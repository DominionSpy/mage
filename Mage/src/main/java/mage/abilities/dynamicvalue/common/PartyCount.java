package mage.abilities.dynamicvalue.common;

import mage.abilities.Ability;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.effects.Effect;
import mage.constants.SubType;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.Predicates;
import mage.game.Game;
import mage.game.permanent.Permanent;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author TheElk801
 */
public enum PartyCount implements DynamicValue {
    instance;
    private static final FilterPermanent filter = new FilterCreaturePermanent();

    static {
        filter.add(Predicates.or(
                SubType.CLERIC.getPredicate(),
                SubType.ROGUE.getPredicate(),
                SubType.WARRIOR.getPredicate(),
                SubType.WIZARD.getPredicate()
        ));
    }

    private static final List<SubType> partyTypes = Arrays.asList(
            SubType.CLERIC,
            SubType.ROGUE,
            SubType.WARRIOR,
            SubType.WIZARD
    );

    private void attemptRearrange(SubType subType, UUID uuid, Set<SubType> creatureTypes, Map<SubType, UUID> subTypeUUIDMap, Map<UUID, Set<SubType>> creatureTypesMap) {
        UUID uuid1 = subTypeUUIDMap.get(subType);
        if (uuid1 == null) {
            return;
        }
        Set<SubType> creatureTypes1 = creatureTypesMap.get(uuid1);
        for (SubType subType1 : creatureTypes1) {
            if (subType == subType1) {
                continue;
            }
            if (!subTypeUUIDMap.containsKey(subType1)) {
                subTypeUUIDMap.put(subType, uuid);
                subTypeUUIDMap.put(subType1, uuid1);
                continue;
            }
            attemptRearrange(subType1, uuid1, creatureTypes, subTypeUUIDMap, creatureTypesMap);
        }
    }

    private Set<SubType> makeSet(Permanent permanent, Game game) {
        Set<SubType> subTypeSet = new HashSet<>();
        for (SubType subType : partyTypes) {
            if (permanent.hasSubtype(subType, game)) {
                subTypeSet.add(subType);
            }
        }
        return subTypeSet;
    }

    @Override
    public int calculate(Game game, Ability sourceAbility, Effect effect) {
        Map<UUID, Set<SubType>> creatureTypesMap = new HashMap<>();
        game.getBattlefield()
                .getActivePermanents(
                        filter, sourceAbility.getControllerId(), sourceAbility.getSourceId(), game
                ).stream()
                .forEach(permanent -> creatureTypesMap.put(permanent.getId(), makeSet(permanent, game)));
        if (creatureTypesMap.size() < 2) {
            return creatureTypesMap.size();
        }
        Set<SubType> availableTypes = creatureTypesMap
                .values()
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
        if (creatureTypesMap.size() == 2) {
            return Math.min(2, availableTypes.size());
        }
        Map<SubType, UUID> subTypeUUIDMap = new HashMap<>();
        for (Map.Entry<UUID, Set<SubType>> entry : creatureTypesMap.entrySet()) {
            for (SubType subType : entry.getValue()) {
                if (!subTypeUUIDMap.containsKey(subType)) {
                    subTypeUUIDMap.put(subType, entry.getKey());
                    break;
                }
            }
            if (subTypeUUIDMap.size() >= availableTypes.size()) {
                return subTypeUUIDMap.size();
            } else {
                for (SubType subType : entry.getValue()) {
                    attemptRearrange(subType, entry.getKey(), entry.getValue(), subTypeUUIDMap, creatureTypesMap);
                }
            }
        }
        return subTypeUUIDMap.keySet().size();
    }

    @Override
    public PartyCount copy() {
        return instance;
    }

    @Override
    public String getMessage() {
        return "for each creature in your party. <i>(Your party consists of up to one each of Cleric, Rogue, Warrior, and Wizard.)</i>";
    }

    @Override
    public String toString() {
        return "1";
    }
}

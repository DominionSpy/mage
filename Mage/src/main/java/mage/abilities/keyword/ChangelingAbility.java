package mage.abilities.keyword;

import mage.abilities.StaticAbility;
import mage.abilities.condition.InvertCondition;
import mage.abilities.condition.common.FaceDownSourceCondition;
import mage.abilities.decorator.ConditionalContinuousEffect;
import mage.abilities.effects.common.continuous.IsAllCreatureTypesSourceEffect;
import mage.constants.Zone;

/**
 * October 1, 2012
 * 702.71. Changeling
 * 702.71a Changeling is a characteristic-defining ability. "Changeling" means "This object
 * is every creature type." This ability works everywhere, even outside the game. See rule 604.3.
 * 702.71b Multiple instances of changeling on the same object are redundant.
 *
 * @author nantuko
 */
public class ChangelingAbility extends StaticAbility {

    private final boolean changelingText;

    public ChangelingAbility() {
        this(true);
    }

    public ChangelingAbility(boolean changelingText) {
        // 504.2. Face-down spells on the stack, face-down permanents in play, and face-down cards
        // in the phased-out zone have no characteristics other than those listed by the ability
        // or rules that allowed the card, spell, or permanent to be turned face down.
        super(Zone.ALL, new ConditionalContinuousEffect(new IsAllCreatureTypesSourceEffect(),
                new InvertCondition(FaceDownSourceCondition.instance), ""));
        this.changelingText = changelingText;
    }

    private ChangelingAbility(final ChangelingAbility ability) {
        super(ability);
        this.changelingText = ability.changelingText;
    }

    @Override
    public String getRule() {
        return changelingText ? "Changeling <i>(This card is every creature type.)</i>" : super.getRule();
    }

    @Override
    public ChangelingAbility copy() {
        return new ChangelingAbility(this);
    }
}

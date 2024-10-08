package mage.cards.p;

import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.ExileSpellEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.CardsImpl;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.filter.FilterCard;
import mage.game.Game;
import mage.players.Player;
import mage.target.TargetCard;
import mage.target.common.TargetCardInYourGraveyard;
import mage.util.CardUtil;

import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/**
 * @author TheElk801
 */
public final class PairODiceLost extends CardImpl {

    public PairODiceLost(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{3}{G}{G}");

        // Roll two six-sided dice. Return any number of cards with total mana value X or less from your graveyard to your hand, where X is the total of those results. Exile Pair o' Dice Lost.
        this.getSpellAbility().addEffect(new PairODiceLostEffect());
        this.getSpellAbility().addEffect(new ExileSpellEffect());
    }

    private PairODiceLost(final PairODiceLost card) {
        super(card);
    }

    @Override
    public PairODiceLost copy() {
        return new PairODiceLost(this);
    }
}

class PairODiceLostEffect extends OneShotEffect {

    PairODiceLostEffect() {
        super(Outcome.Benefit);
        staticText = "roll two six-sided dice. Return any number of cards with total mana value X " +
                "or less from your graveyard to your hand, where X is the total of those results";
    }

    private PairODiceLostEffect(final PairODiceLostEffect effect) {
        super(effect);
    }

    @Override
    public PairODiceLostEffect copy() {
        return new PairODiceLostEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(source.getControllerId());
        if (player == null) {
            return false;
        }
        int rolls = player
                .rollDice(outcome, source, game, 6, 2, 0)
                .stream()
                .mapToInt(x -> x)
                .sum();
        TargetCard target = new PairODiceLostTarget(rolls);
        player.choose(outcome, target, source, game);
        player.moveCards(new CardsImpl(target.getTargets()), Zone.HAND, source, game);
        return true;
    }
}

class PairODiceLostTarget extends TargetCardInYourGraveyard {

    private final int xValue;

    PairODiceLostTarget(int xValue) {
        super(0, Integer.MAX_VALUE, new FilterCard(
                "cards with total mana value " + xValue + " or less from your graveyard"
        ), true);
        this.xValue = xValue;
    }

    private PairODiceLostTarget(final PairODiceLostTarget target) {
        super(target);
        this.xValue = target.xValue;
    }

    @Override
    public PairODiceLostTarget copy() {
        return new PairODiceLostTarget(this);
    }

    @Override
    public boolean canTarget(UUID controllerId, UUID id, Ability source, Game game) {
        return super.canTarget(controllerId, id, source, game)
                && CardUtil.checkCanTargetTotalValueLimit(
                this.getTargets(), id, MageObject::getManaValue, xValue, game);
    }

    @Override
    public Set<UUID> possibleTargets(UUID sourceControllerId, Ability source, Game game) {
        return CardUtil.checkPossibleTargetsTotalValueLimit(this.getTargets(),
                super.possibleTargets(sourceControllerId, source, game),
                MageObject::getManaValue, xValue, game);
    }

    @Override
    public String getMessage(Game game) {
        // shows selected total
        int selectedValue = this.getTargets().stream()
                .map(game::getObject)
                .filter(Objects::nonNull)
                .mapToInt(MageObject::getManaValue)
                .sum();
        return super.getMessage(game) + " (selected total mana value " + selectedValue + ")";
    }

}

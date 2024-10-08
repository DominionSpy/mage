package mage.cards.b;

import mage.MageInt;
import mage.Mana;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.costs.common.DiscardCardCost;
import mage.abilities.effects.common.ExileTopXMayPlayUntilEffect;
import mage.abilities.effects.mana.UntilEndOfTurnManaEffect;
import mage.abilities.keyword.BoastAbility;
import mage.cards.CardSetInfo;
import mage.cards.ModalDoubleFacedCard;
import mage.constants.*;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class BirgiGodOfStorytelling extends ModalDoubleFacedCard {

    public BirgiGodOfStorytelling(UUID ownerId, CardSetInfo setInfo) {
        super(
                ownerId, setInfo,
                new SuperType[]{SuperType.LEGENDARY}, new CardType[]{CardType.CREATURE}, new SubType[]{SubType.GOD}, "{2}{R}",
                "Harnfel, Horn of Bounty",
                new SuperType[]{SuperType.LEGENDARY}, new CardType[]{CardType.ARTIFACT}, new SubType[]{}, "{4}{R}"
        );

        // 1.
        // Birgi, God of Storytelling
        // Legendary Creature - God
        this.getLeftHalfCard().setPT(new MageInt(3), new MageInt(3));

        // Whenever you cast a spell, add {R}. Until end of turn, you don't lose this mana as steps and phases end.
        this.getLeftHalfCard().addAbility(new SpellCastControllerTriggeredAbility(
                new UntilEndOfTurnManaEffect(Mana.RedMana(1)), false
        ));

        // Creatures you control can boast twice during each of your turns rather than once.
        this.getLeftHalfCard().addAbility(BoastAbility.makeBoastTwiceAbility());

        // 2.
        // Harnfel, Horn of Bounty
        // Legendary Artifact
        // Discard a card: Exile the top two cards of your library. You may play those cards this turn.
        this.getRightHalfCard().addAbility(new SimpleActivatedAbility(
                new ExileTopXMayPlayUntilEffect(2, Duration.EndOfTurn).withTextOptions("those cards", true), new DiscardCardCost()
        ));
    }

    private BirgiGodOfStorytelling(final BirgiGodOfStorytelling card) {
        super(card);
    }

    @Override
    public BirgiGodOfStorytelling copy() {
        return new BirgiGodOfStorytelling(this);
    }
}

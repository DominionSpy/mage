package mage.cards.s;

import mage.abilities.effects.common.CreateRoleAttachedTargetEffect;
import mage.abilities.effects.common.DestroyTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.RoleType;
import mage.filter.StaticFilters;
import mage.target.TargetPermanent;
import mage.target.common.TargetControlledCreaturePermanent;
import mage.target.targetpointer.FirstTargetPointer;
import mage.target.targetpointer.SecondTargetPointer;

import java.util.UUID;

/**
 * @author Susucr
 */
public final class ShatterTheOath extends CardImpl {

    public ShatterTheOath(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{3}{B}{B}");

        // Destroy target creature or enchantment. Create a Wicked Role token attached to up to one target creature you control.
        this.getSpellAbility().addEffect(new DestroyTargetEffect().setTargetPointer(new FirstTargetPointer()));
        this.getSpellAbility().addTarget(new TargetPermanent(StaticFilters.FILTER_PERMANENT_CREATURE_OR_ENCHANTMENT));
        this.getSpellAbility().addEffect(new CreateRoleAttachedTargetEffect(RoleType.WICKED).setTargetPointer(new SecondTargetPointer()));
        this.getSpellAbility().addTarget(new TargetControlledCreaturePermanent(0, 1));
    }

    private ShatterTheOath(final ShatterTheOath card) {
        super(card);
    }

    @Override
    public ShatterTheOath copy() {
        return new ShatterTheOath(this);
    }
}

package org.mage.test.cards.abilities.enters;

import mage.constants.PhaseStep;
import mage.constants.Zone;
import org.junit.Test;
import org.mage.test.serverside.base.CardTestPlayerBase;

public class BronzehideLionTest extends CardTestPlayerBase {

    private final String lion = "Bronzehide Lion";

    /**
     *
      When Bronzehide Lion dies, return it to the battlefield.
      It's an Aura enchantment with enchant creature you control and
      "{G}{W}: Enchanted creature gains indestructible until end of turn," and it loses all other abilities.
     */

    @Test
    public void returnAsAura(){
        addCard(Zone.BATTLEFIELD, playerA, lion);
        addCard(Zone.HAND, playerA, "Terror");
        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 10);
        addCard(Zone.BATTLEFIELD, playerA, "Grizzly Bears");

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Terror", lion);
        setChoice(playerA, "Grizzly Bears"); // to enchant

        setStopAt(1, PhaseStep.BEGIN_COMBAT);
        execute();
        assertGraveyardCount(playerA, lion, 0);
        assertAttachedTo(playerA, lion, "Grizzly Bears", true);
    }



    @Test
    public void stayInGraveyard(){
        addCard(Zone.BATTLEFIELD, playerA, lion);
        addCard(Zone.HAND, playerA, "Terror");
        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 10);

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Terror", lion);
        setStrictChooseMode(false); // auto choose, no legal target
        setStopAt(1, PhaseStep.BEGIN_COMBAT);
        execute();
        assertGraveyardCount(playerA, lion, 1);
    }
}

package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.Arrays;
import java.util.List;

/**
 * @author TheElk801
 */
public final class InnistradCrimsonVow extends ExpansionSet {

    private static final List<String> unfinished = Arrays.asList("Binding Geist", "Spectral Binding", "Brine Comber", "Brinebound Gift", "Distracting Geist", "Clever Distraction", "Dorothea, Vengeful Victim", "Dorothea's Retribution", "Drogskol Infantry", "Drogskol Armaments", "Faithbound Judge", "Sinner's Judgment", "Gutter Skulker", "Gutter Shortcut", "Katilda, Dawnhart Martyr", "Katilda's Rising Dawn", "Kindly Ancestor", "Ancestor's Embrace", "Lantern Bearer", "Lanterns' Lift", "Mirrorhall Mimic", "Ghastly Mimicry", "Mischievous Catgeist", "Catlike Curiosity", "Twinblade Geist", "Twinblade Invocation");
    private static final InnistradCrimsonVow instance = new InnistradCrimsonVow();

    public static InnistradCrimsonVow getInstance() {
        return instance;
    }

    private InnistradCrimsonVow() {
        super("Innistrad: Crimson Vow", "VOW", ExpansionSet.buildDate(2021, 11, 19), SetType.EXPANSION);
        this.blockName = "Innistrad: Midnight Hunt";
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 9;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.numBoosterDoubleFaced = 1;

        cards.add(new SetCardInfo("Abrade", 139, Rarity.COMMON, mage.cards.a.Abrade.class));
        cards.add(new SetCardInfo("Adamant Will", 1, Rarity.COMMON, mage.cards.a.AdamantWill.class));
        cards.add(new SetCardInfo("Aim for the Head", 92, Rarity.COMMON, mage.cards.a.AimForTheHead.class));
        cards.add(new SetCardInfo("Alchemist's Retrieval", 47, Rarity.COMMON, mage.cards.a.AlchemistsRetrieval.class));
        cards.add(new SetCardInfo("Ancestor's Embrace", 22, Rarity.COMMON, mage.cards.a.AncestorsEmbrace.class));
        cards.add(new SetCardInfo("Ancient Lumberknot", 230, Rarity.UNCOMMON, mage.cards.a.AncientLumberknot.class));
        cards.add(new SetCardInfo("Angelic Quartermaster", 2, Rarity.UNCOMMON, mage.cards.a.AngelicQuartermaster.class));
        cards.add(new SetCardInfo("Anje, Maid of Dishonor", 231, Rarity.RARE, mage.cards.a.AnjeMaidOfDishonor.class));
        cards.add(new SetCardInfo("Apprentice Sharpshooter", 185, Rarity.COMMON, mage.cards.a.ApprenticeSharpshooter.class));
        cards.add(new SetCardInfo("Archghoul of Thraben", 93, Rarity.UNCOMMON, mage.cards.a.ArchghoulOfThraben.class));
        cards.add(new SetCardInfo("Ascendant Packleader", 186, Rarity.RARE, mage.cards.a.AscendantPackleader.class));
        cards.add(new SetCardInfo("Avabruck Caretaker", 187, Rarity.MYTHIC, mage.cards.a.AvabruckCaretaker.class));
        cards.add(new SetCardInfo("Belligerent Guest", 144, Rarity.COMMON, mage.cards.b.BelligerentGuest.class));
        cards.add(new SetCardInfo("Binding Geist", 48, Rarity.COMMON, mage.cards.b.BindingGeist.class));
        cards.add(new SetCardInfo("Bleed Dry", 94, Rarity.COMMON, mage.cards.b.BleedDry.class));
        cards.add(new SetCardInfo("Blood Fountain", 95, Rarity.COMMON, mage.cards.b.BloodFountain.class));
        cards.add(new SetCardInfo("Blood Hypnotist", 145, Rarity.UNCOMMON, mage.cards.b.BloodHypnotist.class));
        cards.add(new SetCardInfo("Blood Petal Celebrant", 146, Rarity.COMMON, mage.cards.b.BloodPetalCelebrant.class));
        cards.add(new SetCardInfo("Blood Servitor", 252, Rarity.COMMON, mage.cards.b.BloodServitor.class));
        cards.add(new SetCardInfo("Bloodcrazed Socialite", 96, Rarity.COMMON, mage.cards.b.BloodcrazedSocialite.class));
        cards.add(new SetCardInfo("Bloodsworn Knight", 97, Rarity.UNCOMMON, mage.cards.b.BloodswornKnight.class));
        cards.add(new SetCardInfo("Bloodsworn Squire", 97, Rarity.UNCOMMON, mage.cards.b.BloodswornSquire.class));
        cards.add(new SetCardInfo("Bloodtithe Harvester", 232, Rarity.UNCOMMON, mage.cards.b.BloodtitheHarvester.class));
        cards.add(new SetCardInfo("Bloodvial Purveyor", 98, Rarity.RARE, mage.cards.b.BloodvialPurveyor.class));
        cards.add(new SetCardInfo("Bloody Betrayal", 147, Rarity.COMMON, mage.cards.b.BloodyBetrayal.class));
        cards.add(new SetCardInfo("Blossom-Clad Werewolf", 226, Rarity.COMMON, mage.cards.b.BlossomCladWerewolf.class));
        cards.add(new SetCardInfo("Boarded Window", 253, Rarity.UNCOMMON, mage.cards.b.BoardedWindow.class));
        cards.add(new SetCardInfo("Bramble Armor", 188, Rarity.COMMON, mage.cards.b.BrambleArmor.class));
        cards.add(new SetCardInfo("Bramble Wurm", 189, Rarity.UNCOMMON, mage.cards.b.BrambleWurm.class));
        cards.add(new SetCardInfo("Bride's Gown", 4, Rarity.UNCOMMON, mage.cards.b.BridesGown.class));
        cards.add(new SetCardInfo("By Invitation Only", 5, Rarity.RARE, mage.cards.b.ByInvitationOnly.class));
        cards.add(new SetCardInfo("Cartographer's Survey", 190, Rarity.UNCOMMON, mage.cards.c.CartographersSurvey.class));
        cards.add(new SetCardInfo("Catapult Captain", 99, Rarity.UNCOMMON, mage.cards.c.CatapultCaptain.class));
        cards.add(new SetCardInfo("Catapult Fodder", 99, Rarity.UNCOMMON, mage.cards.c.CatapultFodder.class));
        cards.add(new SetCardInfo("Catlike Curiosity", 69, Rarity.UNCOMMON, mage.cards.c.CatlikeCuriosity.class));
        cards.add(new SetCardInfo("Cemetery Gatekeeper", 148, Rarity.MYTHIC, mage.cards.c.CemeteryGatekeeper.class));
        cards.add(new SetCardInfo("Cemetery Protector", 6, Rarity.MYTHIC, mage.cards.c.CemeteryProtector.class));
        cards.add(new SetCardInfo("Cemetery Prowler", 191, Rarity.MYTHIC, mage.cards.c.CemeteryProwler.class));
        cards.add(new SetCardInfo("Ceremonial Knife", 254, Rarity.COMMON, mage.cards.c.CeremonialKnife.class));
        cards.add(new SetCardInfo("Change of Fortune", 150, Rarity.RARE, mage.cards.c.ChangeOfFortune.class));
        cards.add(new SetCardInfo("Child of the Pack", 234, Rarity.UNCOMMON, mage.cards.c.ChildOfThePack.class));
        cards.add(new SetCardInfo("Circle of Confinement", 7, Rarity.UNCOMMON, mage.cards.c.CircleOfConfinement.class));
        cards.add(new SetCardInfo("Clever Distraction", 9, Rarity.UNCOMMON, mage.cards.c.CleverDistraction.class));
        cards.add(new SetCardInfo("Cloaked Cadet", 192, Rarity.UNCOMMON, mage.cards.c.CloakedCadet.class));
        cards.add(new SetCardInfo("Cobbled Lancer", 52, Rarity.UNCOMMON, mage.cards.c.CobbledLancer.class));
        cards.add(new SetCardInfo("Consuming Tide", 53, Rarity.RARE, mage.cards.c.ConsumingTide.class));
        cards.add(new SetCardInfo("Courier Bat", 102, Rarity.COMMON, mage.cards.c.CourierBat.class));
        cards.add(new SetCardInfo("Crawling Infestation", 193, Rarity.UNCOMMON, mage.cards.c.CrawlingInfestation.class));
        cards.add(new SetCardInfo("Cruel Witness", 55, Rarity.COMMON, mage.cards.c.CruelWitness.class));
        cards.add(new SetCardInfo("Crushing Canopy", 194, Rarity.COMMON, mage.cards.c.CrushingCanopy.class));
        cards.add(new SetCardInfo("Dawnhart Disciple", 196, Rarity.COMMON, mage.cards.d.DawnhartDisciple.class));
        cards.add(new SetCardInfo("Dawnhart Geist", 8, Rarity.UNCOMMON, mage.cards.d.DawnhartGeist.class));
        cards.add(new SetCardInfo("Daybreak Combatants", 153, Rarity.COMMON, mage.cards.d.DaybreakCombatants.class));
        cards.add(new SetCardInfo("Deathcap Glade", 261, Rarity.RARE, mage.cards.d.DeathcapGlade.class));
        cards.add(new SetCardInfo("Demonic Bargain", 103, Rarity.RARE, mage.cards.d.DemonicBargain.class));
        cards.add(new SetCardInfo("Depraved Harvester", 104, Rarity.COMMON, mage.cards.d.DepravedHarvester.class));
        cards.add(new SetCardInfo("Desperate Farmer", 104, Rarity.COMMON, mage.cards.d.DesperateFarmer.class));
        cards.add(new SetCardInfo("Dig Up", 197, Rarity.RARE, mage.cards.d.DigUp.class));
        cards.add(new SetCardInfo("Dire-Strain Anarchist", 181, Rarity.MYTHIC, mage.cards.d.DireStrainAnarchist.class));
        cards.add(new SetCardInfo("Distracting Geist", 9, Rarity.UNCOMMON, mage.cards.d.DistractingGeist.class));
        cards.add(new SetCardInfo("Diver Skaab", 56, Rarity.UNCOMMON, mage.cards.d.DiverSkaab.class));
        cards.add(new SetCardInfo("Dominating Vampire", 154, Rarity.RARE, mage.cards.d.DominatingVampire.class));
        cards.add(new SetCardInfo("Doomed Dissenter", 106, Rarity.COMMON, mage.cards.d.DoomedDissenter.class));
        cards.add(new SetCardInfo("Dormant Grove", 198, Rarity.UNCOMMON, mage.cards.d.DormantGrove.class));
        cards.add(new SetCardInfo("Dreadfeast Demon", 108, Rarity.RARE, mage.cards.d.DreadfeastDemon.class));
        cards.add(new SetCardInfo("Dreadlight Monstrosity", 57, Rarity.COMMON, mage.cards.d.DreadlightMonstrosity.class));
        cards.add(new SetCardInfo("Dreamroot Cascade", 262, Rarity.RARE, mage.cards.d.DreamrootCascade.class));
        cards.add(new SetCardInfo("Dreamshackle Geist", 58, Rarity.RARE, mage.cards.d.DreamshackleGeist.class));
        cards.add(new SetCardInfo("Drogskol Armaments", 10, Rarity.COMMON, mage.cards.d.DrogskolArmaments.class));
        cards.add(new SetCardInfo("Drogskol Infantry", 10, Rarity.COMMON, mage.cards.d.DrogskolInfantry.class));
        cards.add(new SetCardInfo("Dying to Serve", 109, Rarity.RARE, mage.cards.d.DyingToServe.class));
        cards.add(new SetCardInfo("End the Festivities", 155, Rarity.COMMON, mage.cards.e.EndTheFestivities.class));
        cards.add(new SetCardInfo("Estwald Shieldbasher", 11, Rarity.COMMON, mage.cards.e.EstwaldShieldbasher.class));
        cards.add(new SetCardInfo("Evolving Wilds", 263, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Falkenrath Celebrants", 156, Rarity.COMMON, mage.cards.f.FalkenrathCelebrants.class));
        cards.add(new SetCardInfo("Falkenrath Forebear", 111, Rarity.RARE, mage.cards.f.FalkenrathForebear.class));
        cards.add(new SetCardInfo("Fearful Villager", 157, Rarity.COMMON, mage.cards.f.FearfulVillager.class));
        cards.add(new SetCardInfo("Fearsome Werewolf", 157, Rarity.COMMON, mage.cards.f.FearsomeWerewolf.class));
        cards.add(new SetCardInfo("Fell Stinger", 112, Rarity.UNCOMMON, mage.cards.f.FellStinger.class));
        cards.add(new SetCardInfo("Fierce Retribution", 13, Rarity.COMMON, mage.cards.f.FierceRetribution.class));
        cards.add(new SetCardInfo("Flame-Blessed Bolt", 158, Rarity.COMMON, mage.cards.f.FlameBlessedBolt.class));
        cards.add(new SetCardInfo("Flourishing Hunter", 199, Rarity.COMMON, mage.cards.f.FlourishingHunter.class));
        cards.add(new SetCardInfo("Foreboding Statue", 256, Rarity.UNCOMMON, mage.cards.f.ForebodingStatue.class));
        cards.add(new SetCardInfo("Forest", 402, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Forsaken Thresher", 256, Rarity.UNCOMMON, mage.cards.f.ForsakenThresher.class));
        cards.add(new SetCardInfo("Frenzied Devils", 159, Rarity.UNCOMMON, mage.cards.f.FrenziedDevils.class));
        cards.add(new SetCardInfo("Geistlight Snare", 60, Rarity.UNCOMMON, mage.cards.g.GeistlightSnare.class));
        cards.add(new SetCardInfo("Geralf, Visionary Stitcher", 61, Rarity.RARE, mage.cards.g.GeralfVisionaryStitcher.class));
        cards.add(new SetCardInfo("Glorious Sunrise", 200, Rarity.RARE, mage.cards.g.GloriousSunrise.class));
        cards.add(new SetCardInfo("Gluttonous Guest", 114, Rarity.COMMON, mage.cards.g.GluttonousGuest.class));
        cards.add(new SetCardInfo("Gnarled Grovestrider", 198, Rarity.UNCOMMON, mage.cards.g.GnarledGrovestrider.class));
        cards.add(new SetCardInfo("Graf Reaver", 115, Rarity.RARE, mage.cards.g.GrafReaver.class));
        cards.add(new SetCardInfo("Grisly Ritual", 116, Rarity.COMMON, mage.cards.g.GrislyRitual.class));
        cards.add(new SetCardInfo("Grolnok, the Omnivore", 238, Rarity.RARE, mage.cards.g.GrolnokTheOmnivore.class));
        cards.add(new SetCardInfo("Groom's Finery", 117, Rarity.UNCOMMON, mage.cards.g.GroomsFinery.class));
        cards.add(new SetCardInfo("Gryff Rider", 15, Rarity.COMMON, mage.cards.g.GryffRider.class));
        cards.add(new SetCardInfo("Gryffwing Cavalry", 16, Rarity.UNCOMMON, mage.cards.g.GryffwingCavalry.class));
        cards.add(new SetCardInfo("Halana and Alena, Partners", 239, Rarity.RARE, mage.cards.h.HalanaAndAlenaPartners.class));
        cards.add(new SetCardInfo("Hallowed Haunting", 17, Rarity.MYTHIC, mage.cards.h.HallowedHaunting.class));
        cards.add(new SetCardInfo("Hamlet Vanguard", 201, Rarity.RARE, mage.cards.h.HamletVanguard.class));
        cards.add(new SetCardInfo("Headless Rider", 118, Rarity.RARE, mage.cards.h.HeadlessRider.class));
        cards.add(new SetCardInfo("Hero's Downfall", 120, Rarity.UNCOMMON, mage.cards.h.HerosDownfall.class));
        cards.add(new SetCardInfo("Heron of Hope", 18, Rarity.COMMON, mage.cards.h.HeronOfHope.class));
        cards.add(new SetCardInfo("Hollowhenge Huntmaster", 187, Rarity.MYTHIC, mage.cards.h.HollowhengeHuntmaster.class));
        cards.add(new SetCardInfo("Honeymoon Hearse", 160, Rarity.UNCOMMON, mage.cards.h.HoneymoonHearse.class));
        cards.add(new SetCardInfo("Honored Heirloom", 257, Rarity.COMMON, mage.cards.h.HonoredHeirloom.class));
        cards.add(new SetCardInfo("Hookhand Mariner", 203, Rarity.COMMON, mage.cards.h.HookhandMariner.class));
        cards.add(new SetCardInfo("Howling Moon", 204, Rarity.RARE, mage.cards.h.HowlingMoon.class));
        cards.add(new SetCardInfo("Hungry Ridgewolf", 161, Rarity.COMMON, mage.cards.h.HungryRidgewolf.class));
        cards.add(new SetCardInfo("Infestation Expert", 206, Rarity.UNCOMMON, mage.cards.i.InfestationExpert.class));
        cards.add(new SetCardInfo("Infested Werewolf", 206, Rarity.UNCOMMON, mage.cards.i.InfestedWerewolf.class));
        cards.add(new SetCardInfo("Inspired Idea", 64, Rarity.RARE, mage.cards.i.InspiredIdea.class));
        cards.add(new SetCardInfo("Into the Night", 163, Rarity.UNCOMMON, mage.cards.i.IntoTheNight.class));
        cards.add(new SetCardInfo("Investigator's Journal", 258, Rarity.RARE, mage.cards.i.InvestigatorsJournal.class));
        cards.add(new SetCardInfo("Island", 399, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Kessig Flamebreather", 164, Rarity.COMMON, mage.cards.k.KessigFlamebreather.class));
        cards.add(new SetCardInfo("Kessig Wolfrider", 165, Rarity.RARE, mage.cards.k.KessigWolfrider.class));
        cards.add(new SetCardInfo("Kindly Ancestor", 22, Rarity.COMMON, mage.cards.k.KindlyAncestor.class));
        cards.add(new SetCardInfo("Laid to Rest", 207, Rarity.UNCOMMON, mage.cards.l.LaidToRest.class));
        cards.add(new SetCardInfo("Lambholt Raconteur", 167, Rarity.UNCOMMON, mage.cards.l.LambholtRaconteur.class));
        cards.add(new SetCardInfo("Lambholt Ravager", 167, Rarity.UNCOMMON, mage.cards.l.LambholtRavager.class));
        cards.add(new SetCardInfo("Lantern Bearer", 66, Rarity.COMMON, mage.cards.l.LanternBearer.class));
        cards.add(new SetCardInfo("Lantern Flare", 23, Rarity.RARE, mage.cards.l.LanternFlare.class));
        cards.add(new SetCardInfo("Lanterns' Lift", 66, Rarity.COMMON, mage.cards.l.LanternsLift.class));
        cards.add(new SetCardInfo("Lightning Wolf", 168, Rarity.COMMON, mage.cards.l.LightningWolf.class));
        cards.add(new SetCardInfo("Lunar Rejection", 67, Rarity.UNCOMMON, mage.cards.l.LunarRejection.class));
        cards.add(new SetCardInfo("Manaform Hellkite", 170, Rarity.MYTHIC, mage.cards.m.ManaformHellkite.class));
        cards.add(new SetCardInfo("Markov Purifier", 241, Rarity.UNCOMMON, mage.cards.m.MarkovPurifier.class));
        cards.add(new SetCardInfo("Markov Retribution", 171, Rarity.UNCOMMON, mage.cards.m.MarkovRetribution.class));
        cards.add(new SetCardInfo("Markov Waltzer", 242, Rarity.UNCOMMON, mage.cards.m.MarkovWaltzer.class));
        cards.add(new SetCardInfo("Massive Might", 208, Rarity.COMMON, mage.cards.m.MassiveMight.class));
        cards.add(new SetCardInfo("Militia Rallier", 24, Rarity.COMMON, mage.cards.m.MilitiaRallier.class));
        cards.add(new SetCardInfo("Mindleech Ghoul", 122, Rarity.COMMON, mage.cards.m.MindleechGhoul.class));
        cards.add(new SetCardInfo("Mischievous Catgeist", 69, Rarity.UNCOMMON, mage.cards.m.MischievousCatgeist.class));
        cards.add(new SetCardInfo("Moldgraf Millipede", 209, Rarity.COMMON, mage.cards.m.MoldgrafMillipede.class));
        cards.add(new SetCardInfo("Moonlit Ambusher", 212, Rarity.UNCOMMON, mage.cards.m.MoonlitAmbusher.class));
        cards.add(new SetCardInfo("Mountain", 401, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mulch", 210, Rarity.COMMON, mage.cards.m.Mulch.class));
        cards.add(new SetCardInfo("Nebelgast Beguiler", 25, Rarity.COMMON, mage.cards.n.NebelgastBeguiler.class));
        cards.add(new SetCardInfo("Necroduality", 70, Rarity.MYTHIC, mage.cards.n.Necroduality.class));
        cards.add(new SetCardInfo("Oakshade Stalker", 212, Rarity.UNCOMMON, mage.cards.o.OakshadeStalker.class));
        cards.add(new SetCardInfo("Odric, Blood-Cursed", 243, Rarity.RARE, mage.cards.o.OdricBloodCursed.class));
        cards.add(new SetCardInfo("Old Rutstein", 244, Rarity.RARE, mage.cards.o.OldRutstein.class));
        cards.add(new SetCardInfo("Olivia, Crimson Bride", 245, Rarity.MYTHIC, mage.cards.o.OliviaCrimsonBride.class));
        cards.add(new SetCardInfo("Ollenbock Escort", 27, Rarity.UNCOMMON, mage.cards.o.OllenbockEscort.class));
        cards.add(new SetCardInfo("Overcharged Amalgam", 71, Rarity.RARE, mage.cards.o.OverchargedAmalgam.class));
        cards.add(new SetCardInfo("Packsong Pup", 213, Rarity.UNCOMMON, mage.cards.p.PacksongPup.class));
        cards.add(new SetCardInfo("Parasitic Grasp", 123, Rarity.UNCOMMON, mage.cards.p.ParasiticGrasp.class));
        cards.add(new SetCardInfo("Path of Peril", 124, Rarity.RARE, mage.cards.p.PathOfPeril.class));
        cards.add(new SetCardInfo("Persistent Specimen", 125, Rarity.COMMON, mage.cards.p.PersistentSpecimen.class));
        cards.add(new SetCardInfo("Piercing Light", 30, Rarity.COMMON, mage.cards.p.PiercingLight.class));
        cards.add(new SetCardInfo("Plains", 398, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Pointed Discussion", 126, Rarity.COMMON, mage.cards.p.PointedDiscussion.class));
        cards.add(new SetCardInfo("Pyre Spawn", 173, Rarity.COMMON, mage.cards.p.PyreSpawn.class));
        cards.add(new SetCardInfo("Reckless Impulse", 174, Rarity.COMMON, mage.cards.r.RecklessImpulse.class));
        cards.add(new SetCardInfo("Reclusive Taxidermist", 214, Rarity.UNCOMMON, mage.cards.r.ReclusiveTaxidermist.class));
        cards.add(new SetCardInfo("Rending Flame", 175, Rarity.UNCOMMON, mage.cards.r.RendingFlame.class));
        cards.add(new SetCardInfo("Resistance Squad", 32, Rarity.UNCOMMON, mage.cards.r.ResistanceSquad.class));
        cards.add(new SetCardInfo("Retrieve", 215, Rarity.UNCOMMON, mage.cards.r.Retrieve.class));
        cards.add(new SetCardInfo("Riphook Raider", 203, Rarity.COMMON, mage.cards.r.RiphookRaider.class));
        cards.add(new SetCardInfo("Rot-Tide Gargantua", 129, Rarity.COMMON, mage.cards.r.RotTideGargantua.class));
        cards.add(new SetCardInfo("Runebound Wolf", 176, Rarity.UNCOMMON, mage.cards.r.RuneboundWolf.class));
        cards.add(new SetCardInfo("Rural Recruit", 216, Rarity.COMMON, mage.cards.r.RuralRecruit.class));
        cards.add(new SetCardInfo("Sanctify", 33, Rarity.COMMON, mage.cards.s.Sanctify.class));
        cards.add(new SetCardInfo("Sanguine Statuette", 177, Rarity.UNCOMMON, mage.cards.s.SanguineStatuette.class));
        cards.add(new SetCardInfo("Savage Packmate", 234, Rarity.UNCOMMON, mage.cards.s.SavagePackmate.class));
        cards.add(new SetCardInfo("Sawblade Slinger", 217, Rarity.UNCOMMON, mage.cards.s.SawbladeSlinger.class));
        cards.add(new SetCardInfo("Scattered Thoughts", 74, Rarity.COMMON, mage.cards.s.ScatteredThoughts.class));
        cards.add(new SetCardInfo("Selhoff Entomber", 76, Rarity.COMMON, mage.cards.s.SelhoffEntomber.class));
        cards.add(new SetCardInfo("Shattered Sanctum", 264, Rarity.RARE, mage.cards.s.ShatteredSanctum.class));
        cards.add(new SetCardInfo("Sheltering Boughs", 218, Rarity.COMMON, mage.cards.s.ShelteringBoughs.class));
        cards.add(new SetCardInfo("Sigarda's Imprisonment", 35, Rarity.COMMON, mage.cards.s.SigardasImprisonment.class));
        cards.add(new SetCardInfo("Sigardian Paladin", 247, Rarity.UNCOMMON, mage.cards.s.SigardianPaladin.class));
        cards.add(new SetCardInfo("Snarling Wolf", 219, Rarity.COMMON, mage.cards.s.SnarlingWolf.class));
        cards.add(new SetCardInfo("Sorin the Mirthless", 131, Rarity.MYTHIC, mage.cards.s.SorinTheMirthless.class));
        cards.add(new SetCardInfo("Spectral Binding", 48, Rarity.COMMON, mage.cards.s.SpectralBinding.class));
        cards.add(new SetCardInfo("Splendid Reclamation", 221, Rarity.RARE, mage.cards.s.SplendidReclamation.class));
        cards.add(new SetCardInfo("Spore Crawler", 222, Rarity.COMMON, mage.cards.s.SporeCrawler.class));
        cards.add(new SetCardInfo("Stensia Uprising", 178, Rarity.RARE, mage.cards.s.StensiaUprising.class));
        cards.add(new SetCardInfo("Stormcarved Coast", 265, Rarity.RARE, mage.cards.s.StormcarvedCoast.class));
        cards.add(new SetCardInfo("Stormchaser Drake", 82, Rarity.UNCOMMON, mage.cards.s.StormchaserDrake.class));
        cards.add(new SetCardInfo("Sundown Pass", 266, Rarity.RARE, mage.cards.s.SundownPass.class));
        cards.add(new SetCardInfo("Sure Strike", 179, Rarity.COMMON, mage.cards.s.SureStrike.class));
        cards.add(new SetCardInfo("Swamp", 400, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Syncopate", 83, Rarity.COMMON, mage.cards.s.Syncopate.class));
        cards.add(new SetCardInfo("Thalia, Guardian of Thraben", 38, Rarity.RARE, mage.cards.t.ThaliaGuardianOfThraben.class));
        cards.add(new SetCardInfo("Thirst for Discovery", 85, Rarity.UNCOMMON, mage.cards.t.ThirstForDiscovery.class));
        cards.add(new SetCardInfo("Torens, Fist of the Angels", 249, Rarity.RARE, mage.cards.t.TorensFistOfTheAngels.class));
        cards.add(new SetCardInfo("Twinblade Geist", 40, Rarity.UNCOMMON, mage.cards.t.TwinbladeGeist.class));
        cards.add(new SetCardInfo("Twinblade Invocation", 40, Rarity.UNCOMMON, mage.cards.t.TwinbladeInvocation.class));
        cards.add(new SetCardInfo("Ulvenwald Behemoth", 225, Rarity.RARE, mage.cards.u.UlvenwaldBehemoth.class));
        cards.add(new SetCardInfo("Ulvenwald Oddity", 225, Rarity.RARE, mage.cards.u.UlvenwaldOddity.class));
        cards.add(new SetCardInfo("Unhallowed Phalanx", 135, Rarity.COMMON, mage.cards.u.UnhallowedPhalanx.class));
        cards.add(new SetCardInfo("Unholy Officiant", 41, Rarity.COMMON, mage.cards.u.UnholyOfficiant.class));
        cards.add(new SetCardInfo("Valorous Stance", 42, Rarity.UNCOMMON, mage.cards.v.ValorousStance.class));
        cards.add(new SetCardInfo("Vampire's Kiss", 136, Rarity.COMMON, mage.cards.v.VampiresKiss.class));
        cards.add(new SetCardInfo("Vampires' Vengeance", 180, Rarity.UNCOMMON, mage.cards.v.VampiresVengeance.class));
        cards.add(new SetCardInfo("Vilespawn Spider", 250, Rarity.UNCOMMON, mage.cards.v.VilespawnSpider.class));
        cards.add(new SetCardInfo("Voice of the Blessed", 44, Rarity.RARE, mage.cards.v.VoiceOfTheBlessed.class));
        cards.add(new SetCardInfo("Volatile Arsonist", 181, Rarity.MYTHIC, mage.cards.v.VolatileArsonist.class));
        cards.add(new SetCardInfo("Voldaren Epicure", 182, Rarity.COMMON, mage.cards.v.VoldarenEpicure.class));
        cards.add(new SetCardInfo("Voldaren Estate", 267, Rarity.RARE, mage.cards.v.VoldarenEstate.class));
        cards.add(new SetCardInfo("Wanderlight Spirit", 86, Rarity.COMMON, mage.cards.w.WanderlightSpirit.class));
        cards.add(new SetCardInfo("Wash Away", 87, Rarity.UNCOMMON, mage.cards.w.WashAway.class));
        cards.add(new SetCardInfo("Weary Prisoner", 184, Rarity.COMMON, mage.cards.w.WearyPrisoner.class));
        cards.add(new SetCardInfo("Weaver of Blossoms", 226, Rarity.COMMON, mage.cards.w.WeaverOfBlossoms.class));
        cards.add(new SetCardInfo("Wedding Announcement", 45, Rarity.RARE, mage.cards.w.WeddingAnnouncement.class));
        cards.add(new SetCardInfo("Wedding Festivity", 45, Rarity.RARE, mage.cards.w.WeddingFestivity.class));
        cards.add(new SetCardInfo("Wedding Invitation", 260, Rarity.COMMON, mage.cards.w.WeddingInvitation.class));
        cards.add(new SetCardInfo("Wedding Security", 138, Rarity.UNCOMMON, mage.cards.w.WeddingSecurity.class));
        cards.add(new SetCardInfo("Welcoming Vampire", 46, Rarity.RARE, mage.cards.w.WelcomingVampire.class));
        cards.add(new SetCardInfo("Whispering Wizard", 88, Rarity.UNCOMMON, mage.cards.w.WhisperingWizard.class));
        cards.add(new SetCardInfo("Winged Portent", 89, Rarity.RARE, mage.cards.w.WingedPortent.class));
        cards.add(new SetCardInfo("Wrathful Jailbreaker", 184, Rarity.COMMON, mage.cards.w.WrathfulJailbreaker.class));
        cards.add(new SetCardInfo("Wretched Throng", 91, Rarity.COMMON, mage.cards.w.WretchedThrong.class));

        cards.removeIf(setCardInfo -> unfinished.contains(setCardInfo.getName())); // remove when mechanic is fully implemented
    }
}

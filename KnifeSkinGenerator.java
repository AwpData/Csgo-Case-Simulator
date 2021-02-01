import java.util.*;

public class KnifeSkinGenerator extends CsgoCases {
    static private String itemname, flavortext = "N/A", skindescription;

    // WHERE EACH KNIFE IS IN EACH CASE (Non-skin exclusive: no dopplers or new knife skin cases)
    // Navaja Knife, Stiletto Knife, Talon Knife, Ursus Knife -> Horizon, Danger Zone, Prisma
    // Bowie Knife -> Operation Wildfire Case
    // Butterfly Knife -> Operation Breakout Case
    // Falchion Knife -> Falchion Case
    // Huntsman Knife -> Huntsman Weapon Case
    // Shadow Daggers -> Shadow Case
    // Bayonet, Flip Knife, Gut Knife, Karambit, M9 Bayonet -> Revolver, OPC, OVC, WC3, eSports 2013W, eSports 2014S, WC2, Winter Offensive, WC1, eSports 2013, OBC, Chroma (1-3), Gamma (1-2), Spectrum (1-2)

    public static ArrayList<String> TheFourNewKnives() {
        double percent = 100 * Math.random() + 1;
        if (percent >= 0 && percent <= 25.25) {
            itemname = "Stiletto Knife ";
            skindescription = "This Italian-style stiletto switchblade knife features a spring-loaded blade that can be deployed almost instantly with the push of a release catch.";
        } else if (percent > 25.25 && percent <= 50.50) {
            itemname = "Ursus Knife ";
            skindescription = "This tanto-style survival knife features a faceted blade and full tang, complete with impact pommel.";
        } else if (percent > 50.50 && percent <= 75.75) {
            itemname = "Navaja Knife ";
            skindescription = "This marble-enamel-handled flip knife conceals a small but viciously tapered blade.";
        } else if (percent > 75.75 && percent <= 101) {
            itemname = "Talon Knife ";
            skindescription = "This ivory-handled karambit features brass rivets and saw-tooth ridges, so it cuts on the way in, and tears on the way out.";
        }
        return KnifeSkin(itemname, skindescription);
    }

    public static ArrayList<String> TheOriginalKnives() {
        double percent = 100 * Math.random() + 1;
        if (percent >= 0 && percent <= 20.2) {
            itemname = "Bayonet ";
            skindescription = "Relatively unchanged in its design since World War II, the bayonet still retains a place in modern military strategy.";
        } else if (percent > 20.2 && percent <= 40.4) {
            itemname = "Flip Knife ";
            skindescription = "Flip knives sport a Persian-style back-swept blade with an acute point.";
        } else if (percent > 40.4 && percent <= 60.6) {
            itemname = "Gut Knife ";
            skindescription = "The most notable feature of a gut knife is the gut hook on the spine of the blade.";
        } else if (percent > 60.6 && percent <= 80.8) {
            itemname = "M9 Bayonet ";
            skindescription = "Originally intended to be mounted on a rifle.";
        } else if (percent > 80.8 && percent <= 101) {
            itemname = "Karambit ";
            skindescription = "With its curved blade mimicking a tiger's claw, the karambit was developed as part of the southeast Asian martial discipline of silat.";
        }

        return KnifeSkin(itemname, skindescription);
    }

    public static ArrayList<String> KnifeSkin(String itemname, String skindescription) {
        ArrayList<String> KnifeStats = new ArrayList<>();
        double percent = 100 * Math.random() + 1;
        if (percent >= 0 && percent <= 4.04) {
            itemname += "| Boreal Forest";
            flavortext = "The woods can be a dangerous place... never travel alone";
            skindescription = "It has been painted using a forest camouflage hydrographic.";
        } else if (percent > 4.04 && percent <= 8.08) {
            itemname += "| Scorched";
            flavortext = "The Phoenix is not a symbol of destruction... it's a symbol of rebirth - Valeria Jenner, Revolutionary";
            skindescription = "It has been spray-painted in a sun-dappled pattern.";
        } else if (percent > 8.08 && percent <= 12.12) {
            itemname += "| Urban Masked";
            flavortext = "True power is demonstrated with subtle application";
            skindescription = "It has been spray-painted using a tangle of masking tape as a stencil.";
        } else if (percent > 12.12 && percent <= 16.16) {
            itemname += "| Marble Fade";
            flavortext = "The blade is made of many colors, but soon it all looks red";
            skindescription = "It has been painted with black and silver metallic paints using a marbleizing medium, then candy coated in three colors.";
        } else if (percent > 16.16 && percent <= 20.20) {
            itemname += "| Rust Coat";
            flavortext = "Some people don't need to hide how dirty their deeds are";
            skindescription = "It is still perfectly operational although the exterior surfaces have rusted.";
        } else if (percent > 20.20 && percent <= 24.24) { // Night Variations
            if (itemname.contains("Talon") || itemname.contains("Stiletto") || itemname.contains("Navaja") || itemname.contains("Ursus")) {
                itemname += "| Night Stripe";
                flavortext = "Spray... Pray... Paint... Stab.";
                skindescription = "It has been spray-painted with a tape mask pattern in a night ops color scheme.";
            } else {
                itemname += "| Night";
                flavortext = "It's the whisper of the wind... it's the bite at your neck";
                skindescription = "It has individual parts spray-painted solid colors in a night ops color scheme.";
            }
        } else if (percent > 24.24 && percent <= 28.28) {
            itemname += "| Forest DDPAT";
            flavortext = "By the time you're close enough to notice the pixels it's already too late";
            skindescription = "It has been painted using a Digital Disruptive Pattern (DDPAT) hydrographic.";
        } else if (percent > 28.28 && percent <= 32.32) {
            itemname += "| Stained";
            flavortext = "If you think it's messy now, wait until you see it under a blacklight";
            skindescription = "It has been given a forced patina using lemon and mustard dripped onto the surface.";
        } else if (percent > 32.32 && percent <= 36.36) {
            itemname += "| Safari Mesh";
            flavortext = "A predator is a predator, no matter the environment";
            skindescription = "It has been spray-painted using mesh fencing and cardboard cutouts as stencils.";
        } else if (percent > 36.36 && percent <= 40.40) {
            itemname += "| Bright Water";
            skindescription = "It has been painted using a blue camo hydrographic.";
        } else if (percent > 40.40 && percent <= 44.44) {
            itemname += "| Case Hardened";
            flavortext = "A little color never hurt anyone";
            skindescription = "It has been color case-hardened through the application of wood charcoal at high temperatures.";
        } else if (percent > 44.44 && percent <= 48.48) {
            itemname += "| Ultraviolet";
            flavortext = "Elegant design paired with brutal intent";
            skindescription = "It has individual parts spray-painted solid colors in a black and purple color scheme.";
        } else if (percent > 48.48 && percent <= 52.52) {
            itemname += "| Blue Steel";
            flavortext = "This is the malbec of weapon design - Booth, Arms Dealer";
            skindescription = "It has been cold blued.";
        } else if (percent > 52.52 && percent <= 56.56) { // Doppler
            percent = 100 * Math.random() + 1;
            if (percent >= 0 && percent <= 12.625) {
                itemname += "| Doppler (Sapphire)";
            } else if (percent > 12.625 && percent <= 25.25) {
                itemname += "| Doppler (Black Pearl)";
            } else if (percent > 25.25 && percent <= 37.875) {
                itemname += "| Doppler (Phase 1)";
            } else if (percent > 37.875 && percent <= 50.5) {
                itemname += "| Doppler (Phase 2)";
            } else if (percent > 50.5 && percent <= 63.125) {
                itemname += "| Doppler (Phase 3)";
            } else if (percent > 63.125 && percent <= 75.75) {
                itemname += "| Doppler (Phase 4)";
            } else if (percent > 75.75 && percent <= 88.375) {
                itemname += "| Doppler (Ruby)";
            } else if (percent > 88.375 && percent <= 101) {
                itemname += "| Doppler";
            }
            flavortext = "Getting lost in its color can prove fatal";
            skindescription = "It has been painted with black and silver metallic paints using a marbleizing medium, then candy coated.";
        } else if (percent > 56.56 && percent <= 60.60) {
            itemname += "| Slaughter";
            flavortext = "Valeria doesn't pay Javier to ask questions... she pays him to pry out answers";
            skindescription = "It has been painted in a zebra-stripe pattern with aluminum and chrome paints with various reflectivities, and has then been covered with a tomato red candy coat.";
        } else if (percent > 60.60 && percent <= 64.64) {
            itemname += "| Black Laminate";
            skindescription = "It has been stonewashed and given a black laminate handle.";
        } else if (percent > 64.64 && percent <= 68.68) {
            itemname += "| Autotronic";
            skindescription = "It has been anodized red and uses steel mesh to lighten the weight.";
        } else if (percent > 68.68 && percent <= 72.72) {
            itemname += "| Tiger Tooth";
            flavortext = "Like the tiger it is rare... like the tiger it is deadly...";
            skindescription = "It has been anodized orange and hand-etched in a tiger stripe pattern.";
        } else if (percent > 72.72 && percent <= 76.76) {
            itemname += "| Fade";
            flavortext = "This isn't just a weapon, it's a conversation piece - Imogen, Arms Dealer In Training";
            skindescription = "It has been painted by airbrushing transparent paints that fade together over a chrome base coat.";
        } else if (percent > 76.76 && percent <= 80.80) {
            itemname += "| Freehand";
            skindescription = "It has been painted black and purple, then decorated with a metallic marker.";
        } else if (percent > 80.80 && percent <= 84.84) {
            itemname += "| Crimson Web";
            flavortext = "Be careful where you walk, you never know where the web is spread";
            skindescription = "It has been painted using a spider web-patterned hydrographic over a red base coat and finished with a semi-gloss topcoat.";
        } else if (percent > 84.84 && percent <= 88.88) { // Gamma Doppler
            percent = 100 * Math.random() + 1;
            if (percent >= 0 && percent <= 16.83) {
                itemname += "| Gamma Doppler (Emerald)";
            } else if (percent >= 16.83 && percent <= 33.66) {
                itemname += "| Gamma Doppler (Phase 1)";
            } else if (percent >= 33.66 && percent <= 50.49) {
                itemname += "| Gamma Doppler (Phase 2)";
            } else if (percent >= 50.49 && percent <= 67.32) {
                itemname += "| Gamma Doppler (Phase 3)";
            } else if (percent >= 67.32 && percent <= 84.15) {
                itemname += "| Gamma Doppler (Phase 4)";
            } else if (percent >= 84.15 && percent <= 101) {
                itemname += "| Gamma Doppler";
            }
            skindescription = "It has been painted with black and silver metallic paints using a marbleizing medium, then candy coated.";
        } else if (percent > 88.88 && percent <= 92.92) {
            itemname += "| Lore";
            skindescription = "It has been custom painted with knotwork.";
        } else if (percent > 92.92 && percent <= 96.96) {
            itemname += "| Damascus Steel";
            flavortext = "Finally, a weapon strong enough to match your resolve";
            skindescription = "It has been forged from a billet made from two different types of carbon steel.";
        } else {// if (percent > 96.96 && percent <= 101) { // Vanilla
            // nothing...its vanilla
        }
        KnifeStats.add(itemname);
        KnifeStats.add(flavortext);
        KnifeStats.add(skindescription);
        return KnifeStats;
    }
}

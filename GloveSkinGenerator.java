import java.util.*;

public class GloveSkinGenerator extends CsgoCases {
	static private String itemname, flavortext = "N/A", skindescription;

	public static ArrayList<String> gloveSkin(String casename) { // casename to check for clutch case skins
		ArrayList<String> GloveStats = new ArrayList<>();
		itemname = "\u2605  ";
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 4.208) {
			if (casename.equals("clutch")) {
				itemname += "Hand Wraps | Duct Tape";
				skindescription = "These scavenged hand-wraps are surprisingly durable but not especially breathable.";
			} else {
				itemname += "Bloodhound Gloves | Charred";
				flavortext = "Challenge coins are great, but they don't draw blood when you backfist someone - Carmen Cocinero, Extraction Expert";
				skindescription = "It was crafted out of classic black supple leather.";
			}
		} else if (percent > 4.208 && percent <= 8.416) {
			if (casename.equals("clutch")) {
				itemname += "Moto Gloves | Turtle";
				skindescription = "This green and grey pair has bright orange accents.";
			} else {
				itemname += "Sport Gloves | Superconductor";
				flavortext = "They don't want none";
				skindescription = "The blue and black gloves are ideal for those who wish to be phenomenal.";
			}
		} else if (percent > 8.416 && percent <= 12.624) {
			if (casename.equals("clutch")) {
				itemname += "Driver Gloves | Imperial Plaid";
				skindescription = "This pair of flannel and leather gloves has an imperial hue.";
			} else {
				itemname += "Driver Gloves | Lunar Weave";
				flavortext = "Keeps the blood off your hands...metaphorically speaking";
				skindescription = "Midnight blue suede has been interwoven with jet black leather to give these gloves a timeless look.";
			}
		} else if (percent > 12.624 && percent <= 16.832) {
			if (casename.equals("clutch")) {
				itemname += "Specialist Gloves | Fade";
				skindescription = "These multicolored gloves have metallic accents.";
			} else {
				itemname += "Hand Wraps | Leather";
				flavortext = "Become notorious";
				skindescription = "They are made of leather, gauze, and wicked intent.";
			}
		} else if (percent > 16.832 && percent <= 21.040) {
			if (casename.equals("clutch")) {
				itemname += "Sport Gloves | Omega";
				skindescription = "These synthetic black gloves have strong yellow accents.";
			} else {
				itemname += "Moto Gloves | Eclipse";
				flavortext = "Don't call it a midlife crisis";
				skindescription = "This is the original classic black design that made Tortue a household name.";
			}
		} else if (percent > 21.040 && percent <= 25.248) {
			if (casename.equals("clutch")) {
				itemname += "Hydra Gloves | Emerald";
				skindescription = "It was crafted out of classic black supple leather with a varnished green emblem.";
			} else {
				itemname += "Specialist Gloves | Forest DDPAT";
				flavortext = "Some people don't like getting their hands dirty";
				skindescription = "The hand stitched leather has been paired with rugged DDPAT printed fabric.";
			}
		} else if (percent > 25.248 && percent <= 29.456) {
			if (casename.equals("clutch")) {
				itemname += "Hand Wraps | Cobalt Skulls";
				skindescription = "These blue bias-tape handwraps are printed with skull motifs.";
			} else {
				itemname += "Bloodhound Gloves | Snakebite";
				flavortext = "Operation Bloodhound marked the end of rouge sniper Chase Turner";
				skindescription = "It was crafted with a mix of leather and snakeskin.";
			}
		} else if (percent > 29.456 && percent <= 33.664) {
			if (casename.equals("clutch")) {
				itemname += "Moto Gloves | POW!";
				skindescription = "This pair has been covered in brightly colored comic book onomatopoeia.";
			} else {
				itemname += "Sport Gloves | Arid";
				flavortext = "If we're going to be heroes, we may as well look the part... - Rona Sabri, Rising Star";
				skindescription = "Multiple shades of brown and a subtle camo print give these gloves a distinguished look.";
			}
		} else if (percent > 33.664 && percent <= 37.872) {
			if (casename.equals("clutch")) {
				itemname += "Driver Gloves | King Snake";
				skindescription = "It has been crafted out of white leather and snakeskin.";
			} else {
				itemname += "Driver Gloves | Convoy";
				flavortext = "Sometimes discretion is called for";
				skindescription = "It has been made with a mix of brown soft leather and dyed suede.";
			}
		} else if (percent > 37.872 && percent <= 42.080) {
			if (casename.equals("clutch")) {
				itemname += "Specialist Gloves | Buckshot";
				skindescription = "These practical gloves would be at home in a hunting blind.";
			} else {
				itemname += "Hand Wraps | Spruce DDPAT";
				flavortext = "Some people say they're tough... others show it";
				skindescription = "The outer wrap is fabric screen printed with grey digital camo.";
			}
		} else if (percent > 42.080 && percent <= 46.288) {
			if (casename.equals("clutch")) {
				itemname += "Sport Gloves | Vice";
				skindescription = "These synthetic gloves are crafted from a striking mix pink and blue technical fabrics.";
			} else {
				itemname += "Moto Gloves | Spearmint";
				flavortext = "For what he's charging us, you'd think Huxley could at least throw in a tin of mints... - Felix Riley, Commanding Officer";
				skindescription = "White leather and red stitching make these gloves as stylish as they are comfortable.";
			}
		} else if (percent > 46.288 && percent <= 50.496) {
			if (casename.equals("clutch")) {
				itemname += "Hydra Gloves | Case Hardened";
				skindescription = "These vegan leather gloves have been printed with a variegated metallic pattern.";
			} else {
				itemname += "Specialist Gloves | Crimson Kimono";
				flavortext = "Start seeing red";
				skindescription = "This pair of black gloves has been accented with a stark red diamond pattern.";
			}
		} else if (percent > 50.496 && percent <= 54.704) {
			if (casename.equals("clutch")) {
				itemname += "Hand Wraps | Overprint";
				skindescription = "These black bias-tape handwraps have been printed with rubberized geometric patterns.";
			} else {
				itemname += "Bloodhound Gloves | Bronzed";
				flavortext = "Let's be honest... no one misses Sergei - Hans Kriegeld, Phoenix Tactician";
				skindescription = "The leather has been dyed gun metal and bronze.";
			}
		} else if (percent > 54.704 && percent <= 58.912) {
			if (casename.equals("clutch")) {
				itemname += "Moto Gloves | Polygon";
				skindescription = "It has been constructed from a mix of man-made materials and leather in various shades of blue.";
			} else {
				itemname += "Sport Gloves | Pandora's Box";
				flavortext = "A must have for any demolitions expert with sweaty palms";
				skindescription = "The black and purple gloves have a subtle pattern printed on the palms.";
			}
		} else if (percent > 58.912 && percent <= 63.120) {
			if (casename.equals("clutch")) {
				itemname += "Driver Gloves | Overtake";
				skindescription = "Speed is of the essence with these classic black and tan leather gloves.";
			} else {
				itemname += "Driver Gloves | Crimson Weave";
				flavortext = "Leave your mark, not your fingerprints";
				skindescription = "Black suede has been interwoven with scarlet leather to give these gloves a timeless look.";
			}
		} else if (percent > 63.120 && percent <= 67.328) {
			if (casename.equals("clutch")) {
				itemname += "Specialist Gloves | Crimson Web";
				skindescription = "These red and grey gloves have been printed with a rubberized webs pattern.";
			} else {
				itemname += "Hand Wraps | Slaughter";
				flavortext = "Who doesn't love working with their hands?";
				skindescription = "Dyed crimson, these wraps make it hard to see where the fabric ends and the bloodstains begin.";
			}
		} else if (percent > 67.328 && percent <= 71.536) {
			if (casename.equals("clutch")) {
				itemname += "Sport Gloves | Amphibious";
				skindescription = "These synthetic red and green gloves are quick drying and breathable.";
			} else {
				itemname += "Moto Gloves | Boom!";
				flavortext = "POW! BOOM! BIFF!";
				skindescription = "This pair has been covered in comic book onomatopoeia.";
			}
		} else if (percent > 71.536 && percent <= 75.744) {
			if (casename.equals("clutch")) {
				itemname += "Hydra Gloves | Mangrove";
				skindescription = "It was crafted from a mix of leather, synthetic mesh, and brass.";
			} else {
				itemname += "Specialist Gloves | Emerald Web";
				flavortext = "Discipline begets success";
				skindescription = "The back of the gloves have been given a spiderweb pattern.";
			}
		} else if (percent > 75.744 && percent <= 79.952) {
			if (casename.equals("clutch")) {
				itemname += "Hand Wraps | Arboreal";
				skindescription = "These bias-tape handwraps have been dyed with a forest camo pattern.";
			} else {
				itemname += "Bloodhound Gloves | Guerrilla";
				flavortext = "Valeria plans on retribution, of that there can be no doubt... - Sebastien Hennequet, Sniper";
				skindescription = "It was made with a mix of brown leather and synthetic leather with a camo print.";
			}
		} else if (percent > 79.952 && percent <= 84.160) {
			if (casename.equals("clutch")) {
				itemname += "Moto Gloves | Transport";
				skindescription = "This pair has a subtle digital camo.";
			} else {
				itemname += "Sport Gloves | Hedge Maze";
				flavortext = "Only cowards fear flying close to the sun";
				skindescription = "The green and white gloves were manufactured by Icarus Athletics.";
			}
		} else if (percent > 84.160 && percent <= 88.368) {
			if (casename.equals("clutch")) {
				itemname += "Driver Gloves | Racing Green";
				skindescription = "This pair of green gloves has been accented with woven grey leather in a chevron pattern.";
			} else {
				itemname += "Driver Gloves | Diamondback";
				flavortext = "Standard issue is for suckers... - Imogen, Arms Dealer In Training";
				skindescription = "It has been crafted out of a mix of tan leather, black leather, and snakeskin.";
			}
		} else if (percent > 88.368 && percent <= 92.576) {
			if (casename.equals("clutch")) {
				itemname += "Specialist Gloves | Mogul";
				skindescription = "These wintery gloves would be at home on the ski hill.";
			} else {
				itemname += "Hand Wraps | Badlands";
				flavortext = "Felix turns a blind eye towards the Colation Taskforce's unsanctioned boxing league";
				skindescription = "This DIY hand protection is made of scavenged materials.";
			}
		} else if (percent > 92.576 && percent <= 96.784) {
			if (casename.equals("clutch")) {
				itemname += "Sport Gloves | Bronze Morph";
				skindescription = "A must have for any demolitions expert with sweaty palms";
			} else {
				itemname += "Moto Gloves | Cool Mint";
				flavortext = "Combat has never felt so refreshing.";
				skindescription = "The soft blue leather has been accented with arctic colored geometric designs.";
			}
		} else if (percent > 96.784 && percent <= 101) {
			if (casename.equals("clutch")) {
				itemname += "Hydra Gloves | Rattler";
				skindescription = "It was crafted from a mix of leather, snakeskin, and brass.";
			} else {
				itemname += "Specialist Gloves | Foundation";
				flavortext = "Rumor has it that Tortue was inspired by the Asiimov line of firearms";
				skindescription = "The white and black gloves have been given orange accents.";
			}
		}
		GloveStats.add(itemname);
		GloveStats.add(flavortext);
		GloveStats.add(skindescription);
		return GloveStats;
	}
}

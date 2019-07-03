import java.util.*;

public class CsgoCases extends ItemColorTracker {
	private String rarity, itemname, flavortext = "N/A", skindescription;
	private ArrayList<String> placeholder;

	public CsgoCases() {
		super();
	}
// Dev note: Create Custom Huntsman Vaulted Case with DB Retribution, P90 DW, CZ Pd, M10 Curse, USPS Orion, and M4a4 Howl

	public void getSessionWinnings() {
		System.out.println("\nPress enter to see your winnings this session!");
		HelperMethods.promptEnterKey();
		System.out.println("Winnings this session: "); // Set # of new skins and # of duplicate skins found (based in text file) later
		System.out.println("Blue (Mil-Spec): " + getBlue());
		System.out.println("Purple (Restricted): " + getPurple());
		System.out.println("Pink (Classified): " + getPink());
		System.out.println("Red (Covert): " + getRed());
		System.out.println("Gold (Exceedingly Rare): " + getGold());
		System.out.println("Stattrak Weapons: " + ItemStatistics.getStattrak());
		System.out.println("\nPress enter to go back to the main menu\n");
		HelperMethods.promptEnterKey();
	}

	// ALL CASES BELOW HERE -------------------
	// PRICE GUIDE: (They are determined by steam market median * 10)
	// Csgo weapons case = 1300 credits
	// Csgo weapons case 2 = 1200 credits
	// Csgo weapons case 3 = 400 credits
	// Chroma Case = 200 credits
	// Chroma 2 Case = 50 credits
	// Chroma 3 Case = 30 credits
	// eSports 2013 case = 1700 credits
	// eSports 2013 winter case = 550 credits
	// eSports 2014 summer case = 850 credits
	// Falchion Case = 90 credits
	// Gamma Case (1-2) = 30 credits
	// Glove Case = 30 credits
	// Huntsman Weapon Case = 175 credits
	// Operation Bravo Case = 2000 credits
	// Operation Breakout Case = 140 credits
	// Operation Hydra Case = 450 credits
	// Operation Phoenix Case = 180 credits
	// Operation Vanguard Case = 200 credits
	// Operation Wildfire Case = 70 credits
	// Revolver Case = 40 credits
	// Shadow Case = 70 credits
	// Winter Offensive Case = 200 credits
	// Spectrum Case (1-2) = 30 credits
	// Clutch Case = 30 credits
	// Horizon Case = 30 credits
	// Danger Zone Case = 200 credits
	// Prisma Case = 600 credits

	public void CsgoWeaponsCase() { // CSGO WEAPONS CASE (1)
		// #s: blue = 3, purple = 3, pink = 2, red = 1, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "MP7 | Skulls";
				flavortext = "A mass grave that fits snugly in the palm of your hands";
				skindescription = "It has been painted using a skull-patterned hydrographic with red or black accents";
				this.blue++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "AUG | Wings";
				flavortext = "An eagle looks majestic until it's clawing your eyes out";
				skindescription = "It has been decorated with dry-transfer decals of eagle feathers.";
				this.blue++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "SG 553 | Ultraviolet";
				flavortext = "Elegant design paired with brutal intent";
				skindescription = "It has individual parts spray-painted solid colors in a black and purple color scheme. ";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "M4A1-S | Dark Water";
				flavortext = "Water gives life, but it can also take it...";
				skindescription = "It has been painted in an aquatic-stripe pattern with charcoal metallic paints of various reflectivities over a chrome base coat.";
				this.purple++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "USP-S | Dark Water";
				flavortext = "Water gives life, but it can also take it...";
				skindescription = "It has been painted in an aquatic-stripe pattern with charcoal metallic paints of various reflectivities over a chrome base coat.";
				this.purple++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "Glock-18 | Dragon Tattoo";
				flavortext = "In a fairy tale the knight always slays the dragon... but this is the real world - Valeria Jenner, Revolutionary";
				skindescription = "It has been painted using a dragon decal over a metallic base coat.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "Desert Eagle | Hypnotic";
				flavortext = "You're not getting sleepy, you're passing out from blood loss";
				skindescription = "It has been painted with a pearl base coat, then spray-painted black through a stencil in a graphic pattern.";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | Case Hardened";
				flavortext = "A little color never hurt anyone";
				skindescription = "It has been color case-hardened through the application of wood charcoal at high temperatures.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			itemname = "AWP | Lightning Strike";
			flavortext = "Sometimes you don't need to strike the same place twice";
			skindescription = "It has been painted with a lightning strike motif using anodizing effect paints over a metallic base coat.";
			this.red++;
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void CsgoWeaponsCase2() { // CSGO WEAPONS CASE 2
		// #s: blue = 5, purple = 4, pink = 2, red = 1, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "SCAR-20 | Crimson Web";
				flavortext = "Be careful where you walk, you never know where the web is spread";
				skindescription = "It has been painted using a spider web-patterned hydrographic over a red base coat and finished with a semi-gloss topcoat.";
				this.blue++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "FAMAS | Hexane";
				skindescription = "It has been painted using a hexagon patterned hydrographic.";
				this.blue++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "P-250 | Hive";
				skindescription = "It has been painted using a hexagon patterned hydrographic.";
				this.blue++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "Tec-9 | Blue Titanium";
				skindescription = "It has a titanium parts whose blue color is characteristic of an oxide layer achieved via controlled anodization at 30 volts.";
				this.blue++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "M4A1-S | Blood Tiger";
				skindescription = "It has been painted using a jungle tiger hydrographic.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "Dual Berettas | Hemoglobin";
				skindescription = "It has been painted using a transparent red abstract hydrographic over a metallic base coat.";
				this.purple++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "Nova | Graphite";
				skindescription = "It has been painted in a polygon pattern with metallic paints of various reflectivities over a chrome base coat.";
				this.purple++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "Five-Seven | Case Hardened";
				flavortext = "A little color never hurt anyone";
				skindescription = "It has been color case-hardened through the application of wood charcoal at high temperatures.";
				this.purple++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "MP9 | Hypnotic";
				flavortext = "You're not getting sleepy, you're passing out from blood loss";
				skindescription = "It has been painted with a pearl base coat, then spray-painted black through a stencil in a graphic pattern.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "USP-S | Serum";
				skindescription = " It has been painted in a digital pattern with metallic paints of various reflectivities over a chrome base coat.";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "P90 | Cold Blooded";
				skindescription = "It has then been laser-etched with a slithering snake motif.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			itemname = "SSG 08 | Blood In The Water";
			skindescription = "It has been airbrushed with the image of a shark.";
			this.red++;
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void CsgoWeaponsCase3() { // CSGO WEAPONS CASE 3
		// #s: blue = 5, purple = 4, pink = 2, red = 1, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "Dual Berettas | Panther";
				skindescription = "It has been painted in a black, grey and red color scheme.";
				this.blue++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "P2000 | Red FragCam";
				skindescription = "It has been painted using a hydrographic of a polygonal camo.";
				this.blue++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "Glock-18 | Blue Fissure";
				skindescription = "It has been painted using a hydrographic in a craquelure pattern.";
				this.blue++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "C275-Auto | Crimson Web";
				flavortext = "Be careful where you walk, you never know where the web is spread";
				skindescription = "It has been painted using a spider web-patterned hydrographic over a red base coat and finished with a semi-gloss topcoat.";
				this.blue++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "USP-S | Stainless";
				skindescription = "It has a stainless steel slide.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "C275-Auto | Tread Plate";
				skindescription = "It has been covered in a metallic foil with a tread plate pattern.";
				this.purple++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "Tec-9 | Titanium Bit";
				skindescription = "Its barrel shroud has been anodized to a royal blue color and subtly fluted.";
				this.purple++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "Five-SeveN | Copper Galaxy";
				flavortext = "Stars are just pin pricks at the darkness";
				skindescription = "It has been painted with metal flake paint.";
				this.purple++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "Desert Eagle | Heirloom";
				skindescription = "It has been hand engraved and inlaid with a scroll pattern.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "C275-Auto | The Fuschia Is Now";
				skindescription = "It has been painted with a chrome base coat and candied in transparent fuschia and charcoal anodized effect paint.";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "P250 | Undertow";
				skindescription = "It has been painted using metallic paints with a silver slide and a blue and black spotted pattern on the receiver.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			itemname = "C275-Auto | Victoria";
			skindescription = "It has been decorated with gold accents and hand-engraved with a scroll pattern.";
			this.red++;
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void ChromaCase() { // CHROMA (1) CASE
		// #s: blue = 5, purple = 4, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "XM1014 | Quicksilver";
				flavortext = "Sometimes you need an unstable element to solve your problems - Kotaro Izaki, Breach Expert";
				skindescription = "It has been painted using a translucent hydrographic with a terrain map motif over metallic silver paint.";
				this.blue++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "SCAR-20 | Grotto";
				flavortext = "The founder of Season Corporation had this piece commissioned after being rescued by renowned Operator Kotaro Izaki";
				skindescription = "It has been sponged and brush-painted with blue metallic effect paints.";
				this.blue++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "Glock-18 | Catacombs";
				flavortext = "Intimidation is the sincerest form of flattery";
				skindescription = "It has been painted using a hydrographic of skulls over a silver metallic paint base.";
				this.blue++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "M249 | System Lock";
				flavortext = "Coverfire never looked so good";
				skindescription = "It has been custom painted with a sci-fi design.";
				this.blue++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "MP9 | Deadly Poison";
				flavortext = "It's not the first bite that kills you, it's the 29 that come after";
				skindescription = "It has been custom painted with dynamic, angular shapes and a stylized spider.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "Sawed-Off | Serenity";
				flavortext = "Serenity is a luxury few can afford - Valeria Jenner, Revolutionary";
				skindescription = "It has been hand painted with the image of a woman with wings.";
				this.purple++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "Dual Berettas | Urban Shock";
				flavortext = "With lightning always comes thunder";
				skindescription = "It has been custom painted with urban camo and blue accents.";
				this.purple++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "MAC-10 | Malachite";
				flavortext = "Bright colors hide a gun with a dark purpose";
				skindescription = "It has been painted using metallic effect paints and given a wavy pattern using a rubber comb tool.";
				this.purple++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "Desert Eagle | Naga";
				flavortext = "A beast in Indian mythology as well as on the battlefield";
				skindescription = "It has been engraved with a mythological motif.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "P250 | Muertos";
				flavortext = "This one is steeped in tradition and blood";
				skindescription = "It has been custom painted with circular motifs.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "AK-47 | Cartel";
				flavortext = "One little squeeze turns every morning into the Day of the Dead";
				skindescription = "It has been engraved with skeletons, flowers and serpents.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "M4A4 | 龍王 (Dragon King)";
				flavortext = "A weapon worthy of The Monkey King himself - Booth, Arms Dealer";
				skindescription = "It has been custom painted with the image of a dragon in red and blue.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "Galil AR | Chatterbox";
				flavortext = "Some say that when you laugh, the world laughs with you...but when Chatterbox laughs there are only screams";
				skindescription = "It has been hand-painted and distressed. The skull painted over the dust cover appears to chatter when the bolt reciprocates.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AWP | Man-o'-war";
				flavortext = "Turn some heads before you take them off";
				skindescription = "It has been given a base coat of blue metallic paint then hand-painted with metallic gold swirls and accents.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void Chroma2Case() { // CHROMA 2 CASE
		// #s: blue = 6, purple = 4, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "Negev | Man-o'-war";
				flavortext = "Turn some heads before you take them off";
				skindescription = "It has been given a base coat of blue metallic paint then hand-painted with metallic gold swirls and accents.";
				this.blue++;
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "MP7 | Armor Core";
				flavortext = "Perfect for the Operator that values sophistication as well as firepower - Booth, Arms Dealer";
				skindescription = "It has been painted with black oil-based paint and given brushed stainless steel parts and inlay.";
				this.blue++;
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "Sawed-Off | Origami";
				flavortext = "It takes time to build something beautiful, but only a moment to destroy it";
				skindescription = "It has been custom painted with an origami-inspired design";
				this.blue++;
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "P250 | Valence";
				flavortext = "Your skills aren't in question, your attitude is - The Teacher and The Iconoclast Part 1";
				skindescription = "It has been custom painted in a modern blue and grey design that complements the weapon's form.";
				this.blue++;
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "Desert Eagle | Bronze Deco";
				flavortext = "Everyone's searching for silver and gold";
				skindescription = "It has been painted in an art deco pattern using metallic automotive paints.";
				this.blue++;
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "AK-47 | Elite Build";
				flavortext = "Tread softly Naomi...people in your line of work aren't known for their longevity - The Shield and The Serpent Part 2";
				skindescription = "It has been custom painted using a combination of hydrographics and careful stenciling and detailed with heat-transfer decals.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "UMP-45 | Grand Prix";
				flavortext = "Don't forget your helmet";
				skindescription = "It has been custom painted with an old-fashioned racing motif.";
				this.purple++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "CZ75-Auto | Pole Position";
				flavortext = "We only get one chance at this, let's do it right - Felix Riley, Commanding Officer";
				skindescription = "It has been custom painted with a red and grey racing theme.";
				this.purple++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "MAG-7 | Heat";
				flavortext = "Make some outlines of your own";
				skindescription = "It has been custom painted to look as though it just came out of the forge.";
				this.purple++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "AWP | Worm God";
				flavortext = "There are some roots you don't want to take hold";
				skindescription = "It has been painted with the image of a skull and roots using high-durability enamel paints.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "FAMAS | Djinn";
				flavortext = "Be careful what you wish for";
				skindescription = "It has been inlaid with gold and nickel and engraved with the image of a jinn.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "Five-SeveN | Monkey Business";
				flavortext = "Sometimes it's ok to play with your food";
				skindescription = "It's a banana.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "Galil AR | Eco";
				flavortext = "For enough money, Elite Crew will take any cause on as their own";
				skindescription = "It has been painted white and green and detailed with heat-transfer decals.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "MAC-10 | Neon Rider";
				flavortext = "One part firearm, two parts Trapper Keeper";
				skindescription = "It has been custom painted with the image of a deadly biker.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "M4A1-S | Hyper Beast";
				flavortext = "You really want to impress me Booth? Make this black light sensitive - Rona Sabri, Rising Star";
				skindescription = "It has been custom painted with a beastly creature in psychedelic colors.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void Chroma3Case() { // CHROMA 3 CASE
		// #s: blue = 7, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "Sawed-Off | Fubar";
				flavortext = "It starts with a bang... it ends with silence";
				skindescription = "This well-traveled shotgun has tick marks carved into the barrel.";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "G3SG1 | Orange Crash";
				flavortext = "Become a modern day Shere Khan";
				skindescription = "Stencils and orange spray paint gave this rifle its signature look.";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "Dual Berettas | Ventilators";
				flavortext = "A weapon for artists, by artists";
				skindescription = "These pistols have been elegantly painted in chrome.";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "P2000 | Oceanic";
				flavortext = "Has anyone heard from Kotaro or Carmen? - Felix Riley, Commanding Officer";
				skindescription = "It has been given a black base coat then accented with blue designs.";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "SG 553 | Atlas";
				flavortext = "It was once a design earmarked for the Coalition Taskforce, but Huxley engaged in corporate espionage to make it a Phoenix exclusive";
				skindescription = "It has been given a modern camouflage hydrographic.";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "M249 | Spectre";
				flavortext = "The Phoenix civil war is about to begin";
				skindescription = "It has been painted in a sleek and contemporary manner.";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "MP9 | Bioleak";
				flavortext = "BEWARE DIRECT EXPOSURE";
				skindescription = "Varying shades of green create the illusion of a chemical spill.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "Tec-9 | Re-Entry";
				flavortext = "I hate being right all the time - Carmen Cocinero, Extraction Expert";
				skindescription = "The barrel has been given a flame decal.";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "Galil AR | Firefight";
				flavortext = "Booth had this weapon commissioned for Valeria in an attempt to smooth things over with the Phoenix";
				skindescription = "It has been given crimson accents and a hand painted icon.";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "XM1014 | Black Tie";
				flavortext = "We have Izaki and Cocinero. You need them for anything or can I just kill them now? - The Mercenary and The Serpent Part 1";
				skindescription = "A vision in black and white chrome, this shotgun is best used on formal occasions.";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "CZ75-Auto | Red Astor";
				flavortext = "Booth has become synonymous with family drama; and who has time for drama when we're talking business - Huxley, The Competition";
				skindescription = "It has been hand painted with red and white accents.";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "SSG 08 | Ghost Crusader";
				flavortext = "I can never replace what was taken from us... but I can take even more from them - The Phoenix and The Initiate Part 2";
				skindescription = "It has been painted white and given arctic blue accents.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "UMP-45 | Primal Saber";
				flavortext = "Every predator eventually meets their end";
				skindescription = "It has been given a decal of a sabertooth tiger skull.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "AUG | Fleet Flock";
				flavortext = "Some birds represent harmony and peace... these are not those birds";
				skindescription = "It has been given a hydrographic of birds flying through clouds.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "P250 | Asiimov";
				skindescription = "It has been custom painted with a sci-fi design.";
				flavortext = "If you think I need a rifle to kill a man, you have no idea who you're talking to... - Mikha Biton, Phoenix Sniper";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "PP-Bizon | Judgement of Anubis";
				flavortext = "Its trigger weighs lighter than a feather";
				skindescription = "It has been custom painted in an Egyptian theme";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "M4A1-S | Chantico's Fire";
				flavortext = "Protect what is yours";
				skindescription = "It has been hand painted in vibrant colors and accentuated by a smiley face on the stock.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void eSports2013Case() { // eSports 2013 CASE
		// #s: blue = 3, purple = 3, pink = 2, red = 1, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.36) {
				itemname = "M4A4 | Faded Zebra";
				skindescription = "It has been spray-painted in a zebra stripe pattern.";
				this.blue++;
			} else if (percent > 33.36 && percent <= 67.32) {
				itemname = "FAMAS | Doomkitty";
				skindescription = "It has been hydro-dipped with a graphic of overlapping cat skulls.";
				this.blue++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "MAG-7 | Memento";
				skindescription = "It has been painted using a geometric-patterned hydrographic.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "Galil AR | Orange DDPAT";
				flavortext = "By the time you're close enough to notice the pixels it's already too late";
				skindescription = "It has been painted using a Digital Disruptive Pattern (DDPAT) hydrographic.";
				this.purple++;
			} else if (percent > 33.33 && percent <= 67.32) {
				itemname = "P250 | Splash";
				skindescription = "It has been spray-painted and decorated using a splash-shaped stencil.";
				this.purple++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "Sawed-Off | Orange DDPAT";
				flavortext = "By the time you're close enough to notice the pixels it's already too late";
				skindescription = "It has been painted using a Digital Disruptive Pattern (DDPAT) hydrographic.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "AWP | BOOM";
				skindescription = "It has been painted using a hydrographic printed with comic book onomatopoeia over an orange base coat.";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | Red Laminate";
				skindescription = "It has been given a laminate stock.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			itemname = "P90 | Death by Kitty";
			skindescription = "It has been hydro-dipped with a graphic of overlapping cat skulls.";
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void eSports2013WinterCase() { // eSports 2013 Winter Case
		// #s: blue = 6, purple = 2, pink = 3, red = 1, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "Galil AR | Blue Titanium";
				skindescription = "It has a titanium parts whose blue color is characteristic of an oxide layer achieved via controlled anodization at 30 volts.";
				this.blue++;
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "Nova | Ghost Camo";
				skindescription = "It has been painted using a hydrographic with an oversized camouflage pattern.";
				this.blue++;
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "P250 | Steel Disruption";
				skindescription = "It has been covered in a metallic foil stamped with a digital disruptive pattern.";
				this.blue++;
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "G3SG1 | Azure Zebra";
				skindescription = "It has been spray-painted in a zebra stripe pattern.";
				this.blue++;
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "PP-Bizon | Water Sigil";
				skindescription = "It has been painted using a hydrographic with a Japanese inspired water pattern.";
				this.blue++;
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "Five-SeveN | Nightshade";
				skindescription = "It has been painted using a hydrographic with a floral pattern in the style of the Arts and Crafts movement.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "AK-47 | Blue Laminate";
				skindescription = "It has been given a laminate stock.";
				this.purple++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "P90 | Blind Spot";
				skindescription = "It has been painted using a hydrographic with an oversized camouflage pattern.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "Desert Eagle | Cobalt Disruption";
				skindescription = "It has been covered in a metallic foil stamped with a digital disruptive pattern.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "AWP | Electric Hive";
				skindescription = "It has been painted using a hexagon patterned hydrographic.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "FAMAS | Afterimage";
				skindescription = "It has been custom-painted with broken ribbon trails.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			itemname = "M4A4 | X-Ray";
			skindescription = "A custom painted M4 showing its internals with an X-Ray";
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void eSports2014SummerCase() { // eSports 2014 Summer Case
		// #s: blue = 6, purple = 5, pink = 4, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "XM1014 | Red Python";
				flavortext = "I know you don't believe in the cause...and when I expose you, Valeria will have your head - The Shield and The Serpent Part 1";
				skindescription = "It has been painted with a snakeskin patterned hydrographic.";
				this.blue++;
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "SSG 08 | Dark Water";
				flavortext = "Water gives life, but it can also take it...";
				skindescription = "It has been painted in an aquatic-stripe pattern with charcoal metallic paints of various reflectivities over a chrome base coat.";
				this.blue++;
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "CZ75-Auto | Hexane";
				skindescription = "It has been painted using a hexagon patterned hydrographic.";
				this.blue++;
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "USP-S | Blood Tiger";
				skindescription = "It has been painted using a jungle tiger hydrographic.";
				this.blue++;
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "Negev | Bratatat";
				skindescription = "It has been custom painted with comic book onomatopoeia and bullet holes.";
				this.blue++;
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "MAC-10 | Ultraviolet";
				flavortext = "Elegant design paired with brutal intent";
				skindescription = "It has individual parts spray-painted solid colors in a black and purple color scheme.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "Glock-18 | Steel Disruption";
				skindescription = "It has been covered in a metallic foil stamped with a digital disruptive pattern.";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "P90 | Virus";
				skindescription = "It has been painted using a zombie hydrographic over a green base coat.";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "PP-Bizon | Blue Streak";
				skindescription = "It has been painted using a semi-transparent hydrographic of a splatter pattern over an aqua blue base coat.";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "MP7 | Ocean Foam";
				skindescription = "It has been painted using a transparent blue abstract hydrographic over a metallic base coat.";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "Desert Eagle | Crimson Web";
				flavortext = "Be careful where you walk, you never know where the web is spread";
				skindescription = "It has been painted using a spider web-patterned hydrographic over a red base coat and finished with a semi-gloss topcoat.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "P2000 | Corticera";
				skindescription = "It has has been painted with a corticera tree motif.";
				this.pink++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "AWP | Corticera";
				skindescription = "It has has been painted with a corticera tree motif.";
				this.pink++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "Nova | Bloomstick";
				skindescription = "It has been airbrushed by hand with a cherry blossom motif, then given a high-gloss top coat.";
				this.pink++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "AUG | Bengal Tiger";
				skindescription = "It has been painted using a tiger stripe hydrographic.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "M4A4 | Bullet Rain";
				skindescription = "It has been custom-painted with a graphic of clouds raining bullets.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | Jaguar";
				skindescription = "It has been custom painted with the image of a panther over a tiger camo background.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void FalchionCase() { // FALCHION CASE
		// #s: blue = 6, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "UMP-45 | Riot";
				flavortext = "If you didn't want collateral damage, perhaps you should have been more specific... - Javier Alviso, Fist of the Phoenix";
				skindescription = "It has been painted using a combination of hydrographics and heat-transfer decals.";
				this.blue++;
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "Nova | Ranger";
				flavortext = "Who's keeping score?";
				skindescription = "It has been painted with a brush stroke hydrographic and detailed with heat-transfer decals.";
				this.blue++;
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "P90 | Elite Build";
				flavortext = "Tread softly Naomi...people in your line of work aren't known for their longevity - The Shield and The Serpent Part 2";
				skindescription = "It has been custom painted using a combination of hydrographics and careful stenciling and detailed with heat-transfer decals.";
				this.blue++;
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "Glock-18 | Bunsen Burner";
				flavortext = "KNOCK KNOCK";
				skindescription = "It has been given a blue patina which has been polished off parts of the slide to result in a graphic flame design";
				this.blue++;
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "Galil AR | Rocket Pop";
				flavortext = "The perfect thing for a hot summer's day";
				skindescription = "It has been custom painted with a graphic design of stripes and pixellated particles.";
				this.blue++;
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "USP-S | Torque";
				flavortext = "They're manipulating you Kotaro. And if you can't see that, you're in more trouble than you know... - Felix Riley, Commanding Officer";
				skindescription = "It has been custom painted in a modern black, white and yellow design.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "FAMAS | Neural Net";
				flavortext = "I know. But it was the right thing to do... - A Family Affair Part 2";
				skindescription = "It has been painted with a translucent hydrographic over a metallic base coat.";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "MP9 | Ruby Poison Dart";
				flavortext = "Who says diamonds are a girl's best friend?";
				skindescription = "It has been painted with red and purple metallic paints over a black base coat.";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "P2000 | Handgun";
				flavortext = "No more fun and games";
				skindescription = "It has been custom painted with a hand making an aiming gesture.";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "Negev | Loudmouth";
				flavortext = "Get back here, I'm talking to you!";
				skindescription = "It has been custom painted with a monstrous design and then distressed.";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "M4A4 | Evil Daimyo";
				flavortext = "Carmen. I found him...- The Oni and The Valkyrie Part 1";
				skindescription = "It has been custom painted with a graphic design in red and black.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "CZ75-Auto | Yellow Jacket";
				flavortext = "Float like a butterfly, sting like a relentless hateful insect";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "MP7 | Nemesis";
				flavortext = "It's coming for you";
				skindescription = " It has been custom painted with the image of a metallic monster.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "SG 553 | Cyrex";
				flavortext = "Sebastien is coming for me Valeria... we don't have much time - Chase Turner, Coalition Defector";
				skindescription = "It has been custom painted with a high-tech design in black, white, and red.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "AK-47 | Aquamarine Revenge";
				flavortext = "Is there an echo in here?";
				skindescription = "It has been custom painted with the image of a pod of dolphins.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AWP | Hyper Beast";
				flavortext = "You really want to impress me Booth? Make this black light sensitive - Rona Sabri, Rising Star";
				skindescription = "It has been custom painted with a beastly creature in psychedelic colors.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.KnifeSkin("Falchion Knife ", "A modern homage to a falchion sword, this clip point blade has a curved edge.");
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void GammaCase() { // GAMMA (1) CASE
		// #s: blue = 7, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "PP-Bizon | Harvester";
				flavortext = "Biomechanic experimentation gone right";
				skindescription = "It has been decorated with a bio-mechanical motif.";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "Nova | Exo";
				flavortext = "It's what's inside that counts";
				skindescription = "It has been painted with hydrographic a silver panel motif over a purple pattern base.";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "Tec-9 | Ice Cap";
				flavortext = "Submerge the opposition";
				skindescription = "It has been painted with a blue and white abstract hydrographic.";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "MAC-10 | Carnivore";
				flavortext = "Prepare before serving";
				skindescription = "It has been painted using a red and purple hydrographic over a metallic base coat.";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "P250 | Iron Clad";
				flavortext = "Reliability and safety guaranteed";
				skindescription = "It has been decorated with riveted metal panels.";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "Five-SeveN | Violent Daimyo";
				flavortext = "How will you rule?";
				skindescription = "It has been custom painted with a graphic design in violet and black.";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "SG 553 | Aerial";
				flavortext = "Establish air superiority";
				skindescription = "It has been painted with silver and yellow and given a white wing decal.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "Sawed-Off | Limelight";
				flavortext = "All eyes on you";
				skindescription = "It has been custom painted with swooping curves in lime green and white.";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "P90 | Chopper";
				flavortext = "Clutch not included";
				skindescription = "It has been painted with a flame motif in orange and blue metallic paints.";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "R8 Revolver | Reboot";
				flavortext = "Have you tried turning it off and on again?";
				skindescription = "It has been decorated with red accents over silver and black panels.";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "AUG | Aristocrat";
				flavortext = "For the 1%";
				skindescription = "It has silver filigree appliqués over an light blue anodized base.";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "AWP | Phobos";
				flavortext = "Build a better world";
				skindescription = "It is constructed of metal panels and durable electronic components.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "P2000 | Imperial Dragon";
				flavortext = "Look to the West";
				skindescription = "It has custom painted with the motif of a dragon using red metallic paints.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "SCAR-20 | Bloodsport";
				flavortext = "CT-side sponsored by…";
				skindescription = "It has been covered in white logo decals over a red and black hydrographic.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "M4A4 | Desolate Space";
				flavortext = "We've lost contact";
				skindescription = "It has been custom painted with a space theme.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "Glock-18 | Wasteland Rebel";
				flavortext = "Pay tribute";
				skindescription = "It has been distressed, block printed, and painted with graffiti.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "M4A1-S | Mecha Industries";
				flavortext = "Featuring all new technology";
				skindescription = "It is constructed of hardened ceramic panels.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void Gamma2Case() { // GAMMA 2 CASE
		// #s: blue = 7, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "Five-SeveN | Scumbria";
				flavortext = "You can't leave him to die, Felix; you have to save him - The Daughter and the Paladin Part 1";
				skindescription = "It has been discretely painted with stripes.";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "G3SG1 | Ventilator";
				flavortext = "Don't worry Naomi, I'll make Felix pay - Mikha Biton, Phoenix Sniper";
				skindescription = "It has been given an elegant black and chrome paintjob and a custom rubber stock.";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "XM1014 | Slipstream";
				flavortext = "Patience, Elliott; they still have a role to play... - The Mercenary and The Serpent Part 2";
				skindescription = "It has been custom painted with smoky greys and vibrant blues.";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "Negev | Dazzle";
				flavortext = "Finally, a gun for trivia lovers";
				skindescription = "It has been covered in blue and white zebra stripe decals.";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "CZ75-Auto | Imprint";
				flavortext = "Couture firearms have taken the Czech Republic by storm";
				skindescription = "It has been painstakingly etched by hand.";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "UMP-45 | Briefing";
				flavortext = "This is going to be a short meeting...";
				skindescription = "It has been given a hydrographic of a topographical map";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "P90 | Grim";
				flavortext = "Imogen... are you selling me a gun or a velvet poster? – Rona Sabri, Rising Star";
				skindescription = "It has been given a hydrographic of murderous specters, then dry brushed with green accents.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "MAG-7 | Petroglyph";
				flavortext = "Conflict existed since the first caveman learned how to pick up a rock – Booth, Arms Dealer";
				skindescription = "It has been custom painted to give the illusion of a rock craving.";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "SCAR-20 | Powercore";
				flavortext = "Rule No. 1 – Challenge demands satisfaction";
				skindescription = "It has been custom painted in green with yellow accents, then given a USB code for quick checkout.";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "SG 553 | Triarch";
				flavortext = "Remind them of your love";
				skindescription = "This rifle was commissioned by royalty and given custom desert camo.";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "Glock-18 | Weasel";
				flavortext = "Just because he's cute, doesn't mean he doesn't bite";
				skindescription = "It has been given a hydrographic of Bobby the Mischievous Weasel. Don't mess with Bobby.";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "Desert Eagle | Directive";
				flavortext = "Your move...";
				skindescription = "It has been designed to help the future of law enforcement stop creeps.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "Tec-9 | Fuel Injector";
				flavortext = "Pit crew not included";
				skindescription = "A hand-stitched leather grip completes this Seattle classic.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "MP9 | Airlock";
				flavortext = "Perfect for shooting toasters";
				skindescription = "It has been painted white and given a stark red magazine";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "AUG | Syd Mead";
				flavortext = "In the past he gave us visions of the future; in the present he placed the future in our hands...";
				skindescription = "It has been custom designed by renowned artist Syd Mead.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "FAMAS | Roll Cage";
				flavortext = "Safety first";
				skindescription = "It has been given custom decals that resemble a mud-splattered car chassis.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | Neon Revolution";
				flavortext = "No suicide squad would be complete without it";
				skindescription = "It has been given an eclectic mix of hydrographic decals then drip painted.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void GloveCase() { // GLOVE CASE
		// #s: blue = 7, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "CZ75-Auto | Polymer";
				flavortext = "You're not dealing with The Phoenix anymore, we know how to take care of our own... - The Daughter and the Paladin Part 2";
				skindescription = "The slide has been given a decal that resembles a polymer formula.";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "MP9 | Sand Scale";
				flavortext = "We must prepare for retaliation - Felix Riley, Commanding Officer";
				skindescription = "It has been custom painted grey and tan.";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "MAG-7 | Sonar";
				flavortext = "You're right, losing is a new experience for me – The Oni and The Valkyrie Part 2";
				skindescription = "It has been lightly stenciled in turquoise.";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "Galil AR | Black Sand";
				flavortext = "Mikah Baton is about to begin his campaign against the Coalition Taskforce";
				skindescription = "It has been custom painted in black and camo.";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "P2000 | Turf";
				flavortext = "The grass is always redder on the opposing side";
				skindescription = "The grip and slide have been painted metallic green.";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "MP7 | Cirrus";
				flavortext = "Get your head out of the clouds";
				skindescription = "It has been painted metallic blue and given a skull decal.";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "Glock-18 | Ironwork";
				flavortext = "Left unchecked, any garden becomes a tangled mass of weeds";
				skindescription = "The slide has been laser etched to depict ivy and thorns.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "G3SG1 | Stinger";
				flavortext = "A moment of pain. Then nothing.";
				skindescription = "It has been given yellow and grey accents.";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "Nova | Gila";
				flavortext = "You're acting like you've never been held captive by mercenaries before – The Oni and The Valkyrie Part 1";
				skindescription = "It has been covered in a lizard skin decal.";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "Dual Berettas | Royal Consorts";
				flavortext = "Face off and release the doves";
				skindescription = "Between the green dyed pearl handled grips, gryphon side plates, and laser etched slide; these pistols redefine elegance.";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "M4A1-S | Flashback";
				flavortext = "For the joker in all of us";
				skindescription = "It has been hand painted in an attempt to make a suggestion about the duality of man.";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "USP-S | Cyrex";
				flavortext = "Imogen was the past Felix, I'm the future - Huxley, The Competition";
				skindescription = "It was been given discreet red highlights to give off a futuristic feel.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "Sawed-Off | Wasteland Princess";
				flavortext = "A perfect gift for the sociopath that has everything...";
				skindescription = "Someone has been keeping track of kills on the barrel.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "P90 | Shallow Grave";
				flavortext = "With the amount of bodies you're racking up, who has time to dig?";
				skindescription = "The grips have been painted to resemble rune stones, and a hydrographic of a skeleton has been applied to the stock";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "FAMAS | Mecha Industries";
				flavortext = "Spikey blue hair and robot companion not included";
				skindescription = "It's stark white and black design make it feel like it came from a sci-fi show.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "SSG 08 | Dragonfire";
				flavortext = "Sit on your horde and wait for any who come to take it";
				skindescription = "It has been given a hydrographic of a monstrous dragon snorting fire.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "M4A4 | Buzz Kill";
				flavortext = "There's one at every party";
				skindescription = "This Sektor Industry firearm has been sleekly painted in yellow and green.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = GloveSkinGenerator.gloveSkin("glove");
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void HuntsmanWeaponCase() { // HUNTSMAN WEAPON CASE
		// #s: blue = 6, purple = 4, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "Galil AR | Kami";
				flavortext = "Some ghosts won't stay buried";
				skindescription = "It has been painted using a hydrographic in a Japanese manga pattern.";
				this.blue++;
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "SSG 08 | Slashed";
				skindescription = "It has been painted using a hydrographic in a claw mark pattern.";
				this.blue++;
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "Tec-9 | Isaac";
				skindescription = "It has been custom painted with a sci-fi design.";
				this.blue++;
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "P2000 | Pulse";
				flavortext = "Striking colors for a striking weapon";
				skindescription = "It has been painted with a hydrographic of bold fuchsia fragments.";
				this.blue++;
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "CZ75-Auto | Twist";
				skindescription = "It has been painted with a spiral design leaving the handle white.";
				this.blue++;
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "P90 | Module";
				skindescription = "It has been painted using metallic paints with an overlayed hexagonal pattern.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "PP-Bizon | Antique";
				flavortext = "With age comes wisdom and stopping power";
				skindescription = "It has been painted using a combination of hydrographics and dry-transfer decals to create the look of a wood stock and gold inlay.";
				this.purple++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "XM1014 | Heaven Guard";
				flavortext = "Sometimes the wings of an angel don't mean salvation";
				skindescription = "It has been painted using a combination of subtly patterned hydrographics and dry-transfer decals of wings.";
				this.purple++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "AUG | Torque";
				skindescription = "It has been custom painted with a robotics inspired pattern.";
				this.purple++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "MAC-10 | Tatter";
				skindescription = "It has been custom painted with a high-tech design reminiscent of flames.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "SCAR-20 | Cyrex";
				flavortext = "Sebastien is coming for me Valeria... we don't have much time - Chase Turner, Coalition Defector";
				skindescription = "It has been custom painted with a high-tech design in black, white, and red.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "M4A1-S | Atomic Alloy";
				skindescription = "It has been anodized black and orange.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "USP-S | Caiman";
				skindescription = "It has been custom painted with an image of a Caiman.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "AK-47 | Vulcan";
				skindescription = "It has been custom painted in a sports inspired design.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "M4A4 | Desert-Strike";
				skindescription = "It has been custom painted with a high-tech design in tan and black.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.KnifeSkin("Huntsman Knife ", "A knife designed for modern tactical uses, the blade is well suited for a range of both combat and utilitarian needs.");
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void OperationBravoCase() { // OPERATION BRAVO CASE
		// #s: blue = 6, purple = 4, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "G3SG1 | Demeter";
				flavortext = "Patience is a virtue";
				skindescription = "This memento from Ali has been painted with a mosaic hydrographic.";
				this.blue++;
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "UMP-45 | Bone Pile";
				flavortext = "One more for the collection";
				skindescription = "This memento from Cache has been painted with skulls over a wiring diagram.";
				this.blue++;
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "Nova | Tempest";
				flavortext = "A storm is coming";
				skindescription = "This memento from Seaside has been painted with a wave and cloud motif hydrographic.";
				this.blue++;
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "Dual Berettas | Black Limba";
				flavortext = "Where classic construction meets modern aesthetics";
				skindescription = "This memento from Agency has a dark patina and grips of black limba wood.";
				this.blue++;
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "SG 553 | Wave Spray";
				flavortext = "Perfect for the insurgent on the go";
				skindescription = "This memento from Seaside has been spray-painted freehand with short, thick lines in contrasting colors.";
				this.blue++;
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "Galil AR | Shattered";
				flavortext = "My men are professionals, they'll get the job done right... - Elliott Kingsman, Career Criminal";
				skindescription = "This memento from Agency has been painted with a polygonal patterned hydrographic.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "M4A1-S | Bright Water";
				flavortext = "Ours is a world of intrigue...but sometimes camouflage is meant to be seen - Booth, Arms Dealer";
				skindescription = "This memento from Seaside has been painted using a blue camo hydrographic.";
				this.purple++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "MAC-10 | Graven";
				flavortext = "It breaks two commandments at the same time";
				skindescription = "This memento from Gwalior has engraved brass parts.";
				this.purple++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "M4A4 | Zirka";
				flavortext = "Imogen shares her father's eye for quality, but her ambition is even fiercer";
				skindescription = "This memento from Cache has been painted with a star motif.";
				this.purple++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "USP-S | Overgrowth";
				flavortext = "Look me in the eyes and tell me that's standard issue - Felix Riley, Commanding Officer";
				skindescription = "This memento from Siege has been painted using a camo hydrographic.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "P90 | Emerald Dragon";
				flavortext = "Tradition can be dangerous";
				skindescription = "This memento from Chinatown has been painted with a dragon motif.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "P2000 | Ocean Foam";
				flavortext = "Waves break, our resolve doesn't - Kotaro Izaki, Breach Expert";
				skindescription = "This memento from Seaside has been painted using a transparent blue abstract hydrographic over a metallic base coat.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "AWP | Graphite";
				flavortext = "Pencils down, hands up";
				skindescription = "This memento from Agency has been painted in a polygon pattern with metallic paints of various reflectivities over a chrome base coat.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "Desert Eagle | Golden Koi";
				flavortext = "A loud gun in every sense of the word";
				skindescription = "This memento from Chinatown has been covered in a metallic foil with a scale pattern.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | Fire Serpent";
				flavortext = "If you want to survive in the streets, learn to spit fire";
				skindescription = "This memento from Ruins has been painted with a fire serpent motif.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void OperationBreakoutCase() { // OPERATION BREAKOUT WEAPON CASE
		// #s: blue = 5, purple = 4, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "Negev | Desert-Strike";
				skindescription = "It has been custom painted with a high-tech design in tan and black.";
				this.blue++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "UMP-45 | Labyrinth";
				skindescription = "It has been painted with subtle orange linework.";
				this.blue++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "MP7 | Urban Hazard";
				skindescription = "It has been custom painted with urban camo and orange accents.";
				this.blue++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "P2000 | Ivory";
				skindescription = "It has faux ivory parts.";
				this.blue++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "SSG 08 | Abyss";
				skindescription = "It has been painted with a hydrographic in an oceanic pattern.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "PP-Bizon | Osiris";
				skindescription = "It has been custom painted with a high-tech design in black, white, and amber.";
				this.purple++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "Nova | Koi";
				skindescription = "It has been custom painted with variegated koi scales.";
				this.purple++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "P250 | Supernova";
				skindescription = "It has been painted with a hydrographic in a cosmic pattern with concentric circles.";
				this.purple++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "CZ75-Auto | Tigris";
				skindescription = "It has been custom painted with high-gloss paint in a tiger stripe motif.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "Five-SeveN | Fowl Play";
				skindescription = "It has been painted with a pattern of falling feathers.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "Desert Eagle | Conspiracy";
				skindescription = "It has been painted with dark, metallic paint and pale yellow accents.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "Glock-18 | Water Elemental";
				skindescription = "It has been custom painted with the image of a creature made of water in a graphic style.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "M4A1-S | Cyrex";
				flavortext = "Sebastien is coming for me Valeria... we don't have much time - Chase Turner, Coalition Defector";
				skindescription = "It has been custom painted with a high-tech design in black, white, and red.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "P90 | Asiimov";
				flavortext = "Anyone can predict the future... a visionary shapes it";
				skindescription = "It has been custom painted with a sci-fi design.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.KnifeSkin("Butterfly Knife ", "The defining characteristic of this weapon is the fan-like opening of a freely pivoting blade, allowing rapid deployment or concealment.");
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void OperationHydraCase() { // OPERATION HYDRA CASE
		// #s: blue = 7, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "UMP-45 | Metal Flowers";
				flavortext = "In memoriam";
				skindescription = "It has been given a steel-colored pattern of funeral roses";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "Tec-9 | Cut Out";
				flavortext = "Spring has sprung";
				skindescription = "An intricate pattern of butterflies and floral details has been applied.";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "FAMAS | Macabre";
				flavortext = "A gruesome discovery";
				skindescription = "It has been spray painted with a green design over a yellow undercoat.";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "MAC-10 | Aloha";
				flavortext = "For the noncommittal";
				skindescription = "It has been airbrushed with a red hibiscus pattern.";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "MAG-7 | Hard Water";
				flavortext = "I wouldn't drink that";
				skindescription = "It has been painted with a grey anodized pattern and finished with blue highlights.";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "M4A1-S | Briefing";
				flavortext = "Everybody has a plan…";
				skindescription = "It has been given a hydrographic of a topographical map.";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "USP-S | Blueprint";
				flavortext = "Sometimes the best-laid plans go awry";
				skindescription = "It has been hand painted using a blue theme to resemble an architect's blueprint.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "P250 | Red Rock";
				flavortext = "Just over the horizon";
				skindescription = "A custom DDPAT camouflage with yellows and oranges has been applied.";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "P90 | Death Grip";
				flavortext = "Do not go quietly";
				skindescription = "A hydrographic pattern of overlapping hands has been applied to a blue base.";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "P2000 | Woodsman";
				flavortext = "The orange is for you, not me";
				skindescription = "It has been hand painted with custom green camouflage and orange detailing.";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "SSG 08 | Death's Head";
				flavortext = "Quid pro quo";
				skindescription = "It has been hand painted to resemble a death's-head hawkmoth.";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "AK-47 | Orbit Mk01";
				flavortext = "Recovered from COLONY01";
				skindescription = "It has been hand painted with a red and black design.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "Dual Berettas | Cobra Strike";
				flavortext = "They always strike back";
				skindescription = "A cobra has been hand painted on either grip. The slide displays its neon venom.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "Galil AR | Sugar Rush";
				flavortext = "Prepare for the crash";
				skindescription = "It has been custom painted using cotton candy themed colors and various patterns.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "M4A4 | Hellfire";
				flavortext = "And brim pebbles";
				skindescription = "A devil-like creature has been hand painted among fire and chains.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "Five-SeveN | Hyper Beast";
				flavortext = "We're all monsters";
				skindescription = "It has been custom painted with a beastly creature in psychedelic colors.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AWP | Oni Taiji";
				flavortext = "Face your demons";
				skindescription = "It has been hand painted with colorful samurai and Oni imagery.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = GloveSkinGenerator.gloveSkin("glove");
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void OperationPhoenixCase() { // OPERATION PHOENIX WEAPON CASE
		// #s: blue = 4, purple = 4, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "Tec-9 | Sandstorm";
				flavortext = "It'll take more than a tarp to protect you";
				skindescription = "It has been painted using a hydrographic in a purple and beige graphic design.";
				this.blue++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "UMP-45 | Corporal";
				flavortext = "Respect can never be taken, only earned";
				skindescription = "It has been custom painted in a military motif.";
				this.blue++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "Negev | Terrain";
				flavortext = "For someone who is supposed to be impartial, your daughter made an interesting choice for companionship - The Father and The Phoenix Part 1";
				skindescription = "It has been painted using a hydrographic with a terrain motif.";
				this.blue++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "MAG-7 | Heaven Guard";
				flavortext = "Sometimes the wings of an angel don't mean salvation";
				skindescription = "It has been painted using a combination of subtly patterned hydrographics and dry-transfer decals of wings.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "FAMAS | Sergeant";
				flavortext = "Lead by example";
				skindescription = "It has been given a patina of varying depth using masking fluid to create a military motif, sealed with a satin finish.";
				this.purple++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "MAC-10 | Heat";
				flavortext = "Make some outlines of your own";
				skindescription = "It has been custom painted to look as though it just came out of the forge.";
				this.purple++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "USP-S | Guardian";
				flavortext = "I can follow procedure and get 7 out, or I can do it my way and save all 10... your choice - Carmen Cocinero, Extraction Expert";
				skindescription = "It has been painted cobalt blue and stenciled with the CT logo on the slide.";
				this.purple++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "SG 553 | Pulse";
				flavortext = "Striking colors for a striking weapon";
				skindescription = "It has been painted with a hydrographic of bold fuchsia fragments.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "P90 | Trigon";
				flavortext = "Become a human typhoon";
				skindescription = "It has been custom painted in contrasting orange, grey and black.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "Nova | Antique";
				flavortext = "With age comes wisdom and stopping power";
				skindescription = "It has been painted using a combination of hydrographics and dry-transfer decals to create the look of a wood stock and gold inlay.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "AK-47 | Redline";
				flavortext = "Never be afraid to push it to the limit";
				skindescription = "It has been painted using a carbon fiber hydrographic and a dry-transfer decal of a red pinstripe.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "AUG | Chameleon";
				flavortext = "Subtlety can make all the difference";
				skindescription = "It has been custom painted with the image of a chameleon.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AWP | Asiimov";
				flavortext = "Anyone can predict the future... a visionary shapes it";
				skindescription = "It has been custom painted with a sci-fi design.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void OperationVanguardCase() { // OPERATION VANGUARD WEAPON CASE
		// #s: blue = 5, purple = 4, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "G3SG1 | Murky";
				flavortext = "There is always some place darker you can go";
				skindescription = "It has been anodized then painted using a leopard-spot hydrographic.";
				this.blue++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "Five-SeveN | Urban Hazard";
				flavortext = "Every year, Booth gathers the worlds foremost designer gunsmiths to show off their latest designs";
				skindescription = "It has been custom painted with urban camo and red accents.";
				this.blue++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "UMP-45 | Delusion";
				flavortext = "Carcosa is calling";
				skindescription = "It has been screen printed with a nautilus design.";
				this.blue++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "MP9 | Dart";
				flavortext = "Throw enough downfield and you're bound to hit the bullseye eventually";
				skindescription = "It has been painted using a striped hydrographic arranged in a chevron pattern.";
				this.blue++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "MAG-7 | Firestarter";
				flavortext = "It always begins with a tiny spark";
				skindescription = "It has been spray-painted in layers then distressed to give the appearance of burning edges.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "Sawed-Off | Highwayman";
				flavortext = "You don't have to hold your pinky out when pulling the trigger, but it's a nice touch";
				skindescription = "It has been lacquered in black and gold using a scotch thistle motif.";
				this.purple++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "Glock-18 | Grinder";
				flavortext = "The only way to make diamonds is by applying pressure";
				skindescription = "The steel slide has been painted using a combination of stenciling and hand-painting using oil paints.";
				this.purple++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "M4A1-S | Basilisk";
				flavortext = "It's rude to stare, but war isn't the time for pleasantries";
				skindescription = "It has been etched with a basilisk.";
				this.purple++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "M4A4 | Griffin";
				flavortext = "Felix handpicked his team from operators all over the world... and while people question their personalities, they never question the results";
				skindescription = "It has been hand-painted with an illustration of a griffin.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "P250 | Cartel";
				flavortext = "One little squeeze turns every morning into the Day of the Dead";
				skindescription = "It has been engraved with skeletons, flowers and serpents.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "SCAR-20 | Cardiac";
				flavortext = "beep. beep. beeeeeeeeeeeep...";
				skindescription = "It has been heat wrapped with vinyl pre-printed in a modern orange and blue design.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "XM1014 | Tranquility";
				flavortext = "I'm not here for what I need; I'm here for something I want - Imogen and The Oni Part 2";
				skindescription = "It has been hand painted with the image of a woman with long hair.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "P2000 | Fire Elemental";
				flavortext = "Sometimes playing with fire is a good thing";
				skindescription = "It has been custom painted with the image of a creature made of fire in a graphic style.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | Wasteland Rebel";
				flavortext = "One day they will ask why we fight, and when they do they will understand - Naomi, Bodyguard to Valeria Jenner";
				skindescription = "It has been distressed, block printed, and painted with graffiti.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void OperationWildfireCase() { // OPERATION WILDFIRE CASE
		// #s: blue = 6, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "Tec-9 | Jambiya";
				flavortext = "Shahrazad told 1000 tales... this is the last one you'll hear";
				skindescription = "It has been hand painted and laser-etched with middle eastern patterns.";
				this.blue++;
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "MAC-10 | Lapis Gator";
				flavortext = "Airboat not included";
				skindescription = "It has been given a hydrographic of vibrant alligator skin.";
				this.blue++;
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "Dual Berettas | Cartel";
				flavortext = "That's why Huxley is doing the heavy lifting, all we have to is nudge her forward... - The Serpent and The Truth Seeker, Part 2";
				skindescription = "It has been engraved with skeletons, flowers and serpents.";
				this.blue++;
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "PP-Bizon | Photic Zone";
				flavortext = "That's not crashing waves you hear...";
				skindescription = "It has been given a custom camouflage pattern accented with florescent paint.";
				this.blue++;
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "SSG 08 | Necropos";
				flavortext = "Every carpenter needs their hammer, every tailor their spindle...";
				skindescription = "It has been hand painted with nefarious runes.";
				this.blue++;
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "USP-S | Lead Conduit";
				flavortext = "You got what you wanted, now do you know what that means? – Booth, Arms Dealer";
				skindescription = "It has been given a custom engraved silencer and slide.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "Tec-9 | Jambiya";
				flavortext = "Shahrazad told 1000 tales... this is the last one you'll hear";
				skindescription = "It has been hand painted and laser-etched with middle eastern patterns.";
				this.purple++;
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "MAC-10 | Lapis Gator";
				flavortext = "Airboat not included";
				skindescription = "It has been given a hydrographic of vibrant alligator skin.";
				this.purple++;
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "Dual Berettas | Cartel";
				flavortext = "That's why Huxley is doing the heavy lifting, all we have to is nudge her forward... - The Serpent and The Truth Seeker, Part 2";
				skindescription = "It has been engraved with skeletons, flowers and serpents.";
				this.purple++;
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "PP-Bizon | Photic Zone";
				flavortext = "That's not crashing waves you hear...";
				skindescription = "It has been given a custom camouflage pattern accented with florescent paint.";
				this.purple++;
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "SSG 08 | Necropos";
				flavortext = "Every carpenter needs their hammer, every tailor their spindle...";
				skindescription = "It has been hand painted with nefarious runes.";
				this.purple++;
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "USP-S | Lead Conduit";
				flavortext = "You got what you wanted, now do you know what that means? – Booth, Arms Dealer";
				skindescription = "It has been given a custom engraved silencer and slide.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "Nova | Hyper Beast";
				flavortext = "They call you The Oni, right? Such a scary name for such a sad man... – Elliot Kingsman, Mercenary";
				skindescription = "It has been custom painted with a beastly creature in psychedelic colors.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "AWP | Elite Build";
				flavortext = "Chase Turner was a great man... you have big shoes to fill – The Phoenix and The Initiate, Part 1";
				skindescription = "It has been custom painted using a combination of hydrographics and careful stenciling and detailed with heat-transfer decals.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "Desert Eagle | Kumicho Dragon";
				flavortext = "I'm a big fan of your work Yukako, we should talk... -Huxley, The Competition";
				skindescription = "Dragons have been laser-etched onto the slide and grip.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "M4A4 | The Battlestar";
				flavortext = "Beware those who speak of the watchtower";
				skindescription = "All corners have been cut off the receipt of purchase.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | Fuel Injector";
				flavortext = "Live your life a quarter mag at a time";
				skindescription = "The body of the rifle has been painted bright yellow and the magazine has been custom painted to look like machinery.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.KnifeSkin("Bowie Knife ", "This full-tang sawback Bowie knife is designed for heavy use in brutal survival situations.");
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void RevolverCase() { // REVOLVER CASE
		// #s: blue = 6, purple = 6, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "SCAR-20 | Outbreak";
				flavortext = "Valeria is getting bolder... the time has come to take the fight to her - Felix Riley, Commanding Officer";
				skindescription = "It has been painted with vibrant shades of green.";
				this.blue++;
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "Sawed-Off | Yorick";
				flavortext = "Rosencrantz and Guildenstern never had a chance...";
				skindescription = "It has been given a skull hydrographic and hand painted gold accents.";
				this.blue++;
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "P2000 | Imperial";
				flavortext = "That's why Huxley is doing the heavy lifting, all we have to is nudge her forward... - The Serpent and The Truth Seeker, Part 2";
				skindescription = "It has been engraved with skeletons, flowers and serpents.";
				this.blue++;
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "AUG | Ricochet";
				flavortext = "My feelings are irrelevant Keo, I have an empire to protect - Booth, Arms Dealer";
				skindescription = "It has been laser-etched and painted with red and yellow metallics.";
				this.blue++;
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "Desert Eagle | Corinthian";
				flavortext = "Protect. Hope. Trust. Persevere.";
				skindescription = "It has been laser-etched and given a custom leather grip.";
				this.blue++;
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "R8 Revolver | Crimson Web";
				flavortext = "Be careful where you walk, you never know where the web is spread";
				skindescription = "It has been painted using a spider web-patterned hydrographic over a red base coat and finished with a semi-gloss topcoat.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "XM1014 | Teclu Burner";
				flavortext = "Sometimes a bunsen isn't enough...";
				skindescription = "Metallic paint has been used to add flames.";
				this.purple++;
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "Tec-9 | Avalanche";
				flavortext = "We must be smart how we move against her, one wrong move and she'll come crashing down on both of us - The Serpent and the Truth Seeker";
				skindescription = "It has been custom painted with a sleek and futuristic hydrographic.";
				this.purple++;
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "PP-Bizon | Fuel Rod";
				flavortext = "Sometimes grunts have the upper hand";
				skindescription = "It has been custom painted to give the illusion of irradiated ammo.";
				this.purple++;
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "Five-SeveN | Retrobution";
				flavortext = "Some things never go out of style";
				skindescription = "It was been custom painted with a retro hydrographic.";
				this.purple++;
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "Negev | Power Loader";
				flavortext = "Feared by Queens. Beloved by Bishops.";
				skindescription = "It has been custom painted with a hydrographic reminiscent of heavy machinery.";
				this.purple++;
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "SG 553 | Tiger Moth";
				flavortext = "Valeria is getting bolder... the time has come to take the fight to her - Felix Riley, Commanding Officer";
				skindescription = "It has been custom painted with a moth wing pattern.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "P90 | Shapewood";
				flavortext = "Tweezers not included";
				skindescription = "The wooden stock has been hand-carved, sanded, and laminated.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "G3SG1 | The Executioner";
				flavortext = "I always take a trophy - Javier Alviso, Fist of the Phoenix";
				skindescription = "It has been hand painted with a gruesome display of bone.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "AK-47 | Point Disarray";
				flavortext = "Up close it is chaos... from a distance it is beauty - Franz Kriegeld, Phoenix Tactician";
				skindescription = "It has been custom painted with a geometric hydrographic.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "R8 Revolver | Fade";
				flavortext = "This isn't just a weapon, it's a conversation piece - Imogen, Arms Dealer In Training";
				skindescription = "It has been painted by airbrushing transparent paints that fade together over a chrome base coat.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "M4A4 | Royal Paladin";
				flavortext = "This phonecall never happened, do you understand? - The Paladin and the Father Part 1";
				skindescription = "It has been painstakingly etched and painted to give a sense of grandeur.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void ShadowCase() { // SHADOW CASE
		// #s: blue = 7, purple = 4, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "SCAR-20 | Green Marine";
				flavortext = "Listen up people... Izaki and Cocinero may be AWOL, but our mission remains the same: we're saving Alex Kincaide - Felix Riley, Commanding Officer";
				skindescription = "It has been given a camouflage pattern with metallic paint.";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "XM1014 | Scumbria";
				flavortext = "Let's not be hasty: there may be another way to get Valeria's attention... - A Father's Love Part 3";
				skindescription = "It has been subtly painted with metallic paints.";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "MAG-7 | Cobalt Core";
				flavortext = "Keep him safe, Carmen - The Valkyrie and The Paramour Part 1";
				skindescription = "It has been custom painted with a futuristic graphic design.";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "MAC-10 | Rangeen";
				flavortext = "Can you stand against it's wrathful gaze?";
				skindescription = "It has been custom painted with an Ancient Egyptian motif.";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "FAMAS | Survivor Z";
				flavortext = "What's red and white and fires full auto?";
				skindescription = "It has been stenciled using masking tape then distressed.";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "Glock-18 | Wraiths";
				flavortext = "First it pierces the shroud, then it pierces the shadow";
				skindescription = "It has lost souls custom painted on the slide.";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "Dual Berettas | Dualing Dragons";
				flavortext = "Marian was always cooler than Sylvia";
				skindescription = "It has dragons laser-etched on the slide and barrel.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "MP7 | Special Delivery";
				flavortext = "If I do what you want, will you let me go? - The Phoenix and The Storyteller Part 2";
				skindescription = "It has been -REDACTED-";
				this.purple++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "M249 | Nebula Crusader";
				flavortext = "You can use it, but you better put up a quarter first";
				skindescription = "It has been custom painted to look like a classic arcade cabinet.";
				this.purple++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "P250 | Wingshot";
				flavortext = "Sometimes a subtle nudge is all it takes to get what you want - Franz Kriegeld, Phoenix Tactician";
				skindescription = "It has been custom painted with a vibrant hydrographic.";
				this.purple++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "Galil AR | Stone Cold";
				flavortext = "Eventually you need to step outside of your mentor's shadow";
				skindescription = "The stock and magazine bare its designer's mark.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "SSG 08 | Big Iron";
				flavortext = "A win with an asterisk is still a win - Rona Sabri, Rising Star";
				skindescription = "It has been custom painted with a yellow and orange hydrographic then slightly distressed.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "G3SG1 | Flux";
				flavortext = "A plan is a list of things that don't happen";
				skindescription = "It has been painted with purple and silver metallic paints.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "AK-47 | Frontside Misty";
				flavortext = "I like to work in the snow... it always leaves a pretty picture - Javier Alviso, Fist of the Phoenix";
				skindescription = "It has been painted in vibrant arctic colors.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "M4A1-S | Golden Coil";
				flavortext = "The viper can strike from anywhere";
				skindescription = "It has been painted with a hydrographic of an attacking snake.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "USP-S | Kill Confirmed";
				flavortext = "2 in the chest, 1 in the head";
				skindescription = "It has been custom painted with the image of a bullet shattering a skull.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.KnifeSkin("Shadow Daggers ", "Designed for efficient brutality, using a push dagger is as simple as throwing a punch or two.");
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void WinterOffensiveCase() { // WINTER OFFENSIVE WEAPON CASE
		// #s: blue = 4, purple = 4, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "M249 | Magma";
				flavortext = "A burning rate of fire";
				skindescription = "Unmasked areas have subsequently been darkened via oxidization using liver of sulfur.";
				this.blue++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "Galil AR | Sandstorm";
				flavortext = "It'll take more than a tarp to protect you";
				skindescription = "It has been painted using a hydrographic in a purple and beige graphic design.";
				this.blue++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "Five-SeveN | Kami";
				flavortext = "Some ghosts won't stay buried";
				skindescription = "It has been painted using a hydrographic in a Japanese manga pattern.";
				this.blue++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "PP-Bizon | Cobalt Halftone";
				flavortext = "Felix, you and I both know Valeria's about to wage a war. The only question is are you prepared? - Booth, Arms Dealer";
				skindescription = "It has been painted using a hydrographic in an oversized halftone pattern over a base coat of turquoise metallic paint.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "Nova | Rising Skull";
				flavortext = "Mr. Izaki, I'm not complaining... but how many shotguns do you need? - Imogen and The Oni, Part 1";
				skindescription = "It has been customized with an image of a skull using matte paints and an oil-based paint marker.";
				this.purple++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "FAMAS | Pulse";
				flavortext = "Striking colors for a striking weapon";
				skindescription = "It has been painted with a hydrographic of bold fuchsia fragments.";
				this.purple++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "Dual Berettas | Marina";
				flavortext = "Some people will call you a hero... others a villain";
				skindescription = "It has been painted with a hydrographic in a contrasting yellow and blue pattern.";
				this.purple++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "MP9 | Rose Iron";
				flavortext = "Beware its many thorns";
				skindescription = "It has been hand painted with a rose and thorn motif in metallic paints of different colors.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "P250 | Mehndi";
				flavortext = "Namaste";
				skindescription = "It has been painted with a hydrographic in a paisley pattern.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "M4A1-S | Guardian";
				flavortext = "I don't have to like you, I have to keep you safe - Carmen Cocinero, Extraction Expert";
				skindescription = "It has been painted cobalt blue and stenciled with the CT logo on the magazine.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "AWP | Redline";
				flavortext = "Never be afraid to push it to the limit";
				skindescription = "It has been painted using a carbon fiber hydrographic and a dry-transfer decal of a red pinstripe.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "Sawed-Off | The Kraken";
				flavortext = "It has been unleashed";
				skindescription = "It has been hand painted with an image of an octopus.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "M4A4 | Asiimov";
				flavortext = "Anyone can predict the future... a visionary shapes it";
				skindescription = "It has been custom painted with a sci-fi design.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void SpectrumCase() { // SPECTRUM (1) CASE
		// #s: blue = 7, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "PP-Bizon | Jungle Slipstream";
				flavortext = "Follow the leader";
				skindescription = "It has been custom painted with a green and yellow hydrographic.";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "MP7 | Akoben";
				flavortext = "Your personal battle cry";
				skindescription = "It has been spray-painted with a blue pattern over a yellow base.";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "Sawed-Off | Zander";
				flavortext = "This one's a keeper";
				skindescription = "It has been hand painted to resemble a popular game fish.";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "SCAR-20 | Blueprint";
				flavortext = "The best-laid plans are drawn to scale";
				skindescription = "It has been hand painted using a blue theme to resemble an architect's blueprint.";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "P250 | Ripple";
				flavortext = "Be the pebble";
				skindescription = "A blue-grey anodized pattern overlays a black base.";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "Five-SeveN | Capillary";
				flavortext = "20 over 100";
				skindescription = "A custom paint job comprised of intricate teal and coral veins has been applied.";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "Desert Eagle | Oxide Blaze";
				flavortext = "Nothing a little sandpaper can't fix";
				skindescription = "A custom paint job has been applied with a rust-colored base and white detailing.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "MAC-10 | Last Dive";
				flavortext = "There's beauty in chaos";
				skindescription = "It has been hand painted with a randomized green and orange pattern.";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "Galil AR | Crimson Tsunami";
				flavortext = "Westward breaks";
				skindescription = "A spray-painted, blue wave pattern sits atop a maroon base.";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "XM1014 | Seasons";
				flavortext = "Spring, summer, fall, and rarely winter";
				skindescription = "It has been hand painted with a randomized multicolored leaf pattern.";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "M249 | Emerald Poison Dart";
				flavortext = "Conservation is not a priority";
				skindescription = "It has been painted using a hydrographic inspired by a poison dart frog.";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "UMP-45 | Scaffold";
				flavortext = "Brick by brick";
				skindescription = "It has been hand painted teal and given a convincing depth effect.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "CZ75-Auto | Xiangliu";
				flavortext = "Beware the rising tide";
				skindescription = "A custom paint job with nine purple and gold snakes has been applied.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "AWP | Fever Dream";
				flavortext = "Delirium is a dangerous thing";
				skindescription = "It has been custom painted with pink, blue, and purple drawings atop a black base.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "M4A1-S | Decimator";
				flavortext = "Quiet retrofuturism";
				skindescription = "It has been custom painted with totally radical blue and pink highlights.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "USP-S | Neo-Noir";
				flavortext = "Drenched in a neon glow, she lies at the foot of an oppressive skyscraper";
				skindescription = "It has been custom painted with a stylized blue-magenta woman over a grayscale background.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | Bloodsport";
				flavortext = "Co-driver wanted";
				skindescription = "It has been covered in white logo decals over a red and black hydrographic.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void Spectrum2Case() { // SPECTRUM 2 CASE
		// #s: blue = 7, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "SCAR-20 | Jungle Slipstream";
				flavortext = "Create your own wake";
				skindescription = "It has been custom painted with a green and yellow hydrographic.";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "Sawed-Off | Morris";
				flavortext = "Close quarters nouveau";
				skindescription = "It has been hand painted with ornate flowers using a pale color palette.";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "G3SG1 | Hunter";
				flavortext = "It smells of rich mahogany";
				skindescription = "The gun's black base has been covered with dark wood paneling.";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "Tec-9 | Cracked Opal";
				flavortext = "Doubles as a mood ring";
				skindescription = "It has been hand painted to resemble cracked, ancient wood with an underlying opal.";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "MAC-10 | Oceanic";
				flavortext = "The shapeless void";
				skindescription = "It has been given a black base coat and accented with blue designs.";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "Glock-18 | Off World";
				flavortext = "The topcoat is still drying";
				skindescription = "It has been hand painted with multiple coats of blue paint.";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "AUG | Triqua";
				flavortext = "All things being equal";
				skindescription = "A custom paint job with gunmetal triangles and carbon fiber over a burnt orange base.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "XM1014 | Ziggy";
				flavortext = "Introduce a little anarchy";
				skindescription = "It has been finished with a randomized pattern of chartreuse, purple, and silver.";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "MP9 | Goo";
				flavortext = "Covered in spite";
				skindescription = "It has been custom painted to resemble a tarlike goo obscuring a grey base.";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "UMP-45 | Exposure";
				flavortext = "Please remove all metal objects from your pockets";
				skindescription = "A custom paint job has been applied which resembles an x-ray; rib cage and all.";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "CZ75-Auto | Tacticat";
				flavortext = "24 bullets, 9 lives";
				skindescription = "It has been hand painted pink and purple and features small, feline decals.";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "SG 553 | Phantom";
				flavortext = "A ScyTech procurement";
				skindescription = "It has been hand painted with a blue and grey design and finished with orange accents.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "R8 Revolver | Llama Cannon";
				flavortext = "Pull the lever";
				skindescription = "Its ivory handle is paired with ornate, engraved flourishes on blue metalwork.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "PP-Bizon | High Roller";
				flavortext = "All in";
				skindescription = "It has been custom painted with poker chips, dice, and a royal flush over a red base.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "M4A1-S | Leaded Glass";
				flavortext = "Lethal fragility";
				skindescription = "It has been hand painted to resemble shattered blue and orange glass.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "P250 | See Ya Later";
				flavortext = "In a while…";
				skindescription = "It has been custom painted with a green, mechanized croc with yellow detailing.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | The Empress";
				flavortext = "Wealth comes in many forms";
				skindescription = "It has been custom painted using the Empress tarot card as inspiration.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void ClutchCase() { // CLUTCH CASE
		// #s: blue = 7, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "XM1014 | Oxide Blaze";
				flavortext = "Not to be used as a load-bearing support";
				skindescription = "A custom paint job has been applied with a rust-colored base and white detailing.";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "PP-Bizon | Night Riot";
				flavortext = "Cause an uproar";
				skindescription = "It has been custom painted with a blue camo pattern.";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "Five-SeveN | Flame Test";
				flavortext = "Element detected: Cs";
				skindescription = "A silver flame on the muzzle overlays a purple base with a metal flake finish.";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "P2000 | Urban Hazard";
				flavortext = "Hard hats required beyond this point";
				skindescription = "It has been custom painted with a grayscale camo grip and a red slide.";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "MP9 | Black Sand";
				flavortext = "End their campaign before it begins";
				skindescription = "It has been custom painted with a tan and black military camo pattern.";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "R8 Revolver | Grip";
				flavortext = "Every enemy is a nail";
				skindescription = "The metal has been meticulously pressed and the grip has been coated with a patterned, blue rubber.";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "SG 553 | Aloha";
				flavortext = "The perfect partner";
				skindescription = "It has been spray painted with a blue hibiscus pattern.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "Negev | Lionfish";
				flavortext = "Just keep swimming";
				skindescription = "It has been spray painted with a randomized lionfish pattern.";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "Nova | Wild Six";
				flavortext = "My gun, my rules";
				skindescription = "A custom paint job has been applied evoking post-apocalyptic imagery.";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "UMP-45 | Arctic Wolf";
				flavortext = "Every round is a 1v5";
				skindescription = "A custom paint job has been applied which resembles the white coat of an arctic wolf.";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "MAG-7 | SWAG-7";
				flavortext = "You either have it or you don't";
				skindescription = "It has been covered in monochromatic silver and black designs.";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "Glock-18 | Moonrise";
				flavortext = "Look for the North Star";
				skindescription = "A randomized city landscape in the foreground gives way to a full moon and purple night sky.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "AUG | Stymphalian";
				flavortext = "Artemis sends her regards";
				skindescription = "It has been custom painted to depict stymphalian birds from Greek mythology.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "AWP | Mortis";
				flavortext = "Every end is a new beginning";
				skindescription = "It has been custom painted using the Death tarot card as inspiration.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "USP-S | Cortex";
				flavortext = "Keep your head";
				skindescription = "It has been custom painted with pink accents over a silver and black base.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "MP7 | Bloodsport";
				flavortext = "Space for rent";
				skindescription = "It has been covered in white logo decals over a red and black hydrographic.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "M4A4 | Neo-Noir";
				flavortext = "She grabbed what she could and disappeared into a decaying dystopia";
				skindescription = "It has been custom painted with a stylized blue-magenta woman over a grayscale background.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = GloveSkinGenerator.gloveSkin("clutch");
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void HorizonCase() { // HORIZON CASE
		// #s: blue = 7, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "Dual Berettas | Shred";
				flavortext = "Sometimes the gnar shreds you";
				skindescription = "It has been spray painted with white and blue streaks on a black base.";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "Tec-9 | Snek-9";
				flavortext = "If red meets yellow, you're a dead fellow";
				skindescription = "A custom paint job inspired by coral snakes has been applied.";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "R8 Revolver | Survivalist";
				flavortext = "Eight shots and multiple enemies; better make them count";
				skindescription = "Hand painted green stripes allow the owner to blend in and avoid detection in tense situations.";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "MP9 | Capillary";
				flavortext = "857 bpm";
				skindescription = "A custom paint job comprised of intricate teal and coral veins has been applied.";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "P90 | Traction";
				flavortext = "Half the battle is keeping a hold of the weapon; the other half is hitting the target";
				skindescription = "It has been custom painted with sectioned blue hexagons designed to fit the P90’s unique shape.";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "AUG | Amber Slipstream";
				flavortext = "Please keep your hands and arms inside the vehicle";
				skindescription = "It has been hand painted with a smoky grey and vibrant orange hydrographic.";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "Glock-18 | Warhawk";
				flavortext = "It may not the best plane on deck, but it is the most readily available";
				skindescription = "A custom paint job reminiscent of a previous era’s war planes has been applied.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "MP7 | Powercore";
				flavortext = "Rule No. 2 – Never clash in public";
				skindescription = "It has been custom painted with a green base and yellow highlights.";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "G3SG1 | High Seas";
				flavortext = "Let dead reckoning be your guide";
				skindescription = "It has been custom painted with a nautical theme and decorative brass metal work.";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "Nova | Toy Soldier";
				flavortext = "Pellets and soldiers delivered in bulk";
				skindescription = "It has been hand painted a familiar shade of green to evoke childhood memories.";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "CZ75-Auto | Eco";
				flavortext = "For a better tomorrow";
				skindescription = "It has heat-transferred decals applied to a white and green base.";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "AWP | PAW";
				flavortext = "Kill rewards paid in scratching posts and tennis balls";
				skindescription = "A pattern of felines, K-9s, and a creature with a red scarf has been applied.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "Sawed-Off | Devourer";
				flavortext = "It’s rude to talk with food in your mouth";
				skindescription = "It has been hand painted to resemble a creature eating its words.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "FAMAS | Eye of Athena";
				flavortext = "+1 to Wisdom";
				skindescription = "A hand painted mechanized owl sits atop a nest of orange and brown feathers.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "M4A1-S | Nightmare";
				flavortext = "Next time set an alarm";
				skindescription = "A custom paint job depicting a frightening nocturnal visitor has been applied.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "Desert Eagle | Code Red";
				flavortext = "Man your stations";
				skindescription = "A custom paint job with a bright red base and white detailing has been applied.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | Neon Rider";
				flavortext = "Two parts Trapper Keeper, three parts synthesizer";
				skindescription = "A deadly biker can be seen in the foreground of various neon, blended patterns.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheOriginalKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void DangerZoneCase() { // DANGER ZONE CASE
		// #s: blue = 7, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "Nova | Wood Fired";
				flavortext = "Gone hunting";
				skindescription = "Its woodgrain base has been painted green and finished with blue accents and burned-in flames.";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "Sawed-Off | Black Sand";
				flavortext = "Mikah did not account for highly motivated opposition";
				skindescription = "It has been custom painted with a tan and black military camo pattern.";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "MP9 | Modest Threat";
				flavortext = "Be the last 01 standing";
				skindescription = "It has been hand painted with an orange and black design.";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "SG 553 | Danger Close";
				flavortext = "Watch your fire";
				skindescription = "It has been hand painted with a metallic-fire themed design.";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "Tec-9 | Fubar";
				flavortext = "You call it used, we call it well-loved";
				skindescription = "The muzzle of this military themed weapon has been scorched with use.";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "Glock-18 | Oxide Blaze";
				flavortext = "The subject claims this washed up on shore";
				skindescription = "A custom paint job has been applied with a rust-colored base and white detailing.";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "M4A4 | Magnesium";
				flavortext = "For those who live fast";
				skindescription = "It has been hand painted with flames and a winged defuser in white atop a dark grey base.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "G3SG1 | Scavenger";
				flavortext = "Why run?";
				skindescription = "Originally green, parts of the weapon have been replaced with street signs and a tomato can.";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "Galil AR | Signal";
				flavortext = "Information is never free";
				skindescription = "A hydrographic pattern of red hexagons has been applied over a dark blue base.";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "MAC-10 | Pipe Down";
				flavortext = "Peek behind the curtain";
				skindescription = "It has been custom painted to appear as if it is filled with red tubes.";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "P250 | Nevermore";
				flavortext = "Claim your spot in the pecking order";
				skindescription = "A bright orange pattern of skeletal birds has been applied.";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "USP-S | Flashback";
				flavortext = "Sierra Hotel Hotel Hotel";
				skindescription = "It has been hand painted in an attempt to make a suggestion about the duality of man.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "UMP-45 | Momentum";
				flavortext = "Always moving forward";
				skindescription = "It has been custom painted with bright colors and forward facing arrows.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "MP5-SD | Phosphor";
				flavortext = "Stand out from the crowd";
				skindescription = "It has been custom painted by dripping neon pink, green, and teal paint onto its dark base.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "Desert Eagle | Mecha Industries";
				flavortext = "Same technology, now available in a smaller form factor";
				skindescription = "Its white and black design feels both sterile and futuristic.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "AWP | Neo-Noir";
				flavortext = "They took comfort in each other's despair";
				skindescription = "It has been custom painted with two stylized blue-magenta women over a grayscale background.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | Asiimov";
				flavortext = "Anyone can predict the future... a visionary shapes it";
				skindescription = "It has been custom painted with a sci-fi design.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheFourNewKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

	public void PrismaCase() { // PRISMA CASE
		// #s: blue = 7, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "MP7 | Mischief";
				flavortext = "Up to no good";
				skindescription = "A concerning black and white smile has been painted atop a red base.";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "Galil AR | Akoben";
				flavortext = "Your personal battle cry";
				skindescription = "A rust-colored pattern has been spray painted over a white base.";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "FAMAS | Crypsis";
				flavortext = "Take a second look";
				skindescription = "It has been spray painted with a randomized insect pattern in autumn colors.";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "P90 | Off World";
				flavortext = "This topcoat may never dry…";
				skindescription = "It has been hand painted with multiple coats of blue paint; even more than last time.";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "MAC-10 | Whitefish";
				flavortext = "Catch and decease";
				skindescription = "Fish scales, bones, and hooks have been hand painted in white over a black base.";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "P250 | Verdigris";
				flavortext = "From the air you breathe";
				skindescription = "The green drips are the result of its copper base being exposed to the elements.";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "AK-47 | Uncharted";
				flavortext = "We share the same canoe";
				skindescription = "A custom paint job of various tribal patterns has been applied.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "Tec-9 | Bamboozle";
				flavortext = "Don't be deceived";
				skindescription = "A custom bamboo paint job has been applied.";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "UMP-45 | Moonrise";
				flavortext = "Look for the North Star";
				skindescription = "A randomized city landscape in the foreground gives way to a full moon and purple-red night sky.";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "MP5-SD | Gauss";
				flavortext = "Lovingly referred to as the \"SpaceGat 2000\"";
				skindescription = "It has been custom painted to look like it was assembled from pieces of stamped steel.";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "Desert Eagle | Light Rail";
				flavortext = "Required power supply sold separately";
				skindescription = "Its custom paint job creates an optical illusion and appears to change the weapon's geometry.";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "AWP | Atheris";
				flavortext = "As deadly as it is beautiful";
				skindescription = "A striking green and blue bush viper has been hand painted over a black base.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "R8 Revolver | Skull Crusher";
				flavortext = "Open wiiiiide";
				skindescription = "It has been hand painted with yellow flames and red and white accents.";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "XM1014 | Incinegator";
				flavortext = "Boom. Bam. Bop... Pow.";
				skindescription = "A custom paint job resembling a gator spitting fire has been applied.";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "AUG | Momentum";
				flavortext = "Always moving forward";
				skindescription = "It has been custom painted with bright colors and forward facing arrows.";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "Five-SeveN | Angry Mob";
				flavortext = "Inside voices, please";
				skindescription = "A brightly colored paint job inspired by street art has been applied.";
				this.red++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "M4A4 | The Emperor";
				flavortext = "Lead with your head, even if it means ignoring your heart";
				skindescription = "It has been custom painted using the Emperor tarot card as inspiration.";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			placeholder = KnifeSkinGenerator.TheFourNewKnives();
			itemname = placeholder.get(0);
			flavortext = placeholder.get(1);
			skindescription = placeholder.get(2);
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription);
		flavortext = "N/A";
	}

}

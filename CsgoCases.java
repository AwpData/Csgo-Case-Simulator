public class CsgoCases extends ReferenceCase {
	private String rarity, itemname, flavortext;

	public CsgoCases() {
		super();
	}

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

	public void CsgoWeaponsCase() { // CSGO WEAPONS CASE
		// #s: blue = 3, purple = 3, pink = 2, red = 1, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "MP7 | Skulls";
				flavortext = "A mass grave that fits snugly in the palm of your hands";
				this.blue++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "AUG | Wings";
				flavortext = "An eagle looks majestic until it's clawing your eyes out";
				this.blue++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "SG 553 | Ultraviolet";
				flavortext = "Elegant design paired with brutal intent";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "M4A1-S | Dark Water";
				flavortext = "Water gives life, but it can also take it...";
				this.purple++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "USP-S | Dark Water";
				flavortext = "Water gives life, but it can also take it...";
				this.purple++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "Glock-18 | Dragon Tattoo";
				flavortext = "In a fairy tale the knight always slays the dragon... but this is the real world - Valeria Jenner, Revolutionary";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "Desert Eagle | Hypnotic";
				flavortext = "You're not getting sleepy, you're passing out from blood loss";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | Case Hardened";
				flavortext = "A little color never hurt anyone";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			itemname = "AWP | Lightning Strike";
			flavortext = "Sometimes you don't need to strike the same place twice";
			this.red++;
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			itemname = KnifeSkinGenerator.KnifeType();
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}

	public void CsgoWeaponsCase2() { // CSGO WEAPONS CASE 2
		// #s: blue = 5, purple = 4, pink = 2, red = 1, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "SCAR-20 | Crimson Web";
				this.blue++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "FAMAS | Hexane";
				this.blue++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "P-250 | Hive";
				this.blue++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "Tec-9 | Blue Titanium";
				this.blue++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "M4A1-S | Blood Tiger";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "Dual Berettas | Hemoglobin";
				this.purple++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "Nova | Graphite";
				this.purple++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "Five-Seven | Case Hardened";
				this.purple++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "MP9 | Hypnotic";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "USP-S | Serum";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "P90 | Cold Blooded";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			itemname = "SSG 08 | Blood In The Water";
			this.red++;
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			itemname = KnifeSkinGenerator.KnifeType();
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}

	public void CsgoWeaponsCase3() { // CSGO WEAPONS CASE 3
		// #s: blue = 5, purple = 4, pink = 2, red = 1, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "Dual Berettas | Panther";
				this.blue++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "P2000 | Red FragCam";
				this.blue++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "Glock-18 | Blue Fissure";
				this.blue++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "C275-Auto | Crimson Web";
				this.blue++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "USP-S | Stainless";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "C275-Auto | Tread Plate";
				this.purple++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "Tec-9 | Titanium Bit";
				this.purple++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "Five-SeveN | Copper Galaxy";
				this.purple++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "Desert Eagle | Heirloom";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "C275-Auto | The Fuschia Is Now";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "P250 | Undertow";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			itemname = "C275-Auto | Victoria";
			this.red++;
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			itemname = KnifeSkinGenerator.KnifeType();
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}

	public void ChromaCase() { // CHROMA CASE
		// #s: blue = 5, purple = 4, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "XM1014 | Quicksilver";
				this.blue++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "SCAR-20 | Grotto";
				this.blue++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "Glock-18 | Catacombs";
				this.blue++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "M249 | System Lock";
				this.blue++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "MP9 | Deadly Poison";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "Sawed-Off | Serenity";
				this.purple++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "Dual Berettas | Urban Shock";
				this.purple++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "MAC-10 | Malachite";
				this.purple++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "Desert Eagle | Naga";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "P250 | Muertos";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "AK-47 | Cartel";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "M4A4 | 龍王 (Dragon King)";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "Galil AR | Chatterbox";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AWP | Man-o'-war";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			itemname = KnifeSkinGenerator.KnifeType();
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}

	public void Chroma2Case() { // CHROMA 2 CASE
		// #s: blue = 6, purple = 4, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "Negev | Man-o'-war";
				this.blue++;
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "MP7 | Armor Core";
				this.blue++;
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "Sawed-Off | Origami";
				this.blue++;
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "P250 | Valence";
				this.blue++;
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "Desert Eagle | Bronze Deco";
				this.blue++;
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "AK-47 | Elite Build";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "UMP-45 | Grand Prix";
				this.purple++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "CZ75-Auto | Pole Position";
				this.purple++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "MAG-7 | Heat";
				this.purple++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "AWP | Worm God";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "FAMAS | Djinn";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "Five-SeveN | Monkey Business";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "Galil AR | Eco";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "MAC-10 | Neon Rider";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "M4A1-S | Hyper Beast";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			itemname = KnifeSkinGenerator.KnifeType();
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}

	public void Chroma3Case() { // CHROMA 3 CASE
		// #s: blue = 7, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "Sawed-Off | Fubar";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "G3SG1 | Orange Crash";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "Dual Berettas | Ventilators";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "P2000 | Oceanic";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "SG 553 | Atlas";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "M249 | Spectre";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "MP9 | Bioleak";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "Tec-9 | Re-Entry";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "Galil AR | Firefight";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "XM1014 | Black Tie";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "CZ75-Auto | Red Astor";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "SSG 08 | Ghost Crusader";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "UMP-45 | Primal Saber";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "AUG | Fleet Flock";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "P250 | Asiimov";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "PP-Bizon | Judgement of Anubis";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "M4A1-S | Chantico's Fire";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			itemname = KnifeSkinGenerator.KnifeType();
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}

	public void eSports2013Case() { // eSports 2013 CASE
		// #s: blue = 3, purple = 3, pink = 2, red = 1, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.36) {
				itemname = "M4A4 | Faded Zebra";
				this.blue++;
			} else if (percent > 33.36 && percent <= 67.32) {
				itemname = "FAMAS | Doomkitty";
				this.blue++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "MAG-7 | Memento";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "Galil AR | Orange DDPAT";
				this.purple++;
			} else if (percent > 33.33 && percent <= 67.32) {
				itemname = "P250 | Splash";
				this.purple++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "Sawed-Off | Orange DDPAT";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "AWP | BOOM";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | Red Laminate";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			itemname = "P90 | Death by Kitty";
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			itemname = KnifeSkinGenerator.KnifeType();
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}

	public void eSports2013WinterCase() { // eSports 2013 Winter Case
		// #s: blue = 6, purple = 2, pink = 3, red = 1, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "Galil AR | Blue Titanium";
				this.blue++;
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "Nova | Ghost Camo";
				this.blue++;
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "P250 | Steel Disruption";
				this.blue++;
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "G3SG1 | Azure Zebra";
				this.blue++;
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "PP-Bizon | Water Sigil";
				this.blue++;
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "Five-SeveN | Nightshade";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "AK-47 | Blue Laminate";
				this.purple++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "P90 | Blind Spot";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "Desert Eagle | Cobalt Disruption";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "AWP | Electric Hive";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "FAMAS | Afterimage";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			itemname = "M4A4 | X-Ray";
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			itemname = KnifeSkinGenerator.KnifeType();
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}

	public void eSports2014SummerCase() { // eSports 2014 Summer Case
		// #s: blue = 6, purple = 5, pink = 4, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "XM1014 | Red Python";
				this.blue++;
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "SSG 08 | Dark Water";
				this.blue++;
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "CZ75-Auto | Hexane";
				this.blue++;
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "USP-S | Blood Tiger";
				this.blue++;
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "Negev | Bratatat";
				this.blue++;
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "MAC-10 | Ultraviolet";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "Glock-18 | Steel Disruption";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "P90 | Virus";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "PP-Bizon | Blue Streak";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "MP7 | Ocean Foam";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "Desert Eagle | Crimson Web";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "P2000 | Corticera";
				this.pink++;
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "AWP | Corticera";
				this.pink++;
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "Nova | Bloomstick";
				this.pink++;
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "AUG | Bengal Tiger";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "M4A4 | Bullet Rain";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | Jaguar";
				this.pink++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			itemname = KnifeSkinGenerator.KnifeType();
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}

	public void FalchionCase() { // FALCHION CASE
		// #s: blue = 6, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "UMP-45 | Riot";
				this.blue++;
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "Nova | Ranger";
				this.blue++;
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "P90 | Elite Build";
				this.blue++;
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "Glock-18 | Bunsen Burner";
				this.blue++;
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "Galil AR | Rocket Pop";
				this.blue++;
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "USP-S | Torque";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "FAMAS | Neural Net";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "MP9 | Ruby Poison Dart";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "P2000 | Handgun";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "Negev | Loudmouth";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "M4A4 | Evil Daimyo";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "CZ75-Auto | Yellow Jacket";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "MP7 | Nemesis";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "SG 553 | Cyrex";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "AK-47 | Aquamarine Revenge";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AWP | Hyper Beast";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			itemname = KnifeSkinGenerator.KnifeSkin("Falchion Knife ");
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}

	public void GammaCase() { // GAMMA CASE
		// #s: blue = 7, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "PP-Bizon | Harvester";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "Nova | Exo";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "Tec-9 | Ice Cap";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "MAC-10 | Carnivore";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "P250 | Iron Clad";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "Five-SeveN | Violent Daimyo";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "SG 553 | Aerial";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "Sawed-Off | Limelight";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "P90 | Chopper";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "R8 Revolver | Reboot";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "AUG | Aristocrat";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "AWP | Phobos";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "P2000 | Imperial Dragon";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "SCAR-20 | Bloodsport";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "M4A4 | Desolate Space";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "Glock-18 | Wasteland Rebel";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "M4A1-S | Mecha Industries";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			itemname = KnifeSkinGenerator.KnifeType();
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}

	public void Gamma2Case() { // GAMMA 2 CASE
		// #s: blue = 7, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "Five-SeveN | Scumbria";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "G3SG1 | Ventilator";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "XM1014 | Slipstream";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "Negev | Dazzle";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "CZ75-Auto | Imprint";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "UMP-45 | Briefing";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "P90 | Grim";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "MAG-7 | Petroglyph";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "SCAR-20 | Powercore";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "SG 553 | Triarch";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "Glock-18 | Weasel";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "Desert Eagle | Directive";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "Tec-9 | Fuel Injector";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "MP9 | Airlock";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "AUG | Syd Mead";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "FAMAS | Roll Cage";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | Neon Revolution";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			itemname = KnifeSkinGenerator.KnifeType();
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}

	public void GloveCase() { // GLOVE CASE
		// #s: blue = 7, purple = 5, pink = 3, red = 2, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 14.43) {
				itemname = "CZ75-Auto | Polymer";
				this.blue++;
			} else if (percent > 14.43 && percent <= 28.86) {
				itemname = "MP9 | Sand Scale";
				this.blue++;
			} else if (percent > 28.86 && percent <= 43.29) {
				itemname = "MAG-7 | Sonar";
				this.blue++;
			} else if (percent > 43.29 && percent <= 57.72) {
				itemname = "Galil AR | Black Sand";
				this.blue++;
			} else if (percent > 57.72 && percent <= 72.15) {
				itemname = "P2000 | Turf";
				this.blue++;
			} else if (percent > 72.15 && percent <= 86.58) {
				itemname = "MP7 | Cirrus";
				this.blue++;
			} else if (percent > 86.58 && percent <= 101) {
				itemname = "Glock-18 | Ironwork";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "G3SG1 | Stinger";
				this.purple++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "Nova | Gila";
				this.purple++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "Dual Berettas | Royal Consorts";
				this.purple++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "M4A1-S | Flashback";
				this.purple++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "USP-S | Cyrex";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "Sawed-Off | Wasteland Princess";
				this.pink++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "P90 | Shallow Grave";
				this.pink++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "FAMAS | Mecha Industries";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "SSG 08 | Dragonfire";
				this.pink++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "M4A4 | Buzz Kill";
				this.red++;
			}
			totalred++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			itemname = GloveSkinGenerator.gloveSkin("glove");
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}
}

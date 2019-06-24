public class CsgoCases extends ReferenceCase {
	private String rarity, itemname;

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
	// PRICE GUIDE:
	// Csgo weapons cases (1-3) = 50 credits
	// Chroma case (1-3) = 30 credits

	public void CsgoWeaponsCase() { // CSGO WEAPONS CASE
		// #s: blue = 3, purple = 3, pink = 2, red = 1, gold = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.33) {
				itemname = "MP7 | Skulls";
				this.blue++;
			} else if (percent > 33.33 && percent <= 66.67) {
				itemname = "AUG | Wings";
				this.blue++;
			} else if (percent > 66.67 && percent <= 101) {
				itemname = "SG 553 | Ultraviolet";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.33) {
				itemname = "M4A1-S | Dark Water";
				this.purple++;
			} else if (percent > 33.33 && percent <= 66.67) {
				itemname = "USP-S | Dark Water";
				this.purple++;
			} else if (percent > 66.67 && percent <= 101) {
				itemname = "Glock-18 | Dragon Tattoo";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.0) {
				itemname = "Desert Eagle | Hypnotic";
				this.pink++;
			} else if (percent > 50.0 && percent <= 101) {
				itemname = "AK-47 | Case Hardened";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			itemname = "AWP | Lightning Strike";
			this.red++;
			ReferenceCase.totalred++;
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
			if (percent >= 0 && percent <= 20.0) {
				itemname = "SCAR-20 | Crimson Web";
				this.blue++;
			} else if (percent > 20.0 && percent <= 40.0) {
				itemname = "FAMAS | Hexane";
				this.blue++;
			} else if (percent > 40.0 && percent <= 60.0) {
				itemname = "P-250 | Hive";
				this.blue++;
			} else if (percent > 60.0 && percent <= 80.0) {
				itemname = "Tec-9 | Blue Titanium";
				this.blue++;
			} else if (percent > 80.0 && percent <= 101) {
				itemname = "M4A1-S | Blood Tiger";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.0) {
				itemname = "Dual Berettas | Hemoglobin";
				this.purple++;
			} else if (percent > 25.0 && percent <= 50.0) {
				itemname = "Nova | Graphite";
				this.purple++;
			} else if (percent > 50.0 && percent <= 75.0) {
				itemname = "Five-Seven | Case Hardened";
				this.purple++;
			} else if (percent > 75.0 && percent <= 101) {
				itemname = "MP9 | Hypnotic";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.0) {
				itemname = "USP-S | Serum";
				this.pink++;
			} else if (percent > 50.0 && percent <= 101) {
				itemname = "P90 | Cold Blooded";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			itemname = "SSG 08 | Blood In The Water";
			this.red++;
			ReferenceCase.totalred++;
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
			if (percent >= 0 && percent <= 20.0) {
				itemname = "Dual Berettas | Panther";
				this.blue++;
			} else if (percent > 20.0 && percent <= 40.0) {
				itemname = "P2000 | Red FragCam";
				this.blue++;
			} else if (percent > 40.0 && percent <= 60.0) {
				itemname = "Glock-18 | Blue Fissure";
				this.blue++;
			} else if (percent > 60.0 && percent <= 80.0) {
				itemname = "C275-Auto | Crimson Web";
				this.blue++;
			} else if (percent > 80.0 && percent <= 101) {
				itemname = "USP-S | Stainless";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.0) {
				itemname = "C275-Auto | Tread Plate";
				this.purple++;
			} else if (percent > 25.0 && percent <= 50.0) {
				itemname = "Tec-9 | Titanium Bit";
				this.purple++;
			} else if (percent > 50.0 && percent <= 75.0) {
				itemname = "Five-SeveN | Copper Galaxy";
				this.purple++;
			} else if (percent > 75.0 && percent <= 101) {
				itemname = "Desert Eagle | Heirloom";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.0) {
				itemname = "C275-Auto | The Fuschia Is Now";
				this.pink++;
			} else if (percent > 50.0 && percent <= 101) {
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
			if (percent >= 0 && percent <= 20.0) {
				itemname = "XM1014 | Quicksilver";
				this.blue++;
			} else if (percent > 20.0 && percent <= 40.0) {
				itemname = "SCAR-20 | Grotto";
				this.blue++;
			} else if (percent > 40.0 && percent <= 60.0) {
				itemname = "Glock-18 | Catacombs";
				this.blue++;
			} else if (percent > 60.0 && percent <= 80.0) {
				itemname = "M249 | System Lock";
				this.blue++;
			} else if (percent > 80.0 && percent <= 101) {
				itemname = "MP9 | Deadly Poison";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.0) {
				itemname = "Sawed-Off | Serenity";
				this.purple++;
			} else if (percent > 25.0 && percent <= 50.0) {
				itemname = "Dual Berettas | Urban Shock";
				this.purple++;
			} else if (percent > 50.0 && percent <= 75.0) {
				itemname = "MAC-10 | Malachite";
				this.purple++;
			} else if (percent > 75.0 && percent <= 101) {
				itemname = "Desert Eagle | Naga";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.6) {
				itemname = "P250 | Muertos";
				this.pink++;
			} else if (percent > 33.6 && percent <= 67.2) {
				itemname = "AK-47 | Cartel";
				this.pink++;
			} else if (percent > 67.2 && percent <= 101) {
				itemname = "M4A4 | 龍王 (Dragon King)";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50) {
				itemname = "Galil AR | Chatterbox";
				this.pink++;
			} else if (percent > 50 && percent <= 101) {
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
			if (percent >= 0 && percent <= 25.0) {
				itemname = "UMP-45 | Grand Prix";
				this.purple++;
			} else if (percent > 25.0 && percent <= 50.0) {
				itemname = "CZ75-Auto | Pole Position";
				this.purple++;
			} else if (percent > 50.0 && percent <= 75.0) {
				itemname = "MAG-7 | Heat";
				this.purple++;
			} else if (percent > 75.0 && percent <= 101) {
				itemname = "AWP | Worm God";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.6) {
				itemname = "FAMAS | Djinn";
				this.pink++;
			} else if (percent > 33.6 && percent <= 67.2) {
				itemname = "Five-SeveN | Monkey Business";
				this.pink++;
			} else if (percent > 67.2 && percent <= 101) {
				itemname = "Galil AR | Eco";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50) {
				itemname = "MAC-10 | Neon Rider";
				this.pink++;
			} else if (percent > 50 && percent <= 101) {
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
			if (percent >= 0 && percent <= 20.0) {
				itemname = "Tec-9 | Re-Entry";
				this.purple++;
			} else if (percent > 20.0 && percent <= 40.0) {
				itemname = "Galil AR | Firefight";
				this.purple++;
			} else if (percent > 40.0 && percent <= 60.0) {
				itemname = "XM1014 | Black Tie";
				this.purple++;
			} else if (percent > 60.0 && percent <= 80.0) {
				itemname = "CZ75-Auto | Red Astor";
				this.purple++;
			} else if (percent > 80.0 && percent <= 101) {
				itemname = "SSG 08 | Ghost Crusader";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.6) {
				itemname = "UMP-45 | Primal Saber";
				this.pink++;
			} else if (percent > 33.6 && percent <= 67.2) {
				itemname = "AUG | Fleet Flock";
				this.pink++;
			} else if (percent > 67.2 && percent <= 101) {
				itemname = "P250 | Asiimov";
				this.pink++;
			}
			totalpink++;
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50) {
				itemname = "PP-Bizon | Judgement of Anubis";
				this.pink++;
			} else if (percent > 50 && percent <= 101) {
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
}

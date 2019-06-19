public class CsgoCases extends ReferenceCase {
	private String rarity, itemname;

	public CsgoCases() {
		super();
	}

	public void getSessionWinnings() {
		System.out.println("\nPress enter to see your winnings this session!");
		HelperMethods.input.nextLine();
		System.out.println("Winnings this session: "); // Set # of new skins and # of duplicate skins found (based in text file) later
		System.out.println("Blue (Mil-Spec): " + getBlue());
		System.out.println("Purple (Restricted): " + getPurple());
		System.out.println("Pink (Classified): " + getPink());
		System.out.println("Red (Covert): " + getRed());
		System.out.println("Gold (Exceedingly Rare): " + getGold());
		System.out.println("Stattrak Weapons: " + ItemStatistics.getStattrak());
		System.out.println("\nPress enter to go back to the main menu\n");
		HelperMethods.input.nextLine();
	}

	// ALL CASES BELOW HERE -------------------

	// PRICE GUIDE:
	// Csgo weapons cases (1-3) = 50 credits
	// Chroma case = 30 credits

	public void CsgoWeaponsCase() { // CSGO WEAPONS CASE
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
			itemname = "Knife | None";
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}

	public void CsgoWeaponsCase2() {
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
			itemname = "Knife | None";
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}

	public void CsgoWeaponsCase3() {
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
			itemname = "Knife | None";
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}

	public void ChromaCase() {
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
			itemname = "Knife | None";
			this.gold++;
			totalgold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}
}

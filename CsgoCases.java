// NOTE: Stattraks have a 10% drop rate
public class CsgoCases extends ReferenceCase {
	private String rarity, itemname;

	public CsgoCases() {
		super();
	}
	
	public void getSessionWinnings() {
		System.out.println("Winnings this session: "); // Set # of new skins and # of duplicate skins found (based in text file) later
		System.out.println("Blue (Mil-Spec): " + getBlue());
		System.out.println("Purple (Restricted): " + getPurple());
		System.out.println("Pink (Classified): " + getPink());
		System.out.println("Red (Covert): " + getRed());
		System.out.println("Gold (Exceedingly Rare): " + getGold());
		System.out.println("Stattrak Weapons: " + ItemStatistics.getStattrak());
	}

	// ALL CASES BELOW HERE -------------------
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
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			itemname = "AWP | Lightning Strike";
			this.red++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			itemname = "Knife | None";
			this.gold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity); // Passes to itemstatistics for stattrak, wear, (float?)
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
			rarity = "Pink";
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			itemname = "SSG 08 | Blood In The Water";
			this.red++;
			rarity = "Red";
		} else if (percent > 99.7 && percent <= 101) { // GOLD TIER
			itemname = "Knife | None";
			this.gold++;
			rarity = "Gold";
		}
		new ItemStatistics(itemname, rarity);
	}
}

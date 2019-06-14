
public class CsgoCases extends DefaultCase {

	public CsgoCases() {
		super();
	}

	public void CsgoWeaponsCase() { // CSGO WEAPONS CASE
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.33) {
				System.out.print("MP7 | Skulls");
				this.blue++;
			} else if (percent > 33.33 && percent <= 66.67) {
				System.out.print("AUG | Wings");
				this.blue++;
			} else if (percent > 66.67 && percent <= 100) {
				System.out.print("SG 553 | Ultraviolet");
				this.blue++;
			}
		} else if (percent > 79.92 && percent <= 95.2) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.33) {
				System.out.print("M4A1-S | Dark Water");
				this.purple++;
			} else if (percent > 33.33 && percent <= 66.67) {
				System.out.print("USP-S | Dark Water");
				this.purple++;
			} else if (percent > 66.67 && percent <= 100) {
				System.out.print("Glock-18 | Dragon Tattoo");
				this.purple++;
			}
		} else if (percent > 95.2 && percent <= 99.1) { // PINK TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50) {
				System.out.print("Desert Eagle | Hypnotic");
				this.pink++;
			} else if (percent > 50 && percent <= 100) {
				System.out.print("AK-47 | Case Hardened");
				this.pink++;
			}
		} else if (percent > 99.1 && percent <= 99.7) { // RED TIER
			System.out.print("AWP | Lightning Strike");
			this.red++;
		} else if (percent > 99.7 && percent <= 100) { // GOLD TIER
			System.out.print("KNIFE KNIFE KNIFE!");
			this.gold++;
		}
	}

	public void getWinnings() {
		System.out.println("Winnings today: "); // Set # of new skins and # of duplicate skins found (based in text file)
		System.out.println("Blue (Mil-Spec): " + getBlue());
		System.out.println("Purple (Restricted): " + getPurple());
		System.out.println("Pink (Classified): " + getPink());
		System.out.println("Red (Covert): " + getRed());
		System.out.println("Gold (Exceedingly Rare): " + getGold());
	}
}

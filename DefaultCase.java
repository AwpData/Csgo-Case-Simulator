
public class DefaultCase {
	protected int white, lightblue, blue, purple, pink, red, gold;

	public DefaultCase() {
		this.white = 0;
		this.lightblue = 0;
		this.blue = 0;
		this.purple = 0;
		this.pink = 0;
		this.red = 0;
		this.gold = 0;
	}

	protected void spin() { // Example Only
		int percent = (int) ((int) 100 * Math.random() + 1);
		if (percent >= 1 && percent <= 40) {
			System.out.print("White aquired");
			this.white++;
		} else if (percent >= 41 && percent <= 60) {
			System.out.print("Lightblue acquired");
			this.lightblue++;
		} else if (percent >= 61 && percent <= 80) {
			System.out.print("Blue acquired");
			this.blue++;
		} else if (percent >= 81 && percent <= 90) {
			System.out.print("Purple acquired");
			this.purple++;
		} else if (percent >= 91 && percent <= 96) {
			System.out.print("Pink acquired");
			this.pink++;
		} else if (percent >= 97 && percent <= 99) {
			System.out.print("Red acquired");
			this.red++;
		} else if (percent == 100) {
			System.out.print("Gold acquired");
			this.gold++;
		}
	}

	public void getWinnings() {
		System.out.println("Winnings today: "); // Set # of new skins and # of duplicate skins found (based in text file)
		System.out.println("White (Consumer Grade): " + getWhite());
		System.out.println("LightBlue (Industrial Grade): " + getLightBlue());
		System.out.println("Blue (Mil-Spec): " + getBlue());
		System.out.println("Purple (Restricted): " + getPurple());
		System.out.println("Pink (Classified): " + getPink());
		System.out.println("Red (Covert): " + getRed());
		System.out.println("Gold (Exceedingly Rare): " + getGold());
	}

	public int getWhite() {
		return white;
	}

	public int getLightBlue() {
		return lightblue;
	}

	public int getBlue() {
		return blue;
	}

	public int getPurple() {
		return purple;
	}

	public int getPink() {
		return pink;
	}

	public int getRed() {
		return red;
	}

	public int getGold() {
		return gold;
	}
}

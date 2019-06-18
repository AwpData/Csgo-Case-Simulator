public class ReferenceCase {
	protected int white, lightblue, blue, purple, pink, red, gold;
	static protected int totalwhite = 0, totallightblue = 0, totalblue = 0, totalpurple = 0, totalpink = 0, totalred = 0, totalgold = 0, totalcreditswon = 0;

	public ReferenceCase() {
		this.white = 0;
		this.lightblue = 0;
		this.blue = 0;
		this.purple = 0;
		this.pink = 0;
		this.red = 0;
		this.gold = 0;
	}

	public static void getTotalWinnings() {
		System.out.println("Total Winnings this session:\n"); // Set # of new skins and # of duplicate skins found (based in text file) later
		System.out.println("White (Consumer Grade): " + totalwhite);
		System.out.println("LightBlue (Industrial Grade): " + totallightblue);
		System.out.println("Blue (Mil-Spec): " + totalblue);
		System.out.println("Purple (Restricted): " + totalpurple);
		System.out.println("Pink (Classified): " + totalpink);
		System.out.println("Red (Covert): " + totalred);
		System.out.println("Gold (Exceedingly Rare): " + totalgold);
		System.out.println("Credits: " + totalcreditswon);
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

	private void spin() { // Example Only
		int percent = (int) ((int) 100 * Math.random() + 1);
		if (percent >= 0 && percent <= 40) {
			System.out.print("White aquired");
			ReferenceCase.totalwhite++;
			this.white++;
		} else if (percent > 40 && percent <= 60) {
			System.out.print("Lightblue acquired");
			ReferenceCase.totallightblue++;
			this.lightblue++;
		} else if (percent > 60 && percent <= 80) {
			System.out.print("Blue acquired");
			ReferenceCase.totalblue++;
			this.blue++;
		} else if (percent > 80 && percent <= 90) {
			System.out.print("Purple acquired");
			ReferenceCase.totalpurple++;
			this.purple++;
		} else if (percent > 90 && percent <= 96) {
			System.out.print("Pink acquired");
			ReferenceCase.totalpink++;
			this.pink++;
		} else if (percent > 96 && percent <= 99) {
			System.out.print("Red acquired");
			ReferenceCase.totalred++;
			this.red++;
		} else if (percent > 99 && percent <= 101) {
			System.out.print("Gold acquired");
			ReferenceCase.totalgold++;
			this.gold++;
		}
	}
}

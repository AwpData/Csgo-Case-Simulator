public class ItemColorTracker {
	protected int white, lightblue, blue, purple, pink, red, gold;
	static protected int totalwhite = 0, totallightblue = 0, totalblue = 0, totalpurple = 0, totalpink = 0, totalred = 0, totalgold = 0, totalcreditswon = 0;
	static protected int totalwhitesold = 0, totallightbluesold = 0, totalbluesold = 0, totalpurplesold = 0, totalpinksold = 0, totalredsold = 0, totalgoldsold = 0;

	public ItemColorTracker() {
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
		System.out.println("White (Consumer Grade): " + totalwhite + " [" + totalwhitesold + " sold]");
		System.out.println("LightBlue (Industrial Grade): " + totallightblue + " [" + totallightbluesold + " sold]");
		System.out.println("Blue (Mil-Spec): " + totalblue + " [" + totalbluesold + " sold]");
		System.out.println("Purple (Restricted): " + totalpurple + " [" + totalpurplesold + " sold]");
		System.out.println("Pink (Classified): " + totalpink + " [" + totalpinksold + " sold]");
		System.out.println("Red (Covert): " + totalred + " [" + totalredsold + " sold]");
		System.out.println("Gold (Exceedingly Rare): " + totalgold + " [" + totalgoldsold + " sold]");
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
}

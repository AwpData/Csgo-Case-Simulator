
public class ReferenceCase {
	protected int white, lightblue, blue, purple, pink, red, gold;

	public ReferenceCase() {
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
		if (percent >= 0 && percent <= 40) {
			System.out.print("White aquired");
			this.white++;
		} else if (percent > 40 && percent <= 60) {
			System.out.print("Lightblue acquired");
			this.lightblue++;
		} else if (percent > 60 && percent <= 80) {
			System.out.print("Blue acquired");
			this.blue++;
		} else if (percent > 80 && percent <= 90) {
			System.out.print("Purple acquired");
			this.purple++;
		} else if (percent > 90 && percent <= 96) {
			System.out.print("Pink acquired");
			this.pink++;
		} else if (percent > 96 && percent <= 99) {
			System.out.print("Red acquired");
			this.red++;
		} else if (percent > 99 && percent <= 101) {
			System.out.print("Gold acquired");
			this.gold++;
		}
	}

	public void getSessionWinnings() {
		System.out.println("Winnings this session: "); // Set # of new skins and # of duplicate skins found (based in text file)
		System.out.println("White (Consumer Grade): " + getWhite());
		System.out.println("LightBlue (Industrial Grade): " + getLightBlue());
		System.out.println("Blue (Mil-Spec): " + getBlue());
		System.out.println("Purple (Restricted): " + getPurple());
		System.out.println("Pink (Classified): " + getPink());
		System.out.println("Red (Covert): " + getRed());
		System.out.println("Gold (Exceedingly Rare): " + getGold());
		System.out.println("Credits: " + CreditsCases.getCreditsWin());
	}
	
	public void getTotalWinnings() {
		
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

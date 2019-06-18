public class CreditsCases extends ReferenceCase {
	protected static int creditswin, credit;

	public CreditsCases() {
		super();
	}

	// FOR SMALL CREDITS CASE (Costs 20 Credits)
	// 10 credits = 1-28%
	// 20 credits = 29-51%
	// 30 credits = 52-71%
	// 40 credits = 72-87%
	// 50 credits = 88-99%
	// 100 credits = 100%

	public void SmallCreditsCase() {
		int percent = (int) ((int) 100 * Math.random() + 1);
		if (percent >= 1 && percent <= 28) {
			System.out.print("10 credits");
			this.white++;
			credit = 10;
		} else if (percent >= 29 && percent <= 51) {
			System.out.print("20 credits");
			this.lightblue++;
			credit = 20;
		} else if (percent >= 52 && percent <= 72) {
			System.out.print("30 credits");
			this.blue++;
			credit = 30;
		} else if (percent >= 73 && percent <= 87) {
			System.out.print("40 credits");
			this.purple++;
			credit = 40;
		} else if (percent >= 88 && percent <= 99) {
			System.out.print("50 credits");
			this.pink++;
			credit = 50;
		} else if (percent > 99 && percent <= 101) {
			System.out.print("100 credits");
			this.red++;
			credit = 100;
		}
		creditswin += credit;
		ReferenceCase.totalcreditswon += credit;
	}

	public void getSessionWinnings() {
		System.out.println("Winnings this session: " + creditswin + " credits");
		System.out.println("10 credits box: " + getWhite());
		System.out.println("20 credits box: " + getLightBlue());
		System.out.println("30 credits box: " + getBlue());
		System.out.println("40 credits box: " + getPurple());
		System.out.println("50 credits box: " + getPink());
		System.out.println("100 credits box: " + getRed());
	}

	protected static int getCreditsWin() {
		return creditswin;
	}
}

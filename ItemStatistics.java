
public class ItemStatistics {
	private String rarity, itemname, wear;
	private double itemfloat;
	private static int stattrak;

	public ItemStatistics(String itemname, String rarity) {
		this.itemname = itemname;
		this.rarity = rarity;
		statTrak(itemname);
	}

	// 10% chance of getting stattrak
	// FN float: 0.00 - 0.07
	// MW float: 0.07 - 0.15
	// FT float: 0.15 - 0.37
	// WW float: 0.37 - 0.44
	// BS float: 0.44 - 1.0

	private void statTrak(String itemname) { // 1st step
		double percent = 100 * Math.random() + 1;
		if (percent >= 62.0 && percent <= 72.0) {
			itemname = "StatTrak™ " + itemname;
			stattrak++;
		}
		wear(itemname);
	}

	private void wear(String itemname) { // 2nd step
		String wear = "";
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent < 20.0) {
			wear = "(Battle-Scarred)";
		} else if (percent >= 20.0 && percent < 40.0) {
			wear = "(Well-Worn)";
		} else if (percent >= 40.0 && percent < 60.0) {
			wear = "(Field-Tested)";
		} else if (percent >= 60.0 && percent < 80.0) {
			wear = "(Minimal-Wear)";
		} else if (percent >= 80.0 && percent <= 100) {
			wear = "(Factory-New)";
		}
		itemfloat(wear);
	}

	private void itemfloat(String wear) { // 3rd step
		if (wear.equals("(Factory-New)")) {
			itemfloat = 0.07 * Math.random();
		} else if (wear.equals("(Minimal-Wear)")) {
			itemfloat = 0.08 * Math.random() + 0.07;
		} else if (wear.equals("(Field-Tested)")) {
			itemfloat = 0.22 * Math.random() + 0.15;
		} else if (wear.equals("(Well-Worn)")) {
			itemfloat = 0.07 * Math.random() + 0.37;
		} else if (wear.equals("(Battle-Scarred)")) {
			itemfloat = 0.56 * Math.random() + 0.44;
		}
		printItemDescription(itemname, wear, rarity, itemfloat);
	}

	private void printItemDescription(String itemname, String wear, String rarity) { // 4th step
		System.out.print(itemname + " " + wear + " " + rarity);
	}

	private void printItemDescription(String itemname, String wear, String rarity, double itemfloat) { // 4bth step
		System.out.print(itemname + " " + wear + " " + rarity + ", Float: " + itemfloat);
	}

	protected String getWear() {
		return wear;
	}

	protected double getItemFloat() {
		return itemfloat;
	}

	protected String getItemName() {
		return itemname;
	}

	protected static int getStattrak() {
		return stattrak;
	}
}

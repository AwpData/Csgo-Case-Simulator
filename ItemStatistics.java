import java.util.*;

public class ItemStatistics extends ClientInterface {
	private String rarity, itemname, wear;
	private double itemfloat;
	static private int stattrak;
	static private ArrayList<String> items = new ArrayList<>();

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

	private void printItemDescription(String itemname, String wear, String rarity, double itemfloat) { // 4bth step
		items.add(itemname + " " + wear + " " + rarity);
		System.out.print(itemname + " " + wear + " " + rarity + ", Float: " + itemfloat);
	}

	public static ArrayList<String> getItemList() {
		return items;
	}

	public String getWear() {
		return wear;
	}

	public String getRarity() {
		return rarity;
	}

	public double getItemFloat() {
		return itemfloat;
	}

	public String getItemName() {
		return itemname;
	}

	public static int getStattrak() {
		return stattrak;
	}
}

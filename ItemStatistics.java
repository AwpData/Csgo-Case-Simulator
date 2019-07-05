import java.util.*;

public class ItemStatistics extends ClientInterface {
	private String rarity, itemname, wear, flavortext, skindescription;
	private double itemfloat;
	static public int stattrak;
	static private ArrayList<ItemStatistics> itemlist = new ArrayList<>();

	// FLOAT GUIDE:
	// FN float: 0.00 - 0.07
	// MW float: 0.07 - 0.15
	// FT float: 0.15 - 0.37
	// WW float: 0.37 - 0.44
	// BS float: 0.44 - 1.0

	// RARITY GUIDE:
	// white = consumer grade
	// light blue = industrial grade
	// blue = mil-spec
	// purple = restricted
	// pink = classified
	// red = covert

	// 10% chance of getting stattrak

	public ItemStatistics(String itemname, String rarity, String flavortext, String skindescription) { // For Csgo Cases
		this.rarity = rarity;
		this.itemname = statTrak(itemname, this.rarity);
		this.wear = wear(this.itemname);
		this.itemfloat = itemfloat(this.wear);
		this.flavortext = flavortext;
		this.skindescription = skindescription;
		itemlist.add(this);
		System.out.print(this.toString());
	}

	public ItemStatistics(String itemname, String rarity, String flavortext, String skindescription, String nostatrak) { // For Csgo Collections
		this.rarity = rarity;
		this.itemname = itemname;
		this.wear = wear(this.itemname);
		this.itemfloat = itemfloat(this.wear);
		this.flavortext = flavortext;
		this.skindescription = skindescription;
		itemlist.add(this);
		System.out.print(this.toString());
	}

	private String statTrak(String itemname, String rarity) { // 1st step
		if (itemname.contains("Glove") || itemname.contains("Wrap")) {
			return itemname;
		} else {
			double percent = 100 * Math.random() + 1;
			if (percent >= 62.0 && percent <= 72.0) { // Is stattrak
				if (rarity.equals("Gold")) { // If knife add star and then trademark symbol
					itemname = "\u2605 StatTrak\u2122 " + itemname;
				} else {
					itemname = "StatTrak\u2122 " + itemname;
				}
				stattrak++;
			} else {
				if (rarity.equals("Gold")) { // If it is a knife add the star icon "★"
					itemname = "\u2605 " + itemname;
				}
			}
			return itemname;
		}
	}

	private String wear(String itemname) { // 2nd step
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
		} else if (percent >= 80.0 && percent <= 101) {
			wear = "(Factory-New)";
		}
		return wear;
	}

	private double itemfloat(String wear) { // 3rd step
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
		return itemfloat;
	}

	public static String sellSkin(int index) {
		String item;
		for (int i = 0; i < itemlist.size(); i++) {
			if (i == index - 1) {
				item = itemlist.get(i).toString();
				itemlist.remove(i);
				System.out.println("Successfully sold: " + item);
				return item;
			}
		}
		return "Skin not found!";
	}

	public static void inspectSkin(int index) {
		for (int i = 0; i <= itemlist.size(); i++) {
			if (i == index) {
				ItemStatistics item = itemlist.get(i - 1);
				System.out.println("\nColor/Name: " + item.getRarity() + " " + item.getItemName());
				System.out.println("Wear: " + item.getWear());
				System.out.println("Float: " + item.getItemFloat());
				System.out.println("Skin Description: " + item.getSkinDescription());
				System.out.println("Flavortext: \"" + item.getFlavorText() + "\"\n");
			}
		}
	}

	public static ArrayList<ItemStatistics> getItemList() {
		return itemlist;
	}

	public String toString() {
		return ("[" + rarity.toUpperCase() + "]" + " " + itemname + " " + wear);
	}

	public String getWear() {
		return wear;
	}

	public String getRarity() {
		return "[" + rarity.toUpperCase() + "]";
	}

	public double getItemFloat() {
		return itemfloat;
	}

	public String getItemName() {
		return itemname;
	}

	public String getFlavorText() {
		return flavortext;
	}

	public String getSkinDescription() {
		return skindescription;
	}

	public static int getStattrak() {
		return stattrak;
	}
}

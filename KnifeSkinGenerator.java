
public class KnifeSkinGenerator extends CsgoCases {
	static private String itemname;

	// Butterfly Knife exclusive to Operation Breakout
	// Falchion Knife exclusive to Falchion Case
	// Huntsman Knife exclusive to Huntsman Case
	// Shadow Daggers exclusive to Shadow Case

	public static String KnifeType() { // Non-Exclusive Knives only
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 10.0) {
			itemname = "Talon Knife ";
		} else if (percent > 10.0 && percent <= 20.0) {
			itemname = "Flip Knife ";
		} else if (percent > 20.0 && percent <= 30.0) {
			itemname = "Bowie Knife ";
		} else if (percent > 30.0 && percent <= 40.0) {
			itemname = "Navaja Knife ";
		} else if (percent > 40.0 && percent <= 50.0) {
			itemname = "Ursus Knife ";
		} else if (percent > 50.0 && percent <= 60.0) {
			itemname = "Bayonet ";
		} else if (percent > 60.0 && percent <= 70.0) {
			itemname = "Stiletto Knife ";
		} else if (percent > 70.0 && percent <= 80.0) {
			itemname = "M9 Bayonet ";
		} else if (percent > 80.0 && percent <= 90.0) {
			itemname = "Karambit ";
		} else if (percent > 90.0 && percent <= 101) {
			itemname = "Gut Knife ";
		}
		itemname = KnifeSkin(itemname);
		return itemname;
	}

	public static String KnifeSkin(String itemname) {
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 4.0) {
			itemname += "| Boreal Forest";
		} else if (percent > 4.0 && percent <= 8.0) {
			itemname += "| Scorched";
		} else if (percent > 8.0 && percent <= 12.0) {
			itemname += "| Urban Masked";
		} else if (percent > 12.0 && percent <= 16.0) {
			itemname += "| Marble Fade";
		} else if (percent > 16.0 && percent <= 20.0) {
			itemname += "| Rust Coat";
		} else if (percent > 20.0 && percent <= 24.0) { // Night Variations
			if (itemname.contains("Talon") || itemname.contains("Stiletto") || itemname.contains("Navaja") || itemname.contains("Ursus")) {
				itemname += "| Night Stripe";
			} else {
				itemname += "| Night";
			}
		} else if (percent > 24.0 && percent <= 28.0) {
			itemname += "| Forest DDPAT";
		} else if (percent > 28.0 && percent <= 32.0) {
			itemname += "| Stained";
		} else if (percent > 32.0 && percent <= 36.0) {
			itemname += "| Safari Mesh";
		} else if (percent > 36.0 && percent <= 40.0) {
			itemname += "| Bright Water";
		} else if (percent > 40.0 && percent <= 44.0) {
			itemname += "| Case Hardened";
		} else if (percent > 44.0 && percent <= 48.0) {
			itemname += "| Ultraviolet";
		} else if (percent > 48.0 && percent <= 52.0) {
			itemname += "| Blue Steel";
		} else if (percent > 52.0 && percent <= 56.0) { // Doppler
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 12.5) {
				itemname += "| Doppler (Sapphire)";
			} else if (percent > 12.5 && percent <= 25) {
				itemname += "| Doppler (Black Pearl)";
			} else if (percent > 25 && percent <= 37.5) {
				itemname += "| Doppler (Phase 1)";
			} else if (percent > 37.5 && percent <= 50) {
				itemname += "| Doppler (Phase 2)";
			} else if (percent > 50 && percent <= 62.5) {
				itemname += "| Doppler (Phase 3)";
			} else if (percent > 62.5 && percent <= 75) {
				itemname += "| Doppler (Phase 4)";
			} else if (percent > 75 && percent <= 87.5) {
				itemname += "| Doppler (Ruby)";
			} else if (percent > 87.5 && percent <= 101) {
				itemname += "| Doppler";
			}
		} else if (percent > 56.0 && percent <= 60.0) {
			itemname += "| Slaughter";
		} else if (percent > 60.0 && percent <= 64.0) {
			itemname += "| Black Laminate";
		} else if (percent > 64.0 && percent <= 68.0) {
			itemname += "| Autotronic";
		} else if (percent > 68.0 && percent <= 72.0) {
			itemname += "| Tiger Tooth";
		} else if (percent > 72.0 && percent <= 76.0) {
			itemname += "| Fade";
		} else if (percent > 76.0 && percent <= 80.0) {
			itemname += "| Freehand";
		} else if (percent > 80.0 && percent <= 84.0) {
			itemname += "| Crimson Web";
		} else if (percent > 84.0 && percent <= 88.0) { // Gamma Doppler
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.66) {
				itemname += "| Gamma Doppler (Emerald)";
			} else if (percent >= 16.66 && percent <= 33.33) {
				itemname += "| Gamma Doppler (Phase 1)";
			} else if (percent >= 33.33 && percent <= 49.99) {
				itemname += "| Gamma Doppler (Phase 2)";
			} else if (percent >= 49.99 && percent <= 66.65) {
				itemname += "| Gamma Doppler (Phase 3)";
			} else if (percent >= 66.65 && percent <= 83.31) {
				itemname += "| Gamma Doppler (Phase 4)";
			} else if (percent >= 83.31 && percent <= 101) {
				itemname += "| Gamma Doppler";
			}
		} else if (percent > 88.0 && percent <= 92.0) {
			itemname += "| Lore";
		} else if (percent > 92.0 && percent <= 96.0) {
			itemname += "| Damascus Steel";
		} else if (percent > 96.0 && percent <= 101) { // Vanilla
			// Nothing since Vanilla has nothing after it
		}
		return itemname;
	}
}


public class KnifeSkinGenerator extends CsgoCases {
	static private String itemname, flavortext;

	// Butterfly Knife exclusive to Operation Breakout
	// Falchion Knife exclusive to Falchion Case
	// Huntsman Knife exclusive to Huntsman Case
	// Shadow Daggers exclusive to Shadow Case

	public static String KnifeType() { // Non-Exclusive Knives only
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 10.1) {
			itemname = "Talon Knife ";
		} else if (percent > 10.1 && percent <= 20.2) {
			itemname = "Flip Knife ";
		} else if (percent > 20.2 && percent <= 30.3) {
			itemname = "Bowie Knife ";
		} else if (percent > 30.3 && percent <= 40.4) {
			itemname = "Navaja Knife ";
		} else if (percent > 40.4 && percent <= 50.5) {
			itemname = "Ursus Knife ";
		} else if (percent > 50.5 && percent <= 60.6) {
			itemname = "Bayonet ";
		} else if (percent > 60.6 && percent <= 70.7) {
			itemname = "Stiletto Knife ";
		} else if (percent > 70.7 && percent <= 80.8) {
			itemname = "M9 Bayonet ";
		} else if (percent > 80.8 && percent <= 90.9) {
			itemname = "Karambit ";
		} else if (percent > 90.9 && percent <= 101) {
			itemname = "Gut Knife ";
		}
		itemname = KnifeSkin(itemname);
		return itemname;
	}

	public static String KnifeSkin(String itemname) {
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 4.04) {
			itemname += "| Boreal Forest";
		} else if (percent > 4.04 && percent <= 8.08) {
			itemname += "| Scorched";
		} else if (percent > 8.08 && percent <= 12.12) {
			itemname += "| Urban Masked";
		} else if (percent > 12.12 && percent <= 16.16) {
			itemname += "| Marble Fade";
		} else if (percent > 16.16 && percent <= 20.20) {
			itemname += "| Rust Coat";
		} else if (percent > 20.20 && percent <= 24.24) { // Night Variations
			if (itemname.contains("Talon") || itemname.contains("Stiletto") || itemname.contains("Navaja") || itemname.contains("Ursus")) {
				itemname += "| Night Stripe";
			} else {
				itemname += "| Night";
			}
		} else if (percent > 24.24 && percent <= 28.28) {
			itemname += "| Forest DDPAT";
		} else if (percent > 28.28 && percent <= 32.32) {
			itemname += "| Stained";
		} else if (percent > 32.32 && percent <= 36.36) {
			itemname += "| Safari Mesh";
		} else if (percent > 36.36 && percent <= 40.40) {
			itemname += "| Bright Water";
		} else if (percent > 40.40 && percent <= 44.44) {
			itemname += "| Case Hardened";
		} else if (percent > 44.44 && percent <= 48.48) {
			itemname += "| Ultraviolet";
		} else if (percent > 48.48 && percent <= 52.52) {
			itemname += "| Blue Steel";
		} else if (percent > 52.52 && percent <= 56.56) { // Doppler
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 12.625) {
				itemname += "| Doppler (Sapphire)";
			} else if (percent > 12.625 && percent <= 25.25) {
				itemname += "| Doppler (Black Pearl)";
			} else if (percent > 25.25 && percent <= 37.875) {
				itemname += "| Doppler (Phase 1)";
			} else if (percent > 37.875 && percent <= 50.5) {
				itemname += "| Doppler (Phase 2)";
			} else if (percent > 50.5 && percent <= 63.125) {
				itemname += "| Doppler (Phase 3)";
			} else if (percent > 63.125 && percent <= 75.75) {
				itemname += "| Doppler (Phase 4)";
			} else if (percent > 75.75 && percent <= 88.375) {
				itemname += "| Doppler (Ruby)";
			} else if (percent > 88.375 && percent <= 101) {
				itemname += "| Doppler";
			}
		} else if (percent > 56.56 && percent <= 60.60) {
			itemname += "| Slaughter";
		} else if (percent > 60.60 && percent <= 64.64) {
			itemname += "| Black Laminate";
		} else if (percent > 64.64 && percent <= 68.68) {
			itemname += "| Autotronic";
		} else if (percent > 68.68 && percent <= 72.72) {
			itemname += "| Tiger Tooth";
		} else if (percent > 72.72 && percent <= 76.76) {
			itemname += "| Fade";
		} else if (percent > 76.76 && percent <= 80.80) {
			itemname += "| Freehand";
		} else if (percent > 80.80 && percent <= 84.84) {
			itemname += "| Crimson Web";
		} else if (percent > 84.84 && percent <= 88.88) { // Gamma Doppler
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname += "| Gamma Doppler (Emerald)";
			} else if (percent >= 16.83 && percent <= 33.66) {
				itemname += "| Gamma Doppler (Phase 1)";
			} else if (percent >= 33.66 && percent <= 50.49) {
				itemname += "| Gamma Doppler (Phase 2)";
			} else if (percent >= 50.49 && percent <= 67.32) {
				itemname += "| Gamma Doppler (Phase 3)";
			} else if (percent >= 67.32 && percent <= 84.15) {
				itemname += "| Gamma Doppler (Phase 4)";
			} else if (percent >= 84.15 && percent <= 101) {
				itemname += "| Gamma Doppler";
			}
		} else if (percent > 88.88 && percent <= 92.92) {
			itemname += "| Lore";
		} else if (percent > 92.92 && percent <= 96.96) {
			itemname += "| Damascus Steel";
		} else if (percent > 96.96 && percent <= 101) { // Vanilla
			// Nothing since Vanilla has nothing after it
		}
		return itemname;
	}
}

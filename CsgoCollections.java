
public class CsgoCollections extends CsgoCases {
	private String rarity, itemname, flavortext = "N/A", skindescription;

	public CsgoCollections() {
		super();
	}

	public void getSessionWinnings() {
		System.out.println("\nPress enter to see your winnings this session!");
		HelperMethods.promptEnterKey();
		System.out.println("Winnings this session: ");
		System.out.println("White (Consumer Grade): " + getWhite());
		System.out.println("Light Blue (Industrial Grade): " + getLightBlue());
		System.out.println("Blue (Mil-Spec): " + getBlue());
		System.out.println("Purple (Restricted): " + getPurple());
		System.out.println("Pink (Classified): " + getPink());
		System.out.println("Red (Covert): " + getRed());
		System.out.println("\nPress enter to go back to the main menu\n");
		HelperMethods.promptEnterKey();
	}
	// ALL COLLECTIONS BELOW HERE -------------------
	// PRICE GUIDE: (Pre-determined)
	// Alpha Collection: 1500;

	public void AlphaCollection() { // ALPHA COLLECTION
		// #s: white = 6, light-blue = 5, blue = 3, purple = 2;
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // WHITE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "XM1014 | Jungle";
				flavortext = "For those with an appetite for destruction";
				skindescription = "This memento from Ruins has individual parts spray-painted solid colors in a jungle color scheme.";
				this.white++;
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "MP9 | Dry Season";
				flavortext = "Don't worry...business is about to pick up - Booth, Arms Dealer";
				skindescription = "This memento from Gwalior has been spray-painted using ripped tape strips and perforated metal as stencils.";
				this.white++;
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "M249 | Jungle DDPAT";
				flavortext = "Even if you can't see it, you'll definitely hear it";
				skindescription = "This memento from Ruins has been painted using a Digital Disruptive Pattern (DDPAT) hydrographic.";
				this.white++;
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "MP7 | Groundwater";
				flavortext = "Never take victory for granted";
				skindescription = "This memento from Cache has individual parts spray-painted solid colors in an olive drab color scheme.";
				this.white++;
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "Five-SeveN | Anodized Gunmetal";
				flavortext = "You don't know Felix Riley like I do... the man is impossible to break - The Traitor and The Truthseeker Part 1";
				skindescription = "This memento from Siege has been painted with a gunmetal anodized effect paint over a chrome base coat.";
				this.white++;
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "Tec-9 | Tornado";
				flavortext = "Words are wind, but wind can kill";
				skindescription = "This memento from Ali has individual parts spray-painted solid colors in a tornado color scheme.";
				this.white++;
			}
			totalwhite++;
			rarity = "White";
		} else if (percent > 79.92 && percent <= 94.2) { // LIGHT BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "Sawed-Off | Mosaico";
				flavortext = "Patience is a virtue";
				skindescription = "This memento from Ali has been painted with a mosaic hydrographic.";
				this.lightblue++;
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "Negev | Palm";
				flavortext = "Beautiful today...ashes tomorrow";
				skindescription = "This memento from Gwalior been spray-painted using cardboard cutouts, fine mesh, and palm leaves as stencils.";
				this.lightblue++;
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "SSG 08 | Mayan Dreams";
				flavortext = "Sometimes a sacrifice is called for";
				skindescription = "This memento from Ruins has been painted using a Mayan cloud motif hydrographic.";
				this.lightblue++;
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "P250 | Facets";
				flavortext = "My men are professionals, they'll get the job done right... - Elliott Kingsman, Career Criminal";
				skindescription = "This memento from Agency has been painted with a polygonal patterned hydrographic.";
				this.lightblue++;
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "Glock-18 | Sand Dune";
				flavortext = "Gonzo journalist Alex Kincaide disappeared after traveling to The Maghreb to cover Operation Vanguard";
				skindescription = "This memento from Gwalior has individual parts spray-painted solid colors in a sand dune color scheme.";
				this.lightblue++;
			}
			totallightblue++;
			rarity = "Light Blue";
		} else if (percent > 94.2 && percent <= 99.5) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "PP-Bizon | Rust Coat";
				flavortext = "Scars build character";
				skindescription = "This memento from Siege is still perfectly operational although the exterior surfaces have rusted.";
				this.blue++;
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "AUG | Anodized Navy";
				flavortext = "I already lost one man to Valeria's lies... I don't intend to lose anyone else - Felix Riley, Commanding Officer";
				skindescription = "This memento from Ali has been painted with a chrome base coat and candied in transparent navy anodized effect paint.";
				this.blue++;
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "MAG-7 | Hazard";
				flavortext = "DO NOT CROSS";
				skindescription = "This memento from Siege has been spray-painted in a hazard stripe pattern.";
				this.blue++;
			}
			totalblue++;
			rarity = "Blue";
		} else if (percent > 99.5 && percent <= 101) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "SCAR-20 | Emerald";
				flavortext = "This is what the great Sebastien Hennequet has been reduced to? A nagging school marm? What happened to you... - The Teacher and The Iconoclast Part 2";
				skindescription = "This memento from Chinatown has been painted with a chrome base coat and candied in transparent emerald anodized effect paint.";
				this.purple++;
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "FAMAS | Spitfire";
				flavortext = "Jester's dead";
				skindescription = "This memento from Cache has been painted with a shark's mouth in the style of aircraft nose art.";
				this.purple++;
			}
			totalpurple++;
			rarity = "Purple";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription, "nostatrak");
		flavortext = "N/A";
	}
}

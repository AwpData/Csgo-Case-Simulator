
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
	// Assault Collection: 3000;
	// Aztec Collection: 500;
	// Baggage Collection: 1500;
	// Bank Collection: 300;
	// Cache Collection: 400;

	public void AlphaCollection() { // ALPHA COLLECTION
		// #s: white = 6, light-blue = 5, blue = 3, purple = 2;
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // WHITE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "XM1014 | Jungle";
				flavortext = "For those with an appetite for destruction";
				skindescription = "This memento from Ruins has individual parts spray-painted solid colors in a jungle color scheme.";
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "MP9 | Dry Season";
				flavortext = "Don't worry...business is about to pick up - Booth, Arms Dealer";
				skindescription = "This memento from Gwalior has been spray-painted using ripped tape strips and perforated metal as stencils.";
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "M249 | Jungle DDPAT";
				flavortext = "Even if you can't see it, you'll definitely hear it";
				skindescription = "This memento from Ruins has been painted using a Digital Disruptive Pattern (DDPAT) hydrographic.";
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "MP7 | Groundwater";
				flavortext = "Never take victory for granted";
				skindescription = "This memento from Cache has individual parts spray-painted solid colors in an olive drab color scheme.";
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "Five-SeveN | Anodized Gunmetal";
				flavortext = "You don't know Felix Riley like I do... the man is impossible to break - The Traitor and The Truthseeker Part 1";
				skindescription = "This memento from Siege has been painted with a gunmetal anodized effect paint over a chrome base coat.";
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "Tec-9 | Tornado";
				flavortext = "Words are wind, but wind can kill";
				skindescription = "This memento from Ali has individual parts spray-painted solid colors in a tornado color scheme.";
			}
			this.white++;
			totalwhite++;
			rarity = "White";
		} else if (percent > 79.92 && percent <= 94.2) { // LIGHT BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "Sawed-Off | Mosaico";
				flavortext = "Patience is a virtue";
				skindescription = "This memento from Ali has been painted with a mosaic hydrographic.";
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "Negev | Palm";
				flavortext = "Beautiful today...ashes tomorrow";
				skindescription = "This memento from Gwalior been spray-painted using cardboard cutouts, fine mesh, and palm leaves as stencils.";
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "SSG 08 | Mayan Dreams";
				flavortext = "Sometimes a sacrifice is called for";
				skindescription = "This memento from Ruins has been painted using a Mayan cloud motif hydrographic.";
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "P250 | Facets";
				flavortext = "My men are professionals, they'll get the job done right... - Elliott Kingsman, Career Criminal";
				skindescription = "This memento from Agency has been painted with a polygonal patterned hydrographic.";
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "Glock-18 | Sand Dune";
				flavortext = "Gonzo journalist Alex Kincaide disappeared after traveling to The Maghreb to cover Operation Vanguard";
				skindescription = "This memento from Gwalior has individual parts spray-painted solid colors in a sand dune color scheme.";
			}
			this.lightblue++;
			totallightblue++;
			rarity = "Light Blue";
		} else if (percent > 94.2 && percent <= 99.5) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "PP-Bizon | Rust Coat";
				flavortext = "Scars build character";
				skindescription = "This memento from Siege is still perfectly operational although the exterior surfaces have rusted.";
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "AUG | Anodized Navy";
				flavortext = "I already lost one man to Valeria's lies... I don't intend to lose anyone else - Felix Riley, Commanding Officer";
				skindescription = "This memento from Ali has been painted with a chrome base coat and candied in transparent navy anodized effect paint.";
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "MAG-7 | Hazard";
				flavortext = "DO NOT CROSS";
				skindescription = "This memento from Siege has been spray-painted in a hazard stripe pattern.";
			}
			this.blue++;
			totalblue++;
			rarity = "Blue";
		} else if (percent > 99.5 && percent <= 101) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "SCAR-20 | Emerald";
				flavortext = "This is what the great Sebastien Hennequet has been reduced to? A nagging school marm? What happened to you... - The Teacher and The Iconoclast Part 2";
				skindescription = "This memento from Chinatown has been painted with a chrome base coat and candied in transparent emerald anodized effect paint.";
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "FAMAS | Spitfire";
				flavortext = "Jester's dead";
				skindescription = "This memento from Cache has been painted with a shark's mouth in the style of aircraft nose art.";
			}
			this.purple++;
			totalpurple++;
			rarity = "Purple";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription, "nostatrak");
		flavortext = "N/A";
	}

	public void AssaultCollection() { // ASSAULT COLLECTION
		// #s: white = 2, light-blue = 1, blue = 2, purple = 2;
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // WHITE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "SG 553 | Tornado";
				skindescription = "It has individual parts spray-painted solid colors in a tornado color scheme.";
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "UMP-45 | Caramel";
				skindescription = "It has individual parts spray-painted solid colors in a caramel and black color scheme.";
			}
			this.white++;
			totalwhite++;
			rarity = "White";
		} else if (percent > 79.92 && percent <= 94.2) { // LIGHT BLUE TIER
			itemname = "Five-SeveN | Candy Apple";
			flavortext = "Great on cars, better on weapons";
			skindescription = "It has individual parts spray-painted solid colors in a red and black color scheme.";
			this.lightblue++;
			totallightblue++;
			rarity = "Light Blue";
		} else if (percent > 94.2 && percent <= 99.5) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "Negev | Anodized Navy";
				skindescription = "It has been painted with a chrome base coat and candied in transparent navy blue anodized effect paint.";
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AUG | Hot Rod";
				flavortext = "Automatic. Systematic. Hydromatic.";
				skindescription = "It has been painted with a chrome base coat and candied in transparent red anodized effect paint.";
			}
			this.blue++;
			totalblue++;
			rarity = "Blue";
		} else if (percent > 99.5 && percent <= 101) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "MP9 | Bulldozer";
				flavortext = "This bone crusher is a devastator";
				skindescription = "It has individual parts spray-painted solid colors in a production line yellow color scheme.";
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "Glock-18 | Fade";
				flavortext = "This isn't just a weapon, it's a conversation piece - Imogen, Arms Dealer In Training";
				skindescription = "It has been painted by airbrushing transparent paints that fade together over a chrome base coat.";
			}
			this.purple++;
			totalpurple++;
			rarity = "Purple";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription, "nostatrak");
		flavortext = "N/A";
	}

	public void AztecCollection() { // AZTEC COLLECTION
		// #s: white = 3, light-blue = 2, blue = 1;
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 51) { // WHITE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "Five-SeveN | Jungle";
				skindescription = "It has individual parts spray-painted solid colors in a jungle color scheme.";
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "Nova | Forest Leaves";
				skindescription = "It has been spray-painted using leaves as stencils.";
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "SSG 08 | Lichen Dashed";
				skindescription = "It has been spray-painted using short pieces of tape as stencils.";
			}
			this.white++;
			totalwhite++;
			rarity = "White";
		} else if (percent > 51 && percent <= 90) { // LIGHT BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "M4A4 | Jungle Tiger";
				skindescription = "It has been painted using a jungle tiger hydrographic.";
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | Jungle Spray";
				flavortext = "Perfect for the insurgent on the go";
				skindescription = "It has been spray-painted freehand with short, thick lines in contrasting colors.";
			}
			this.lightblue++;
			totallightblue++;
			rarity = "Light Blue";
		} else if (percent > 90 && percent <= 101) { // BLUE TIER
			itemname = "Tec-9 | Ossified";
			skindescription = "It has been painted using a transparent lime green abstract hydrographic over a metallic base coat.";
			this.blue++;
			totalblue++;
			rarity = "Blue";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription, "nostatrak");
		flavortext = "N/A";
	}

	public void BaggageCollection() { // BAGGAGE COLLECTION
		// #s: white = 5, light blue = 4, blue = 3, purple = 2, pink = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // WHITE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "SSG 08 | Sand Dune";
				flavortext = "With Turner dead, we have a new priority: rescue Alex Kincaide - Felix Riley, Commanding Officer";
				skindescription = "It has individual parts spray-painted solid colors in a sand dune color scheme.";
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "G3SG1 | Contractor";
				flavortext = "Rona Sabri still hasn't forgiven Sebastien for not selecting her to go after Turner";
				skindescription = "It has individual parts spray-painted tan, navy and dark green.";
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "MP9 | Green Plaid";
				flavortext = "It's not a bagpipe, but it plays a song before every funeral";
				skindescription = "It has been painted with a hydrographic in a taupe and blue-green plaid pattern.";
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "C275-Auto | Green Plaid";
				flavortext = "It's not a bagpipe, but it plays a song before every funeral";
				skindescription = "It has been painted with a hydrographic in a taupe and blue-green plaid pattern.";
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "MP7 | Olive Plaid";
				flavortext = "I like it. It brings out my eyes on camera... - Rona Sabri, Rising Star";
				skindescription = "It has been painted with a hydrographic in a beige and olive green plaid pattern.";
			}
			this.white++;
			totalwhite++;
			rarity = "White";
		} else if (percent > 79.92 && percent <= 95.2) { // LIGHT BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 25.25) {
				itemname = "SG 553 | Traveler";
				flavortext = "Everyone has a story, and Javier will pry it out before he kills you";
				skindescription = "It has been custom painted in a stripe design inspired by vintage luggage, and had some parts wrapped in brown leather.";
			} else if (percent > 25.25 && percent <= 50.50) {
				itemname = "MAC-10 | Commuter";
				flavortext = "They took the bait, let's move... - Elliott Kingsman, Mercenary";
				skindescription = "It has been painted with a plaid hydrographic and partly wrapped in faux crocodile leather.";
			} else if (percent > 50.50 && percent <= 75.75) {
				itemname = "P90 | Leather";
				flavortext = "Don't worry, the safety is TSA compliant";
				skindescription = "Its stock has been wrapped in brown leather.";
			} else if (percent > 75.75 && percent <= 101) {
				itemname = "P2000 | Coach Class";
				flavortext = "It's not fancy, but it gets you where you need to go";
				skindescription = "It has been painted with a plaid hydrographic and parts of the grip have been wrapped in brown leather.";
			}
			this.lightblue++;
			totallightblue++;
			rarity = "Light Blue";
		} else if (percent > 95.2 && percent <= 99.1) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "USP-S | Business Class";
				flavortext = "Some people don't just want extra leg room... they want peace and quiet";
				skindescription = "It has been custom painted with colors and patterns inspired by vintage luggage, and had some parts wrapped in brown leather.";
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "Sawed-Off | First Class";
				flavortext = "Mimosa not included";
				skindescription = "Its stock has been wrapped in green leather.";
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "XM1014 | Red Leather";
				flavortext = "Pack your bags. Let's go kill that sonofabitch... - The Oni and The Valkyrie Part 2";
				skindescription = "Its stock and grip have been wrapped in red leather.";
			}
			this.blue++;
			totalblue++;
			rarity = "Blue";
		} else if (percent > 99.1 && percent <= 99.7) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "Desert Eagle | Pilot";
				flavortext = "Assume crash positions";
				skindescription = "It has a brass inlay of a pilot's wings.";
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "AK-47 | First Class";
				flavortext = "Mimosa not included";
				skindescription = "Its stock has been wrapped in green leather.";
			}
			this.purple++;
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 99.7 && percent <= 101) { // PINK TIER
			itemname = "AK-47 | Jet Set";
			flavortext = "Anyone paying close attention will connect the dots and see what she did. We don't have much time to find a solution... - A Father's Love Part 1";
			skindescription = "Its stock has been wrapped in brown leather. This weapon has been to a lot of cities.";
			this.pink++;
			totalpink++;
			rarity = "Pink";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription, "nostatrak");
		flavortext = "N/A";
	}

	public void BankCollection() { // BANK COLLECTION
		// #s: white = 6, light blue = 5, blue = 3, purple = 1, pink = 1
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 79.92) { // WHITE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "R8 Revolver | Bone Mask";
				flavortext = "True power is demonstrated with subtle application";
				skindescription = "It has been spray-painted using a tangle of masking tape as a stencil.";
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "Tec-9 | Urban DDPAT";
				flavortext = "By the time you're close enough to notice the pixels it's already too late";
				skindescription = "It has been painted using a Digital Disruptive Pattern (DDPAT) hydrographic.";
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "Sawed-Off | Forest DDPAT";
				flavortext = "By the time you're close enough to notice the pixels it's already too late";
				skindescription = "It has been painted using a Digital Disruptive Pattern (DDPAT) hydrographic.";
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "MP7 | Forest DDPAT";
				flavortext = "By the time you're close enough to notice the pixels it's already too late";
				skindescription = "It has been painted using a Digital Disruptive Pattern (DDPAT) hydrographic.";
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "SG 553 | Army Sheen";
				flavortext = "Remember your training";
				skindescription = "It has been covered in a metallic foil stamped with a camouflage pattern.";
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "Negev | Army Sheen";
				flavortext = "Remember your training";
				skindescription = "It has been covered in a metallic foil stamped with a camouflage pattern.";
			}
			this.white++;
			totalwhite++;
			rarity = "White";
		} else if (percent > 79.92 && percent <= 95.2) { // LIGHT BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "MAC-10 | Silver";
				flavortext = "There is beauty in simplicity - Franz Kriegeld, Phoenix Tactician";
				skindescription = "It has been painted with a chrome base coat and candied in transparent silver anodized effect paint.";
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "UMP-45 | Carbon Fiber";
				flavortext = "Just because I carried my team doesn't mean it wasn't a team effort - Rona Sabri, Rising Star";
				skindescription = "It has been painted using a carbon fiber hydrographic over a graphite base coat.";
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "G3SG1 | Green Apple";
				flavortext = "An apple a day keeps insurance premiums high";
				skindescription = "It has individual parts spray-painted solid colors in a green and black color scheme.";
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "Nova | Caged Steel";
				flavortext = "Say matte!";
				skindescription = "It has been painted with a hex pattern using stencilled metal flake paint, then covered in an oval cutout hydrographic.";
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "Glock-18 | Death Rattle";
				flavortext = "I know you don't believe in the cause...and when I expose you, Valeria will have your head - The Shield and The Serpent Part 1";
				skindescription = "It has been painted with a snakeskin patterned hydrographic.";
			}
			this.lightblue++;
			totallightblue++;
			rarity = "Light Blue";
		} else if (percent > 95.2 && percent <= 99.1) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 33.66) {
				itemname = "Desert Eagle | Meteorite";
				flavortext = "Everyone wants to make an impact";
				skindescription = "It has been painted with metallic paint, using a crystallizing mask to create a pattern.";
			} else if (percent > 33.66 && percent <= 67.32) {
				itemname = "Galil AR | Tuxedo";
				flavortext = "For when combat is a black tie affair";
				skindescription = "It has individual parts spray-painted solid colors in a black and white color scheme.";
			} else if (percent > 67.32 && percent <= 101) {
				itemname = "CZ75-Auto | Tuxedo";
				flavortext = "For when combat is a black tie affair";
				skindescription = "It has individual parts spray-painted solid colors in a black and white color scheme.";
			}
			this.blue++;
			totalblue++;
			rarity = "Blue";
		} else if (percent > 99.1 && percent <= 99.7) { // PURPLE TIER
			itemname = "AK-47 | Emerald Pinstripe";
			flavortext = "Questioning Imogen is questioning me. Now Relax, have some scotch, and let's talk business - The Father and The Phoenix Part 2";
			skindescription = "It has been given a bog oak stock and painted a white and green pinstripes.";
			this.purple++;
			totalpurple++;
			rarity = "Purple";
		} else if (percent > 99.7 && percent <= 101) { // PINK TIER
			itemname = "P250 | Franklin";
			flavortext = "Money doesn't talk... it kills";
			skindescription = "It has been painted using a hydrographic of American hundred-dollar bills.";
			this.pink++;
			totalpink++;
			rarity = "Pink";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription, "nostatrak");
		flavortext = "N/A";
	}

	public void CacheCollection() { // CACHE COLLECTION
		// #s: light-blue = 6, blue = 5, purple = 2;
		double percent = 100 * Math.random() + 1;
		if (percent >= 0 && percent <= 51) { // LIGHT BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 16.83) {
				itemname = "Negev | Nuclear Waste";
				skindescription = "It has been painted with a hydrographic pattern of nuclear hazards symbols.";
			} else if (percent > 16.83 && percent <= 33.66) {
				itemname = "PP-Bizon | Chemical Green";
				skindescription = "It has been painted solid colors in grey and garish green.";
			} else if (percent > 33.66 && percent <= 50.49) {
				itemname = "Five-SeveN | Hot Shot";
				skindescription = "It has been painted solid colors in light grey and hot green.";
			} else if (percent > 50.49 && percent <= 67.32) {
				itemname = "P250 | Contamination";
				skindescription = "It has been painted with a hydrographic pattern of nuclear skulls and bones.";
			} else if (percent > 67.32 && percent <= 84.15) {
				itemname = "AUG | Radiation Hazard";
				skindescription = "It has been spray-painted with radiological warning hazard patterns.";
			} else if (percent > 84.15 && percent <= 101) {
				itemname = "SG 553 | Fallout Warning";
				skindescription = "It has been spray-painted with radiological warning hazard patterns.";
			}
			this.lightblue++;
			totallightblue++;
			rarity = "Light Blue";
		} else if (percent > 51 && percent <= 95) { // BLUE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 20.2) {
				itemname = "Tec-9 | Toxic";
				skindescription = "It has been painted with a garish hydrographic pattern of nuclear skulls and bones.";
			} else if (percent > 20.2 && percent <= 40.4) {
				itemname = "MAC-10 | Nuclear Garden";
				skindescription = "It has been chromed then overlayed with a semi transparent hydrographic pattern of nuclear skulls and bones.";
			} else if (percent > 40.4 && percent <= 60.6) {
				itemname = "XM1014 | Bone Machine";
				skindescription = "It has been chromed then overlayed with a semi transparent hydrographic pattern of nuclear skulls and bones.";
			} else if (percent > 60.6 && percent <= 80.8) {
				itemname = "MP9 | Setting Sun";
				skindescription = "It has been painted with a hydrographic pattern of nuclear hazards symbols.";
			} else if (percent > 80.8 && percent <= 101) {
				itemname = "Glock-18 | Reactor";
				skindescription = "It has been painted with a pattern of nuclear hazard symbols using metallic paints.";
			}
			this.blue++;
			totalblue++;
			rarity = "Blue";
		} else if (percent > 95 && percent <= 101) { // PURPLE TIER
			percent = 100 * Math.random() + 1;
			if (percent >= 0 && percent <= 50.5) {
				itemname = "FAMAS | Styx";
				skindescription = "It has been chromed then overlayed with a semi transparent hydrographic pattern of nuclear skulls and bones.";
			} else if (percent > 50.5 && percent <= 101) {
				itemname = "Galil AR | Cerberus";
				skindescription = "It has been custom painted with a depiction of Cerberus, the mythical three headed dog that guards the underworld.";
			}
			this.purple++;
			totalpurple++;
			rarity = "Purple";
		}
		new ItemStatistics(itemname, rarity, flavortext, skindescription, "nostatrak");
		flavortext = "N/A";
	}
}

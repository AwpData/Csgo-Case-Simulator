import java.io.*;

/* IMPORTANT IMPORTANT IMPORTANT
 * 
 * This program uses Unicode Characters! 
 * If you use Eclipse, it is set to use the default "Cp1252" text file encoding and this program must be set to "UTF-8"!
 * In order to not get errors or missing characters (labeled with "?"):
 * 1. Window > Preferences > General > Content Types, under "Default encoding", type "UTF-8" and click apply
 * 2. Window > Preferences > General > Workspace, set "Text file encoding" to "Other : UTF-8".
 * 
 * NOTE: Other classes have useful keys for the data if you are confused!
 */

// CASES IMPLEMENTED (CsgoCases.java)
// All current cases have been implemented! (7/3/19)

// COLLECTIONS IMPLEMENTED (CsgoCollections.java)
// Alpha Collection

// SOUVENIRS IMPLEMENTED (CsgoSouvenirs.java)

// STICKER CAPSULES IMPLEMENTED (CsgoCapsules.java)

//CREDIT CASES IMPLEMENTED (CreditCases.java)
// Small Credits Case 

// CUSTOM CASES IMPLEMENTED (CustomCases.java)

public class ClientInterface {
	static int credits = 10000;

	public static void main(String[] args) throws FileNotFoundException {
		String selection = "";
		boolean proceed = false, mainloop = true;
		while (mainloop) {

			// ----------- Prints Out Inventory Of Items In File ----------- //
			PrintStream output = new PrintStream(new File("src/inventory.txt"));
			for (int i = 0; i < ItemStatistics.getItemList().size(); i++) {
				output.println(ItemStatistics.getItemList().get(i).toString());
			}
			// ----------- Console Output Method ----------- //
			System.out.println("\nYour credit balance is " + credits);
			selection = HelperMethods.MainMenu();

			// ----------- Miscellaneous Options ----------- //
			if (selection.equalsIgnoreCase("quit")) { // Quit program
				HelperMethods.quit();
			}
			if (selection.equalsIgnoreCase("sell")) {
				HelperMethods.sell();
			}

			if (selection.equalsIgnoreCase("inspect")) {
				HelperMethods.inspect();
			}

			/// ----------- Opening Box Methods ----------- ///

			// ----------- Csgo Cases ------------ //

			if (selection.equals("1")) {
				selection = HelperMethods.CsgoCasesMainMenu();
				if (selection.equals("1")) {
					proceed = HelperMethods.buyCheck("CSGO Weapons Case", 1300, "CsgoWeaponsCase", "case");
				} else if (selection.equals("2")) {
					proceed = HelperMethods.buyCheck("CSGO Weapons Case 2", 1200, "CsgoWeaponsCase2", "case");
				} else if (selection.equals("3")) {
					proceed = HelperMethods.buyCheck("CSGO Weapons Case 3", 400, "CsgoWeaponsCase3", "case");
				} else if (selection.equals("4")) {
					proceed = HelperMethods.buyCheck("Chroma Case", 200, "ChromaCase", "case");
				} else if (selection.equals("5")) {
					proceed = HelperMethods.buyCheck("Chroma 2 Case", 50, "Chroma2Case", "case");
				} else if (selection.equals("6")) {
					proceed = HelperMethods.buyCheck("Chroma 3 Case", 30, "Chroma3Case", "case");
				} else if (selection.equals("7")) {
					proceed = HelperMethods.buyCheck("eSports 2013 Case", 1700, "eSports2013Case", "case");
				} else if (selection.equals("8")) {
					proceed = HelperMethods.buyCheck("eSports 2013 Winter Case", 550, "eSports2013WinterCase", "case");
				} else if (selection.equals("9")) {
					proceed = HelperMethods.buyCheck("eSports 2014 Summer Case", 850, "eSports2014SummerCase", "case");
				} else if (selection.equals("10")) {
					proceed = HelperMethods.buyCheck("Falchion Case", 90, "FalchionCase", "case");
				} else if (selection.equals("11")) {
					proceed = HelperMethods.buyCheck("Gamma Case", 30, "GammaCase", "case");
				} else if (selection.equals("12")) {
					proceed = HelperMethods.buyCheck("Gamma 2 Case", 30, "Gamma2Case", "case");
				} else if (selection.equals("13")) {
					proceed = HelperMethods.buyCheck("Glove Case", 30, "GloveCase", "case");
				} else if (selection.equals("14")) {
					proceed = HelperMethods.buyCheck("Huntsman Weapon Case", 175, "HuntsmanWeaponCase", "case");
				} else if (selection.equals("15")) {
					proceed = HelperMethods.buyCheck("Operation Bravo Case", 2000, "OperationBravoCase", "case");
				} else if (selection.equals("16")) {
					proceed = HelperMethods.buyCheck("Operation Breakout Case", 140, "OperationBreakoutCase", "case");
				} else if (selection.equals("17")) {
					proceed = HelperMethods.buyCheck("Operation Hydra Case", 450, "OperationHydraCase", "case");
				} else if (selection.equals("18")) {
					proceed = HelperMethods.buyCheck("Operation Phoenix Case", 180, "OperationPhoenixCase", "case");
				} else if (selection.equals("19")) {
					proceed = HelperMethods.buyCheck("Operation Vanguard Case", 200, "OperationVanguardCase", "case");
				} else if (selection.equals("20")) {
					proceed = HelperMethods.buyCheck("Operation Wildfire Case", 70, "OperationWildfireCase", "case");
				} else if (selection.equals("21")) {
					proceed = HelperMethods.buyCheck("Revolver Case", 40, "RevolverCase", "case");
				} else if (selection.equals("22")) {
					proceed = HelperMethods.buyCheck("Shadow Case", 70, "ShadowCase", "case");
				} else if (selection.equals("23")) {
					proceed = HelperMethods.buyCheck("Winter Offensive Case", 200, "WinterOffensiveCase", "case");
				} else if (selection.equals("24")) {
					proceed = HelperMethods.buyCheck("Spectrum Case", 30, "SpectrumCase", "case");
				} else if (selection.equals("25")) {
					proceed = HelperMethods.buyCheck("Spectrum 2 Case ", 30, "Spectrum2Case", "case");
				} else if (selection.equals("26")) {
					proceed = HelperMethods.buyCheck("Clutch Case", 30, "ClutchCase", "case");
				} else if (selection.equals("27")) {
					proceed = HelperMethods.buyCheck("Horizon Case", 30, "HorizonCase", "case");
				} else if (selection.equals("28")) {
					proceed = HelperMethods.buyCheck("Danger Zone Case", 200, "DangerZoneCase", "case");
				} else if (selection.equals("29")) {
					proceed = HelperMethods.buyCheck("Prisma Case", 600, "PrismaCase", "case");
				} else if (selection.equalsIgnoreCase("back")) {
					continue;
				}

				// ------------- Csgo Collections ------------- //

			} else if (selection.equals("2")) {
				selection = HelperMethods.CsgoCollectionsMenu();
				if (selection.equals("1")) {
					proceed = HelperMethods.buyCheck("Alpha Collection", 1500, "AlphaCollection", "package");
				} else if (selection.equalsIgnoreCase("back")) {
					continue;
				}

				// ------------- Credits Cases ------------- //

			} else if (selection.equals("3")) {
				selection = HelperMethods.CreditsCasesMenu();
				if (selection.equals("1")) {
					proceed = HelperMethods.buyCheck("Small Credits Case", 25, "SmallCreditsCase", "case");
				} else if (selection.equalsIgnoreCase("back")) {
					continue;
				}
				if (proceed == true) {
					credits += CreditsCases.getCreditsWin();
					proceed = false;
				}
			} else {
				System.out.println("\nInvalid option, try again.");
			}

			// ----------- Reset Static Stats For Next Spin ----------- //
			CreditsCases.creditswin = 0;
			ItemStatistics.stattrak = 0;
		}
	}
}

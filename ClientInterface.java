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

// CASES IMPLEMENTED
// Csgo Weapons Cases (1-3)
// Chroma Cases (1-3)
// eSports 2013 Case
// eSports 2013 Winter Case
// eSports 2014 Summer Case
// Falchion Case
// Gamma Cases (1-2)
// Glove Case
// Small Credits Case 

// PACKAGES IMPLEMENTED

// SOUVENIRS IMPLEMENTED

public class ClientInterface {
	static int credits = 10000; // change this to any value

	public static void main(String[] args) throws FileNotFoundException {
		String selection = "";
		boolean proceed = false, mainloop = true;
		while (mainloop) {

			// ----------- Prints Out Inventory Of Items ----------- //
			PrintStream output = new PrintStream(new File("src/inventory.txt"));
			for (int i = 0; i < ItemStatistics.getItemList().size(); i++) {
				output.println(ItemStatistics.getItemList().get(i));
			}
			// ----------- Console Output Method ----------- //
			System.out.println("Your credit balance is " + credits);
			selection = HelperMethods.MainMenu();
			System.out.println();

			// ----------- Miscellaneous Options ----------- //
			if (selection.equalsIgnoreCase("quit")) { // Quit program
				ReferenceCase.getTotalWinnings();
				System.out.println("\nCheck inventory.txt to see your winnings");
				System.out.println("\nQuitting program...");
				System.exit(0);
			}
			if (selection.equalsIgnoreCase("sell")) {
				if (ItemStatistics.getItemList().size() == 0) {
					System.out.println("There is nothing to sell!\n");
				} else {
					System.out.println("Enter the line number of the skin you would like to sell\n");
					for (int i = 0; i < ItemStatistics.getItemList().size(); i++) {
						System.out.println((i + 1) + ". " + ItemStatistics.getItemList().get(i));
					}
					int index = HelperMethods.input.nextInt();
					String item = ItemStatistics.sellSkin(index);
					HelperMethods.addCreditsFromSell(item);
				}
				System.out.println("Press ENTER to go back to the main menu");
				HelperMethods.promptEnterKey();
			}

			// ----------- Case Option Advancement Methods ----------- //
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
				proceed = HelperMethods.buyCheck("Small Credits Case", 25, "SmallCreditsCase", "case");
				if (proceed == true) {
					credits += CreditsCases.getCreditsWin();
				}
			}
			// ----------- Reset Static Stats For Next Spin ----------- //
			CreditsCases.creditswin = 0;
			ItemStatistics.stattrak = 0;
		}
	}
}

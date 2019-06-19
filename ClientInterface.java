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
// Small Credits Case 

// PACKAGES IMPLEMENTED

// SOUVENIRS IMPLEMENTED

public class ClientInterface {
	static int credits = 1000; // change this to any value

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
				System.out.println("\nQuitting program...");
				System.exit(0);
			}
			if (selection.equalsIgnoreCase("sell")) {
				System.out.println("Enter the line of the skin you would like to sell (In inventory.txt)");
				int index = HelperMethods.input.nextInt();
				String item = ItemStatistics.sellSkin(index);
				HelperMethods.addCreditsFromSell(item);
			}

			// ----------- Case Option Advancement Methods ----------- //
			if (selection.equals("1")) { // CSGO Weapons Case
				proceed = HelperMethods.buyCheck("CSGO Weapons Case", 50, "CsgoWeaponsCase", "case");
			} else if (selection.equals("2")) { // CSGO Weapons Case 2
				proceed = HelperMethods.buyCheck("CSGO Weapons Case 2", 50, "CsgoWeaponsCase2", "case");
			} else if (selection.equals("3")) { // CSGO Weapons Case 3
				proceed = HelperMethods.buyCheck("CSGO Weapons Case 3", 50, "CsgoWeaponsCase3", "case");
			} else if (selection.equals("4")) { // Chroma Case
				proceed = HelperMethods.buyCheck("Chroma Case", 30, "ChromaCase", "case");
			} else if (selection.equals("5")) {
				proceed = HelperMethods.buyCheck("Chroma 2 Case", 30, "Chroma2Case", "case");
			} else if (selection.equals("6")) {
				proceed = HelperMethods.buyCheck("Chroma 3 Case", 30, "Chroma3Case", "case");
			} else if (selection.equals("7")) { // Small Credits Case
				proceed = HelperMethods.buyCheck("Small Credits Case", 20, "SmallCreditsCase", "case");
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

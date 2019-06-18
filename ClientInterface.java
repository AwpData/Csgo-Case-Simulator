import java.util.*;
import java.io.*;
// cost of credits lootbox = 20 credits
// To spin a case, just put the name of it with () after

// white = consumer grade
// light blue = industrial grade
// blue = mil-spec 
// purple = restricted
// pink = classified
// red = covert

// CASES IMPLEMENTED
// Csgo Weapons Case
// Csgo Weapons Case 2
// Csgo Weapons Case 3
// Small Credits Case 

// PACKAGES IMPLEMENTED

// SOUVENIRS IMPLEMENTED

public class ClientInterface {
	public static void main(String[] args) throws FileNotFoundException {
		String selection = "";
		int numofboxes = 0;
		int credits = 500; // change this to any value
		boolean proceed = false, mainloop = true;
		Scanner input = new Scanner(System.in);
		while (mainloop) {
			PrintStream output = new PrintStream(new File("src/inventory.txt"));
			for (int i = 0; i < ItemStatistics.getItemList().size(); i++) {
				output.println(ItemStatistics.getItemList().get(i));
			}
			System.out.println("Your credit balance is " + credits);
			selection = HelperMethods.makeSelection();

			// ----------- Miscellaneous Options ----
			if (selection.equals("5")) { // Quit program
				ReferenceCase.getTotalWinnings();
				System.out.println("\nQuitting program...");
				System.exit(0);
			}

			// ----------- Cases below --------------
			if (selection.equals("1")) { // CSGO Weapons Case
				System.out.println("CSGO Weapons Case cost 50 credits. How many would you like to buy?");
				numofboxes = input.nextInt();
				proceed = HelperMethods.buyCheck("CSGO Weapons Case", 50, numofboxes, credits, "CsgoWeaponsCase", "case");
				if (proceed == true) {
					credits -= 50 * numofboxes;
				} else if (proceed == false) {
					continue;
				}
			} else if (selection.equals("2")) { // CSGO Weapons Case 2
				System.out.println("CSGO Weapons Case 2 cost 50 credits. How many would you like to buy?");
				numofboxes = input.nextInt();
				proceed = HelperMethods.buyCheck("CSGO Weapons Case 2", 50, numofboxes, credits, "CsgoWeaponsCase2", "case");
				if (proceed == true) {
					credits -= 50 * numofboxes;
				} else if (proceed == false) {
					continue;
				}
			} else if (selection.equals("3")) { // CSGO Weapons Case 3
				System.out.println("CSGO Weapons Case 3 cost 50 credits. How many would you like to buy?");
				numofboxes = input.nextInt();
				proceed = HelperMethods.buyCheck("CSGO Weapons Case 3", 50, numofboxes, credits, "CsgoWeaponsCase3", "case");
				if (proceed == true) {
					credits -= 50 * numofboxes;
				} else if (proceed == false) {
					continue;
				}
			} else if (selection.equals("4")) { // Small Credits Case
				System.out.println("Small credits case cost 20 credits. How many would you like to buy?");
				numofboxes = input.nextInt();
				proceed = HelperMethods.buyCheck("Small Credits Case", 20, numofboxes, credits, "SmallCreditsCase", "case");
				if (proceed == true) {
					credits -= (20 * numofboxes);
					credits += CreditsCases.getCreditsWin();
					CreditsCases.creditswin = 0;
				} else if (proceed == false) {
					continue;
				}
			}
		}
	}
}

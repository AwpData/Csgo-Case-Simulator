import java.lang.reflect.*;
import java.util.*;
// cost of credits lootbox = 20 credits
// **** all lootboxes cost 20 credits for now
// small credits case = spinSmallCreditsCase()
// To spin the case, just put the name of it with () after

// white = consumer grade
// light blue = industrial grade
// blue = mil-spec 
// purple = restricted
// pink = classified
// red = covert

// CASES IMPLEMENTED
// Csgo Weapons Case
// Csgo Weapons Case 2
// Small Credits Case (Not in program yet)

// PACKAGES IMPLEMENTED

// SOUVENIRS IMPLEMENTED

public class ClientInterface {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String selection = "";
		int numofboxes = 0;
		int credits = 500; // change this to any value
		boolean proceed = false, mainloop = true;
		Scanner input = new Scanner(System.in);
		while (mainloop) {
			selection = HelperMethods.makeSelection();
			if (selection.equals("3")) { // QUIT METHOD
				System.out.println("Quitting program...");
				// insert total winnings method here
				System.exit(0);
			}
			System.out.println("Your credit balance is " + credits);
			if (selection.equals("1")) { // CSGO Weapons Case
				System.out.println("CSGO Weapons Case cost 50 credits. How many would you like to buy?");
				numofboxes = input.nextInt();
				proceed = HelperMethods.buyCheck("CSGO Weapons Case", 50, numofboxes, credits, "CsgoWeaponsCase");
				if (proceed == true) {
					credits -= 50 * numofboxes;
				} else if (proceed == false) {
					continue;
				}
			} else if (selection.equals("2")) { // CSGO Weapons Case 2
				System.out.println("CSGO Weapons Case 2 cost 50 credits. How many would you like to buy?");
				numofboxes = input.nextInt();
				proceed = HelperMethods.buyCheck("CSGO Weapons Case 2", 50, numofboxes, credits, "CsgoWeaponsCase2");
				if (proceed == true) {
					credits -= 50 * numofboxes;
				} else if (proceed == false) {
					continue;
				}
			}
		}
	}
}

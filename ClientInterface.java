import java.util.*;

// white = consumer grade
// light blue = industrial grade
// blue = mil-spec 
// purple = restricted
// pink = classified
// red = covert

// CASES IMPLEMENTED
// Csgo Weapons Case
//
// Small Credits Case

// PACKAGES IMPLEMENTED

// SOUVENIRS IMPLEMENTED

public class ClientInterface {
	public static void main(String[] args) {
		int numofboxes = 0, spendingtotal;
		int creditboxcost = 20;
		int credits = 100000; // change this to any value
		boolean buy = false;
		Scanner input = new Scanner(System.in);
		while (!buy) {
			System.out.println("How many loot boxes would you like to open?");
			numofboxes = input.nextInt();
			input.nextLine();
			spendingtotal = numofboxes * creditboxcost;
			if (spendingtotal > credits) {
				System.out.println("Insufficient funds you need " + spendingtotal + " credits more. Try again");
			} else if (credits == 0) {
				System.out.println("You are broke");
			} else {
				credits -= spendingtotal;
				System.out.println("Buying " + numofboxes + " boxes");
				System.out.println("Your credit balance is now: " + credits + " credits");
				buy = true;
			}
		}
		// cost of credits lootbox = 20 credits
		CreditsCase creditslootbox = new CreditsCase();
		CsgoCases csgocase = new CsgoCases();
		// credits case = spinCreditsCase()
		// To spin the case, just put the name of it with () after
		for (int i = 1; i <= numofboxes; i++) {
			System.out.println("\nPress enter to open a box! " + (numofboxes - i + 1) + " boxes remaining");
			input.nextLine();
			System.out.print("Lootbox " + i + " contains: ");
			csgocase.CsgoWeaponsCase();
			System.out.println();
		}
		System.out.println();
		csgocase.getWinnings();
	}
}

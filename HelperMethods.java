import java.lang.reflect.*;
import java.util.*;

public class HelperMethods extends ClientInterface { // For Client Interface Class
	static Scanner input = new Scanner(System.in);
	static private int numofboxes;

	public static String makeSelection() {
		System.out.println("Which case would you like to buy? (Enter number) \n");
		System.out.println("1. CSGO Weapons Case");
		System.out.println("2. CSGO Weapons Case 2");
		System.out.println("3. CSGO Weapons Case 3");
		System.out.println("4. Chroma Case");
		System.out.println("5. Small Credits Case");
		System.out.println("\ntype \"quit\" to quit");
		return input.nextLine();
	}

	public static boolean buyCheck(String boxname, int cost, String casename, String type) {
		System.out.println(boxname + " cost " + cost + " credits. How many would you like to buy?");
		numofboxes = input.nextInt();
		int spendingtotal = numofboxes * cost;
		if (credits == 0 || credits < 0) {
			System.out.println("You are broke\nGame over...");
			System.exit(0);
		} else if (cost > credits) {
			System.out.println("You can't afford this one choose a different one.\n");
			return false;
		} else if (spendingtotal > credits) {
			System.out.println("Insufficient funds you need " + (spendingtotal - credits) + " credits more.\n");
			return false;
		} else {
			System.out.println("Buying " + numofboxes + " boxes...");
			System.out.println("Transaction successful: " + credits + " - " + spendingtotal);
			credits -= spendingtotal;
			System.out.println("Your credit balance is now: " + credits + " credits");
			HelperMethods.spin(numofboxes, casename, type);
			return true;
		}
		return false;
	}

	public static void spin(int numofboxes, String casename, String boxtype) {
		if (casename.contains("Credits")) { // Credits cases type spins
			CreditsCases creditscase = new CreditsCases();
			for (int i = 1; i <= numofboxes; i++) {
				System.out.println("\nPress enter to open a " + boxtype + ": " + (numofboxes - i + 1) + " " + boxtype + "s remaining");
				input.nextLine();
				System.out.print(boxtype + " " + i + " contains: ");
				try {
					Method method = creditscase.getClass().getMethod(casename);
					method.invoke(creditscase);
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					System.out.println("ProgramError: How did this happen?");
				}
				System.out.println();
			}
			System.out.println("\nPress enter to see your winnings this session!\n");
			input.nextLine();
			creditscase.getSessionWinnings();
			System.out.println("\nPress enter to go back to the main menu");
			input.nextLine();
		} else { // Case type spins
			CsgoCases csgocase = new CsgoCases();
			for (int i = 1; i <= numofboxes; i++) {
				System.out.println("\nPress enter to open a " + boxtype + ": " + (numofboxes - i + 1) + " " + boxtype + "s remaining");
				input.nextLine();
				System.out.print(boxtype + " " + i + " contains: ");
				try {
					Method method = csgocase.getClass().getMethod(casename);
					method.invoke(csgocase);
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					System.out.println("ProgramError: How did this happen?");
				}
				System.out.println();
			}
			System.out.println("\nPress enter to see your winnings this session!");
			input.nextLine();
			csgocase.getSessionWinnings();
			System.out.println("\nPress enter to go back to the main menu\n");
			input.nextLine();
		}
	}
}

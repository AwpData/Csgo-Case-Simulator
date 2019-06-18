import java.lang.reflect.*;
import java.util.*;

public class HelperMethods extends ClientInterface { // For Client Interface Class
	static Scanner input = new Scanner(System.in);

	public static String makeSelection() {
		System.out.println("Which case would you like to buy? (Enter number) \n");
		System.out.println("1. CSGO Weapons Case");
		System.out.println("2. CSGO Weapons Case 2");
		System.out.println("3. CSGO Weapons Case 3");
		System.out.println("4. Small Credits Case");
		System.out.println("5. Quit program\n");
		return input.nextLine();
	}

	public static boolean buyCheck(String boxname, int cost, int numofboxes, int credits, String casename, String type) {
		boolean buy = false;
		while (!buy) {
			int spendingtotal = numofboxes * cost;
			if (credits == 0 || credits < 0) {
				System.out.println("You are broke\nGame over...");
				System.exit(0);
			} else if (cost > credits) {
				System.out.println("You can't afford this one choose a different one.");
				return false;
			} else if (spendingtotal > credits) {
				System.out.println("Insufficient funds you need " + (spendingtotal - credits) + " credits more.");
				return false;
			} else {
				System.out.println("Buying " + numofboxes + " boxes...");
				System.out.println("Transaction successful: " + credits + " - " + spendingtotal);
				credits -= spendingtotal;
				System.out.println("Your credit balance is now: " + credits + " credits");
				HelperMethods.spin(numofboxes, casename, type);
				return true;
			}
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
			System.out.println();
			creditscase.getSessionWinnings();
			System.out.println();
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
					e.printStackTrace();
				}
				System.out.println();
			}
			System.out.println();
			csgocase.getSessionWinnings();
			System.out.println();
		}
	}
}

import java.lang.reflect.*;
import java.util.*;

public class HelperMethods extends ClientInterface { // For Client Interface Class
	static Scanner input = new Scanner(System.in);

	public static String makeSelection() {
		System.out.println("Which case would you like to buy? (Enter number) \n");
		System.out.println("1. CSGO Weapons Case");
		System.out.println("2. CSGO Weapons Case 2");
		System.out.println("3. Quit program\n");
		return input.nextLine();
	}

	public static boolean buyCheck(String boxname, int cost, int numofboxes, int credits) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		boolean buy = false;
		while (!buy) {
			int spendingtotal = numofboxes * cost;
			if (credits == 0 || credits < 0) {
				System.out.println("You are broke\nGame over...");
				System.exit(0);
			} else if (cost > credits) {
				System.out.println("You can't afford this case choose a different one.");
				return false;
			} else if (spendingtotal > credits) {
				System.out.println("Insufficient funds you need " + (spendingtotal - credits) + " credits more. Try again");
				numofboxes = input.nextInt();
			} else {
				credits -= spendingtotal;
				System.out.println("Buying " + numofboxes + " boxes");
				System.out.println("Your credit balance is now: " + credits + " credits");
				HelperMethods.spin(numofboxes, "CsgoWeaponsCase2", "case");
				return true;
			}
		}
		return false;
	}

	public static void spin(int numofboxes, String casename, String boxtype) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		CsgoCases csgocase = new CsgoCases();
		for (int i = 1; i <= numofboxes; i++) {
			System.out.println("\nPress enter to open a " + boxtype + ": " + (numofboxes - i + 1) + " " + boxtype + "s remaining");
			input.nextLine();
			System.out.print(boxtype + " " + i + " contains: ");
			Method method = csgocase.getClass().getMethod(casename);
			method.invoke(csgocase);
			System.out.println();
		}
		System.out.println();
		csgocase.getSessionWinnings();
		System.out.println();
	}

}

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

public class HelperMethods extends ClientInterface { // For Client Interface Class
	static public Scanner input = new Scanner(System.in);
	static private int numofboxes;

	// ---------- PRICES WHEN SELLING -----------
	// Blue: 25 credits; With Stattrak: 50 credits
	// Purple: 100 credits; With Stattrak: 200 credits
	// Pink: 500 credits; With Stattrak: 1,000 credits
	// Red: 1,000 credits; With Stattrak: 2,000 credits
	// Gold: 2,500 credits; With Stattrak: 5,000 credits

	public static String MainMenu() {
		System.out.println("Which case would you like to buy? (Enter number) \n");
		System.out.println("1. CSGO Weapons Case");
		System.out.println("2. CSGO Weapons Case 2");
		System.out.println("3. CSGO Weapons Case 3");
		System.out.println("4. Chroma Case");
		System.out.println("5. Chroma 2 Case");
		System.out.println("6. Chroma 3 Case");
		System.out.println("7. Small Credits Case");
		System.out.println("\nType \"sell\" to sell a skin");
		System.out.println("Type \"quit\" to quit");
		return input.next();
	}

	public static boolean buyCheck(String boxname, int cost, String casename, String type) {
		System.out.println(boxname + " cost " + cost + " credits. How many would you like to buy?");
		numofboxes = input.nextInt();
		int spendingtotal = numofboxes * cost;
		if (credits == 0 || credits < 0) {
			System.out.println("You are broke\nGame over...");
			System.exit(0);
		} else if (cost > credits) {
			System.out.println("You can't afford this " + type + " choose something else.\n");
			return false;
		} else if (spendingtotal > credits) {
			System.out.println("Insufficient funds you need " + (spendingtotal - credits) + " credits more.\n");
			return false;
		} else {
			System.out.println("Buying " + numofboxes + " boxes...");
			System.out.println("Transaction successful: " + credits + " - " + spendingtotal);
			credits -= spendingtotal;
			System.out.println("Your credit balance is now: " + credits + " credits");
			preSpin(numofboxes, casename, type);
			return true;
		}
		return false;
	}

	public static void preSpin(int numofboxes, String casename, String boxtype) {
		if (casename.contains("Credits")) { // Credits cases type spins
			CreditsCases creditscase = new CreditsCases();
			spin(creditscase, casename, numofboxes, boxtype);
			creditscase.getSessionWinnings();
		} else { // If (case type is Csgo skin case)
			CsgoCases csgocase = new CsgoCases();
			spin(csgocase, casename, numofboxes, boxtype);
			csgocase.getSessionWinnings();
		}
	}

	public static void spin(Object objectname, String casename, int numofboxes, String boxtype) {
		for (int i = 1; i <= numofboxes; i++) {
			System.out.println("\nPress enter to open a " + boxtype + ": " + (numofboxes - i + 1) + " " + boxtype + "s remaining");
			promptEnterKey();
			System.out.print(boxtype + " " + i + " contains: ");
			try {
				Method method = objectname.getClass().getMethod(casename);
				method.invoke(objectname);
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				System.out.println("ProgramError: How did this happen?");
			}
			System.out.println();
		}
	}

	public static void addCreditsFromSell(String item) {
		if (item.contains("[BLUE]")) {
			if (item.contains("StatTrak")) {
				System.out.println("Your item was worth 50 credits");
				credits += 50;
			} else {
				System.out.println("Your item was worth 25 credits");
				credits += 25;
			}
		} else if (item.contains("[PURPLE]")) {
			if (item.contains("StatTrak")) {
				System.out.println("Your item was worth 200 credits");
				credits += 200;
			} else {
				System.out.println("Your item was worth 100 credits");
				credits += 100;
			}
		} else if (item.contains("[PINK]")) {
			if (item.contains("StatTrak")) {
				System.out.println("Your item was worth 1,000 credits");
				credits += 1000;
			} else {
				System.out.println("Your item was worth 500 credits");
				credits += 500;
			}
		} else if (item.contains("[RED]")) {
			if (item.contains("StatTrak")) {
				System.out.println("Your item was worth 2,000 credits");
				credits += 2000;
			} else {
				System.out.println("Your item was worth 1,000 credits");
				credits += 1000;
			}
		} else if (item.contains("[GOLD]")) {
			if (item.contains("StatTrak")) {
				System.out.println("Your item was worth 5,000 credits");
				credits += 5000;
			} else {
				System.out.println("Your item was worth 2,500 credits");
				credits += 2500;
			}
		}
		System.out.println("\nPress ENTER to go back to the main menu");
		promptEnterKey();
	}

	public static void promptEnterKey() { // Troubleshoot ENTER key method
		try {
			System.in.read(new byte[2]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

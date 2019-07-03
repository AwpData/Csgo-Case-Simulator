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
	// ---------- PRICE MULTIPLIERS -------------
	// FN: *2.4, MW: *1.7, FT: *1.3, WW: *1.3, BS: *1.15

	public static String MainMenu() {
		System.out.println("Which case would you like to buy? (Enter number) \n");
		System.out.println("1. CSGO Weapons Case");
		System.out.println("2. CSGO Weapons Case 2");
		System.out.println("3. CSGO Weapons Case 3");
		System.out.println("4. Chroma Case");
		System.out.println("5. Chroma 2 Case");
		System.out.println("6. Chroma 3 Case");
		System.out.println("7. eSports 2013 Case");
		System.out.println("8. eSports 2013 Winter Case");
		System.out.println("9. eSports 2014 Summer Case");
		System.out.println("10. Falchion Case");
		System.out.println("11. Gamma Case");
		System.out.println("12. Gamma 2 Case");
		System.out.println("13. Glove Case");
		System.out.println("14. Huntsman Weapon Case");
		System.out.println("15. Operaton Bravo Case");
		System.out.println("16. Operaton Breakout Case");
		System.out.println("17. Operaton Hydra Case");
		System.out.println("18. Operaton Phoenix Case");
		System.out.println("19. Operaton Vanguard Case");
		System.out.println("20. Operaton Wildfire Case");
		System.out.println("21. Revolver Case");
		System.out.println("22. Shadow Case");
		System.out.println("23. Winter Offensive Case");
		System.out.println("24. Spectrum Case");
		System.out.println("25. Spectrum 2 Case");
		System.out.println("26. Clutch Case");
		System.out.println("27. Horizon Case");
		System.out.println("28. Danger Zone Case");
		System.out.println("29. Prisma Case");
		System.out.println("30. Small Credits Case");
		System.out.println("\nType \"inspect\" to get full information on a skin in your inventory (Float, Flavortext, Skin Description, etc...)");
		System.out.println("Type \"sell\" to sell a skin");
		System.out.println("Type \"quit\" to quit\n");
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
				System.out.println("Non-existant Casename");
			}
			System.out.println();
		}
	}

	public static void inspect() {
		if (ItemStatistics.getItemList().size() == 0) {
			System.out.println("You have zero skins to inspect!\n");
		} else {
			System.out.println("Enter the line number of the skin you would like to inspect\n");

			for (int i = 0; i < ItemStatistics.getItemList().size(); i++) {
				System.out.println((i + 1) + ". " + ItemStatistics.getItemList().get(i).toString());
			}
			int index = input.nextInt();
			ItemStatistics.inspectSkin(index);
		}
		System.out.println("Press ENTER to go back to the main menu");
		promptEnterKey();
	}

	public static void sell() {
		if (ItemStatistics.getItemList().size() == 0) {
			System.out.println("There is nothing to sell!\n");
		} else {
			System.out.println("Enter the line number of the skin you would like to sell\n");
			for (int i = 0; i < ItemStatistics.getItemList().size(); i++) {
				System.out.println((i + 1) + ". " + ItemStatistics.getItemList().get(i).toString());
			}
			int index = input.nextInt();
			String item = ItemStatistics.sellSkin(index);
			addCreditsFromSell(item);
		}
		System.out.println("Press ENTER to go back to the main menu");
		promptEnterKey();
	}

	public static void addCreditsFromSell(String item) {
		int price = 0;
		if (item.contains("[BLUE]")) {
			if (item.contains("StatTrak")) {
				price += 50;
			} else {
				price += 25;
			}
			ItemColorTracker.totalbluesold++;
		} else if (item.contains("[PURPLE]")) {
			if (item.contains("StatTrak")) {
				price += 200;
			} else {
				price += 100;
			}
			ItemColorTracker.totalpurplesold++;
		} else if (item.contains("[PINK]")) {
			if (item.contains("StatTrak")) {
				price += 1000;
			} else {
				price += 500;
			}
			ItemColorTracker.totalpinksold++;
		} else if (item.contains("[RED]")) {
			if (item.contains("StatTrak")) {
				price += 2000;
			} else {
				price += 1000;
			}
			ItemColorTracker.totalredsold++;
		} else if (item.contains("[GOLD]")) {
			if (item.contains("StatTrak")) {
				price += 5000;
			} else {
				price += 2500;
			}
			ItemColorTracker.totalgoldsold++;
		}

		if (item.contains("Factory-New")) {
			price += price * 2.4;
		} else if (item.contains("Minimal-Wear")) {
			price += price * 1.7;
		} else if (item.contains("Field-Tested")) {
			price += price * 1.3;
		} else if (item.contains("Well-Worn")) {
			price += price * 1.15;
		} // else if battle-scarred, the price is 1x
		credits += price;
		System.out.println("Your item was worth " + price + " credits\n");
	}

	public static void quit() {
		ItemColorTracker.getTotalWinnings();
		System.out.println("\nCheck inventory.txt to see your winnings");
		System.out.println("\nQuitting program...");
		System.exit(0);
	}

	public static void promptEnterKey() { // ENTER key method
		try {
			System.in.read(new byte[2]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

import java.io.*;
import java.sql.*;
import java.util.Scanner;

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

// CASES IMPLEMENTED (CsgoCases.java)
// All current cases have been implemented! (7/3/19)

// COLLECTIONS IMPLEMENTED (CsgoCollections.java)
// Alpha Collection
// Assault Collection
// Aztec Collection
// Baggage Collection
// Bank Collection
// Cache Collection

// SOUVENIRS IMPLEMENTED (CsgoSouvenirs.java)

// STICKER CAPSULES IMPLEMENTED (CsgoCapsules.java)

//CREDIT CASES IMPLEMENTED (CreditCases.java)
// Small Credits Case 

// CUSTOM CASES IMPLEMENTED (CustomCases.java)


public class ClientInterface {
    static int credits = 10000;

    public static void main(String[] args) throws FileNotFoundException, SQLException {

        Connection conn = null;
        PreparedStatement ps = null;
        Statement statement = null;
        ResultSet rs;
        String sql_command;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:CSGO.db");
            statement = conn.createStatement();
            sql_command = "CREATE TABLE IF NOT EXISTS simulations" +
                    "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT NOT NULL," +
                    "password TEXT NOT NULL," +
                    "credits INT DEFAULT(0)," +
                    "golds INT DEFAULT(0)," + "reds INT DEFAULT(0)," + "pinks INT DEFAULT(0)," +
                    "purples INT DEFAULT(0)," + "blues INT DEFAULT(0)," + "light_blues INT DEFAULT(0),"
                    + "whites INT DEFAULT(0))";
            statement.executeUpdate(sql_command);

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        Scanner login = new Scanner(System.in);
        System.out.println("Welcome to AwpData's CSGO Simulation!");
        boolean logged_in = false;
        while (!logged_in) {
            System.out.println("1. Create an Account");
            System.out.println("2. Login to an Existing Account");
            System.out.println("3. Delete an Existing Account");
            String choice = login.nextLine();
            if (choice.equals("1")) {
                System.out.println("Username:");
                String username = login.nextLine();
                System.out.println("Password:");
                String password = login.nextLine();
                ps = conn.prepareStatement("INSERT INTO simulations (name, password) VALUES (?, ?)");
                ps.setString(1, username);
                ps.setString(2, password);
                ps.executeUpdate();
                System.out.println("\nAccount created!\n");
            } else if (choice.equals("2")) {
                System.out.println("Username:");
                String username = login.nextLine();
                System.out.println("Password:");
                String password = login.nextLine();
                if (select_user(username, password, ps, conn)) {
                    System.out.println("\nSuccess! Account found!");
                    logged_in = true;
                }
                if (!logged_in) {
                    System.out.println("\nIncorrect username and/or password!\n");
                }
            } else if (choice.equals("3")) {
                System.out.println("Username:");
                String username = login.nextLine();
                System.out.println("Password:");
                String password = login.nextLine();
                if (select_user(username, password, ps, conn)) {
                    System.out.println("Are you sure you want to delete? (y/n)");
                    String confirmation = login.nextLine();
                    if (confirmation.equals("y")) {
                        ps = conn.prepareStatement("DELETE FROM simulations WHERE name = ? AND password = ?");
                        ps.setString(1, username);
                        ps.setString(2, password);
                        ps.executeUpdate();
                        System.out.println("\nAccount deleted successfully!\n");
                    }
                } else {
                    System.out.println("\nAccount not found!\n");
                }
            } else {
                System.out.println("\nInvalid option. Please try again\n");
            }
        }

        String selection;
        boolean proceed = false, mainloop = true;
        while (mainloop) {

            // ----------- Prints Out Inventory Of Items In File ----------- //
            PrintStream output = new PrintStream("./inventory.txt");
            for (int i = 0; i < ItemStatistics.getItemList().size(); i++) {
                output.println(ItemStatistics.getItemList().get(i).toString());
            }
            // ----------- Console Output Method ----------- //
            System.out.println("\nYour credit balance is " + credits);
            selection = HelperMethods.MainMenu();

            // ----------- Miscellaneous Options ----------- //
            if (selection.equalsIgnoreCase("quit")) { // Quit program
                HelperMethods.quit();
            }
            if (selection.equalsIgnoreCase("sell")) {
                HelperMethods.sell();
            }

            if (selection.equalsIgnoreCase("inspect")) {
                HelperMethods.inspect();
            }

            /// ----------- Opening Box Methods ----------- ///

            // ----------- Csgo Cases ------------ //

            if (selection.equals("1")) {
                selection = HelperMethods.CsgoCasesMainMenu();
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
                    proceed = HelperMethods.buyCheck("Huntsman Weapon Case", 175, "HuntsmanWeaponCase", "case");
                } else if (selection.equals("15")) {
                    proceed = HelperMethods.buyCheck("Operation Bravo Case", 2000, "OperationBravoCase", "case");
                } else if (selection.equals("16")) {
                    proceed = HelperMethods.buyCheck("Operation Breakout Case", 140, "OperationBreakoutCase", "case");
                } else if (selection.equals("17")) {
                    proceed = HelperMethods.buyCheck("Operation Hydra Case", 450, "OperationHydraCase", "case");
                } else if (selection.equals("18")) {
                    proceed = HelperMethods.buyCheck("Operation Phoenix Case", 180, "OperationPhoenixCase", "case");
                } else if (selection.equals("19")) {
                    proceed = HelperMethods.buyCheck("Operation Vanguard Case", 200, "OperationVanguardCase", "case");
                } else if (selection.equals("20")) {
                    proceed = HelperMethods.buyCheck("Operation Wildfire Case", 70, "OperationWildfireCase", "case");
                } else if (selection.equals("21")) {
                    proceed = HelperMethods.buyCheck("Revolver Case", 40, "RevolverCase", "case");
                } else if (selection.equals("22")) {
                    proceed = HelperMethods.buyCheck("Shadow Case", 70, "ShadowCase", "case");
                } else if (selection.equals("23")) {
                    proceed = HelperMethods.buyCheck("Winter Offensive Case", 200, "WinterOffensiveCase", "case");
                } else if (selection.equals("24")) {
                    proceed = HelperMethods.buyCheck("Spectrum Case", 30, "SpectrumCase", "case");
                } else if (selection.equals("25")) {
                    proceed = HelperMethods.buyCheck("Spectrum 2 Case ", 30, "Spectrum2Case", "case");
                } else if (selection.equals("26")) {
                    proceed = HelperMethods.buyCheck("Clutch Case", 30, "ClutchCase", "case");
                } else if (selection.equals("27")) {
                    proceed = HelperMethods.buyCheck("Horizon Case", 30, "HorizonCase", "case");
                } else if (selection.equals("28")) {
                    proceed = HelperMethods.buyCheck("Danger Zone Case", 200, "DangerZoneCase", "case");
                } else if (selection.equals("29")) {
                    proceed = HelperMethods.buyCheck("Prisma Case", 600, "PrismaCase", "case");
                } else if (selection.equalsIgnoreCase("back")) {
                    continue;
                }

                // ------------- Csgo Collections ------------- //

            } else if (selection.equals("2")) {
                selection = HelperMethods.CsgoCollectionsMenu();
                if (selection.equals("1")) {
                    proceed = HelperMethods.buyCheck("Alpha Collection", 1500, "AlphaCollection", "package");
                } else if (selection.equals("2")) {
                    proceed = HelperMethods.buyCheck("Assault Collection", 3000, "AssaultCollection", "package");
                } else if (selection.equals("3")) {
                    proceed = HelperMethods.buyCheck("Aztec Collection", 500, "AztecCollection", "package");
                } else if (selection.equals("4")) {
                    proceed = HelperMethods.buyCheck("Baggage Collection", 1500, "BaggageCollection", "package");
                } else if (selection.equals("5")) {
                    proceed = HelperMethods.buyCheck("Bank Collection", 300, "BankCollection", "package");
                } else if (selection.equals("6")) {
                    proceed = HelperMethods.buyCheck("Cache Collection", 400, "CacheCollection", "package");
                } else if (selection.equalsIgnoreCase("back")) {
                    continue;
                }

                // ------------- Credits Cases ------------- //

            } else if (selection.equals("3")) {
                selection = HelperMethods.CreditsCasesMenu();
                if (selection.equals("1")) {
                    proceed = HelperMethods.buyCheck("Small Credits Case", 25, "SmallCreditsCase", "case");
                } else if (selection.equalsIgnoreCase("back")) {
                    continue;
                }
                if (proceed) {
                    credits += CreditsCases.getCreditsWin();
                    proceed = false;
                }
            } else {
                System.out.println("\nInvalid option, try again.");
            }

            // ----------- Reset Static Stats For Next Spin ----------- //
            CreditsCases.creditswin = 0;
            ItemStatistics.stattrak = 0;
        }
        sql_command = "LOAD DATA INFILE 'inventory.txt' INTO TABLE CSGO.simulations";
        statement.executeUpdate(sql_command);
        statement.close();
        conn.close();
    }

    public static boolean select_user(String username, String password, PreparedStatement ps, Connection conn) throws SQLException {

        ps = conn.prepareStatement("SELECT name, password FROM simulations WHERE name = ? AND password = ?");
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            if (rs.getString("name").equals(username) && rs.getString("password").equals(password)) {
                System.out.println("\nSuccess! Account found!");
                return true;
            }
        }
        return false;
    }
}


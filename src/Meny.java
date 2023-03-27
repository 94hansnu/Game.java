
import java.util.Scanner;
public class Meny {
    public static Game game;

    // Skapar nytt spel
    public static void createNewGame() {
        // parametern i game bör förslagsvis vara att den tar emot en str player och att den sätts i game konstruktor till playerName.
        game = new Game(userChoise());
    }

    // Fight börjar
    public static void goAdventuring() {
        game.startGame();
    }

    // Visar egenskaper av spelaren
    public static void showCharacterDetails() {
        // Här bör det skrivas game.player.getName osv.
        System.out.println();
    }

    // Visar shop meny
    public static void showShop() {
        // Här bör det komma game.shop.showShop();
    }

    // Avslutar spelet
    static void exitGame() {
        System.exit(0);
    }

    // Kontrollerar om användarens input är mellan 1-4. Om det stämmer körs ett av alternativen,
    // annars kommer metoden loopas tills användaren skriver in korrekt.
    public static void afterShowOptions() {
        Integer choise = whileWrongInput();
        if (choise < 5 && choise > 0) {
            switch (choise) {
                case 1 -> goAdventuring();
                case 2 -> showCharacterDetails();
                case 3 -> showShop();
                case 4 -> exitGame();
            }
        } else {
            System.out.print("Enter a number between 1-4.\n> ");
            afterShowOptions();
        }
    }

    // Låter användaren skriva in sitt val. Om val != int kommer loop köras. Return int.
    static Integer whileWrongInput() {
        Integer choise = checkUserChoise(userChoise());
        while (choise == null) {
            showOptions();
            choise = checkUserChoise(userChoise());
        }
        return choise;
    }

    // Tror jag tar bort denna
    public static void allConnected() {
        showGameHeadMeny();
        createNewGame();
        showOptions();
    }


    // Visar det första som kommer upp när man startar programmet
    public static void showGameHeadMeny() {
        System.out.print("************************" +
                "\n* Welcome to The Game  *" +
                "\n************************" +
                "\n* Enter your name: ");
    }

    // Visar de fyra val användaren har
    public static void showOptions() {
        System.out.print("\n1. Go adventuring\n2. Show details about your character" +
                "\n3. Go to shop\n4. Exit game\n> ");
    }

    // Return användarens input. Används dels för att kontrollera om input är av korrekt format,
    // samt att ta in användarens PlayerName
    public static String userChoise() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    // Kontrollerar om användarens input är av typ int
    public static Integer checkUserChoise(String userChoise) {
        int test = 0;
        try {
            test = Integer.valueOf(userChoise);
            return test;
        } catch (NumberFormatException e) {
            System.out.println("Don't try to enter letters or special characters.");
            return null;
        }
    }
}


import java.util.Scanner;
public class Meny {
    // Kanske onödig
    public static Game game;

    // Kanske onödig
    public static void createNewGame() {
        game = new Game(userChoise());
    }

    // Kanske onödig
    public static void goAdventuring() { game.startGame(); }

    // Kanske onödig
    public static void showCharacter() {
        // Här bör det skrivas game.player.getName osv.
        System.out.println();
    }
    // Kanske onödig
    public static void showShop() {
        // Här bör det komma game.shop.showShop();
    }

    // Kanske onödig
    public static void exitGame() {
        System.exit(0);
    }
    public static Integer afterShowOptions() {
        Integer choise = checkUserChoise(userChoise());
        while(choise == null || choise < 1 || choise > 4) {
            if (choise == null) {
                showOptions();
                choise = checkUserChoise(userChoise());
            }
            else {
                System.out.println("Enter a number between 1-4.\n> ");
                choise = checkUserChoise(userChoise());
            }
        }
        return choise; /*
            switch (choise){
            case 1 -> goAdventuring();
            case 2 -> showCharacter();
            case 3 -> showShop();
            case 4 -> exitGame();
                default -> System.out.println("No default.");
            }*/
    }
    public static void allConnected() {
        showGameHeadMeny();
        createNewGame(); // Kanske onödig
        showOptions();
    }


    public static void showGameHeadMeny() {
        System.out.print("************************"+
                         "\n* Welcome to The Game  *"+
                         "\n************************"+
                         "\n* Enter your name: ");
    }
    public static void showOptions() {
        System.out.print("\n1. Go adventuring\n2. Show details about your character" +
                "\n3. Go to shop\n4. Exit game\n> ");
    }
    public static String userChoise() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static Integer checkUserChoise(String userChoise) {
        int test = 0;
        try {
            test = Integer.valueOf(userChoise);
            return test;
        }
        catch (NumberFormatException e) {
            System.out.println("Don't try to enter letters or special characters.");
            return null;
        }
    }
    // :)

}

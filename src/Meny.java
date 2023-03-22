
import java.util.Scanner;
public class Meny {
    public static Game game;
    public static void createNewGame() {
        game = new Game(userChoise());
    }
    public static void goAdventuring() { game.startGame(); }

    public static void showCharacter() {
        // Här bör det skrivas game.player.getName osv.
        System.out.println();
    }
    public static void showShop() {
        // Här bör det komma game.shop.showShop();
    }
    public static void exitGame() {
        System.exit(0);
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

}

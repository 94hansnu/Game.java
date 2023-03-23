
import java.util.Scanner;
public class Meny {

    // Loopar igenom användarens inmatning tills det är mellan 1-4.
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
        return choise;
    }

    // Välkomst meny
    public static String showGameHeadMeny() {
        System.out.print("************************"+
                         "\n* Welcome to The Game  *"+
                         "\n************************"+
                         "\n* Enter your name: ");
        return new Scanner(System.in).next();
    }
    // Visar de fyra alternativ som finns
    public static void showOptions() {
        System.out.print("\n1. Go adventuring\n2. Show details about your character" +
                "\n3. Go to shop\n4. Exit game\n> ");
    }
    // Returnerar en str från användare
    public static String userChoise() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    // Med try-catch testar denna endast om användarens inmatning är av nummerformat
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

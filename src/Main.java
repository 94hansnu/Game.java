import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.print("Skriv inget: ");
        String ok = Meny.userChoise();
        System.out.println(ok.isBlank());
        System.out.println(ok.isEmpty());*/

       /* Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.print("Tryck enter: ");
        String input = scanner.nextLine();
        if(input.isEmpty()) {
            System.out.println("Funkar");
        }
        else {
            System.out.println("Funkar ej");
        }*/

        Monster m = new SpecificMonster("Kelly", 10, 10);
        Game game = new Game(Meny.showGameHeadMeny());
        game.startGame();

        //Testing
        System.out.println("Hello world!");

       // Meny.allConnected();
       // Meny.showGameHeadMeny();
       /* Meny.createNewGame();
        Meny.showOptions();
        Meny.goAdventuring();
        String a = Meny.userChoise();

        System.out.println(a);
        Integer b = Meny.checkUserChoise(a);
        System.out.println(b);
        Meny.createNewGame();*/

    }
}
public class Main {
    public static void main(String[] args) {

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
public class Main {
    public static void main(String[] args) {


        //Testing
        System.out.println("Hello world!");

        Meny.showGameHeadMeny();
        Meny.createNewGame();
        Meny.showOptions();
        Meny.goAdventuring();
        String a = Meny.userChoise();

        System.out.println(a);
        Integer b = Meny.checkUserChoise(a);
        System.out.println(b);
        Meny.createNewGame();
    }
}
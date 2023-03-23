public class Game {
    public String name;

    public Game(String name) {
        this.name = "hej";
        System.out.println("Jej?");
        System.out.println(name);
    }
    public void startGame() {
        System.out.println("Game started");
        System.out.println(name + " this is working great");
        gameOver();
        name = "Abba";
    }

    public void gameOver() {
        Meny.showOptions();
        Meny.afterShowOptions();
        System.out.println(name);
    }
    public void switchish() {
        switch (Meny.afterShowOptions()){
            case 1 -> System.out.println(1);
            case 2 -> System.out.println(2);
            case 3 -> System.out.println(3);
            case 4 -> System.out.println(4);
            default -> System.out.println("No default.");
        }
    }



}

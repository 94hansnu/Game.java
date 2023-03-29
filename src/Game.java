public class Game {
    //public String name;
    public Player player;

    public Game(String name) {
        player = new Player(name, 0,200);

    }
    public void startGame() {
        System.out.println("Game started");
        Meny.showOptions();
        switchish();
    }

    public void gameOver() {
        Meny.showOptions();
        Meny.afterShowOptions();
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

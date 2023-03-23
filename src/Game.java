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
    public void switchish(Integer choise) {
        switch (choise){
            case 1 -> goAdventuring();
            case 2 -> showCharacter();
            case 3 -> showShop();
            case 4 -> exitGame();
            default -> System.out.println("No default.");
        }
    }



}

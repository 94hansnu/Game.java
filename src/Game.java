public class Game {
    public String name;
    public Game(String name) {
        this.name = name;
        System.out.println("Jej?");

        System.out.println(name);
    }
    public void startGame() {
        System.out.println("Game started");
        System.out.println(name + " this is working great");
    }
}

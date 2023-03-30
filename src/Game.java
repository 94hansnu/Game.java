import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public Player player;
    ArrayList<Monster> monsters = new ArrayList<>();
    private Monster monster;
    private Integer level;
    public Shop shop;

    public Game(String name) {
        player = new Player(name, 0,200);
        level = 0;
        for(int i = 1; i<11; i++) {
            monsters.add(new Monster(Reasons.getRandomName(), 50*i, 50*i));
        }
        shop = new Shop(player);
    }
    public void startGame() {
        System.out.println("Game started");
        currentMonster();
        Meny.showOptions();
        switchish();
    }
    public Integer chanceOfAttack() {
        return (int)(Math.random()*10);
    }


    public void gameOver() {
        Meny.showOptions();
        Meny.afterShowOptions();
    }
    public void switchish() {
        switch (Meny.afterShowOptions()){
            case 1 -> goAdventuring();
            case 2 -> showCharacter();
            case 3 -> goToShop();
            case 4 -> System.exit(0);
            default -> System.out.println("No default.");
        }
    }
    public void goAdventuring() {
        while (level<10) {
            if(chanceOfAttack()>0) {
                System.out.println("Oh... " + monster.getName() + " appeared!");
                while(monster.getHp()> 0) {
                    playerFight();
                    while(true){
                        if(checkEnter()) {
                            break;
                        }
                    }
                    monsterFight();
                    while(true){
                        if(checkEnter()) {
                            break;
                        }
                    }

                }
                if(monster.getHp() < 1) {
                    player.setXp(monster.getXp());
                    System.out.println("You brutally killed the monster, dealing " + monster.getXp() + " experience!");
                    if(player.getXp()/level+1 > 99) {
                        System.out.println("You leveled up!");
                        level ++;
                    }
                    evolveTheMonster();
                }
                if(player.getHp() < 1) {
                    System.out.println("Hahahahaha the monsters gave you a humiliating fight and now you have no HP left :(");
                    System.exit(0);
                }

            }
            else {
                System.out.println("You see nothing but swaying grass all around you...\n[Press enter to continue]");
                checkEnter();
            }
        }

    }


    private Boolean checkEnter() {
       // String input = "";
        if(Meny.userChoiseNextLine().isEmpty()){
            return true;
        }
        System.out.println("[Press enter to continue] ");
        return false;
       // Meny.userChoiseNextLine()
       /*String enter = Meny.userChoise();

        while(!enter.isEmpty()) {
            System.out.println("[Press enter to continue] ");
            enter = Meny.userChoise();

            //Meny.userChoise();
        }
        System.out.println("Denna visar sig vara true");
        return true;*/
    }
    public void currentMonster() {
        monster = new Monster(monsters.get(level).getName(), monsters.get(level).getXp(), monsters.get(level).getHp());
    }
    private void evolveTheMonster() {
        monster = new SpecificMonster(monster.getName(), monster.getXp(), monster.getHp());
    }
    private void playerFight() {
        Integer a = player.attack();
        monster.defense(a);
        System.out.println("You hit " + monster.getName() + " dealing " + a + " damage!");
    }
    private void monsterFight() {
        Integer a = monster.attack();
        player.defense(a);
        System.out.println("Oh... " + monster.getName() + " attacked you by" + Reasons.getRandomReason() +
                " dealing " + a + " damage!");

    }
    private void fight() {

    }
    public void showCharacter() {
        System.out.println("Name: " + player.getName() + "\nLevel: " + level + "\nHp: " + player.getHp() +
        "\nXp: " + player.getXp() + "\nStrenght: " + player.getStrength() + "\nToughness: " + player.getToughness());
    }
    // Går till shop, tar emot ett giltligt användarval, därefter körs switchish igen där användare får göra om huvudmenyval igen.
    public void goToShop() {
        shop.displayMeny();
        shop.buyItem(Meny.afterShowOptions());
        switchish();
    }
}

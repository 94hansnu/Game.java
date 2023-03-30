import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public Player player;
    ArrayList<Monster> monsters = new ArrayList<>();
    private Monster monster;
    private Integer level;
    public Shop shop;

    public Game(String name) {
        player = new Player(name, 0, 200);
        level = 0;
        for (int i = 0; i < 11; i++) {
            monsters.add(new Monster(Reasons.getRandomName(), 50 * (i + 1), 10 * (i + 1)));
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
        return (int) (Math.random() * 10);
    }

    public void switchish() {
        switch (Meny.afterShowOptions()) {
            case 1 -> goAdventuring();
            case 2 -> showCharacter();
            case 3 -> goToShop();
            case 4 -> System.exit(0);
            default -> System.out.println("No default.");
        }
    }

    public void goAdventuring() {
        Integer a = chanceOfAttack();
        if (a > 0) {
            System.out.println("Oh... " + monster.getName() + " appeared!");
            fight();
        } else {
            System.out.println("You see nothing but swaying grass all around you...\n[Press enter to continue]");
            while (true) {
                if (checkEnter()) {
                    break;
                }
            }
            goAdventuring();
        }
        checkMonsterStatus();
        isAlive();
        Meny.showOptions();
        switchish();
    }

    public void win() {
        player.setXp(monster.getXp());
        player.gold.dropGold();
        System.out.println("You brutally killed the monster, dealing " + monster.getXp() + " experience!");
        if (player.getXp() / (level + 1) > 99) {
            System.out.println("You leveled up!");
            level++;
            currentMonster();
        } else {
            evolveTheMonster();
            System.out.println(monster.getName() + " has evolved and now has " + monster.getHp() + " HP and " + monster.getXp() + " XP...");
        }
    }

    private void checkMonsterStatus() {
        if (monster.getHp() <= 0) {
            win();
        }
    }

    private void isAlive() {
        if (player.getHp() < 1) {
            System.out.println("You lost.");
            System.exit(0);
        }
    }

    // Funkar
    public Boolean run() {
        if (level > 9) {
            return true;
        }
        return false;
    }

    // Funkar
    public void fight() {
        if (!run()) {
            while (monster.getHp() > 0) {
                playerFight();
                while (true) {
                    System.out.println("[Press enter to continue] ");
                    if (checkEnter()) {
                        break;
                    }
                }
                monsterFight();
                while (true) {
                    System.out.println("[Press enter to continue] ");
                    if (checkEnter()) {
                        break;
                    }
                }
            }
        } else {
            System.out.println("You won!");
            System.exit(0);
        }

    }

    // Funkar
    private Boolean checkEnter() {
        if (Meny.userChoiseNextLine().isEmpty()) {
            return true;
        }
        return false;
    }

    // Funkar
    public void currentMonster() {
        monster = new Monster(monsters.get(level).getName(), monsters.get(level).getXp(), monsters.get(level).getHp());
    }

    // Funkar
    private void evolveTheMonster() {
        monster = new SpecificMonster(monster.getName(), monster.getXp() * 7, (level + 1) * 100);
    }

    // Funkar
    private void playerFight() {
        Integer a = player.attack();
        monster.defense(a);
        System.out.println("You hit " + monster.getName() + " Dealing " + a + " damage!");
    }

    // Funkar
    private void monsterFight() {
        Integer a = monster.attack();
        player.defense(a);
        System.out.println("Oh... " + monster.getName() + " attacked you by" + Reasons.getRandomReason() +
                " dealing " + a + " damage!");

    }

    // Funkar
    public void showCharacter() {
        System.out.println("Name: " + player.getName() + "\nLevel: " + level + "\nHp: " + player.getHp() +
                "\nXp: " + player.getXp() + "\nStrenght: " + player.getStrength() + "\nToughness: " + player.getToughness());
        Meny.showOptions();
        switchish();
    }

    // Går till shop, tar emot ett giltligt användarval, därefter körs switchish igen där användare får göra om huvudmenyval igen.
    public void goToShop() {
        shop.displayMeny();
        shop.buyItem(Meny.afterShowOptions());
        Meny.showOptions();
        switchish();
    }


}


import java.util.ArrayList;
import java.util.List;

public class GameExempel {
    private Player player;
    private List<Monster> monster;
    private int gold;
    private Shop shop;
    private Meny meny;
    private InterfaceMethods interfaceMethods;
    private Traits traits;


    public GameExempel() {
        //Skapa spelare och monster
        player = new Player();
        monster = new ArrayList<>();
        monster.add(new Monster());
        monster.add(new SpecificMonster());

        //Skapa shop, meny, interface och traits
        shop = new Shop();
        meny = new Meny();
        interfaceMethods = new InterfaceMethods();
        traits = new Traits();
    }

    public void startGame() {
        //Visa meny för att välja spelarklass
        meny.displayPlayerClassMeny();//Skapa metod till Meny-klass

        //Låt spelaren välja en klass och skapa en instans av klassen
        //Spara spelaren i en instansvariabel i Game-klassen
        player = meny.createPlayer();

        //Starta spelet med den valda klassen
        play();
    }

    public void play() {
        //Loopa spelet tills det är över
        while (!gameOver()) {
            //Gör spelarens drag
            player.makeMove(interfaceMethods);

            //Slåss mot slumpmässiga monster
            for (Monster monster : monster) {
                if (player.defeatMonster(monster, traits)) {
                    //Lägg till gold
                    gold += monster.getGold();

                    //Slumpmässigt droppa belöning/Gold
                    player.collectReward(traits);
                }
            }

            //Gå till shoppen
            if (player.wantsToVisitShop(interfaceMethods)) {
                //Visa shop-menyn
                shop.display();

                //Låt spelaren köpa amuletter
                int cost = shop.getAmuletCost();
                if (gold >= cost) {
                    player.addAmulet(shop.getSelectedAmulet(), traits);
                    gold -= cost;
                }
            }
        }

        //visa resultat
        displayResult();
    }

    private boolean gameOver() {
        //Kontrollera om spelet är över
        return player.isDead() || isSpecificMonsterDefeated();
    }

    private void displayResult() {
        //Visa spelets resultat till spelaren

    }
}


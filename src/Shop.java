import java.util.Scanner;

public class Shop {
    private int amuletCost = 100; //kostnaden för en amulett
    // private Scanner scanner;//scanner objekt för att läsa inmatning från användaren
    private Player player;// Player objekt som butiken interagerar med

    public Shop(Player player) {//konstruktor som tar in en scanner som parameter och initierar scanner och player-variabeln.
        //this.scanner = scanner;
        this.player = player;
    }

    public void displayMeny() { // metod för att visa butiksmeny
        System.out.println("Välkommen till butiken!");
        System.out.println("1. Köp styrkeamulett för " + amuletCost + "gold");
        System.out.println("2. Köp försvarsamulett för " + amuletCost + "gold");
        System.out.println("3. Se goldsaldo");
        System.out.println("4. Återgå till huvudmeny");
    }

    public void buyItem(int choice) { // metod för att köpa amulett i butiken baserat på spelarens val.
        switch (choice) {
            case 1:
                if (player.gold.getGold() >= amuletCost) {// kontrollera så att spelaren har tillräckligt med guld
                    player.gold.setGold(player.gold.getGold() - amuletCost);// dra av kostnaden från spelarens guld.
                    player.setStrength(player.setStrength(5)); //Ökar spelarens styrka med 5
                    System.out.println("Du köpte en styrkeamulett!");
                } else {
                    System.out.println("Du har inte tillräckligt med gold för att köpa en styrkeamulett");
                }
                break;
            case 2:
                if (player.gold.getGold() >= amuletCost) {//kontrollera att spelaren har tillräckligt med guld
                    player.gold.setGold(player.gold.getGold() - amuletCost);//dra av kostnaden från spelarens guld.
                    player.setToughness(player.getToughness() + 2); //Ökar spelarens försvar med 2
                    System.out.println("Du köpte en försvarsamulett!");
                } else {
                    System.out.println("Du har inte tillräckligt med gold för att köpa en försvarsamulett");
                }
                break;
            case 3:
                System.out.println("Du har " + player.gold.getGold() + "gold.");
                break;
            case 4:
                // Återgå till huvudmeny
                break;
            default:
                System.out.println("Ogiltligt val. Försök igen.");
                break;
        }
    }
}
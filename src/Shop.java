import java.util.Scanner;

public class Shop {
    private int amuletCost = 100;
    private Scanner scanner;
    private Player player;

    public Shop(Scanner scanner) {
        this.scanner = scanner;
        this.player =  player;
    }

        public void displayMeny () {
            System.out.println("Välkommen till butiken!");
            System.out.println("1. Köp styrkeamulett för " + amuletCost + "gold");
            System.out.println("2. Köp försvarsamulett för " + amuletCost + "gold");
            System.out.println("3. Se goldsaldo");
            System.out.println("4. Återgå till huvudmeny");
        }

        public void buyItem ( int choice){
            switch (choice) {
                case 1:
                    if (player.gold.getGold() >= amuletCost) {
                        player.setGold(player.getGold() - amuletCost);
                        player.setStrength(player.setStrength() + 5); //Ökar spelarens styrka med 5
                        System.out.println("Du köpte en styrkeamulett!");
                    } else {
                        System.out.println("Du har inte tillräckligt med gold för att köpa en styrkeamulett");
                    }
                    break;
                case 2:
                    if (player.getGold() >= amuletCost) {
                        player.setGold(player.getGold() - amuletCost);
                        player.setToughness(player.getToughness() + 2); //Ökar spelarens försvar med 2
                        System.out.println("Du köpte en försvarsamulett!");
                    } else {
                        System.out.println("Du har inte tillräckligt med gold för att köpa en försvarsamulett");
                    }
                    break;
                case 3:
                    System.out.println("Du har " + player.getGold() + "gold.");
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
import java.util.Random;

public class Gold {
    private int amount; //instansvariabel för att hålla koll på hur mycket gold spelaren har
    private Random random = new Random(); //instansvariabel för slumpgeneratorn

    public Gold() { //Konstruktor som sätter startvärde
        this.amount = 0; //Spelaren startar med 0 Gold
    }

    //Metod för att få gold när spelaren besegrat ett monster
    public int getGold() {
        int goldDropped = random.nextInt(100) + 1; //Slumptal mellan 1-100 Gold
        amount += goldDropped;
        return goldDropped;
    }

    //Metod för att använda gold när spelaren köper från shoppen
    public boolean useGold(int goldToUse) {
        if (amount >= goldToUse) {
            amount -= goldToUse;
            return true;
        }
        return false;
        }

        //Metod för att slumpmässigt droppa gold när spelaren besegrat ett monster
        public int dropGold() {
            int goldDropped = random.nextInt(100) + 1; //Slumptal mellan 1-100 Gold
            amount += goldDropped;
            return goldDropped;
        }

        // Metod för att hämta spelarens totala gold
        public int getAmount() {
        return amount;

    }
}

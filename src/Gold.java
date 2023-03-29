import java.util.Random;

public class Gold {
    private int amount; //instansvariabel för att hålla koll på hur mycket gold spelaren har
    private Random random = new Random(); //instansvariabel för slumpgeneratorn

    public Gold() { //Konstruktor som sätter startvärde
        this.amount = 100; //Spelaren startar med 100 Gold
    }

    public int setGold(int a) {
        return this.amount += a;
    }


    public int getGold() {
        return amount;
    }

    //Metod för att använda gold när spelaren köper från shoppen

   /* public boolean useGold(int goldToUse) {
        if (amount >= goldToUse) {
            amount -= goldToUse;
            return true;
>>>>>>> b333adde3d7c45c3281e5b3b36485fe26ff918fe
        }
        return false;
    }*/

    //Metod för att slumpmässigt droppa gold när spelaren besegrat ett monster
    public int dropGold() {
        int goldDropped = random.nextInt(100) + 1; //Slumptal mellan 1-100 Gold
        amount += goldDropped;
        return goldDropped;
    }

}

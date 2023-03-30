import java.util.ArrayList;
import java.util.Arrays;


public class Reasons {
    public static ArrayList<String> attack;
    public static ArrayList<String> monsterName;
    public Reasons() {
    }
    public static String getRandomReason() {
        attack = new ArrayList<>(Arrays.asList(" strangled you!", " jumped on your head!", " put an unopened can of coke in your throat!",
                " chewed off your arm!", " shoot you!", " forced you to sell cocaine and then called the police on you... What a shame!", " sold you to the gorillas!",
                " chased you down the road until a bus drove you over!", " gave you COVID!", " put you on a random boat to a pirate island!", " pushed you off a mountain!"," put your ballsack on a stone and started hitting it with a baseballracket!",
                " kicked you in your knee...the opposite direction!", " elbowed you in the throat!", " put you on a random airballon, hehe!", " took all of your clothes!", " forced you to eat a yeast infected piece of meat and then sing a lullaby!",
                " let a snake bite you!", " stuck a cactus in your eye!", " fooled you to undress in public, now you are arrested for exposure...pervert!", " forced you to scam old people on their last money!",
                " put his fist in your asshole and then lift you up to the sky. Say hello to the eagles wierdo!", " left a false warning about you hiding in bushes, staring at childern...U GOING TO JAIL!",
                " called the Mexican military and let them use you as a piñata!", " tried to bury you alive... Things getting scary!", " burned your bellybutton!",
                " poured boiling water in your eyes...AOUCH!", " did a triangle on you while Will Smith slapped you across your face!", " did a kimura!",
                " called your mother fat!", " had you occupied by standing in the windows at Red Light District!"));
        return attack.get((int) (Math.random()*attack.size()));
    }
    public static String getRandomName() {
        monsterName = new ArrayList<>(Arrays.asList("The discusting beever", "The pervert old man", "The pervert old lady",
                "Putin", "Donald Trump", "Capybara", "Ebba Busch", "Gudrun Schyman", "Grandmother", "The annoying lady from the tax office",
                "Karen", "Your dad", "Usama bin Ladin", "Saddam Hussein"));
        return monsterName.get((int)(Math.random()*monsterName.size())); }
}

public class Player extends Traits{
    private Integer gold;
    private Integer strength;
    private Integer toughness;
    public Player(String name, Integer xp, Integer hp, Integer gold, Integer strength, Integer toughness){
        super(name, xp, hp);
        this.gold=gold;
        this.strength=strength;
        this.toughness=toughness;
    }
    @Override
    public void defense(){
        int damage= 2* (getHp()/toughness);
        setHp(getHp() - damage);
        System.out.println(getName() + " lost " + damage + " HP due to defense.");
    }
    public Integer getGold(){
        return gold;
    }
    public Integer getStrength(){
        return strength;
    }
    public Integer getToughness(){
        return toughness;
    }
}
//Pseudokod
//Instansvariabler för player-klassen, Integer gold, Integer strength, Integer toughness
//Konstrukor för player-klassen, name, xp, hp, gold, stength och toughness
//Superklass för att kalla på Traits klassens konstruktor och sedan initialisera player klassens egna instansvariabler
//Override-metoden defense som finns i Traits klassen och beräkna mängd skada som spelaren kommer
// att ta med beaktning av toughness instansvariabel. Uppdatera spelarens hp instansvariabel och skriv ut
// hur mycket skada som har uppstått.
//Getter-metoder för player-instansvariabler

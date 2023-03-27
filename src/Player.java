public class Player extends Traits{
    private Gold gold;
    private Integer strength;
    private Integer toughness;
    public Player(String name, Integer xp, Integer hp ){
        super(name, xp, hp);
        Gold= new Gold();
        this.strength=0;
        this.toughness=0;
    }
    @Override
    public void defense(int damage){
    }

    public Integer getStrength(){
        return strength;
    }
    public Integer getToughness(){
        return toughness;
    }
    public void  setStrength(Integer strength){ this.strength;}
    public void setToughness(Integer toughness){ this.toughness;}
}
//Pseudokod
//Instansvariabler för player-klassen
//Konstrukor för player-klassen
//Superklass för att kalla på Traits klassens konstruktor och sedan initialisera player klassens egna instansvariabler
//Override-metoden defense som finns i Traits klassen
//Getter och setters -metoder för player-instansvariabler

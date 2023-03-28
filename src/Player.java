public class Player extends Traits{
    private Gold gold;
    private Integer strength;
    private Integer toughness;
    private int defense;
    public Player(String name, Integer xp, Integer hp ){
        super(name, xp, hp);
        Gold gold= new Gold();
        this.strength=0;
        this.toughness=0;
    }
    @Override
    public void defense(){//osäker om denna ska vara kvar
    }
    public void defense(int damage){
        int totalDefense= defense+toughness;//beräknar totalt försvar inklusive toughness
        int effectiveDamage= damage-totalDefense;//beräknar effektiv skada efter försvar
        if (effectiveDamage>0){
            int newHp=getHp()-effectiveDamage;//beräknar ny hp efter skada
            setHp(newHp);//sätter nya hp värdet
        }
    }
    public Integer getStrength(){
        return strength;
    }
    public Integer getToughness(){
        return toughness;
    }
    public void  setStrength(Integer strength){
        this.strength+=strength;
    }
    public void setToughness(Integer toughness){
        this.toughness+=toughness;
    }
}
//Pseudokod
//Instansvariabler för player-klassen
//Konstrukor för player-klassen
//Superklass för att kalla på Traits klassens konstruktor och sedan initialisera player klassens egna instansvariabler
//Override-metoden defense som finns i Traits klassen
//Getter och setters -metoder för player-instansvariabler

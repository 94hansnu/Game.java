public class Player extends Traits{
    public Gold gold;
    public Integer strength;
    public Integer toughness;
    
    public Player(String name, Integer xp, Integer hp ){
        super(name, xp, hp);
        Gold gold= new Gold();
        this.strength=0;
        this.toughness=0;
    }
    @Override
    public void defense(int damage){//osäker om denna ska vara kvar
        int totalDefense= damage-toughness;//beräknar totalt försvar inklusive toughness
        if (totalDefense>0){
            int newHp=getHp()-totalDefense;//beräknar ny hp efter skada
            setHp(newHp);//sätter nya hp värdet
    }
    }
    public Integer getStrength(){
        return strength;
    }
    public Integer getToughness(){
        return toughness;
    }
    public int  setStrength(Integer strength){return this.strength+=strength;}
    public int setToughness(Integer toughness){return this.toughness=toughness;}
}
//Pseudokod
//Instansvariabler för player-klassen
//Konstrukor för player-klassen
//Superklass för att kalla på Traits klassens konstruktor och sedan initialisera player klassens egna instansvariabler
//Override-metoden defense som finns i Traits klassen
//Getter och setters -metoder för player-instansvariabler

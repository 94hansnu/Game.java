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
    public void defense(int damage){
        int totalDefense= damage-toughness;
        if (totalDefense>0){
            int newHp=getHp()-totalDefense;
            setHp(newHp);
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
//1. Klassen 'Player', som ärver från klassen 'Traits'
//2. Tre instansvariabler definieras 'gold' av typen 'Gold', 'strength' och 'toughness' av typen 'Integer'.
//3. En konstruktor för klassen definieras, som tar tre argument:'name' av typen 'String', 'xp' av typen 'Integer'
// och 'hp' av typen 'Integer'. Konstruktorn anropar först konstruktorn för överordnad klass med 'super(name, xp, hp)
// vilket sätter värdena på 'name', 'xp', och 'hp'. Sedan skapas en ny instans av 'Gold' och tilldelas till variabeln 'gold'
// värdena på 'strength och 'toughness' sätt till 0.
//4. En metod 'defense' definieras, som tar ett argument 'damage' av typen 'int'. Metoden beräknar först det totala
// försvarsvärdet genom att subtrahera 'toughness' från 'damage'. Om 'totalDefense' är större än 0 beräknar metoden
// det nya hälsotillståndet genom att subtrahera 'totalDefense' från det aktuella hälsotillståndet(som erhålls från metoden
// 'getHp()' och sedan sätta det nya hälsotillståndet med metoden 'setHp(newHp)'.
//5. Två metoder 'getStrength' och 'getTougness' definieras, som returnerar 'strength' och 'toughness'.
//6. Två metoder 'setStrength' och 'setToughness' definieras, som ökar värdet på 'strength' och sätter värdet på 'toughness'
// till det nya värdet som skickas in i metoden. 'setStrength' ökar 'strenght' med nya värdet och returnerar det nya värdet
// av 'strength'

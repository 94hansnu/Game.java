public abstract class Traits implements InterfaceMethods{
    public String name;
    public Integer xp;
    public Integer hp;

    public Traits(String name, Integer xp, Integer hp){
        this.name=name;
        this.xp=xp;
        this.hp=hp;
    }
    @Override
    public Integer attack(){
        return 1+(int)(Math.random()*10);
    }
    @Override
    public void defense(int damage){
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public Integer getXp(){
        return this.xp;
    }
    @Override
    public Integer getHp(){
        return this.hp;
    }
    @Override
    public void setHp(int newHp){};
}

//Pseudokod
//1. En abstrakt klass som implementerar ett interface InterfaceMethods
//2. Skapa instansvariabler 'name', 'xp' och 'hp'.
//3. Konstruktor som tar emot 'name', 'xp' och 'hp' och sätter instansvariabler.
//4. Implementera attak-metoden från interface InterfaceMethods och returnera ett slumpmässigt tal mellan 1 och 10.
// Implementera defense-metoden frpn interface InterfaceMethods, ska inte innehålla någon kod, subklasser kan överrida denna metod.
// Implementera getName-metoden från interface InterfaceMethods, ska returnera objektets namn
// Implementera getXp-metoden från interface InterfaceMethods, ska returnera objektets xp
// Implementera getHp-metoden från interface InterfaceMethods, ska returnera objektets hp
// Implementera setHp-metoden från interface InterfaceMethods, ska inte innehålla någon kod, subklasser kan överrida denna metod.
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
//Traits klassen implementerar InterfaceMethods
//Instansvariabler name(String), xp(Integer), hp(Integer)
//Konstrukor Traits(String name, Integer xp, Integer hp)
//Sätt name, xp och hp instansvariablerna till motsvarande inparametrar
//Implementera metoderna attack();, defense();, getName(); returnerar String (return name),
//getXp(): returnerar Integer (return xp) och getHp(); returnerar Integer (return hp)
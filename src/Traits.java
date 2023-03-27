public class Traits implements InterfaceMethods{
    private String name;
    private Integer xp;
    private Integer hp;

    public Traits(String name, Integer xp, Integer hp){
        this.name=name;
        this.xp=xp;
        this.hp=hp;
    }
    @Override
    public void attack(){
    }
    @Override
    public void defense(){
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
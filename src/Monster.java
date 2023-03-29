
public class Monster extends Traits{


    public Monster(String name, int xp, int hp) {
        super(name,xp,hp);
    }
    /*
    @Override // Tror ej denna met behövs???
    public int getXp() { return xp; }
    @Override // samma här
    public void defense(int attack)  {hp-=attack; }
    @Override
    public int getHp() { return hp; }
    @Override
    public String getName() { return name; }*/
    //@Override
    //public Integer attack() { return 1+(int)(Math.random()*10); }


}
// specific monster class 

class SpecificMonster extends Monster{
    public SpecificMonster(String name, int xp, int hp) {
        super (name, xp * (1+(int)(Math.random()*5)), hp * (1+(int)(Math.random()*5)));
    }

}





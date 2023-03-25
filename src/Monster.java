import java.lang.reflect.Method;
// extenda
public class Monster extends Traits{


    // Detta är Monster klassen

    // variabler (monstret förlorar Gold vid döden,monstret gör att användaren förlorar hp men vinner xp)

    // dessa tre borde raderas om hanandi har gjort som vi skrev
    public String name;
    public int HP;
    public int XP;

    /* metoderna som ska finnas:
    void attack();

 void defense(Integer attack);

 String getName();

 Integer getXp();

 Integer getHp();
     */


    // borde här ej vara:
    public Monster (String name, int HP, int XP) {
        super(name,hp,xp);
    }
    // int ? public int
    @Override
    public int getXP() { return xp; }

    // public void lessXP

    public int getXP ()
       // return 0?
    //utveckl
    @Override
    public void defense(int attack)  {hp-=attack; }
    @Override
    public int getHP() { return HP; }
    @Override
    public String getName() { return name; }
    @Override
    public Integer attack() { return 1+(int)(Math.random()*10); }
}



    // hej
    // Monster-class
}
import java.lang.reflect.Method;
// extenda
public class Monster extends Traits{


    // Detta är Monster klassen

    // variabler (monstret förlorar Gold vid döden,monstret gör att användaren förlorar hp men vinner xp)

    // dessa tre borde raderas om hanandi har gjort som vi skrev
    public String name;
    public int HP;
    public int XP;

    /* metoderna som ska finnas:
    void attack();

 void defense(Integer attack);

 String getName();

 Integer getXp();

 Integer getHp();
     */


    // borde här ej vara:
    public Monster (String name, int HP, int XP) {
        super(name,hp,xp);
    }
    // int ? public int
    @Override
    public int getXP() { return xp; }

    // public int lessHP
    public int getXP ()
       // return 0?
    //utveckl
    @Override
    public void defense(int attack)  {hp-=attack; }
    @Override
    public int getHP() { return HP; }
    @Override
    public String getName() { return name; }
    @Override
    public Integer attack() { return 1+(int)(Math.random()*10); }
}


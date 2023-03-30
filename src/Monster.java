import java.util.ArrayList;
import java.util.Arrays;

public class Monster extends Traits{
    public Monster(String name, int xp, int hp) {

        super(name,xp,hp);
    }





}
// specific monster class 

class SpecificMonster extends Monster{
    public SpecificMonster(String name, int xp, int hp) {
        super (name, xp * (1+(int)(Math.random()*5)), hp * (1+(int)(Math.random()*5)));
    }

}





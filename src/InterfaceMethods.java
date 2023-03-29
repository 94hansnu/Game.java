public interface InterfaceMethods {
    Integer attack();
    void defense(int damage);
    String getName();
    Integer getXp();
    Integer getHp();
    void setHp(int newHp);
}

//Pseudokod
//1. Skapa ett interface kallat InterfaceMethods.
//2. Skapa metoder attack() returnerar Integer, defense() returnerar void, getName() returnerar String,
// getXp() returnerar Integer, getHp() returnerar Integer och setHp() returnerar void,
// ska implementeras av klasser som implementerar detta interface

public class Warrior extends Hero {

    private static String ENEMY;

    public Warrior(String name,int armor, int maxHealth, int health, int autoAttackDps, int stamina, int mana){ 
        super(name, armor, maxHealth, health, autoAttackDps, stamina, mana);
        ENEMY="dude";
    }
    

    /**
     * Fortify defense for next turn
     */
    public void fortify(){
        armor += 2;
    }

    /**
     * @return the enemy
     */
    public String getENEMY() {
        return ENEMY;
    }
}

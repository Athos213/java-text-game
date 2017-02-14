
//Creating abstract class Hero
public abstract class Hero{


    private String name;
    protected int armor;
    protected int maxHealth;
    protected int health;
    protected int autoAttackDps;
    protected int stamina;
    protected int mana;
    protected boolean[] status;

    protected static int FIRECOST = 5;

    /**
     * @param name
     * @param armor
     * @param maxHealth
     * @param health
     * @param autoAttackDps
     * @param stamina
     * @param mana
     */
    public Hero(String name, int armor, int maxHealth, int health, int autoAttackDps, int stamina, int mana) {
        this.name = name;
        this.armor = armor;
        this.maxHealth = maxHealth;
        this.health = health;
        this.autoAttackDps = autoAttackDps;
        this.stamina = stamina;
        this.mana = mana;
        status = new boolean[] {false};
    }

    public String myName(){
        return "My name is " + getName();
    }

    /**
     * Normal attack
     * @param defender
     */

    public void attack(Hero defender){
        //defender.setHealth(defender.getHealth()-this.getAutoAttackDps()* 1/defender.getArmor());
        defender.health -= autoAttackDps * 1/defender.armor;
    }
    public String statusList(){
        return ("My name is: " + name + "\n" +
                "I have " + health + " health" + "\n" +
                "I have " + armor + " armor" + "\n" +
                "I have " + mana + " mana" + "\n" 
                );
    }
    //
    //Abstract methods
    //
    
    public abstract void fortify();

    //
    // Getters, Setters
    //
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the armor
     */
    public int getArmor() {
        return armor;
    }

    /**
     * @param armor the armor to set
     */
    public void setArmor(int armor) {
        this.armor = armor;
    }

    /**
     * @return the maxHealth
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
     * @param maxHealth the maxHealth to set
     */
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the autoAttackDps
     */
    public int getAutoAttackDps() {
        return autoAttackDps;
    }

    /**
     * @param autoAttackDps the autoAttackDps to set
     */
    public void setAutoAttackDps(int autoAttackDps) {
        this.autoAttackDps = autoAttackDps;
    }

    /**
     * @return the stamina
     */
    public int getStamina() {
        return stamina;
    }

    /**
     * @param stamina the stamina to set
     */
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    /**
     * @return the mana
     */
    public int getMana() {
        return mana;
    }

    /**
     * @param mana the mana to set
     */
    public void setMana(int mana) {
        this.mana = mana;
    }

    /**
     * @return the status
     */
    public boolean[] getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean[] status) {
        this.status = status;
    }

    /**
     * @return the fIRECOST
     */
    public int getFIRECOST() {
        return FIRECOST;
    }

}

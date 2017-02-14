
public class Wizard extends Hero {

    private static String ENEMY;

    public Wizard(String name,int armor, int maxHealth, int health, int autoAttackDps, int stamina, int mana){ 
        super(name, armor, maxHealth, health, autoAttackDps, stamina, mana);
        ENEMY="dude";
    }
    

    public void fire(Hero defender){
        //this.setmana(this.getmana()-5);
        //defender.sethealth(defender.gethealth()-this.getautoattackdps());
        mana -= Hero.FIRECOST;
        defender.health -= autoAttackDps;
        defender.status[0] = true;
    }

    public void fortify(){
        //this.setmana(this.getmana()-5);
        //defender.sethealth(defender.gethealth()-this.getautoattackdps());
        mana -= 5;
        armor += 2;
    }

    /**
     * @return the eNEMY
     */
    public String getENEMY() {
        return ENEMY;
    }
}


public class Game {
    protected static int i;
    public static void main(String[] args){
        Hero good = new Wizard("good",1,7,7,10,13,5);
        Hero enemy = new Warrior("enemy",5,13,8,12,13,14);
        i = 0;

        while (i == 0){
            i = Turn.turn(good, enemy);
            i = Turn.turn(enemy, good);
        }
    }
}

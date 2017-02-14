import java.util.Scanner;

public class Turn{
    public static int turn(Hero character, Hero enemy) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        if (Game.i == 1) {scan.close(); return 1;}
        if (character.status[0] == true) {
            character.health -= 2;
            character.status[0] = false; 
        }
        if (character.health <= 0) {
            System.out.println("Game over; " + enemy.getName() + " was victorious.");
            scan.close();
            return 1;
        }
        System.out.println("My name is " + character.getName() + "\n");
        while (counter == 0) {
            String x = "None";
            System.out.println("Enter " + character.getName() +" Move\n");
            x = scan.next();
            if (x.equals("attack")) {
                character.attack(enemy);
                counter = 1;
            }
            else if (x.equals("status")) {
                System.out.println(character.statusList());
            }
            else if (x.equals("fire") && character.mana >= Hero.FIRECOST) {
                try{
                    ((Wizard)character).fire(enemy);
                    counter = 1;
                    System.out.println("Casting fireball\n");
                } catch (ClassCastException fired){
                    System.out.println("Can't cast fire\n");
                }
            }
            else if (x.equals("fortify")) {
                try{
                    character.fortify();
                    counter = 1;
                    System.out.println("fortifying\n");
                } catch (ClassCastException fired) {
                    System.out.println("Cannot fortify\n");
                }
            } else {
                System.out.println("Not enough mana\n");
            }
        }
        return 0;
    }
}

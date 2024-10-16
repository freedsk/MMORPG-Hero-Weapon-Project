// Classe dérivée Warrior
public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " swings his sword mightily!");
    }
}
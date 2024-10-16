// Classe dérivée Mage
public class Mage extends Hero {

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a powerful spell!");
    }
}
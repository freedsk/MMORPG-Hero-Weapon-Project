public class Potion implements Usable{
    private String type;
    private int healingPower;

    // Constructeur de Potion
    public Potion(String type, int healingPower) {
        this.type = type;
        this.healingPower = healingPower;
    }

    // Implémentation de la méthode use() de l'interface Usable
    @Override
    public void use() {
        System.out.println("Drinking potion: " + type + " which heals " + healingPower + " health points.");
    }

    public String getType() {
        return type;
    }

    public int getHealingPower() {
        return healingPower;
    }
}
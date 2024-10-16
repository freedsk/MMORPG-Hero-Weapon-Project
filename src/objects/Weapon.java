// Classe pour représenter une arme
public class Weapon implements Usable{
    private String name;
    private int damage;

    // Constructeur
    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    // Implémentation de la méthode use() de l'interface Usable
    @Override
    public void use() {
        System.out.println("Using weapon: " + name + " with damage: " + damage);
    }

    // Getter pour récupérer le nom
    public String getName() {
        return name;
    }

    // Getter pour récupérer les dégâts
    public int getDamage() {
        return damage;
    }

    // Méthode pour afficher les informations de l'arme
    public void displayWeaponInfo() {
        System.out.println("Weapon: " + name + ", Damage: " + damage);
    }
}
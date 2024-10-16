import java.util.ArrayList;
import java.util.List;
//ddddd
public class Hero{

    protected String name;
    protected int health;
    protected List<Usable> inventory;  // Une collection d'objets utilisables (armes, potions)


    // Constructeur
    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<>();
    }

    public void addWeapon (Weapon weapon){
        weapons.add(weapon);
        System.out.println(weapon.getName()  + " has been added to " + name + "'s weapons.");
    }

    // Ajouter un objet utilisable à l'inventaire
    public void addToInventory(Usable item) {
        inventory.add(item);
        System.out.println(item.getClass().getSimpleName() + " has been added to " + name + "'s inventory.");
    }

    // Utiliser un objet de l'inventaire
    public void useItem(int index) {
        if (index >= 0 && index < inventory.size()) {
            inventory.get(index).use();  // Appelle la méthode use() de l'objet Usable
        } else {
            System.out.println("Invalid item index.");
        }
    }

    // Afficher le contenu de l'inventaire
    public void displayInventory() {
        System.out.println(name + "'s inventory:");
        for (Usable item : inventory) {
            System.out.println("- " + item.getClass().getSimpleName());
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}



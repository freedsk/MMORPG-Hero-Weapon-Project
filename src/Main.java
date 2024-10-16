public class Main {
    public static void main(String[] args) {
        // Créer des armes
        Weapon sword = new Weapon("Sword", 50);
        Weapon axe = new Weapon("Axe", 65);

        // Créer une potion
        Potion healthPotion = new Potion("Health Potion", 20);

        // Créer un héros
        Hero hero = new Hero("Aragorn", 100);

        // Ajouter des objets à l'inventaire du héros
        hero.addToInventory(sword);
        hero.addToInventory(axe);
        hero.addToInventory(healthPotion);

        // Afficher l'inventaire du héros
        hero.displayInventory();

        // Utiliser des objets de l'inventaire
        hero.useItem(0);  // Utiliser l'épée
        hero.useItem(2);  // Utiliser la potion
    }
}
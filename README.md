📜 MMORPG Hero Weapon Project
This Java project demonstrates essential object-oriented programming (OOP) concepts by simulating a simple MMORPG-style game. In this game, a hero can own weapons and potions, and interact with these items in their inventory.

🛠 Features
A hero can own weapons and potions.
A hero can use items from their inventory.
Demonstrates key OOP concepts:
Classes and Objects
Inheritance
Polymorphism
Interfaces
Collections
📂 Project Structure
less
Copier le code
MMORPGProject/
│
├── src/
│   ├── Main.java         // Main entry point for the game
│   ├── Hero.java         // Hero class representing a hero in the game
│   ├── Warrior.java      // Warrior subclass of Hero
│   ├── Mage.java         // Mage subclass of Hero
│   ├── Weapon.java       // Weapon class, implements Usable interface
│   └── Potion.java       // Potion class, implements Usable interface
│
└── bin/                  // Directory for compiled .class files
🚀 Getting Started
Prerequisites
Java Development Kit (JDK) installed (version 8 or above).
Steps to Run the Project
Clone the repository:

bash
Copier le code
git clone https://github.com/yourusername/mmorpg-hero-weapon.git
Navigate to the project directory:

bash
Copier le code
cd mmorpg-hero-weapon
Compile the project: Make sure you're in the main directory where the src/ folder is located.

bash
Copier le code
javac -d bin src/*.java
Run the project:

bash
Copier le code
java -cp bin Main
🔑 Key Concepts
1. Classes and Objects
A class is a blueprint for creating objects in Java. An object is an instance of a class and contains fields (variables) and methods (functions).

In this project:

Class Weapon represents a weapon, with attributes such as name and damage.
Class Potion represents a healing potion with attributes like type and healingPower.
Example:

java
Copier le code
public class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
}
2. Inheritance
Inheritance allows one class to inherit fields and methods from another class. This is useful for creating hierarchies of related classes.

In this project:

Hero is the base class.
Warrior and Mage are subclasses of Hero.
Example:

java
Copier le code
public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);  // Calls the Hero constructor
    }
}
3. Polymorphism
Polymorphism enables treating objects of different subclasses as if they are objects of a common superclass or interface. This makes the code more flexible.

In this project, both Weapon and Potion implement the Usable interface, meaning they can be used polymorphically.

Example:

java
Copier le code
public interface Usable {
    void use();
}
Both Weapon and Potion implement the Usable interface, so they can be treated uniformly as Usable objects in the hero’s inventory.

4. Interfaces
An interface in Java defines a contract for classes to follow. It specifies methods that a class must implement, without providing the method implementation.

In this project:

The Usable interface requires the use() method to be implemented.
Example:

java
Copier le code
public interface Usable {
    void use();
}
5. Collections
Collections in Java allow the management of groups of objects. In this project, the hero’s inventory is stored in a List<Usable>, which can contain both Weapon and Potion objects.

Example:

java
Copier le code
public class Hero {
    protected List<Usable> inventory;

    public Hero() {
        this.inventory = new ArrayList<>();
    }

    public void addToInventory(Usable item) {
        inventory.add(item);
    }

    public void useItem(int index) {
        inventory.get(index).use();
    }
}
🧪 Example Usage in Main.java
java
Copier le code
public class Main {
    public static void main(String[] args) {
        // Create weapons and a potion
        Weapon sword = new Weapon("Sword", 50);
        Weapon axe = new Weapon("Axe", 65);
        Potion healthPotion = new Potion("Health Potion", 20);

        // Create a hero
        Hero hero = new Warrior("Aragorn", 100);

        // Add items to hero's inventory
        hero.addToInventory(sword);
        hero.addToInventory(axe);
        hero.addToInventory(healthPotion);

        // Display and use items
        hero.useItem(0);  // Use the sword
        hero.useItem(2);  // Use the potion
    }
}
👨‍💻 Author
Your Name - @yourusername


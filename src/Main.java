public class Main {
    public static void main(String[] args) {
        // Création des armes
        ArmePhysique epee = new ArmePhysique("Épée en Acier", 25);
        ArmeMagique batonMagique = new ArmeMagique("Bâton de Glace", 30);

        // Création des personnages
        Guerrier guerrier = new Guerrier("Ragnar", 100, 20, 15, 10, epee);  // Nom, PV, Force, Défense, Mana, Arme
        Mage mage = new Mage("Merlin", 80, 15, 40, 50, batonMagique);      // Nom, PV, Force, Défense, Mana, Arme

        // Création des potions
        PotionSoin potionSoin = new PotionSoin("Potion de Soin", 30);
        PotionMana potionMana = new PotionMana("Potion de Mana", 20);

        // Création de l'inventaire et ajout des objets
        Inventaire inventaire = new Inventaire();
        inventaire.ajouterObjet(potionSoin);
        inventaire.ajouterObjet(potionMana);

        // Affichage de l'inventaire
        inventaire.afficherInventaire();

        // Phase de combat
        System.out.println("\n--- Combat commence ---\n");
        guerrier.attaquer(mage);  // Ragnar attaque Merlin
        mage.attaquer(guerrier);  // Merlin attaque Ragnar

        // Utilisation des potions
        System.out.println("\n--- Utilisation des potions ---\n");
        System.out.println(guerrier.getNom() + " utilise une potion de soin.");
        inventaire.utiliserObjet(0, guerrier);  // Ragnar utilise la première potion (PotionSoin)

        System.out.println(mage.getNom() + " utilise une potion de mana.");
        inventaire.utiliserObjet(0, mage);  // Merlin utilise la première potion restante (PotionMana)

        // Phase finale
        System.out.println("\n--- Fin du combat ---\n");
        System.out.println(guerrier.getNom() + " a " + guerrier.getPointsDeVie() + " points de vie.");
        System.out.println(mage.getNom() + " a " + mage.getPointsDeVie() + " points de vie.");
    }
}

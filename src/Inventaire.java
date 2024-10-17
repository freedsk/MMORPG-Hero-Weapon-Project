import java.util.ArrayList;

public class Inventaire {

    private ArrayList<Utilisable> objets;  // Contient des objets utilisables (armes, potions, etc.)

    public Inventaire() {
        objets = new ArrayList<>();
    }

    public void ajouterObjet(Utilisable objet) {
        objets.add(objet);
        System.out.println("Ajout de " + objet.getClass().getSimpleName() + " dans l'inventaire.");
    }

    public void utiliserObjet(int index, Personnage cible) {
        if (index >= 0 && index < objets.size()) {
            Utilisable objet = objets.get(index);
            objet.utiliser(cible);  // On appelle utiliser directement grâce à l'interface
            objets.remove(index);
        } else {
            System.out.println("Objet non disponible.");
        }
    }

    public void afficherInventaire() {
        System.out.println("Inventaire :");
        for (int i = 0; i < objets.size(); i++) {
            System.out.println((i + 1) + ". " + objets.get(i).getClass().getSimpleName());
        }
    }
}

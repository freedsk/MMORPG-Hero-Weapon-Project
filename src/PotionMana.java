public class PotionMana implements Utilisable {
    private String nom;
    private int mana;

    public PotionMana(String nom, int mana) {
        this.nom = nom;
        this.mana = mana;
    }

    @Override
    public void utiliser(Personnage cible) {
        // Logique pour restaurer le mana du personnage
        System.out.println(cible.getNom() + " a récupéré " + mana + " points de mana.");
        cible.ajouterMana(mana);
    }
}
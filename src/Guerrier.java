

public class Guerrier extends Personnage {
    private ArmePhysique arme;

    public Guerrier(String nom, int pointsDeVie, int force, int mana, int puissance, ArmePhysique arme) {
        super(nom, pointsDeVie, force, mana, puissance);  // Appel du constructeur parent
        this.arme = arme;
    }

    @Override
    public void attaquer(Personnage adversaire) {
        int degats = this.force + this.arme.getDegats();  // Dégâts = force + dégâts de l'arme
        System.out.println(this.nom + " attaque avec " + this.arme.getNom() + " et inflige " + degats + " points de dégâts.");
        adversaire.recevoirDegats(degats);
    }
}

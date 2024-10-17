

public class Mage extends Personnage {
    private ArmeMagique arme;

    public Mage(String nom, int pointsDeVie, int force, int mana, int puissance, ArmeMagique arme) {
        super(nom, pointsDeVie, force, mana, puissance);
        this.arme = arme;
    }

    @Override
    public void attaquer(Personnage adversaire) {
        if (this.mana > 0) {
            int degatsMagiques = this.puissance + this.arme.getDegatsMagiques();
            System.out.println(this.nom + " lance un sort avec " + this.arme.getNom() + " et inflige " + degatsMagiques + " points de dégâts magiques.");
            adversaire.recevoirDegats(degatsMagiques);
            this.mana -= 10;  // Le sort consomme du mana
        } else {
            System.out.println(this.nom + " n'a plus de mana pour lancer un sort !");
        }
    }
}

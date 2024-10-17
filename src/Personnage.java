
public abstract class Personnage {
    protected String nom;
    protected int pointsDeVie;
    protected int force;
    protected int mana;
    protected int puissance;  // Dégâts magiques ou physiques

    public Personnage(String nom, int pointsDeVie, int force, int mana, int puissance) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.force = force;
        this.mana = mana;
        this.puissance = puissance;
    }

    public abstract void attaquer(Personnage adversaire);

    public void recevoirDegats(int degats) {
        this.pointsDeVie -= degats;
        System.out.println(this.nom + " a reçu " + degats + " points de dégâts. Il lui reste " + this.pointsDeVie + " points de vie.");
    }

    // Méthode pour modifier le mana
    public void ajouterMana(int pointsMana) {
        this.mana += pointsMana;
        System.out.println(this.nom + " récupère " + pointsMana + " points de mana.");
    }

    public void ajouterVie(int points) {
        this.pointsDeVie += points;
        System.out.println(nom + " récupère " + points + " points de vie.");
    }

    public boolean estVivant() {
        return this.pointsDeVie > 0;
    }

    // Getters et Setters pour les stats
    public String getNom() { return nom; }
    public int getPointsDeVie() { return pointsDeVie; }
    public int getForce() { return force; }
    public int getMana() { return mana; }
    public int getPuissance() { return puissance; }
}

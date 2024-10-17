public class PotionSoin implements Utilisable {
    private String nom;
    private int soin;

    public PotionSoin(String nom, int soin) {
        this.nom = nom;
        this.soin = soin;
    }

    @Override
    public void utiliser(Personnage cible) {
        cible.ajouterVie(soin);  // Appelle une méthode pour soigner le personnage
        System.out.println(cible.getNom() + " a été soigné de " + soin + " points.");
    }
}
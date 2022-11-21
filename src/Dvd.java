public class Dvd  extends Article{

    double duree;
    Personne realisateur;

    public Dvd(String reference, String designation, double prix, double duree, Personne realisateur) {
        super(reference, designation, prix);
        this.duree = duree;
        this.realisateur = realisateur;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public Personne getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Personne realisateur) {
        this.realisateur = realisateur;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "duree=" + duree +
                ", realisateur='" + realisateur + '\'' +
                '}';
    }
}

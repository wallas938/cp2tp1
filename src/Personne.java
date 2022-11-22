import java.util.ArrayList;

public class Personne {

    String nom;
    String prenom;

    ArrayList<Article> realisations = new ArrayList<>();

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public ArrayList<Article> getRealisations() {
        return realisations;
    }

    public void setRealisations(Article realisation) {
        this.realisations.add(realisation);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom +
                '}';
    }
}

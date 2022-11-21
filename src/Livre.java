public class Livre extends Article{
    long isbn;
    int nombreDePage;
    Personne auteur;

    public Livre(String reference, String designation, double prix, long isbn, Personne auteur) {
        super(reference, designation, prix);
        this.isbn = isbn;
        this.auteur = auteur;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNombreDePage() {
        return nombreDePage;
    }

    public void setNombreDePage(int nombreDePage) {
        this.nombreDePage = nombreDePage;
    }

    public Personne getAuteur() {
        return auteur;
    }

    public void setAuteur(Personne auteur) {
        this.auteur = auteur;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "isbn=" + isbn +
                ", nombreDePage=" + nombreDePage +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}

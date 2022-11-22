import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Magasin {
    ArrayList<Personne> artistes = new ArrayList<>();

    public Magasin() {
    }

    ArrayList<Article> getArticlesByArtiste(Personne artiste) {
        return artistes.stream().filter(personne -> personne.getPrenom() == artiste.getPrenom()).findAny().get().getRealisations();
    }

    public ArrayList<Personne> getArtistes() {
        return artistes;
    }

    public void setArtiste(Personne artiste) {
        this.artistes.add(artiste);
    }

    @Override
    public String toString() {
        return "Magasin{" +
                "artistes=" + artistes +
                '}';
    }
}

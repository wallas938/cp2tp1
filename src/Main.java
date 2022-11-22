public class Main {
    public static void main(String[] args) {

        // MAGASIN
        Magasin magasin = new Magasin();

        // ARTISTES
        Personne billy = new Personne("Smith", "Billy");

        Personne mike = new Personne("Johnson", "Mike");

        // AJOUT DES ARTISTES DANS LE MAGASIN POUR LA RECHERCHE

        magasin.setArtiste(billy);

        magasin.setArtiste(mike);

        // CREATION DES ARTICLES

        Livre l1 = new Livre("livre1 reference", "livre1 designation", 21.00, 1545454154, billy  );

        Livre l2 = new Livre("livre2 reference", "livre2 designation", 48.00, 1559854154, billy  );

        Dvd d1 = new Dvd("dvd1 reference", "dvd1 designation", 21.00, 5.55, mike );

        Dvd d2 = new Dvd("dvd2 reference", "dvd2 designation", 14.95, 3.28, mike );

        // AJOUT DES ARTICLES AUX ARTISTES

        billy.setRealisations(l1);

        billy.setRealisations(l2);

        mike.setRealisations(d1);

        mike.setRealisations(d2);

        // RÉCUPERER LES ARTICLES PAR ARTISTE ( PRÉNOM )

        System.out.println(magasin.getArticlesByArtiste(billy));

        System.out.println(magasin.getArticlesByArtiste(mike));

    }
}
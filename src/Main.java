public class Main {
    public static void main(String[] args) {

        Personne p1 = new Personne("Billy", "Smith");

        Personne p2 = new Personne("Mike", "johnson");

        Livre l1 = new Livre("livre1 reference", "livre1 designation", 21.00, 1545454154, p1  );

        Livre l2 = new Livre("livre2 reference", "livre2 designation", 48.00, 1559854154, p1  );

        Dvd d1 = new Dvd("dvd1 reference", "dvd1 designation", 21.00, 5.55, p2 );

        p1.setRealisations(l1);

        p1.setRealisations(l2);

        p2.setRealisations(d1);

        System.out.println(p1.getRealisations());

        System.out.println(p2.getRealisations());

    }
}
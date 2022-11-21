public class Main {
    public static void main(String[] args) {
        Article a = new Article("reference", "designation", 19.00);
        System.out.println(a);

        Livre l1 = new Livre("livre1 reference", "livre1 designation", 21.00, 1545454154, new Personne("Billy", "Smith") );
        System.out.println(l1);

        Dvd d1 = new Dvd("dvd1 reference", "dvd1 designation", 21.00, 5.55, new Personne("Mike", "johnson") );
        System.out.println(d1);
    }
}
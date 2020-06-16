import huisdieren.*;

public class MyApp {
    public static void main(String[] args) {
        // Demo static methode/property vs niet-static methode/property
        Huisdier dier1 = new Huisdier();
        System.out.println(dier1.getNHuisdieren());

        Bestelling.testBestelling();

        restVanCode();
    }

    /**
     * Wat code met voorbeeld constructies voor ArrayList, overerving,
     * polymorfie etc. zoals behandeld in de les.
     */
    private static void restVanCode() {
        System.out.println("Test it");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        alice.voegCijferToe(3, "Aardrijkskunde");
        alice.voegCijferToe(8, "Inleiding Sociale Wetenschapsfilosofie");

        bob.voegCijferToe(2, "Wiskunde");
        bob.voegCijferToe(6, "Structured Program Development");

        bob.schrapCijfer("Wiskunde");

        System.out.println("Alica: " + alice);
        System.out.println("Bob: " + bob);

        System.out.println("Alica's gemiddelde: " + alice.hoeGaatHet());
        System.out.println("Bob's gemiddelde: " + bob.hoeGaatHet());

    }

    
}


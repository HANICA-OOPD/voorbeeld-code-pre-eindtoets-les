public class MyApp {
    public static void main(String[] args) {
        System.out.println("Test it");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        alice.voegCijferToe(3, "Aardrijkskunde");
        bob.voegCijferToe(2, "Wiskunde");
        alice.voegCijferToe(8, "Inleiding Sociale Wetenschapsfilosofie");
        bob.voegCijferToe(6, "Structured Program Development");

        bob.schrapCijfer("Wiskunde");

        System.out.println("Alica's gemiddeld: " + alice.bepaalGemiddeldeCijfer());
        System.out.println("Bob's gemiddeld: " + bob.bepaalGemiddeldeCijfer());
    }
}


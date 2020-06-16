/** 
 * Een klasse voor de gegevens van een bestelling in een cafe en wat logica en een testfunctie erbij.
 * Merk op dat er nu per tafel maar 1 type drankje besteld kan worden.
 * Dat is niet erg realisatisch. De gemaakte logica kan later uitgebreid/genormaliseerd naar een BestellingRegel met aantal en soort erin.
 * De andere properties als tafelnummer blijft dan hier in Bestelling (samen met ArrayList van BestellingRegel).
 * Dit kun je als slotopgave doen om te oefenen (Opg 7), maar fix eerst onderstaand 6 TODO's.
 **/

 // Opgave 0: Maak een nieuwe project aan en roep de statische functie Bestelling.testBestelling() aan uit de main.
public class Bestelling {
    
    private int tafelNummer;

    private int aantalDrankjes;

    private float prijsDrankje;

    private String naamDrankje;

    public void veranderDrankje(String nieuweDrank) {
        this.naamDrankje = nieuweDrank;
    }

    public void drankjeErbij() {
        this.aantalDrankjes++;
    }

    public static void testBestelling() {
        // Nieuwe bestelling van 3 cola voor tafel 4 (bug?).
        Bestelling bestelling1 = new Bestelling(3, 4, "Cola");
        log(bestelling1.totaleKosten());

        // Nieuwe bestelling van 4 whiskey voor tafel 1.
        Bestelling bestelling2 = new Bestelling(1, 4, "Whiskey");
        log(bestelling2.totaleKosten());

        // Nieuwe bestelling van 4 whiskey voor tafel 1.
        Bestelling bestelling3 = new Bestelling(1, 4, "Whiskey");
        log(bestelling3.totaleKosten());
        
        // TODO Opg1: Zet alle bestellingen in een ArrayList.

        // TODO Opg2: Schrijf een functie `totaleKostenAlleTafels()` die gegeven het arraylist totale verwacht inkomsten berekent.
        // Opg2A Gebruik hierbij de al opgezette functie totaleKosten, maar fix deze eerst. NB: Deze berekent kosten voor 1 tafel/bestelling,
        // NIET voor alle tafels.
        // Opg2C: Kan de functie totaleKostenAlleTafels static zijn of niet? Zo nee, waarom niet, zo ja, is dat ook beter/mooier?

        // TODO Opg3: Verwijderen bestelling van tafel 4 uit totaallijst; deze klanten zijn van het terras weggelopen... :()
        // Schrijf hiervoor een methode `verwijderBestelling(tafelNummer)`

        // TODO Opg4: Roep eerdere functie aan voor nieuwe totaal inkomsten zonder die tafel.

        // TODO Opg5: Herschrijf je functie verwijderBestelling zodat deze geen fout geeft als je een tafel nummer opgeeft
        // waar helemaal geen bestelling voor is geplaatst. De methode logt dan wel netjes een error:
        // "Warning: Voor tafel x is nog geen bestelling geplaats."

    }

    public Bestelling(int tafelNummer, int aantalDrankjes, String naamDrankje) {
        this.tafelNummer = tafelNummer;
        this.aantalDrankjes = aantalDrankjes;
        this.naamDrankje = naamDrankje;
    }

    public float getPrijsDrankje(String drankje) {
        if (drankje=="whiskey") {
            prijsDrankje = 5.00f;
        } else {
            prijsDrankje = 2.00f;
        }
        return prijsDrankje;
    }

    /** Bepaalt de totale kosten van alle drankjes. */
    public float totaleKosten() {
        // TODO: Fixen, daadwerkelijke kosten berekenen.
        return 10.00f;
    }

    @Override
    public String toString() {
        return "Voor tafel " + tafelNummer + " komen er " + aantalDrankjes 
            + " glazen " + naamDrankje + "aan (kosten: " + totaleKosten() + ").";
    }

    // TODO (later): Onderstaande statische log functies verplaatsen naar apart herbuikbaar bestand.
    /** 
     * Log de kosten (voorlopig gewoon een print naar console (=stdout)
     * later wellicht online logservice)
     **/
    public static void log(String s, int severityLevel) {
        String level = "";
        if(severityLevel==1) {
            level = "Error: ";
        } else if (severityLevel>1) {
           level = "Warning: ";
        }
        System.out.print(level);
        System.out.println(s);
    }

    public static void log(String s) {
        log(s, 1);
    }

    public static void log(float s) {
        // Converteer float naar string (we kunnen alleen strings loggen).
        // Bron: https://stackoverflow.com/questions/7552660/java-convert-float-to-string-and-string-to-float
        String waarde = Float.toString(s);
        log(waarde, 1);
    }
}
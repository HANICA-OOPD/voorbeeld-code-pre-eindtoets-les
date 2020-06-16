package huisdieren;

/** 
 * De  variabele nHuisdieren is  een  static  variabele.
 * Schrijf  zo  duidelijke  mogelijk  op  wat  de consequentie is van deze beslissing.
 * 
 * Dit betekent dat de waarde van deze variabele hetzelfde is voor alle instanties van de klasse Huisdier.
 * Het maakt dus niet uit op welke instantie je deze aanroept; de waarde is altijd hetzelfde.
 * Daarom is het netter om de aanroep ook op de klasse te doen:
 * Huisdier.nHuisdieren
 * 
 * inplaats van
 * Huisdier dier1 = new Huisdier();
 * dier1.nHuisdieren;
 * 
 * Dat deze hetzelfde betekent NIET dat de waarde niet kan veranderen.
 * Als je Huisdier.nHuisdieren++ doet, is de waarde 1 hoger voor ALLE instanties.
 * 
 * Dit is precies wat je wilt als je de variabele alleen ophoogt in de constructor,
 * en de variabele weergeeft HOEVEEL huisdieren er (momenteel) totaal zijn aangemaakt.
 * 
 * De consequentie van de keuze is dus dat het goed werkt en dat nHuisdieren dus NIET uniek is
 * voor elk huisdier. Om een unieke id of tag te maken zou je
 * een NIET static property moeten toevoegen, en hier de huidige
 * waarde van nHuisdieren aan toewijzen in de constructor.
 * 
 * public Huisdier() {
 *      this.tag = nHuisdieren++;
 * }
 */


public class Huisdier {

    private static int nHuisdieren = 0;

    private int tag;

    public Huisdier() {
        this.tag = nHuisdieren++;
    }

    public static int getNHuisdieren() {
        return nHuisdieren;
    }

    public String getTag() {
        return Integer.toString(this.tag);
    }

    @Override
    public String toString() { 
        return "Tag: " + getTag() + "unieke tag voor alle " + nHuisdieren + " die er zijn.";
    }
}

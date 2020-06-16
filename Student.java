import java.util.*;

public class Student extends Persoon {

    private ArrayList<Cijfer> cijfers;

    public Student(String naam) {
        super(naam);

        this.cijfers = new ArrayList<Cijfer>();
    }

    @Override
    public String toString() {
        // super.toString(); // "h8287sjh"
        return naam + "\n" + cijfersAlsString(cijfers);
    }

	private static String cijfersAlsString(ArrayList<Cijfer> cijfers) {
        String output = "";
        for (Cijfer cijfer: cijfers) {
            output += cijfer.toString() + "\n";
        };
        return output;
    }

    public void voegCijferToe(int beoordeling, String vak) {
        Cijfer cijfer = new Cijfer(beoordeling, vak);
        if (!cijfers.contains(cijfer)) {
            cijfers.add(cijfer);
        }
	}

    /**
     * Schrapt het cijfer van het meegegeven, als aanwezig (anders doet 'ie niks).
     * @param vak
     */
	public void schrapCijfer(String vak) {
        int index = 0;
        for (Cijfer cijfer: cijfers) {
            if (cijfer.getVak()==vak) {
                cijfers.remove(index);
                return;
            }
            index++;
        }
        System.out.println("Geen cijfer gevonden voor: '" + vak + "'.");
	}

    public String hoeGaatHet() {
        return (bepaalGemiddeldeCijfer()>8) ? "Goed" : "Slecht";
    }

	private float bepaalGemiddeldeCijfer() {
        // TODO.
        return 4.0f;
    }
    
    public void methodeMetCast() {
        int getalletje = 3;
        float floatGetal = getalletje;

        float nogEenFloatGetal = 1.6f;
        int nogEenGetalletje = (int) nogEenFloatGetal;

        Student jan = new Student("Jan");
        Persoon persoonJan = jan;

        Persoon kees = new Student("Kees");

        Persoon marjan = new Persoon("Marjan");
        ArrayList<Persoon> personen = new ArrayList<Persoon>();
        personen.add(jan);
        personen.add(kees);
        personen.add(marjan);

        // Loop over alle personen.
        for(Persoon persoon: personen) {
            persoon.hoeGaatHet();
            if (persoon instanceof Student) {
                Student persoonAlsStudent = (Student) persoon;
                persoonAlsStudent.bepaalGemiddeldeCijfer();
            }
        }

        Student studentKees = (Student) kees;
        // ((Student) kees).bepaalGemiddeldeCijfer();

        studentKees.bepaalGemiddeldeCijfer();

        // System.out.println(floatgetal);
    }
}

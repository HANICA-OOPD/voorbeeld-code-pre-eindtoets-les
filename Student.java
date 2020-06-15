import java.util.*;

public class Student {

    private String naam;
    private ArrayList<Cijfer> cijfers;

    public Student(String naam) {
        this.naam = naam;
        this.cijfers = new ArrayList<Cijfer>();
    }

    @Override
    public String toString() {
        return naam;
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

	public float bepaalGemiddeldeCijfer() {
        // TODO.
        return 4.0f;
	}
}

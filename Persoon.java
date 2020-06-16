import java.util.Random;

public class Persoon {

    protected String naam;
    private boolean goedeBeenUitBed = (new Random().nextInt()%2==0);

    public Persoon(String naam) {
        this.naam = naam;
    }

    public String hoeGaatHet() {
        return goedeBeenUitBed ? "Goed" : "Slecht";
    }

}

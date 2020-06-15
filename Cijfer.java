

public class Cijfer {
    private int cijfer;
    private String vak;

    public Cijfer(int cijfer, String vak) {
        this.cijfer = cijfer;
        this.vak = vak;
    }

    @Override
    public String toString() {
        return vak + ": " + Integer.toString(cijfer);
    }

    @Override
    public boolean equals(Object cijfer) {
        if (cijfer instanceof Cijfer) {
            Cijfer c = (Cijfer) cijfer;
            return c.cijfer==this.cijfer && c.vak==this.vak;
        }
        return false;
    }

    public String getVak() {
        return vak;
    }
}

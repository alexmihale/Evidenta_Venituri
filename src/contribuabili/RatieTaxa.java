package contribuabili;

public enum RatieTaxa {
    GENERAL(0.16),
    IT(0.10),
    CONSTRUCTII(0.06);

    private double ratieTaxa;

    RatieTaxa(double ratieTaxa){
        this.ratieTaxa = ratieTaxa;
    }

    public double getRatieTaxa() {
        return ratieTaxa;
    }
}

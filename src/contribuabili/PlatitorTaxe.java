package contribuabili;

public class PlatitorTaxe implements Contribuabil {

    private static int counter = 0;
    private RatieTaxa ratieTaxa;
    private int id;

    private double venituri;

    private double taxePlatite;

    private double taxeDePlatit;

    public PlatitorTaxe(RatieTaxa ratieTaxa){
        counter++;
        id = counter;
        this.ratieTaxa = ratieTaxa;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getVenituri() {
        return venituri;
    }

    @Override
    public double getTaxePlatite() {
        return taxePlatite;
    }

    @Override
    public double getTaxeNeplatite() {
        return taxeDePlatit;
    }

    public void declaraVenit(double venituri){
        this.venituri += venituri;
        taxeDePlatit += venituri * ratieTaxa.getRatieTaxa();

    }

    public String toString(){
        return "PlatitorTaxe{"+
                "id=" + id +
                ", venituri=" + venituri +
                ", taxePlatite=" + taxePlatite +
                ", taxeDePlatit=" + taxeDePlatit +
                "}";
    }

    public void platesteTaxa(double valoare){
        if(valoare <= 0){
            System.out.println("Ati introdus o valoare negativa. Valoarea trebuie sa fie mai mare ca 0 : " + valoare);
            return;
        }
        if(this.taxeDePlatit < valoare) {
            System.out.println("Ati dorit sa platiti mai mult: " + valoare + " > " + taxeDePlatit);
            return;
        }
        this.taxePlatite += valoare;
        this.taxeDePlatit -= valoare;
    }
}

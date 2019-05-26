package contribuabili;

public class ContribuabilTest implements Contribuabil{
    private static int counter = 0;
    private final int id;

    public ContribuabilTest(){
        counter++;
        id = counter;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getVenituri() {
        return 0;
    }

    @Override
    public double getTaxePlatite() {
        return 0;
    }

    @Override
    public double getTaxeNeplatite() {
        return 0;
    }
}


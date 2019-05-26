package contribuabili;

public enum Registru {

    REGISTRU,
    REGISTRU_PROVINCIE;

    private int counter = 0;

    private Contribuabil[] contribuabili = new Contribuabil[5];

    private Registru() {}

    public void adaugaContribuabil(Contribuabil contribuabil) {
        if(counter+1 > contribuabili.length){
            dubleazaArray();
        }
        System.out.println("S-a adaugat Contribuabil " + contribuabil.getId());
        contribuabili[counter] = contribuabil;
        counter++;
    }

    private void dubleazaArray(){
        Contribuabil[] nouArray = new Contribuabil[contribuabili.length * 2];
        for (int i = 0; i < contribuabili.length ; i++) {
            nouArray[i] = contribuabili[i];
        }

        contribuabili = nouArray;
    }

    public void stergeContribuabil(Contribuabil contribuabil) {
                int i = gasesteIdContribuabil(contribuabil);
                if (i == -1){
                    System.out.println("Nu exista acel contribuabil " + contribuabil.getId());
                    return;
                }
                for (int j = i; j < counter -1 ; j++) {
                    contribuabili[j] = contribuabili[j+1];
                }
        System.out.println("S-a sters Contribuabil " + contribuabil.getId());
                contribuabili[counter-1] = null;
                counter--;
    }
//TODO
    /*
    *Folosind binary search eficientizti algoritmul
     */
    public int gasesteIdContribuabil(Contribuabil contribuabil){
        for (int i = 0; i <counter ; i++) {
            if(contribuabil.getId() == contribuabili[i].getId()){
                return i;
            }
        }

        return -1;
    }

    public int getNumarContribuabil(){
        return counter;
    }

}

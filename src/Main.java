import contribuabili.*;

import javax.swing.text.PlainDocument;

public class Main {
    public static void main(String[] args) {
        Contribuabil c1 = new ContribuabilTest();
        Contribuabil c2 = new ContribuabilTest();
        Contribuabil c3 = new ContribuabilTest();
        System.out.println(c1.getId());
        System.out.println(c2.getId());
        System.out.println(c3.getId());

        Registru.REGISTRU.adaugaContribuabil(c1);
        Registru.REGISTRU.adaugaContribuabil(c2);
        Registru.REGISTRU.adaugaContribuabil(c3);

        Contribuabil c4 =new ContribuabilTest();
        Registru.REGISTRU.stergeContribuabil(c4);
        Registru.REGISTRU.stergeContribuabil(c1);

        PlatitorTaxe c5 = new PlatitorTaxe(RatieTaxa.IT);
        PlatitorTaxe c6 = new PlatitorTaxe(RatieTaxa.GENERAL);
        c5.declaraVenit(100);
        System.out.println(c5.toString());

        c5.platesteTaxa(20);
        c5.platesteTaxa(16);
        System.out.println(c5.toString());

        c6.declaraVenit(500);

        System.out.println(c6.toString());

        c6.platesteTaxa(15);
        System.out.println(c6.toString());


    }
}

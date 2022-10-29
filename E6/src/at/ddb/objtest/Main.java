package at.ddb.objtest;

import at.ddb.objtest.formen.Rechteck;
import at.ddb.objtest.formen.Kreis;

public class Main {
    public static void main(String[] args) throws Exception {
        Rechteck rA = new Rechteck();
        // rA.laenge = 0;
        rA.setBreite(15);
        System.out.println(rA);

        Rechteck rB = new Rechteck(15, 7);
        System.out.println(rB);

        Rechteck rC = new Rechteck(0, 15);
        System.out.println(rC);

        Kreis k1 = new Kreis();
        System.out.println(k1);
        
        Kreis k2 = new Kreis(3);
        System.out.println(k2);
    }
}

package at.ddb.objtest;

import at.ddb.objtest.formen.Kreis;
import at.ddb.objtest.formen.Rechteck;

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

        Kreis k1 = new Kreis(15);
        System.out.println(k1);

        Kreis k2 = new Kreis(-30);
        System.out.println(k2);
    }
}

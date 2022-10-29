package at.ddb.objtest;

import at.ddb.objtest.formen.Rechteck;

public class Main {
    public static void main(String[] args) throws Exception {
        Rechteck rA = new Rechteck();
        System.out.println("Rechteck Länge: " + rA.laenge);
        System.out.println("Rechteck Breite" + rA.breite);
        System.out.println("Rechteck Umfang: " + rA.berechneUmfang());
        // rA.laenge = 0;
        rA.breite = 15;
        System.out.println("Rechteck Länge: " + rA.laenge);
        System.out.println("Rechteck Breite" + rA.breite);
        System.out.println("Rechteck Umfang: " + rA.berechneUmfang());
        System.out.println("Rechteck Fläche: " + rA.berechneFlaeche());

        Rechteck rB = new Rechteck(15, 7);
        System.out.println("Rechteck Länge: " + rB.laenge);
        System.out.println("Rechteck Breite" + rB.breite);
        System.out.println("Rechteck Umfang: " + rB.berechneUmfang());
        System.out.println("Rechteck Fläche: " + rB.berechneFlaeche());
        System.out.println(rB.toString());
    }
}

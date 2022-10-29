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

        Rechteck rB = new Rechteck();
        rB.laenge = 15;
        rB.breite = 7;
        System.out.println("Rechteck Länge: " + rB.laenge);
        System.out.println("Rechteck Breite" + rB.breite);
        System.out.println("Rechteck Umfang: " + rB.berechneUmfang());

    }
}

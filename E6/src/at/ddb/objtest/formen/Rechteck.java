package at.ddb.objtest.formen;

public class Rechteck {
    public int laenge;
    public int breite;

    public Rechteck() {
    }

    public Rechteck(int laenge, int breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public double berechneFlaeche() {
        return laenge * breite;
    }
    public double berechneUmfang() {
        return 2 * (laenge + breite);
    }

}

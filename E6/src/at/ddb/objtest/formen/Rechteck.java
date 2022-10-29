package at.ddb.objtest.formen;

public class Rechteck {
    public int laenge;
    public int breite;

    public double berechneUmfang() {
        return 2 * ( this.laenge + this.breite );
    }

}

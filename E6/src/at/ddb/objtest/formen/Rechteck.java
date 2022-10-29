package at.ddb.objtest.formen;

public class Rechteck {
    private int laenge;
    private int breite;

    public Rechteck() {
    }

    public Rechteck(int laenge, int breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public void setLaenge(int laenge) {
        if(laenge > 0)
            this.laenge = laenge;
    }

    public int getLaenge() {
        return this.laenge;
    }

    public void setBreite(int breite) {
        if(breite > 0)
            this.breite = breite;
    }

    public int getBreite() {
        return this.breite;
    }

    public double berechneFlaeche() {
        return laenge * breite;
    }
    public double berechneUmfang() {
        return 2 * (laenge + breite);
    }

    @Override
    public String toString() {
        return "[" + super.toString() + "] || Länge: "+ laenge + " Breite: " + breite + " Fläche: " + berechneFlaeche() + " Umfang: " + berechneUmfang();
    }
}

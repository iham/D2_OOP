package at.ddb.objtest.formen;

public class Rechteck extends Form2D {
    private int laenge;
    private int breite;

    public Rechteck() {
    }

    public Rechteck(int laenge, int breite) {
        this.setLaenge(laenge);
        this.setBreite(breite);
    }

    public void setLaenge(int laenge) {
        if(laenge < 0)
            laenge *= -1;
        this.laenge = laenge;
    }

    public int getLaenge() {
        return this.laenge;
    }

    public void setBreite(int breite) {
        if(breite < 0)
            breite *= -1;
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
        return "[" + super.toString() + "] || Rechteck " + this.zeichneSymbol() + " Länge: " + laenge + " Breite: " + breite + " Fläche: " + berechneFlaeche() + " Umfang: " + berechneUmfang();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + laenge;
        result = prime * result + breite;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rechteck other = (Rechteck) obj;
        if (laenge != other.laenge)
            return false;
        if (breite != other.breite)
            return false;
        return true;
    }

    @Override
    public String zeichneSymbol() {
        return "▭";
    }

    @Override
    public void draw() {
        System.out.println("****");
        System.out.println("*  *");
        System.out.println("****");
    }

}

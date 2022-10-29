package at.ddb.objtest.formen;

public class Kreis {
    private int radius;

    public Kreis() {}

    public Kreis(int radius) {
        this.setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius < 0)
            radius *= -1;
        this.radius = radius;
    }

    public double berechneFlaeche() {
        return radius * radius * Math.PI;
    }
    public double berechneUmfang() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "[" + super.toString() + "] || Radius: "+ radius + " Fläche: " + berechneFlaeche() + " Umfang: " + berechneUmfang();
    }

}

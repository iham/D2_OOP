package at.ddb.objtest.formen;

public class Kreis extends Form2D {
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + radius;
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
        Kreis other = (Kreis) obj;
        if (radius != other.radius)
            return false;
        return true;
    }

}

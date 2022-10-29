package at.ddb.objtest.formen;

import java.awt.Color;

public class Form2D {
    private int x;
    private int y;
    private Color color = Color.BLUE;

    public Form2D() {}

    public Form2D(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        if(x < 0)
            x *= -1;
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        if(y < 0)
            y *= -1;
        this.y = y;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "2D Form | x: " + x + " y: " + y + " color: " + color;
    }

}

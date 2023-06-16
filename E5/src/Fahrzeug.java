public abstract class Fahrzeug {
    public String AntriebsArt;
    public String Dimensionen;
    public byte AnzahlSpuren;
    public boolean InBewegung;

    public void start() {
        this.InBewegung = true;
    }

    public void stop() {
        this.InBewegung = false;
    }
    
}


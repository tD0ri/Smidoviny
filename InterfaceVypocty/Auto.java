import java.awt.Color;
public class Auto implements ICestujici
{
    private final Color BARVA;
    int pocetCestujicich;
    boolean moznostZahradky;
    String model;
    private int pocetKol;
    private boolean motorBezi;
    private int rychlost;

    public Auto()
    {
        this.BARVA = Color.WHITE;
        this.pocetCestujicich = 5;
        this.moznostZahradky = true;
        this.model = "Codiaq";
        this.pocetKol = 4;
        this.motorBezi = true;
        this.rychlost = 80;
    }
    public Color getBarva()
    {
        return this.BARVA;
    }
    public int getpocetCestujicich()
    {
        return this.pocetCestujicich;
    }
    public void setPocetCestujicich(int pocetCestujicich)
    {
        this.pocetCestujicich = pocetCestujicich;
    }

}

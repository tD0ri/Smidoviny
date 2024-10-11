import java.awt.Color;
public class Motorka implements ICestujici
{
    private final Color BARVA;
    int pocetCestujicich;
    boolean moznostZahradky;
    String model;
    private int pocetKol;
    private boolean motorBezi;
    private int rychlost;
    
    public Motorka()
    {
        this.BARVA = Color.BLACK;
        this.pocetCestujicich = 2;
        this.moznostZahradky = true;
        this.model = "Kawasaki";
        this.pocetKol = 2;
        this.motorBezi = true;
        this.rychlost = 120;
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

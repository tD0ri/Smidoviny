
public class Dum
{
    private static Dum dum;
    private String typStrechy;
    private String material;
    private int pocetPodlazi;   
    private boolean obytny;
    private int pocetOken;
    
    private Dum()
    {
        this.typStrechy = "sedlová";
        this.material = "cihly";
        this.pocetPodlazi = 3;
        this.pocetOken = 41;
        this.obytny = false;
    }
    
    private Dum (String typStrechy, String material, int pocetPodlazi, int pocetOken, boolean obytne)
    {
        this.typStrechy = typStrechy;
        this.material = material;
        this.pocetPodlazi = pocetPodlazi;
        this.pocetOken = pocetOken;
        this.obytny = obytny;
    }
    
    public static Dum getInstance()
    {
        if (dum == null) dum = new Dum();
        return dum;
    }
    
    public String getTypStrechy()
    {
        return this.typStrechy;
    }
    
    public void setTypStrechy(String typStrechy)
    {
        this.typStrechy = typStrechy;
    }
    
    public String getMaterial()
    {
        return this.material;
    }
    
    public void setMaterial(String material)
    {
        this.material = material;
    }
    
    public int getPocetPodlazi()
    {
        return this.pocetPodlazi;
    }
    
    public void setPocetPodlazi(int pocetPodlazi)
    {
        this.pocetPodlazi = pocetPodlazi;
    }
    
    public int getPocetOken()
    {
        return this.pocetOken;
    }
    
    public void setPocetOken(int pocetOken)
    {
        this.pocetOken = pocetOken;
    }
    
    public boolean getObytny()
    {
        return this.obytny;
    }
    
    public void setObytny(boolean obytny)
    {
        this.obytny = obytny;
    }
}

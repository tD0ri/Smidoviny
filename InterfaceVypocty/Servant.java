
public class Servant
{

    public Servant()
    {
    }
    public int getPocetCestujicich(ICestujici vozidlo)
    {
        return vozidlo.getpocetCestujicich();
    }
    public void priberCestujiciho(ICestujici vozidlo)
    {
        vozidlo.setPocetCestujicich(vozidlo.getpocetCestujicich()+1);
    }

}

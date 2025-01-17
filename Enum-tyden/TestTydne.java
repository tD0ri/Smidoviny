
public class TestTydne
{

    public static void main(String[] args)
    {
        Tyden pondeli = Tyden.PONDELI;
        Tyden nedele = Tyden.NEDELE;
        System.out.println(pondeli.ordinal());
        System.out.println(nedele.ordinal());
        System.out.println(Tyden.values().length);
        System.out.println(Tyden.values()[3]);
        
        for (Tyden d : Tyden.values())
        System.out.println(d.ordinal()+" "+d);
    }

}

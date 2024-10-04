
public class TestDomu
{

    public static void main(String[] args)
    {
        Dum mujPrvniDum = new Dum("rovna", "tvarnice", 2, 22, true);
        System.out.println(mujPrvniDum.getTypStrechy()+" " + mujPrvniDum.getMaterial());
        mujPrvniDum.setTypStrechy("sedlova");
        mujPrvniDum.setMaterial("beton");
        System.out.println(mujPrvniDum.getTypStrechy()+" " + mujPrvniDum.getMaterial());

    }
}

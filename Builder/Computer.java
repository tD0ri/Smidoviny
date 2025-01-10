
public class Computer
{
    private String CPU;
    private String RAM;
    private String storage;
    private String graphics;
    public Computer()
    {
    }
    public String getCPU()
    {
        return CPU;
    }
    public void setCPU(String CPU)
    {
        this.CPU = CPU;
    }
    public String getRAM()
    {
        return RAM;
    }
    public void setRAM(String RAM)
    {
        this.RAM = RAM;
    }
    public String getStorage()
    {
        return storage;
    }
    public void setStorage(String storage)
    {
        this.storage = storage;
    }
    public String getGraphics()
    {
        return storage;
    }
    public void setGraphics(String graphics)
    {
        this.graphics = graphics;
    }
    @Override
    public String toString()
    {
        return "Computer [CPU= " + CPU + ", RAM= " + RAM + ", storage= " + storage + ", graphics= " + graphics + "]";
    }
}

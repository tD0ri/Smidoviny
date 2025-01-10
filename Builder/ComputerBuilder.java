
public class ComputerBuilder
{
    private String CPU; 
    private String RAM;
    private String storage; 
    private String graphics;
    
    public ComputerBuilder nastavCPU(String CPU)
    {
        this.CPU = CPU;
        return this;
    }
    public ComputerBuilder nastavRAM(String RAM)
    {
        this.RAM = RAM;
        return this;
    }
    public ComputerBuilder nastavStorage(String storage)
    {
        this.storage = storage;
        return this;
    }
    public ComputerBuilder nastavGraphics(String graphics)
    {
        this.graphics = graphics;
        return this;
    }
    public Computer build()
    {
        Computer computer = new Computer();
        computer.setCPU(this.CPU);
        computer.setRAM(this.RAM);
        computer.setStorage(this.storage);
        computer.setGraphics(this.graphics);
        return computer;
    }
}

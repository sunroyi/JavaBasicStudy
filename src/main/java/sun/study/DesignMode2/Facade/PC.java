package sun.study.DesignMode2.Facade;

public class PC {

    CPU cpu;
    Disk disk;
    Memory memory;

    public PC(){
        this.cpu = new CPU();
        this.disk = new Disk();
        this.memory = new Memory();
    }

    public void StarUp(){
        System.out.println("PC Startup Start");
        cpu.StartUp();
        disk.StartUp();
        memory.StartUp();
        System.out.println("PC Startup Emd");
    }

    public void ShutDown(){
        System.out.println("PC ShutDown Start");
        memory.ShutDown();
        disk.ShutDown();
        cpu.ShutDown();
        System.out.println("PC ShutDown Emd");
    }
}

package sun.study.DesignMode.Facade;

public class PC {

    public void Startup(){
        System.out.println("PC Start");
        CPU cpu = new CPU();
        Memory memory = new Memory();
        Disk disk = new Disk();

        cpu.Startup();
        memory.Startup();
        disk.Startup();
    }
}

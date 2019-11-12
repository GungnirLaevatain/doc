package facade;

/**
 * The class Computer.
 * 电脑类
 *
 * @author GungnirLaevatain
 * @version 2019 -06-13 21:37:59
 * @since JDK 11
 */
public class Computer {
    private Cpu cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        cpu = new Cpu();
        disk = new Disk();
        memory = new Memory();
    }

    /**
     * Start.
     * 启动电脑
     *
     * @author GungnirLaevatain
     */
    public void start() {
        // 启动cpu 内存 硬盘从而完成电脑的启动
        cpu.start();
        memory.start();
        disk.start();
    }

    /**
     * Stop.
     * 停止电脑运行
     *
     * @author GungnirLaevatain
     */
    public void stop() {
        // 停止cpu 内存 硬盘运行从而完成电脑的停止运行
        cpu.stop();
        memory.stop();
        disk.stop();
    }
}

package facade;

/**
 * The class Client.
 *
 * @author GungnirLaevatain
 * @version 2019 -06-13 21:57:53
 * @since JDK 11
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        computer.stop();
    }
}

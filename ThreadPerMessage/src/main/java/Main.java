/**
 * @Description
 * @className: Main
 * @Date 2022-3-17
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("main BEGIN");
        Host host = new Host();
        host.request(10, 'A');
        host.request(20, 'B');
        host.request(30, 'C');
        host.request(40, 'D');
        System.out.println("main END");
    }
}
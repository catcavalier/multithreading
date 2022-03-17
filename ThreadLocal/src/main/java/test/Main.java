package test;

/**
 * @Description
 * @className: Main
 * @Date 2022-3-17
 */
public class Main {
    public static void main(String[] args) {
        new ClientThread("Alice").start();
        new ClientThread("Bobby").start();
        new ClientThread("Chris").start();
    }
}

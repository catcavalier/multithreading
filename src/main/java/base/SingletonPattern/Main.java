package main.java.base.SingletonPattern;

/**
 * @Description
 * @className: Main
 * @Date 2022-3-16
 */
//两个Main线程同时调用单例方法getInstance
public class Main extends Thread {
    public static void main(String[] args) {
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
        new Main().start();
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + MySystem.getInstance().getDate());
    }
}
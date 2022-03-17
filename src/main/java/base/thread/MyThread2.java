package main.java.base.thread;

/**
 * @Description
 * @className: MyThread
 * @Date 2022-3-16
 */
public class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i + " ");
        }
    }
}

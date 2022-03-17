package main.java.base.runnable;

/**
 * @Description
 * @className: MyThread
 * @Date 2022-3-16
 */
public class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.print(i + " ");
        }
    }
}
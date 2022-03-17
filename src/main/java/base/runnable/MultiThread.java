package main.java.base.runnable;

/**
 * @Description
 * @className: MultiThread
 * @Date 2022-3-16
 */
public class MultiThread {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();    //启动子线程
        //主线程继续同时向下执行
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + " ");
        }
    }
}
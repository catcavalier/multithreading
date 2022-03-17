package main.java.base.thread;

/**
 * @Description
 * @className: MultiThread
 * @Date 2022-3-16
 */
public class MultiThread2 {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.start();    //启动子线程
        //主线程继续同时向下执行
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " ");
        }

    }
}
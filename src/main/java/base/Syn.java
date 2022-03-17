package main.java.base;

/**
 * @Description
 * @className: Syn
 * @Date 2022-3-16
 */
public class Syn {
    //synchronized实例方法
    public synchronized void deposit(int m){
        System.out.println("This is synchronized method.");
    }
    //synchronized类方法
    public static synchronized void staticDeposit(int m) {
        System.out.print("This is synchronized static method.");
    }
}

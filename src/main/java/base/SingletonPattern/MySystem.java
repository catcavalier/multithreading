package main.java.base.SingletonPattern;

import java.util.Date;

/**
 * @Description
 * @className: MySystem
 * @Date 2022-3-16
 */
public class MySystem {
    private static MySystem instance = null;
    private Date date = new Date();

    private MySystem() {
    }
    public Date getDate() {
        return date;
    }
    public static MySystem getInstance() {
        if (instance == null) {
            synchronized (MySystem.class) {
                if (instance == null) {
                    instance = new MySystem();
                }
            }
        }
        return instance;
    }
}

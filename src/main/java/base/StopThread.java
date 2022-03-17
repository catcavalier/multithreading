package main.java.base;

/**
 * @Description
 * @className: stopthread
 * @Date 2022-3-16
 */
public class StopThread {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(i+" ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

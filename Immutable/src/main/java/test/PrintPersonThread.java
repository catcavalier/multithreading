package test;

/**
 * @Description
 * @className: PrintPersonThread
 * @Date 2022-3-16
 */
public class PrintPersonThread extends Thread {
    private Person person;
    public PrintPersonThread(Person person) {
        this.person = person;
    }
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " prints " + person);
        }
    }
}

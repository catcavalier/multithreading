package test;

/**
 * @Description
 * @className: Main
 * @Date 2022-3-17
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data(10);
        new ReaderThread(data).start();
        new ReaderThread(data).start();
//        new ReaderThread(data).start();
//        new ReaderThread(data).start();
//        new ReaderThread(data).start();
//        new ReaderThread(data).start();
        new WriterThread(data, "ABCDEFGHIJKLMNOPQRSTUVWXYZ").start();
        new WriterThread(data, "abcdefghijklmnopqrstuvwxyz").start();
    }
}

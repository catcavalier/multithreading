package test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description
 * @className: TSLog
 * @Date 2022-3-17
 */
//实际执行记录日志的类，每个线程都会拥有一个该类的实例
public class TSLog {
    private PrintWriter writer = null;
    public TSLog(String filename) {
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void println(String s) {
        writer.println(s);
        System.out.println(s);
    }
    public void close() {
        writer.println("==== End of log ====");
        writer.close();
    }
}

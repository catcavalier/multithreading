package test;

import java.io.IOException;
import java.util.Random;

/**
 * @Description
 * @className: ChangerThread
 * @Date 2022-3-17
 */
//修改线程模仿“一边修改文章，一边保存”
public class ChangerThread extends Thread {
    private Data data;
    private Random random = new Random();
    public ChangerThread(String name, Data data) {
        super(name);
        this.data = data;
    }
    public void run() {
        try {
            for (int i = 0; true; i++) {
                data.change("No." + i);
                Thread.sleep(random.nextInt(1000));
                data.save();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
package test;

import java.io.IOException;

/**
 * @Description
 * @className: SaverThread
 * @Date 2022-3-17
 */
//存储线程每个1s，会对数据进行一次保存，就像文本处理软件的“自动保存”一样。
public class SaverThread extends Thread {
    private Data data;
    public SaverThread(String name, Data data) {
        super(name);
        this.data = data;
    }
    public void run() {
        try {
            while (true) {
                data.save(); // 存储资料
                Thread.sleep(1000); // 休息约1秒
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
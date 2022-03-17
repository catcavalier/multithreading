package test;

import java.util.LinkedList;

/**
 * @Description
 * @className: RequestQueue
 * @Date 2022-3-16
 * 注：getRequest方法中有一个判断while (queue.size() <= 0)，
 * 该判断称为Guarded Suspension Pattern 的警戒条件（guard condition）。
 * 在Java语言中，是使用while语句和wait方法来实现guardedMethod的；
 * 使用notify/notifyAll方法实现stateChangingMethod。如案例中的RequestQueue 类。
 * <p>
 * 注意：Guarded Suspension Pattern 需要使用while，
 * 这样可以使从wait set被唤醒的线程在继续向下执行前检查Guard条件。
 * 如果改用if，当多个线程被唤醒时，由于wait是继续向下执行的，可能会出现问题。
 */
public class RequestQueue {
    private final LinkedList<Request> queue = new LinkedList<Request>();

    public synchronized Request getRequest() {
        while (queue.size() <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        return (Request) queue.removeFirst();
    }

    public synchronized void putRequest(Request request) {
        queue.addLast(request);
        notifyAll();
    }
}
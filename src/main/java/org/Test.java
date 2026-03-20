package org;


import java.util.concurrent.locks.ReentrantLock;

public class Test {

    //初始化一个静态lock对象
    private static final ReentrantLock lock = new ReentrantLock();
    //初始化计算量值
    private static int count;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(()->{
            for (int i = 0; i <1000 ; i++) {
                lock.lock();
                try {
                    count++;
                } finally {
                    lock.unlock();
                }
            }
        });
        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                lock.lock();
                try {
                    count++;
                } finally {
                    lock.unlock();
                }
            }
        });
        thread1.start();
        thread2.start();
//        thread1.join();
        thread2.join();
        System.out.println("result:"+count);
    }
}

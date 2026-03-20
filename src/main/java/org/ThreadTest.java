package org;

public class ThreadTest extends Thread{

    public static int ticket =100;


    @Override
    public void run() {
        while(ticket>=0){
            ticket--;
            System.out.println("票的数量"+ticket);
        }
        System.out.println("票已买完");
        System.out.println("票已买完-1-github修改");
        System.out.println("票已买完-1-本地第一修改");
        System.out.println("票已买完-2-本地第二修改");
        System.out.println("票已买完-2-github修改");
    }
}

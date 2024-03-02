/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading.multithreadingdemo7;


import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Deepak
 */
class BookTicket
{
    static int total_seats=10;
    static synchronized void bookTicket(int seats)
    {
        if(total_seats>=seats)
        {
            System.out.println("success");
            total_seats=total_seats-seats;
            System.out.println("seats left : "+total_seats);
        }
        else
        {
            System.err.println("fail");
        }
    }
}
class MyThread1 extends Thread
{
    BookTicket bt;
    int seats;

    MyThread1(BookTicket bt, int seats) 
    {
        this.bt=bt;
        this.seats=seats;
    }
    
    public void run()
    {
        bt.bookTicket(seats);
    }
}
class MyThread2 extends Thread
{
    BookTicket bt;
    int seats;

    MyThread2(BookTicket bt, int seats) 
    {
        this.bt=bt;
        this.seats=seats;
    }
    
    public void run()
    {
        bt.bookTicket(seats);
    }
}
public class TrainBooking
{
    public static void main(String[] args) throws FileNotFoundException {
        BookTicket bt1=new BookTicket();
        
        MyThread1 t1=new MyThread1(bt1, 7);
        t1.start();
        
        MyThread1 t2=new MyThread1(bt1, 4);
        t2.start();
        
        //----------------------------------------------------
        BookTicket bt2=new BookTicket();
        
        MyThread2 t3=new MyThread2(bt2, 5);
        t3.start();
        
        MyThread2 t4=new MyThread2(bt2, 6);
        t4.start();

        int i = 2200;
        byte b = (byte) i;
//        boolean b1 = (boolean) i; error
        System.out.println(-128 + (i - 127 - 1));
        System.out.println(b);

        char c1 = 98;
        System.out.println(c1);
        FileReader fr = new FileReader("TrainBooking.java");
        

//        100010011000
//        1001 1000

   }
}

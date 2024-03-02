/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading.demooo;

/**
 *
 * @author Deepak
 */
class BookTrainSeat
{
    int total_seats=10;
    
    void bookSeat(int seats, String name)
    {
        //1000 lines of code
        try
        {
            for(int i=1; i<=10; i++)
            {
                System.out.println(Thread.currentThread().getName()+" : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        synchronized(this)
        {
            if(total_seats>=seats)
            {
                System.out.println(name+" booked "+seats+" seats successfully");
                total_seats=total_seats-seats;
                System.out.println("Total seats left : "+total_seats);
            }
            else
            {
                System.err.println(name+" sorry...!! seats not left");
                System.err.println("Total seats left : "+total_seats);
            }
        }
        
        
        //1000 lines of code
    }
}
class MyThread extends Thread
{
    BookTrainSeat bts; 
    int seats;

    public MyThread(BookTrainSeat bts, int seats)
    {
        this.bts=bts;
        this.seats=seats;
    }
    
    public void run()
    {
        bts.bookSeat(seats, Thread.currentThread().getName());
    }
}
public class TrainReservation
{
    public static void main(String[] args)
    {
        BookTrainSeat bts=new BookTrainSeat();
        
        MyThread deepak=new MyThread(bts, 5);
        deepak.setName("Deepak");
        deepak.start();
        
        MyThread amit=new MyThread(bts, 3);
        amit.setName("Amit");
        amit.start();
        
        MyThread rahul=new MyThread(bts, 4);
        rahul.setName("Rahul");
        rahul.start();
    }
}
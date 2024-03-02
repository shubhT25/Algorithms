/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading.threadcases;

/**
 *
 * @author Deepak
 */

//Performing Single Task from Multiple Threads

class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("hi");
    }
}
public class Test2
{
    public static void main(String[] args)
    {
        MyThread2 mt2=new MyThread2();
        mt2.start();
        
        MyThread2 mt22=new MyThread2();
        mt22.start();
    }
}

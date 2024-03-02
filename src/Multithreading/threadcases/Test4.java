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

//Performing Multiple Task from Multiple Threads

class MyThread4 extends Thread
{
    public void run()
    {
        System.out.println("hi");
    }
}
class MyThread44 extends Thread
{
    public void run()
    {
        System.out.println("hello");
    }
}
class MyThread444 extends Thread
{
    public void run()
    {
        System.out.println("hey");
    }
}
public class Test4
{
    public static void main(String[] args)
    {
        MyThread4 mt1=new MyThread4();
        mt1.start();
        
        MyThread44 mt2=new MyThread44();
        mt2.start();
        
        MyThread444 mt3=new MyThread444();
        mt3.start();
    }
}

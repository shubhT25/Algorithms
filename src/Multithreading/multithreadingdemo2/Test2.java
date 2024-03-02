/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading.multithreadingdemo2;

/**
 *
 * @author Deepak
 */
class MyThread2 extends Thread
{
    @Override
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
        //mt2.start(); it will provide an exception because we cannot start one thread 2 times
    }
}

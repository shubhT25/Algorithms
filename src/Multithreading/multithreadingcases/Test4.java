/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading.multithreadingcases;

/**
 *
 * @author Deepak
 */
class Abc4 extends Thread
{
    public void run()
    {
        System.out.println("hi " + Thread.currentThread().getName());
    }
    public void run(int a)
    {
        System.out.println(a + " " + Thread.currentThread().getName());
    }
}
public class Test4
{
    public static void main(String[] args)
    {
        Abc4 ob1=new Abc4();
        ob1.start();
        
        ob1.run(10);
    }
}
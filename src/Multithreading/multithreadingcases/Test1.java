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
class Abc1 extends Thread
{
    public void run()
    {
        System.out.println("hi");
    }
}
public class Test1 
{
    public static void main(String[] args)
    {
        Abc1 ob1=new Abc1();
        ob1.start();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryCatch.Testing;

import java.util.Scanner;

/**
 *
 * @author Deepak
 */
public class Voting2
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age=s.nextInt();
        
        if(age<18)
        {
            try
            {
                throw new InvalidAgeException("You cannot vote as your age is below 18");
            }
            catch(InvalidAgeException e)
            {
                System.out.println(e.getMessage());
            }
        }
        else
        {
            System.out.println("you can vote now...!!");
        }
        
        System.out.println("------------------Thank you-------------------");
    }
}

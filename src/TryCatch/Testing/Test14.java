/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryCatch.Testing;

/**
 *
 * @author Deepak
 */
public class Test14
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(100/0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("hiiii");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryCatch.Testing;

import java.io.FileInputStream;

/**
 *
 * @author Deepak
 */
public class Test15
{
    public static void main(String[] args)
    {
        try(
                FileInputStream fis=new FileInputStream("");
           )
        {
            fis.read();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

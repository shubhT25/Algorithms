/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryCatch.Testing;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Deepak
 */
public class Test16
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        try(
                
                Connection con=DriverManager.getConnection("","","");
           )
        {
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

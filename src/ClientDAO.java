/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.sql.*;
 import java.sql.Connection;
public class ClientDAO {

    
   private Statement s;
  private static ClientDAO ob = null;
    private static Connection con= null;
    private  ClientDAO() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ users", "root", "qwertz1234567890");
                      s=con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
           public static Connection getInstance() { 
        if ( ob == null ) { 
            ob = new ClientDAO(); 
        }
        return con; 
    } 

    public static void main(String[] args) {

    }

   
}

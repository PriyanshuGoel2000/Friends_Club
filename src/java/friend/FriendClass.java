/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friend;
import java.sql.*;

/**
 *
 * @author Sankalp
 */
public class FriendClass {
     Connection conn;
          ResultSet rss;
          Statement stt;
    
    /** Creates a new instance of FriendClass */
    public FriendClass() {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
          conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","Sankalp1402");
          stt=conn.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        }
    
    public String groupCreation(String from,String to,String dat,String sta)
    {
        try
        {
        stt.executeUpdate("insert into group_table values ('"+from+"','"+to+"','" +dat+"','"+sta+"')");
        return "ok";
        }
        catch(Exception e)
        {
            return "error";
        }
    }
    public  ResultSet selectUname(String id)throws SQLException
    {
        rss=stt.executeQuery("select uname from user_reg1 where email='"+id+"' ");
        return rss;
    }
    
    }
    


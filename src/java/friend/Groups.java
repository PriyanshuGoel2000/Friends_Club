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
public class Groups {
     Connection conn;
          ResultSet rss;
          Statement stt;
    
    /** Creates a new instance of FriendClass */
    public Groups() {
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
    public ResultSet allGroups()throws SQLException
    {
        rss=stt.executeQuery("select * from group_create");
        return rss;
    }
}

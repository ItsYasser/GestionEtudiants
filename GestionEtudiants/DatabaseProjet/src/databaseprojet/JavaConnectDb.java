/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseprojet;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author El Mysto
*/
public class JavaConnectDb {
    public static Connection ConnecrDb(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","yasser");
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }

    
}

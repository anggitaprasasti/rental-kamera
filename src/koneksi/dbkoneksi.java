/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class dbkoneksi {
    Connection koneksi=null;
public static Connection koneksidb(){
try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrentalkamera","root","");
    return koneksi;
}catch(Exception e) {
JOptionPane.showMessageDialog(null, e);
return null;
}
}
}

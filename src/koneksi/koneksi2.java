/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class koneksi2 {
    public static String PathReport = System.getProperty("user.dir") + "/src/rentalkamera/";
    public static  Connection koneksi;
    public static String ParhReport;
    public static Connection getloneksi(){
        if (koneksi == null){
            try {
                String url = new String();
                String  user = new String();
                String password = new String();
                url = "jdbc:mysql://localhost/dbrentalkamera";
                user="root";
                password="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user,password);
            } catch (SQLException e) {
                System.out.println("koneksi Error");
            }
        }
        return null;
    }

    public static Connection getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

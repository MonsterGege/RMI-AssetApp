/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoneksiDB;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Eberhend
 */
public class Koneksi {


    
    public  Koneksi() throws ClassNotFoundException, SQLException{
        try{
            String username = "root";
            String password = "";
            String database = "db_aset";
            String url = "jdbc:mysql://localhost:3306/"+database;
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi Berhasil!!!");
        }catch(SQLException e){
            System.out.println("Koneksi Gagal!!!");
        }
    }
}

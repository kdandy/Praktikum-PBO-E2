/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc_utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Dandy Faishal Fahmi / 24060123140136
 */
public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Sesuaikan host, port, nama db
                String url =  "jdbc:mysql://localhost:3306/pbo_netbin";
                // Sesuaikan username dan password mysql
                String user = "root";
                String password = "tengkuafif1234";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi Berhasil");
                }
            } catch (ClassNotFoundException one) {
                System.out.println("Gagal load driver : " +one.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}

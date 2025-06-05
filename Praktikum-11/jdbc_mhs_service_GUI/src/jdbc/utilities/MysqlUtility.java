/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dandy Faishal Fahmi / 24060123140136
 */
public class MysqlUtility {
    private static Connection koneksi = null;
    private static final String URL = "jdbc:mysql://localhost:3306/pbo_netbin";
    private static final String USER = "root";
    private static final String PASSWORD = "tengkuafif1234";
    
    public static Connection getConnection() {
        try {
            // Tutup koneksi lama jika ada dan sudah tidak valid
            if (koneksi != null && koneksi.isClosed()) {
                koneksi = null;
            }
            
            if (koneksi == null) {
                // Load MySQL JDBC Driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // Buat koneksi baru
                koneksi = DriverManager.getConnection(URL, USER, PASSWORD);
                
                if (koneksi != null && !koneksi.isClosed()) {
                    System.out.println("Koneksi ke database berhasil!");
                } else {
                    System.err.println("Koneksi ke database gagal!");
                }
            }
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver tidak ditemukan: " + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error koneksi database: " + e.getMessage());
            e.printStackTrace();
        }
        
        return koneksi;
    }
    
    public static void closeConnection() {
        if (koneksi != null) {
            try {
                koneksi.close();
                koneksi = null;
                System.out.println("Koneksi database ditutup");
            } catch (SQLException e) {
                System.err.println("Error saat menutup koneksi: " + e.getMessage());
            }
        }
    }
    
    public static boolean isConnected() {
        try {
            return koneksi != null && !koneksi.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }
}
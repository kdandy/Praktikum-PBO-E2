/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc.program;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author Dandy Faishal Fahmi / 24060123140136
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    public static void main(String[] args) throws SQLException {
        List <Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");
        
        // Insert
        System.out.println("===insert");
        Mahasiswa mhsAdd1 = new Mahasiswa(1, "Tengku");
        service.add(mhsAdd1);
        System.out.println("berhasil insert: " + mhsAdd1);
        Mahasiswa mhsAdd2 = new Mahasiswa(2, "Aff");
        service.add(mhsAdd2);
        System.out.println("berhasil insert: " + mhsAdd2);
        Mahasiswa mhsAdd3 = new Mahasiswa(3, "Abah");
        service.add(mhsAdd3);
        System.out.println("berhasil insert: " + mhsAdd3);
        displayAll();
        
        // Update
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(2);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Muflihul");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();
        
        // Delete
        System.out.println("===delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }
    
    public static void displayAll() throws SQLException {
        System.out.println("===DisplayAll");
        List<Mahasiswa> list = service.getAll();
        if (list.isEmpty()) {
            System.out.println("Tabel kosong");
        } else {
            for (Mahasiswa m : list) {
                System.out.println(m.toString());
            }
        } 
    }
}
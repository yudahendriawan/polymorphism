/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDanObjek;

/**
 *
 * @author Umum
 */
public class ImplementasiKelasKaryawan {
    public static void main(String[] args){
        //membuat objek karyawan dengan nama Aurel
        Karyawan Aurel = new Karyawan();
        
        //mengisi nilai kedalam data-data Objek Karyawan
        Aurel.ID = "K001";
        Aurel.divisi = "Marketing";
        Aurel.nama = "Aurel Dian";
        Aurel.gaji = 2500000;
        
        //mencetak data-data Objek Karyawan
        System.out.println("Data Karyawan : ");
        System.out.println("ID : "+Aurel.ID);
        System.out.println("Nama : "+Aurel.nama);
        System.out.println("Divisi : "+Aurel.divisi);
        System.out.println("Gaji : "+Aurel.gaji);
        
        //Instansiasi objek Karyawan
        Karyawan karyawan001 = new Karyawan();
        
        //mengisi data pada objek Karyawan
        karyawan001.ID = "K001";
        karyawan001.nama = "Agus Ramadhan";
        karyawan001.divisi = "Keuangan";
        karyawan001.gaji = 1850000;
        
        //memanggil method CetakData()
        karyawan001.CetakData();
        
        //memanggil method hitungSumbanganZakat
        System.out.println("Sumbangan Zakat : "+karyawan001.hitungSumbanganZakat());
    }
}

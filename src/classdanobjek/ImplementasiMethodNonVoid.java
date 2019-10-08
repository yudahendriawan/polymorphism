/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdanobjek;

/**
 *
 * @author user
 */
public class ImplementasiMethodNonVoid {
    public static void main(String[] args){
        Karyawan karyawan001 = new Karyawan();
        karyawan001.ID = "K001";
        karyawan001.nama = "Agus Ramadhan";
        karyawan001.divisi = "Keuangan";
        karyawan001.gaji = 1850000;
        
        karyawan001.cetakData();
        
        System.out.println("Sumbangan Zakat : "
                +karyawan001.hitungSumbanganZakat());
    }
}

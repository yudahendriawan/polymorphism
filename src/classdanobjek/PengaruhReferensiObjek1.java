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
public class PengaruhReferensiObjek1 {
    public static void main(String[] args){
        /*Instansiasi 2 objek referensi yang mengacu pada 1 objek karyawan*/
        Karyawan Karyawan001 = new Karyawan();
        Karyawan Karyawan002 = Karyawan001;
         
        //mengisi data objek karyawan melalui objek referensi 1
        Karyawan001.nama = "Mischella";
        Karyawan001.divisi = "HRD";
        
        //mencetak data objek karyawan yang diacu 2 objek referensi
        System.out.println("Data Karyawan001");
        System.out.println("Nama    : "+Karyawan001.nama);
        System.out.println("DIvisi  : "+Karyawan001.divisi);
        System.out.println("");
        System.out.println("Data Karyawan002");
        System.out.println("Nama    : "+Karyawan002.nama);
        System.out.println("Divisi  : "+Karyawan002.divisi);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author WIN X
 */
public class mahasiswa {
    //Informasi tentang mahasisa Kelas A
    public void infoMahasiswa(int laki2, int perempuan, String kelas){
        int jumlah = laki2+perempuan;
        System.out.println(kelas+", jumlah mahasiswa = "+jumlah);
    }
    //Informasi tentang mahasiswa sampai tahun 2008
    public void infoMahasiswa (int mhsLama, int mhsBaru, int mhsCuti, int angkatan){
        int jumlah = mhsLama + mhsBaru + mhsCuti;
        System.out.println("Sampai tahun "+angkatan+", jumlah mahasiswa = "+jumlah);
    }
}

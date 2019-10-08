/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author WIN X
 */
public class dosen {
    private String nama, nik, jurusan;
    
    //membuat konstruktor
    dosen(String namaX, String nikX, String jurX){
        nama = namaX;
        nik = nikX;
        jurusan = jurX;
    }
    //menampilkan informasi
    public void view(){
        System.out.println("Nama                : "+nama);
        System.out.println("NIK                 : "+nik);
        System.out.println("Jurusan             : "+jurusan);
    }
}

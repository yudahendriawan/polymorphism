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
public class rektor extends dosen {
    private int th_mulai, jabatan_ke;
    
    //inisialisasi
    rektor(String namaX, String nikX, String jurX, int thX, int keX){
        super(namaX, nikX, jurX);
        th_mulai = thX;
        jabatan_ke = keX;
    }
    
    //menampilkan informasi
    public void viewRektor(){
        System.out.println("Th mulai jabatan    : "+th_mulai);
        System.out.println("Jabatan rektor ke-  : "+jabatan_ke);
        System.out.println();
    }
}

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
public class dekan extends dosen {
    private String fakultas;
    
    //inisialisasi
    dekan(String namaX, String nikX, String jurX, String fakX){
        super(namaX, nikX, jurX);
        fakultas=fakX;
    }
    
    //menampilkan informasi
    public void viewDekan(){
        System.out.println("Fakultas            : "+fakultas);
        System.out.println();
    }
}

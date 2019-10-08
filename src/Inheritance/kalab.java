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
public class kalab extends dosen {
    private String laboratorium;
    
    //inisialisasi
    kalab(String namaX, String nikX, String jurX, String labX){
        super(namaX, nikX, jurX);
        laboratorium = labX;
    }
    
    //menampilkan informasi
    public void viewKalab(){
        System.out.println("Laboratorium        : "+laboratorium);
        System.out.println();
    }
}

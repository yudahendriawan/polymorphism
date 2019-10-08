/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

/**
 *
 * @author WIN X
 */
public class kendaraan {
    private String model;
    
    //Inisialisasi
    public kendaraan(String model){
        this.model=model;
    }
    
    //Informasi yang merupakan method tanpa instruksi
    public void informasi(){
        System.out.println("Model   : "+model);
    }
}

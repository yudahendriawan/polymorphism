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
public class pesawat extends kendaraan{
    private String nama, jenis;
    
    public pesawat(String nama){
        super("pesawat");
        this.nama = nama;
        jenis = "belum teridentifikasi";
    }
    public pesawat(String nama, String jenis){
        super("pesawat");
        this.nama= nama;
        this.jenis = jenis;
    }
    public void informasi(){
        System.out.println("Nama pesawat adalah "+nama);
        System.out.println("Jenis pesawat adalah "+jenis);
    }
}

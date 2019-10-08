/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enkapsulasi;

/**
 *
 * @author user
 */
public class ParamKonstruktor {
    String nama;
    int semester;
    String nim;
    public ParamKonstruktor(String namaKu, int semesterKu, String nimKu){
        this.nama=namaKu;
        this.nim=nimKu;
        this.semester=semesterKu;
    }
    public void infoKu(){
        System.out.println("Nama : "+nama+"\nNim : "+nim+"\nSemester : "+semester);
    }
}

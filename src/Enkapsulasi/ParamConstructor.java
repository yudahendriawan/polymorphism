/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enkapsulasi;

/**
 *
 * @author WIN X
 */
public class ParamConstructor {
    String nama;
    int semester;
    String nim;
    public ParamConstructor(String namaKu, int semesterKu, String nimKu){
        nama = namaKu;
        nim = nimKu;
        semester = semesterKu;
    }
    public void infoKu(){
        System.out.println("Nama : "+nama +"\nNim : "+nim+"\nSemester : "+semester);
    }
}

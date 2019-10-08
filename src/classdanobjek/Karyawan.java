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
public class Karyawan {
    String ID, nama, divisi;
    double gaji;
    
    //method void
    void CetakData(){
        System.out.println("Data Karyawan : ");
        System.out.println("ID : "+ID);
        System.out.println("Nama : "+nama);
        System.out.println("Divisi : "+divisi);
        System.out.println("Gaji : "+gaji);
    }
    double hitungSumbanganZakat(){
        double zakat = gaji*0.025;
        return zakat;
    }
}

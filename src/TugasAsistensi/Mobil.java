/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsistensi;

/**
 *
 * @author WIN X
 */
public class Mobil {
    private String merk, warna, jenis;
    private int kapasitasmesin, bataspenumpang;
    
    public void setmerk(String brand){
        merk = brand;
    }
    public String getmerk(){
        return merk;
    }
    public void setwarna(String colour){
        warna = colour;
    }
    public String getwarna(){
        return warna;
    }
    public void setjenis(String type){
        jenis = type;
    }
    public String getjenis(){
        return jenis;
    }
    public void setkapasitasmesin(int machine){
        kapasitasmesin = machine;
    }
    public int getkapasitasmesin(){
        return kapasitasmesin;
    }
    public void setbataspenumpang(int passenger){
        bataspenumpang = passenger;
    }
    public int getbataspenumpang(){
        return bataspenumpang;
    }
    //method void
    public void infoMobil(){
        System.out.println("Merk                    : "+getmerk());
        System.out.println("Warna                   : "+getwarna());
        System.out.println("Jenis                   : "+getjenis());
        System.out.println("Kapasitas Mesin         : "+getkapasitasmesin()+" cc");
        System.out.println("Batas Penumpang         : "+getbataspenumpang());
        System.out.println();
    }
}

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
public class TesMobil {
    public static void main(String[] args){
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil();
        Mobil mobil3 = new Mobil();
        Mobil mobil4 = new Mobil();
        
        System.out.println("Identifikasi Mobil :");
        
        System.out.println("====Mobil 1====");
        mobil1.setmerk("Toyota");
        mobil1.setwarna("Biru");
        mobil1.setjenis("Minibus");
        mobil1.setkapasitasmesin(2000);
        mobil1.setbataspenumpang(7);
        mobil1.infoMobil();
        
        System.out.println("====Mobil 2====");
        mobil2.setmerk("Daihatsu");
        mobil2.setwarna("Hitam");
        mobil2.setjenis("Pick up");
        mobil2.setkapasitasmesin(1500);
        mobil2.setbataspenumpang(2);
        mobil2.infoMobil();
        
        System.out.println("====Mobil 3====");
        mobil3.setmerk("Suzuki");
        mobil3.setwarna("Silver");
        mobil3.setjenis("Suv");
        mobil3.setkapasitasmesin(1800);
        mobil3.setbataspenumpang(5);
        mobil3.infoMobil();
        
        System.out.println("====Mobil 4====");
        mobil4.setmerk("Honda");
        mobil4.setwarna("Merah");
        mobil4.setjenis("Sedan");
        mobil4.setkapasitasmesin(1300);
        mobil4.setbataspenumpang(5);
        mobil4.infoMobil();
    }
}

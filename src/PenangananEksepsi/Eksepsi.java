/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenangananEksepsi;

//import static PenangananEksepsi.DemoThrows.cobaEksepsi;

import static PenangananEksepsi.DemoThrows.cobaEksepsi;




/**
 *
 * @author WIN X
 */
public class Eksepsi {
    public static void main (String[] args){
//        int pembilang = 7;
//        int penyebut = 0;
//        try{
//            int hasil = pembilang/penyebut;
//            System.out.println("Hasil = "+hasil);
//        }
//        catch(Exception e){
//            System.out.println("KESALAHAN : Terdapat Pembagian Dengan Nol");
//        }
//        System.out.println("Stateen Setelah blok trycatch");
    //}}
//=======================================================================
//    cobaEksepsi(4,0);
//        System.out.println(""); 
//        cobaEksepsi(12,4);
//    }
//    public static void cobaEksepsi(int pembilang, int penyebut){
//        try{
//            int hasil = pembilang / penyebut;
//            System.out.println("Hasil bagi : "+hasil);
//            int[] Arr = {1,2,3,4,5}; //array dengan 5 elemen
//            Arr[10]=23; //mengakses indks ke-10
//        }
//        catch(ArithmeticException eksepsi1){
//            System.out.println("Terdapat pembagian dengan 0");
//        }
//        catch(ArrayIndexOutOfBoundsException eksepsi2){
//            System.out.println("Indeks di luar rentang");
//        }
//    }
//}
//========================================================================
//      Mahasiswa mhs = new Mahasiswa();
//      mhs.setNIM(null);
//      mhs.setNama("Nadilla");
//        System.out.println("\nNIM : "+mhs.getNIM());
//        System.out.println("Nama : "+mhs.getNAMA());
//    }
//}
//class Mahasiswa{
//          private String nim, nama;
//          
//          public void setNIM(String inputNIM){
//              try{
//                  nim= inputNIM;
//                  if(inputNIM==null){
//                      throw new NullPointerException();
//                  }
//              }
//              catch(NullPointerException npe){
//                  System.out.println("KESALAHAN : NIM tidak boleh null");
//              }
//          }
//          public String getNIM(){
//              return nim;
//          }
//          public void setNama(String inputNAMA){
//              nama=inputNAMA;
//              try{
//                  nama=inputNAMA;
//                  if(nama==null){
//                      throw new NullPointerException();
//                  }
//              }
//              catch(NullPointerException npe){
//                  System.out.println("KESALAHAN : Nama mahasiswa tidak boleh null");
//              }
//          }
//          public String getNAMA(){
//              return nama;
//          }
//      }
//====================================================================
try{
    cobaEksepsi();
}
catch(Exception e){
    System.out.println("Eksepsi ditangkap disini....");
    System.out.println(e.getMessage());
}
        System.out.println("Statemen setelah blok trycatch");
    }
}
class DemoThrows{
    public static void cobaEksepsi() throws IllegalAccessException{
        throw new IllegalAccessException("KESALAHAN : illegal access");
    }
}
//====================================================================
//cobaEksepsi(4,0);
//        System.out.println();
//        cobaEksepsi(12,4);
//    }
//}
//class DemoFinally{
//    public static void cobaEksepsi(int pembilang, int penyebut){
//        try{
//            int hasil = pembilang / penyebut;
//            System.out.println("Hasil bagi : "+hasil);
//            int[]Arr ={1,2,3,4,5};
//            Arr[10]=23;
//        }
//        catch(ArithmeticException eksepsi1){
//            System.out.println("Terdapat pembagian dengan nol");
//        }
//        catch(ArrayIndexOutOfBoundsException eksepsi2){
//            System.out.println("Indeks di luar rentang");
//        }
//        finally{
//            System.out.println("Ini adalah statemen di blok finally");
//        }
//    }
//}
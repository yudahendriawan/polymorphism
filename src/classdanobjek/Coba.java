/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdanobjek;

/**
 *
 * @author user
 */
public class Coba {

    public int jumlah(int a,int b){
        int c = a+ b;
        return c;
    }
    void tampil(){
        //System.out.println("Hello");
    }
    public static void main(String[]args){
        Coba coba = new Coba();
        int c = 5;
        int d = 6;
        System.out.println(coba.jumlah(c,d));
        coba.tampil();
    }
}



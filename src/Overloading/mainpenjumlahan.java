/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author WIN X
 */
public class mainpenjumlahan {
    public static void main(String[] args){
        int x1=10, x2=15;
        double y1=10.5, y2=15.8;
        penjumlahan P= new penjumlahan();
        System.out.println(x1+" + "+x2+" = "+P.jumlah(x1,x2));
        System.out.println(y1+" + "+y2+" = "+P.jumlah(y1,y2));
    }
}

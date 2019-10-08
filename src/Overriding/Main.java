/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author WIN X
 */
public class Main {
    public static void main(String[] args) {
        dosen P;
        rektor rek = new rektor("Andi","885230202","Informatika",2006,2);
        dekan dek = new dekan("Ahmad","995230101","T. Kimia","TI");
        kalab lab = new kalab("Indah","035230302","Informatika","KSC");
        
        P=rek;
        P.view();
        P=dek;
        P.view();
        P=lab;
        P.view();
    }
}

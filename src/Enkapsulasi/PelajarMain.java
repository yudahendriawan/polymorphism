
package Enkapsulasi;

import java.util.Scanner;

public class PelajarMain {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan NIP    : ");
        String nip = input.next();
        System.out.print("Masukkan Nama   : ");
        String nama = input.next();
        System.out.print("Nilai Ujian 1   : ");
        double nilai1 = input.nextDouble();
        System.out.print("Nilai Ujian 2   : ");
        double nilai2 = input.nextDouble();
        System.out.print("Nilai Tugas     : ");
        double nilai = input.nextDouble();
        Pelajar student = new Pelajar();
        student.setNip(nip);
        student.setNama(nama);
        student.setNilaiUjian1(nilai1);
        student.setNilaiUjian2(nilai2);
        student.setNilaiTugas(nilai);
        student.info();
    }    
}

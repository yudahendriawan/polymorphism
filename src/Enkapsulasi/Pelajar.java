package Enkapsulasi;
public class Pelajar {
    private String nip;
    private String nama;
    private double nilaiUjian1, nilaiUjian2, nilaiTugas, nilaiakhir;
    public void setNip(String nomor){
        nip = nomor;
    }
    public String getNip(){
        return nip;
    }
    public void setNama(String name){
        nama = name;
    }
    public String getNama(){
        return nama;
    }
    public void setNilaiUjian1(double nilai1){
        nilaiUjian1 = nilai1;
    }
    public double getNilaiUjian1(){
        return nilaiUjian1;
    }
    public void setNilaiUjian2(double nilai2){
        nilaiUjian2 = nilai2;
    }
    public double getNilaiUjian2(){
        return nilaiUjian2;
    }
    public void setNilaiTugas(double nilai){
        nilaiTugas = nilai;
    }
    public double getNilaiTugas(){
        return nilaiTugas;
    }
    public void setNilaiAkhir(double akhir){
        nilaiakhir = akhir;
    }
    public double nilaiAkhir(){
        return nilaiakhir=(nilaiUjian1+nilaiUjian2+nilaiTugas)/3;
    }
    public String isLulus(){
        if(nilaiakhir>=60&&nilaiakhir<=100)
            return "Anda Lulus";
        else
            return "Anda Tidak Lulus";
    }
    public void info(){
        System.out.println("NIP             : "+getNip());
        System.out.println("Nama            : "+getNama());
        System.out.println("Nilai Ujian 1   : "+getNilaiUjian1());
        System.out.println("Nilai Ujian 2   : "+getNilaiUjian2());
        System.out.println("Nilai Tugas     : "+getNilaiTugas());
        System.out.println("Nilai Akhir     : "+nilaiAkhir());
        System.out.println(isLulus());
    }
}

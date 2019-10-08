package Enkapsulasi;

public class Buku {
    private String namaPengarang, judulBuku;
    private int tahunTerbit;
    private int cetakanKe;
    private double hargaJual;
    
    public void infoBuku(){
        System.out.println("Nama Pengarang  : "+getNamaPengarang());
        System.out.println("Judul Buku      : "+getJudulBuku());
        System.out.println("Cetakan Ke      : "+getCetakanKe());
        System.out.println("Tahun Terbit    : "+getTahunTerbit());
        System.out.println("Harga Jual      : "+getHargaJual());
    }

    public Buku(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe, double hargaJual) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
    }
    public Buku(){
        
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public int getCetakanKe() {
        return cetakanKe;
    }

    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setCetakanKe(int cetakanKe) {
        this.cetakanKe = cetakanKe;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public String getJudulBuku() {
        return judulBuku;
    }
}

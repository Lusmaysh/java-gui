package main;

public class Produk {
    private String nama;
    private double harga;
    private int stok;
    private String kategori;

    public Produk(String nama, double harga, int stok, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    public String getInfo(){
        return "nama: "+nama+
                "harga: "+harga+
                "stok: "+stok+
                "kategori: "+kategori; 
    }
}

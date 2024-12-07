package main;

public class BukuCetak extends Buku{
    private int jumlahHalaman;

    public BukuCetak(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Jumlah Halaman: "+ jumlahHalaman; //To change body of generated methods, choose Tools | Templates.
    }
       
}

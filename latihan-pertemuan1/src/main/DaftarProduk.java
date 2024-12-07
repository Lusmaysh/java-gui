package main;

import java.util.ArrayList;

public class DaftarProduk {
    private ArrayList<Produk> daftarProduk;
    
    public DaftarProduk(ArrayList<Produk> daftarProduk){
        this.daftarProduk = daftarProduk;
    }
    
    public void tambahProduk(Produk x){
        daftarProduk.add(x);
    }
    
    public void tampilkanProduk(){
        for(Produk x : daftarProduk){
            System.out.println("Nama: "+ x.getNama()+
                    ", Harga: " +x.getHarga()+
                    ", Stok: " +x.getStok()+
                    ", Kategori: " +x.getKategori()
            );
        }
    }
}

package main;

import java.util.ArrayList;

public class DaftarBuku {
    private ArrayList<Buku> daftarBuku;

    public DaftarBuku(ArrayList<Buku> daftarBuku) {
        this.daftarBuku = daftarBuku;
    }

    public void tambahBuku(Buku b){
        daftarBuku.add(b);
    }
    
    public void tampilkanBuku(){
        for(Buku b : daftarBuku){
            System.out.println("Judul : "+ b.getJudul()+
                    ", Penulis : " +b.getPenulis());
        }
    }
}

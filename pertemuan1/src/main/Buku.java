package main;

public class Buku {
//    deklarasi variabel
    private String judul;
    private String penulis;
    
//    construktor
    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
    
//    getter dan setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public String getInfo(){
        return "Judul : "+judul+
               ", Penulis : "+penulis;
    }
    
}

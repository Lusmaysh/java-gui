package main;
import java.util.ArrayList;
import java.util.Scanner;
//DaftarBuku.java

public class App {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        ArrayList list = new ArrayList();
        String ulang = "y";
        System.out.println("Aplikasi Input Buku");
        while (ulang.equalsIgnoreCase("y")) {
            System.out.println("Input judul buku: ");
            String judul = input.nextLine();
            System.out.println("Input penulis: ");
            String penulis  = input.nextLine();
            Buku bukuKu = new Buku(judul, penulis);
            
            DaftarBuku daftarBuku = new DaftarBuku(list);
            daftarBuku.tambahBuku(bukuKu);
            daftarBuku.tampilkanBuku();
            
            System.out.println("input ulang (Y/N)");
            ulang = input.nextLine();
        }
    }
}

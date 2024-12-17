package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        ArrayList list = new ArrayList();
        String ulang = "y";
        System.out.println("Aplikasi Input Produk");
        
        while (ulang.equalsIgnoreCase("y")) {
            
            System.out.println("Input nama produk: ");
            String nama = input.nextLine();
            System.out.println("Input harga: ");
            double harga = Double.parseDouble(input.nextLine());
            System.out.println("Input stok: ");
            int stok  = Integer.parseInt(input.nextLine());
            System.out.println("Input kategori: ");
            String kategori  = input.nextLine();
            
            Produk prod = new Produk(nama, harga, stok, kategori);
            
            DaftarProduk daftarProduk = new DaftarProduk(list);
            daftarProduk.tambahProduk(prod);
            daftarProduk.tampilkanProduk();
            
            System.out.println("input ulang (Y/N)");
            ulang = input.nextLine();
        }
    }
    
}

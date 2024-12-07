/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author PC
 */
public class App2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku buku1 = new BukuCetak("Pemrograman Java", "Saya", 23);
        Buku buku2 = new BukuDigital("Ayonima", "budiono", 1000);
        
        System.out.println(buku1.getInfo());
        System.out.println(buku2.getInfo());
    }
    
}

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
public class BukuDigital extends Buku{
    private double ukuranFile;

    public BukuDigital(String judul, String penulis, double ukuranFile) {
        super(judul, penulis);
        this.ukuranFile = ukuranFile;
    }

    public double getUkuranFile() {
        return ukuranFile;
    }

    public void setUkuranFile(double ukuranFile) {
        this.ukuranFile = ukuranFile;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+", Ukuran File: "+ukuranFile+" MB"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

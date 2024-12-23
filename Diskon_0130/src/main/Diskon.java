/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Microsoft
 */
public class Diskon {
    private double num1;
    private double num2;
    private double hasil;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double hitung()
    {
        if(num1 == 0)
        {
            throw new ArithmeticException("Harga awal tidak boleh nol!");
        }
        if(num2 > 100)
        {
            throw new ArithmeticException("Persentase diskon tidak boleh lebih dari 100%");
        }
        hasil = num1 * (num2/100);
        hasil = num1 - hasil;
        return hasil;
    }
}

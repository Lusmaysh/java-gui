package Main;

public class Kalkulator {
    
    private double angka1;
    private double angka2;
    private double hasil;

    public double getAngka1() {
        return angka1;
    }

    public void setAngka1(double angka1) {
        this.angka1 = angka1;
    }

    public double getAngka2() {
        return angka2;
    }

    public void setAngka2(double angka2) {
        this.angka2 = angka2;
    }
    
    public double tambah()
    {
        hasil = angka1+angka2;
        return hasil;
    }
    
    public double kurang(){
        hasil = angka1-angka2;
        return hasil;
    }
    
    public double kali(){
        hasil = angka1*angka2;
        return hasil;
    }
    
    public double bagi(){
        if(angka2==0){
            throw new ArithmeticException("Pembagi tidak boleh nol");
        }
        hasil = angka1/angka2;
        return hasil;
    }
    
    
}

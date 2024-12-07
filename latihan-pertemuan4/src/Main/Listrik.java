package Main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Listrik {
    
    private String nama;
    private String idPelanggan;
    private String daya;
    private double nominal;
    private double ppn;
    private double angs;
    private double jumlahKwh;
    private double admin;
    private double total;
    private double a;

    public Listrik() {
        this.admin = 2000.0; // Nilai default untuk admin
        this.angs = 0.0;
        this.ppn = 0.0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getDaya() {
        return daya;
    }

    public void setDaya(String daya) {
        this.daya = daya;
    }

    public double getNominal() {
        return nominal;
    }

    public void setNominal(double nominal) {
        this.nominal = nominal;
    }

    public double getPpn() {
        return ppn;
    }

    public void setPpn(double ppn) {
        this.ppn = ppn;
    }

    public double getAngs() {
        return angs;
    }

    public void setAngs(double angs) {
        this.angs = angs;
    }

    public double getJumlahKwh() {
        a = nominal / 1000;
        jumlahKwh = a * 63 / 100;
        System.out.println(jumlahKwh);
        return jumlahKwh;
    }

    public void setJumlahKwh(double jumlahKwh) {
        this.jumlahKwh = jumlahKwh;
    }

    public double getAdmin() {
        return admin; // Getter untuk admin
    }

    public void setAdmin(double admin) {
        this.admin = admin; // Setter untuk admin
    }

    public double getTotal() {
        total = nominal + admin;
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    // Method untuk mendapatkan formatted date time
    public static String getDateTime() {
        // Mengambil tanggal dan waktu saat ini
        LocalDateTime currentDateTime = LocalDateTime.now();
        
        // Format sesuai kebutuhan
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss '(CU)'");
        return currentDateTime.format(formatter);
    }
    
    public static String generateRandomCode() {
        Random random = new Random();
        StringBuilder codeBuilder = new StringBuilder();

        for (int s = 0; s < 5; s++)
        {
            for (int i = 0; i < 4; i++) {
                // Tambahkan 4 angka acak
                codeBuilder.append(random.nextInt(10));
            }
            // Tambahkan pemisah '-'
            codeBuilder.append('-');
        }
        
        // remove last dash
        codeBuilder.deleteCharAt(codeBuilder.length() -1 );
        
        System.out.println(codeBuilder.toString());
        return codeBuilder.toString();
    }
}

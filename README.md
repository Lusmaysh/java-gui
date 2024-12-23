
# Tutorial Menambahkan Library MySQL Connector/J di Apache NetBeans

Tutorial ini akan memandu Anda untuk menambahkan library **MySQL Connector/J** ke Apache NetBeans agar dapat terhubung dengan database MySQL di proyek Java Anda.

## Langkah-langkah:

### 1. Unduh dan Instal Bahan-bahan

Pertama, Anda perlu mengunduh **MySQL Connector/J** dari tautan berikut:

[Unduh MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)

Ikuti langkah-langkah berikut:

- Pilih versi terbaru dari **MySQL Connector/J**.
- Pilih **Platform Independent**
- Klik **Download** dan pilih **No thanks, just start my download** di halaman donasi MySQL.

### 2. Ekstrak File dan Pindahkan `jar`

Setelah unduhan selesai, Anda akan mendapatkan file ZIP yang berisi **MySQL Connector/J**.

- Ekstrak file ZIP tersebut.
- Di dalam folder hasil ekstraksi, Anda akan menemukan file dengan ekstensi `.jar`. Contohnya: `mysql-connector-java-x.x.x.jar`.

  Pindahkan file `.jar` tersebut ke folder instalasi utama NetBeans di dalam drive C. Biasanya, letaknya di:

  ```
  C:\Program Files\NetBeans x.x.x\platform\modules
  ```
  **(Gantilah `x.x.x` dengan versi NetBeans Anda).**

### 3. Tambahkan Library ke NetBeans

Sekarang kita akan menambahkan library MySQL Connector/J ke NetBeans.

1. **Buka Apache NetBeans** di komputer Anda.
2. Di **Proyek** (Projects), klik kanan pada folder **Libraries** proyek Java Anda.
3. Klik tombol **Add Library**.
4. Klik **Create...** (jika belum ada library MySQL Connector/J sebelumnya).
5. Beri nama library tersebut, misalnya **MySQL Connector/J**.
6. Klik **Add JAR/Folder**.
7. Cari file `mysql-connector-java-x.x.x.jar` yang telah Anda pindahkan ke folder NetBeans sebelumnya.
8. Klik **OK** dan **Add Library**.

### 4. Verifikasi Library

Setelah menambahkan library, Anda bisa memverifikasinya dengan melakukan hal berikut:

1. Kembali ke proyek Java Anda.
2. Buka kelas atau file Java yang berisi kode koneksi ke MySQL.
3. Tambahkan baris import untuk `java.sql.*` dan `com.mysql.jdbc.*`.

Contoh:
```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nama_database";
        String user = "root";
        String password = "password";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }
}
```

Jika tidak ada error dan koneksi berhasil, maka Anda telah berhasil menambahkan MySQL Connector/J ke NetBeans.

---

### Selesai!

Dengan mengikuti langkah-langkah di atas, Anda sekarang sudah bisa menggunakan **MySQL Connector/J** di proyek Java Anda di Apache NetBeans. Jika Anda mengalami masalah, pastikan bahwa Anda menggunakan versi yang tepat dari MySQL Connector/J dan Apache NetBeans.

---

**Catatan:**
- Jika ada perubahan versi dari MySQL Connector/J atau NetBeans, pastikan untuk selalu menggunakan versi yang kompatibel agar tidak terjadi error saat proses integrasi.

Semoga berhasil! 😄

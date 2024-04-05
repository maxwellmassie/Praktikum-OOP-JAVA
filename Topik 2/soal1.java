// Pada suatu perusahaan jasa pengiriman paket, tarif pengiriman ditentukan berdasarkan tabel berikut:

// tablenya gabisa dicopy ygy

// Tarif pengiriman per km tidak di-proratakan, namun dibulatkan ke bawah. Sebagai contoh, paket dengan berat 3 kg dan dikirimkan sejauh 5.7 km dihitung dengan tarif untuk jarak 5 km, sehingga tarif pengiriman paket tersebut adalah Rp. 15.000,-.

// Tuliskan program yang meminta pengguna untuk memasukkan berat barang dalam kg dan jarak pengiriman dalam km, lalu menghitung tarif biaya pengiriman, dan menampilkan tarif tersebut.

// Contoh output program yang diharapkan adalah seperti berikut:

// Masukkan berat paket Anda (kg): 7.8
// Masukkan jarak pengiriman (km): 2.5
// Tarif Pengiriman = Rp.10,000.00
// Angka yang dicetak biru pada output di atas adalah input dari pengguna.

// Catatan:

// Perhatikan bahwa terdapat sebuah spasi setelah tanda titik dua pada setiap prompt.
// Asumsikan pengguna selalu menginput nilai positif (>= 0).

import java.util.Scanner;

public class TarifPengiriman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan berat paket Anda (kg): ");
        double berat = scanner.nextDouble();
        
        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarak = scanner.nextDouble();
        
        double tarif = hitungTarif(berat, jarak);
        
        System.out.printf("Tarif Pengiriman = Rp.%,.2f\n", tarif);
        
        scanner.close();
    }
    
    public static double hitungTarif(double berat, double jarak) {
        double tarifPerKm;
        
        if (berat <= 2) {
            tarifPerKm = 1500;
        } else if (berat <= 6) {
            tarifPerKm = 3000;
        } else if (berat <= 10) {
            tarifPerKm = 5000;
        } else {
            tarifPerKm = 5500;
        }
        
        double totalTarif = Math.floor(jarak) * tarifPerKm;
        
        return totalTarif;
    }
}


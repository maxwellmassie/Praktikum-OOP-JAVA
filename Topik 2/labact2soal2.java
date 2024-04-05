//soal act
// Tuliskan sebuah program penjualan tiket bioskop dalam jumlah terbatas dengan ketentuan penjualan seperti berikut:

// Tiket yang dijual sebanyak 10 tiket.
// Pembeli dapat membeli tiket dengan banyak pembelian maksimum sebanyak 4 tiket.  
// Program melakukan hal-hal berikut:

// Meminta pengguna untuk memasukkan banyak pembelian tiket dari setiap pembeli lalu mencetak pesan yang memberitahukan jumlah tiket yang tersisa. 
// Jika pengguna memasukkan pembelian tiket lebih dari 4 tiket, program menampilkan pesan yang memberitahukan banyak maksimum pembelian adalah 4, lalu meminta kembali banyak pembelian tiket.
// Jika pengguna memasukkan pembelian tiket lebih dari sisa tiket yang tersedia, program menampilkan pesan bahwa sisa tiket tidak cukup untuk pembelian, lalu meminta kembali banyak pembelian tiket.
// Ulangi sampai semua tiket habis terjual.
// Contoh output program yang diharapkan adalah seperti berikut:

// Contoh 1 (Pengguna memasukkan jumlah tiket sesuai batas pembelian tiket per orang)

// Masukkan jumlah tiket yang ingin dibeli: 2
// Anda membeli sebanyak 2 tiket.
// Sisa tiket yang tersedia: 8
// Masukkan jumlah tiket yang ingin dibeli: 4
// Anda membeli sebanyak 4 tiket.
// Sisa tiket yang tersedia: 4
// Masukkan jumlah tiket yang ingin dibeli: 3
// Anda membeli sebanyak 3 tiket.
// Sisa tiket yang tersedia: 1
// Masukkan jumlah tiket yang ingin dibeli: 1
// Anda membeli sebanyak 1 tiket.
// Semua tiket telah terjual kepada 4 pembeli.
// Contoh 2 (Pengguna memasukkan jumlah tiket lebih dari batas pembelian tiket per orang)

// Masukkan jumlah tiket yang ingin dibeli: 4
// Anda membeli sebanyak 4 tiket.
// Sisa tiket yang tersedia: 6
// Masukkan jumlah tiket yang ingin dibeli: 5
// Anda tidak bisa membeli lebih dari 4 tiket.
// Masukkan jumlah tiket yang ingin dibeli: 1
// Anda membeli sebanyak 1 tiket.
// Sisa tiket yang tersedia: 5
// Masukkan jumlah tiket yang ingin dibeli: 3
// Anda membeli sebanyak 3 tiket.
// Sisa tiket yang tersedia: 2
// Masukkan jumlah tiket yang ingin dibeli: 2
// Anda membeli sebanyak 2 tiket.
// Semua tiket telah terjual kepada 4 pembeli.
// Contoh 3 (Pengguna memasukkan jumlah tiket lebih dari jumlah tiket yang tersedia)

// Masukkan jumlah tiket yang ingin dibeli: 4
// Anda membeli sebanyak 4 tiket.
// Sisa tiket yang tersedia: 6
// Masukkan jumlah tiket yang ingin dibeli: 3
// Anda membeli sebanyak 3 tiket.
// Sisa tiket yang tersedia: 3
// Masukkan jumlah tiket yang ingin dibeli: 4
// Maaf, sisa tiket yang tersisa adalah 3 tiket.
// Masukkan jumlah tiket yang ingin dibeli: 3
// Anda membeli sebanyak 3 tiket.
// Semua tiket telah terjual kepada 3 pembeli.
// Teks yang dicetak biru adalah input dari pengguna.


// Catatan:

// Pastikan program meminta input kembali dari pengguna ketika tiket yang dibeli lebih dari pembelian maksimum per orang atau ketika tiket yang ingin dibeli lebih dari jumlah sisa tiket yang tersedia.

// berikut kodennya

import java.util.Scanner;

public class PenjualanTiket {

    private static final int TOTAL_TIKET = 10;
    private static final int MAX_PEMBELIAN_PER_ORANG = 4;
    private static int sisaTiket = TOTAL_TIKET;
    private static int jumlahPembeli = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (sisaTiket > 0) {
            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            int jumlahTiketDibeli = scanner.nextInt();

            if (jumlahTiketDibeli > MAX_PEMBELIAN_PER_ORANG) {
                System.out.println("Anda tidak bisa membeli lebih dari " + MAX_PEMBELIAN_PER_ORANG + " tiket.");
                continue;
            } else if (jumlahTiketDibeli > sisaTiket) {
                System.out.println("Maaf, sisa tiket yang tersisa adalah " + sisaTiket + " tiket.");
                continue;
            }

            sisaTiket -= jumlahTiketDibeli;
            jumlahPembeli++;

            System.out.println("Anda membeli sebanyak " + jumlahTiketDibeli + " tiket.");

            if (sisaTiket > 0) {
                System.out.println("Sisa tiket yang tersedia: " + sisaTiket);
            } else {
                System.out.println("Semua tiket telah terjual kepada " + jumlahPembeli + " pembeli.");
            }
        }
    }
}
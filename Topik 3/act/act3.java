// Modifikasi class RekeningBank di bawah seperti berikut:

// Tambahkan sebuah field static noRekTerakhir yang digunakan untuk merekam nomor rekening yang telah terpakai. Field ini digunakan untuk menetapkan field nomorRekening. Inisialisasi field ini ke 1000.
// Tambahkan sebuah field instance nomorRekening bertipe int untuk menyimpan nomor rekening. Nilai field ini ditetapkan berdasarkan nilai field noRekTerakhir. 
// Tambahkan sebuah method instance getNomorRekening yang mengembalikan nomor rekening.
// Modifikasi kedua constructor sehingga selain menetapkan saldo dari rekening juga menetapkan nomor rekening berdasarkan field noRekTerakhir. Constructor harus membuat object pertama dengan nomor rekening 1001, object kedua dengan nomor rekening 1002, dan seterusnya.
// Berikut adalah kode yang memperlihatkan penggunaan class RekeningBank setelah ditambahkan hal-hal di atas:

// RekeningBank rek1 = new RekeningBank();
// rek1.setSaldo(2500000);
// RekeningBank rek2 = new RekeningBank(3750000);
// RekeningBank rek3 = new RekeningBank(7500000);

// System.out.printf("Saldo rekening no. %d = Rp.%,.2f\n", 
//                 rek1.getNomorRekening(), rek1.getSaldo());
// System.out.printf("Saldo rekening no. %d = Rp.%,.2f\n", 
//                 rek2.getNomorRekening(), rek2.getSaldo());
// System.out.printf("Saldo rekening no. %d = Rp.%,.2f\n", 
//                 rek3.getNomorRekening(), rek3.getSaldo());

// Kode di atas akan memberikan output seperti berikut:

// Saldo rekening no. 1001 = Rp.2,500,000.00
// Saldo rekening no. 1002 = Rp.3,750,000.00
// Saldo rekening no. 1003 = Rp.7,500,000.00

///jawabbb\\\
public class RekeningBank {
    private static int noRekTerakhir = 1000; // Field static untuk menyimpan nomor rekening terakhir
    private int nomorRekening; // Field instance untuk menyimpan nomor rekening
    private double saldo; // Saldo rekening

    // Constructor tanpa argument
    public RekeningBank() {
        noRekTerakhir++; // Menaikkan nomor rekening terakhir
        this.nomorRekening = noRekTerakhir; // Menetapkan nomor rekening baru
        saldo = 0.0;
    }

    // Constructor dengan saldo awal
    public RekeningBank(double saldoAwal) {
        noRekTerakhir++; // Menaikkan nomor rekening terakhir
        this.nomorRekening = noRekTerakhir; // Menetapkan nomor rekening baru
        saldo = saldoAwal;
    }

    // Method untuk menambah saldo
    public void deposit(double jumlah) {
        saldo += jumlah;
    }

    // Method untuk menarik saldo
    public void withdraw(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
        } else {
            System.out.println("Dana tidak mencukupi.");
        }
    }

    // Method setter untuk saldo
    public void setSaldo(double s) {
        saldo = s;
    }

    // Method getter untuk saldo
    public double getSaldo() {
        return saldo;
    }

    // Method getter untuk nomor rekening
    public int getNomorRekening() {
        return nomorRekening;
    }

    // Main method untuk pengujian
    public static void main(String[] args) {
        RekeningBank rek1 = new RekeningBank();
        rek1.setSaldo(2500000);
        RekeningBank rek2 = new RekeningBank(3750000);
        RekeningBank rek3 = new RekeningBank(7500000);

        System.out.printf("Saldo rekening no. %d = Rp%,.2f\n",
                rek1.getNomorRekening(), rek1.getSaldo());
        System.out.printf("Saldo rekening no. %d = Rp%,.2f\n",
                rek2.getNomorRekening(), rek2.getSaldo());
        System.out.printf("Saldo rekening no. %d = Rp%,.2f\n",
                rek3.getNomorRekening(), rek3.getSaldo());
    }
}

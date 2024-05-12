// Pada kotak jawaban terdapat definisi class RekeningBank. 
// Tambahkan method toString pada class tersebut yang menampilkan informasi rekening bank dan
//  method equals yang membandingkan nilai-nilai field pada dua object RekeningBank. 
//  Sebagai contoh, misalkan terdapat kode berikut:

// RekeningBank rek1 = new RekeningBank("102345", 1500000);
// RekeningBank rek2 = new RekeningBank("234567", 1500000);
// RekeningBank rek3 = new RekeningBank("102345", 1500000);
// System.out.println(rek1);
// System.out.println(rek1.equals(rek2));
// System.out.println(rek1.equals(rek3));
// Kode di atas akan memberikan output seperti berikut:

// 102345, 1500000.0
// false
// true

//jawab//

public class RekeningBank {
    private String nomorRekening;
    private double saldo;

    public RekeningBank(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    // [1] Method toString untuk menampilkan informasi rekening bank
    public String toString() {
        return nomorRekening + ", " + saldo;
    }

    // [2] Method equals untuk membandingkan dua objek RekeningBank
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        RekeningBank rek = (RekeningBank) obj;
        return Double.compare(rek.saldo, saldo) == 0 &&
                nomorRekening.equals(rek.nomorRekening);
    }

    public static void main(String[] args) {
        RekeningBank rek1 = new RekeningBank("102345", 1500000);
        RekeningBank rek2 = new RekeningBank("234567", 1500000);
        RekeningBank rek3 = new RekeningBank("102345", 1500000);

        System.out.println(rek1);
        System.out.println(rek1.equals(rek2));
        System.out.println(rek1.equals(rek3));
    }
}

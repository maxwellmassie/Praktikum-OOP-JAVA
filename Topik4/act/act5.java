// Class RekeningBank didefinisikan seperti berikut:

// public class RekeningBank
// {
//     private String nomorRekening;
//     private double saldo;
    
//     public RekeningBank(String nomorRekening, double saldo)
//     {
//         this.nomorRekening = nomorRekening;
//         this.saldo = saldo;
//     }

//     public String getNomorRekening()
//     {
//         return nomorRekening;
//     }
    
//     public double getSaldo()
//     {
//         return saldo;
//     }

//     public void setSaldo(double saldo)
//     {
//         this.saldo = saldo;
//     }

//     public void deposit(double jumlah)
//     {
//         saldo = saldo + jumlah;
//     }

//     public void withdraw(double jumlah)
//     {
//         if (saldo >= jumlah)
//         {
//             saldo = saldo - jumlah;
//         } 
//         else
//         {
//             System.out.println("Dana tidak mencukupi.");
//         }
//     }
// }
// Tuliskan sebuah class RekeningMinMax yang mengekstensi class RekeningBank yang mempunyai tambahan dua field untuk mengingat saldo minimum dan saldo maksimum yang pernah terekam dalam rekening. Class RekeningMinMax memiliki member-member berikut:

// Field saldoMax bertipe double yang digunakan untuk merekam saldo minimum dari rekening.
// Field saldoMin bertipe double yang digunakan untuk merekam saldo maksimum dari rekening.
// Sebuah constructor yang menerima dua argument untuk nomor rekening dan saldo awal.
// Method getSaldoMax yang mengembalikan nilai field saldoMax.
// Method getSaldoMin yang mengembalikan nilai field saldoMin.
// Method deposit yang meng-overriding method deposit superclass. Method deposit menerima sebuah argument berupa jumlah uang yang dimasukkan ke rekening dan menetapkan nilai saldo setelah proses deposit. Method ini juga memodifikasi nilai field saldoMax jika saldo setelah uang yang dimasukkan lebih besar dari saldo maksimum sebelumnya.
// Method withdraw yang meng-overriding method withdraw superclass. Method withdraw menerima sebuah argument berupa jumlah uang yang ditarik dari rekening dan menetapkan nilai saldo setelah proses withdraw. Method ini juga memodifikasi nilai field saldoMin jika saldo setelah uang ditarik lebih kecil dari saldo minimum sebelumnya.
// Kode berikut mencontohkan penggunaan class RekeningMinMax:

// RekeningMinMax rek = new RekeningMinMax("123456", 1500000);
// System.out.printf("Nomor Rekening: %s, Saldo Awal: Rp.%,.2f\n",
//                     rek.getNomorRekening(), rek.getSaldo());
// rek.deposit(250000);
// rek.withdraw(750000);
// rek.withdraw(500000);
// rek.withdraw(250000);
// rek.deposit(250000);
// System.out.printf("Saldo: Rp.%,.2f\n", rek.getSaldo());
// System.out.printf("Saldo Max: Rp.%,.2f\n", rek.getSaldoMax());
// System.out.printf("Saldo Min: Rp.%,.2f\n", rek.getSaldoMin());
// rek.withdraw(800000);
// Kode di atas akan memberikan output:

// Nomor Rekening: 123456, Saldo Awal: Rp.1,500,000.00
// Saldo: Rp.500,000.00
// Saldo Max: Rp.1,750,000.00
// Saldo Min: Rp.250,000.00
// Dana tidak mencukupi.

//jawab//

public class RekeningMinMax extends RekeningBank {
    private double saldoMax;
    private double saldoMin;

    public RekeningMinMax(String nomorRekening, double saldo) {
        super(nomorRekening, saldo);
        saldoMax = saldo;
        saldoMin = saldo;
    }

    public double getSaldoMax() {
        return saldoMax;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    @Override
    public void deposit(double jumlah) {
        super.deposit(jumlah);
        if (getSaldo() > saldoMax) {
            saldoMax = getSaldo();
        }
    }

    @Override
    public void withdraw(double jumlah) {
        super.withdraw(jumlah);
        if (getSaldo() < saldoMin) {
            saldoMin = getSaldo();
        }
    }
}

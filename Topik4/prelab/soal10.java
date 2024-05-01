// Class Pegawai didefinisikan seperti berikut:

// public class Pegawai 
// {
//     private String nama;
//     private double gajiPokok;
    
//     public Pegawai(String nama, double gajiPokok)
//     {
//         this.nama = nama;
//         this.gajiPokok = gajiPokok;
//     }
    
//     public String getNama()
//     {
//         return nama;
//     }

//     public double getGaji()
//     {
//         return gajiPokok;
//     }
// }
// Tuliskan sebuah class Manager yang mengekstensi class Pegawai dengan menambahkan field bonus dan method getGaji yang mengoverriding method dengan nama yang sama pada class Pegawai. Method getGaji pada class Manager mengembalikan gaji pokok ditambah bonus.

// Kode berikut mencontohkan penggunaan class Manager:

// Manager mgr = new Manager("Budi", 5000000, 2500000);
// System.out.println("Manager:");
// System.out.println("Nama: " + mgr.getNama());
// System.out.printf("Gaji: Rp.%,.2f\n", mgr.getGaji());
// Output dari kode di atas:

// Manager:
// Nama: Budi
// Gaji: Rp.7,500,000.00

//JAWAB//

public class Manager extends Pegawai {
    private double bonus;

    public Manager(String nama, double gajiPokok, double bonus) {
        super(nama, gajiPokok); // Memanggil constructor dari superclass Pegawai
        this.bonus = bonus;
    }

    @Override
    public double getGaji() {
        return super.getGaji() + bonus; // Mengoverride method getGaji dari superclass
    }

    public static void main(String[] args) {
        Manager mgr = new Manager("Budi", 5000000, 2500000);
        System.out.println("Manager:");
        System.out.println("Nama: " + mgr.getNama());
        System.out.printf("Gaji: Rp.%,.2f\n", mgr.getGaji());
    }
}

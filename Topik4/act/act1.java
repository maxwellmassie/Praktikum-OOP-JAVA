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
// Tuliskan sebuah class PegawaiHonorer yang mengekstensi class Pegawai dengan menambahkan dua field bertipe double: field honorPerJam dan field jamKerja. Class PegawaiHonorer juga memiliki method getGaji yang mengoverriding method dengan nama yang sama pada superclassnya. Method getGaji pada class PegawaiHonorer mengembalikan hasil kali honorPerJam dan jamKerja.

// Kode berikut mencontohkan penggunaan class PegawaiHonorer:

// PegawaiHonorer staff = new PegawaiHonorer("Herman Winardi", 150000, 45.5);
// System.out.println("Pegawai Honorer: ");
// System.out.println("Nama: " + staff.getNama());
// System.out.printf("Gaji: Rp.%,.2f\n", staff.getGaji());
// Output dari kode di atas:

// Pegawai Honorer: 
// Nama: Herman Winardi
// Gaji: Rp.6,825,000.00

//Jawab//

public class PegawaiHonorer extends Pegawai {

    private double honorPerJam, jamKerja;

 

    public PegawaiHonorer(String nama, double honorPerJam, double jamKerja){

        super(nama, honorPerJam);

 

        this.honorPerJam = honorPerJam;

        this.jamKerja = jamKerja;

    }

 

    @Override

    public double getGaji(){

        return honorPerJam * jamKerja;

    }

}

//by rincember
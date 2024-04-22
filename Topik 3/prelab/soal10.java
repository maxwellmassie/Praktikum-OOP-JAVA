// Perhatikan definisi class bernama Mahasiswa berikut:

// public class Mahasiswa 
// {
//     private String nama;
//     private String email;

//     public Mahasiswa(String aNama, String aEmail)
//     {
//         nama = aNama;
//         email = aEmail;
//     }

//     public String getData()
//     {
//         return nama + ", " + email;
//     }
// }
// Tuliskan sebuah method static bernama buatMahasiswa yang meminta pengguna untuk memasukkan nama dan email dari mahasiswa dan mengembalikan object Mahasiswa dengan nama dan email dari input tersebut!

// Contoh kode yang memanggil method buatMahasiswa adalah sebagai berikut:

// Mahasiswa maba = buatMahasiswa();
// System.out.println("Mahasiswa: " + maba.getData());
// Kode di atas akan memberikan output seperti berikut:

// Masukkan nama: Budi Susilo
// Masukkan email: busilo@mail.com
// Mahasiswa: Budi Susilo, busilo@mail.com

//JAWABBBB

public static Mahasiswa buatMahasiswa() {

    Scanner input = new Scanner(System.in);

 

    System.out.print("Masukkan nama: ");

    String nama = input.nextLine();

 

    System.out.print("Masukkan email: ");

    String email = input.nextLine();

 

    return new Mahasiswa(nama, email);

}

//NO 10 BY RINCEMBER
// Misalkan terdapat class Mahasiswa yang didefinisikan seperti berikut:

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
// Lengkapi program di kotak jawaban sehingga program tersebut melakukan hal-hal berikut: 

// Membuat sebuah array Mahasiswa dengan lima elemen. 
// Meminta pengguna untuk memasukkan nama dan email untuk lima mahasiswa dan menyimpan masing-masing object mahasiswa dengan nama dan email yang diinput ke elemen-elemen array. 
// Menampilkan data lima mahasiswa.  
// Berikut adalah contoh output dari program yang diminta:

// Input mahasiswa ke-1:
// Nama: Budi Susilo
// Email: bususilo@mail.com
// Input mahasiswa ke-2:
// Nama: Panji Satria
// Email: panjisatria@mail.com
// Input mahasiswa ke-3:
// Nama: Anita Kartini
// Email: anita.k@gmail.com
// Input mahasiswa ke-4:
// Nama: Ines Tarigan
// Email: inestari@yahoo.com
// Input mahasiswa ke-5:
// Nama: Herman Yanto
// Email: hermanyanto@gmail.com

// Data Mahasiswa:
// 1. Budi Susilo, bususilo@mail.com
// 2. Panji Satria, panjisatria@mail.com
// 3. Anita Kartini, anita.k@gmail.com
// 4. Ines Tarigan, inestari@yahoo.com
// 5. Herman Yanto, hermanyanto@gmail.com

//jawabbbbb

import java.util.Scanner;

public class ArrayMahasiswa 
{
    public static void main(String[] args)
    {
        String nama;    // Untuk menyimpan input nama
        String email;   // Untuk menyimpan input email

        Scanner keyboard = new Scanner(System.in);

        // Buat sebuah array bertipe data Mahasiswa dengan lima elemen.
        // Referensikan array tersebut ke variabel mhs.
        
Mahasiswa[] mhs = new Mahasiswa[5];


        // Minta pengguna untuk memasukkan nama, tingkat, dan email
        // setiap mahasiswa.
        for (
int i = 0; i < mhs.length; i++
)
        {
            System.out.println("Input mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            nama = keyboard.nextLine();
            System.out.print("Email: ");
            email = keyboard.nextLine();
            // Buat object Mahasiswa untuk elemen array ke-i.
            
mhs[i] = new Mahasiswa(nama, email);

        }

        System.out.println();
        // Tampilkan data semua mahasiswa
        System.out.println("Data Mahasiswa: ");
        for (
int i = 0; i < mhs.length; i++
)
        {
            
System.out.println((i + 1) + ". " + mhs[i].getData());

        }
    }    
}
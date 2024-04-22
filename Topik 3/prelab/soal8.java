// Misalkan terdapat class BujurSangkar yang didefinisikan seperti berikut:

// public class BujurSangkar
// {
//     private double sisi;
  
//     public void setSisi(double panjang)
//     {
//         sisi = panjang;
//     }
    
//     public double getSisi()
//     {
//         return sisi;
//     }
    
//     public double getLuas()
//     {
//         return sisi * sisi;
//     }
// }
// Lengkapi program di kotak jawaban sehingga program tersebut membuat sebuah object dari class BujurSangkar,
// meminta pengguna untuk  memasukkan sisi bujur sangkar dan menetapkan nilai field sisi dari object BujurSangkar
// dengan  nilai yang dimasukkan pengguna, lalu menampilkan luas bujur sangkar.

//JAWAB

import java.util.Scanner;

public class TesBujurSangkar 
{
    public static void main(String[] args)
    {
        double sisi;    // Untuk menyimpan input dari pengguna.
        
        // Buat object Scanner untuk mendapatkan input pengguna.
        Scanner keyboard = new Scanner(System.in);

        // Buat sebuah object bujur sangkar dan referensikan ke variabel kotak.
        
BujurSangkar kotak = new BujurSangkar();

        
        // Minta pengguna memasukkan sisi bujur sangkar dan
        // simpan input pengguna ke variabel sisi.
        System.out.print("Masukkan sisi bujur sangkar: ");
        
sisi = keyboard.nextDouble();

        
        // Simpan nilai yang dimasukkan pengguna ke field sisi.
        
kotak.setSisi(sisi);

        
        // Tampilkan luas bujur sangkar.
        System.out.println("Luas bujur sangkar = " + kotak.getLuas());
    }        
}
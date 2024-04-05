// soal act
// Pada kotak jawaban terdapat program yang belum lengkap. Tugas Anda adalah melengkapi program tersebut dengan menuliskan method-method yang diperlukan. Program tersebut seharusnya bekerja seperti berikut: meminta pengguna untuk memasukkan masing-masing lima nilai ujian, menghitung rata-rata dari lima ujian, menampilkan nilai rata-rata tersebut, menghitung grade huruf dari nilai rata-rata, dan menampilkan grade huruf tersebut. 

// Program di kotak jawaban memerlukan dua method berikut:

// hitungRatarata - Method ini harus menerima lima nilai ujian sebagai argument dan mengembalikan nilai rata-rata ujian.
// tentukanGrade - Method ini harus menerima nilai ujian sebagai argument dan mengembalikan grade huruf nilai, berdasarkan skala penilaian berikut:
// Rentang Nilai	Grade Huruf
// nilai>=90
// A
// 90>nilai>=80
// B 
// 80>nilai>=70
// C
// 70>nilai>=60
// D
// nilai<60
// E


// Berikut adalah contoh output dari program lengkap yang diharapkan:

// Masukkan nilai ujian ke-1: 98.4
// Masukkan nilai ujian ke-2: 87.5
// Masukkan nilai ujian ke-3: 98.4
// Masukkan nilai ujian ke-4: 78.6
// Masukkan nilai ujian ke-5: 86.5
// Rata-rata nilai ujian = 89.88
// Grade Anda = B
// Teks yang dicetak biru adalah input dari pengguna.

// Catatan:

// Asumsikan pengguna selalu memasukkan input yang valid.
// Jangan ubah kode method main.

// berikut kodenya tp bukan kj ygy wkwkw

import java.util.Scanner;

public class NilaiUjian 
{
    // Method untuk menghitung rata-rata lima nilai ujian
    public static double hitungRatarata(double nilai1, double nilai2, double nilai3, double nilai4, double nilai5) 
    {
        return (nilai1 + nilai2 + nilai3 + nilai4 + nilai5) / 5;
    }

    // Method untuk menentukan grade berdasarkan nilai rata-rata
    public static char tentukanGrade(double ratarata) 
    {
        char grade;
        if (ratarata >= 90) {
            grade = 'A';
        } else if (ratarata >= 80) {
            grade = 'B';
        } else if (ratarata >= 70) {
            grade = 'C';
        } else if (ratarata >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        return grade;
    }

    /****************************************
     *  !!! JANGAN UBAH KODE DI BAWAH !!!   *
     ****************************************/
    public static void main(String[] args)
    {
        double nilai1;
        double nilai2;
        double nilai3;
        double nilai4;
        double nilai5;
        double ratarata;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian ke-1: ");
        nilai1 = keyboard.nextDouble();
        
        System.out.print("Masukkan nilai ujian ke-2: ");
        nilai2 = keyboard.nextDouble();

        System.out.print("Masukkan nilai ujian ke-3: ");
        nilai3 = keyboard.nextDouble();

        System.out.print("Masukkan nilai ujian ke-4: ");
        nilai4 = keyboard.nextDouble();

        System.out.print("Masukkan nilai ujian ke-5: ");
        nilai5 = keyboard.nextDouble();

        ratarata = hitungRatarata(nilai1, nilai2, nilai3, nilai4, nilai5);

        System.out.println("Rata-rata nilai ujian = " + ratarata);
        System.out.println("Grade Anda = " + tentukanGrade(ratarata));

    }
}

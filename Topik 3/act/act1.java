// Tulislah sebuah class bernama Mahasiswa yang mempunyai field-field private berikut:

// Field nama yang mereferensikan sebuah String yang menyimpan nama mahasiswa.
// Field totalSkor yang menyimpan total skor mahasiswa. Field ini bertipe data int.
// Field banyakKuis menyimpan banyaknya kuis yang diikuti oleh mahasiswa. Field ini bertipe data int.
// Class Mahasiswa memiliki sebuah constructor dan method-method berikut:

// Constructor yang menerima sebuah String sebagai argument dan menetapkannya ke field nama serta memberikan nilai 0 ke field totalSkor dan field banyakKuis.
// Method addSkor yang menerima sebuah argument dan menambahkan nilai argument tersebut ke field totalSkor dan menginkrementasi field banyakKuis.
// Method getNama yang mengembalikan nilai dari field nama.
// Method getTotalSkor mengembalikan nilai dalam field totalSkor.
// Method getAverageSkor mengembalikan nilai ekspresi aritmatika totalSkor / banyakKuis.
// Berikut adalah contoh kode yang menggunakan class Mahasiswa:

// Mahasiswa mahasiswa = new Mahasiswa("Harry Cooper");
// mahasiswa.addSkor(7);
// mahasiswa.addSkor(10);
// mahasiswa.addSkor(8);
// System.out.println("Nama mahasiswa: " + mahasiswa.getNama());
// System.out.println("Total skor: " + mahasiswa.getTotalSkor());
// System.out.println("Skor rata-rata: " + mahasiswa.getAverageSkor());
// Kode di atas akan memberikan output seperti berikut:

// Nama mahasiswa: Harry Cooper
// Total skor: 25
// Skor rata-rata: 8.333333333333334

///jawabbb\\\\

public class Mahasiswa {
    private String nama;
    private int totalSkor;
    private int banyakKuis;

    public Mahasiswa(String nama) {
        this.nama = nama;
        this.totalSkor = 0;
        this.banyakKuis = 0;
    }

    public void addSkor(int skor) {
        totalSkor += skor;
        banyakKuis++;
    }

    public String getNama() {
        return nama;
    }

    public int getTotalSkor() {
        return totalSkor;
    }

    public double getAverageSkor() {
        if (banyakKuis == 0) {
            return 0.0;
        }
        return (double) totalSkor / banyakKuis;
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Harry Cooper");
        mahasiswa.addSkor(7);
        mahasiswa.addSkor(10);
        mahasiswa.addSkor(8);
        System.out.println("Nama mahasiswa: " + mahasiswa.getNama());
        System.out.println("Total skor: " + mahasiswa.getTotalSkor());
        System.out.println("Skor rata-rata: " + mahasiswa.getAverageSkor());
    }
}

// Pada kotak jawaban terdapat sebuah class bernama Buku yang memerlukan sebuah constructor. Tambahkan sebuah constructor pada class Buku sehingga class ini dapat diinstansiasi menggunakan statement seperti berikut:

// Buku java = new Buku("Big Java", "Cay Horstmann", "Wiley", 250000);
// Pastikan constructor yang Anda tulis menerima sebuah argument untuk setiap field.

//JAWABAN
public class Buku {
    private String judul;
    private String penulis;
    private String penerbit;
    private int jumlahTerjual;

    // Constructor dengan parameter untuk setiap field
    public Buku(String judul, String penulis, String penerbit, int jumlahTerjual) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.jumlahTerjual = jumlahTerjual;
    }

    // Getter dan setter (jika diperlukan) dapat ditambahkan di sini
}

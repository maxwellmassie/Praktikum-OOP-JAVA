// Perhatikan definisi interface berikut:

// public interface BarangRitel
// {
//     public double getHargaRitel();
// }
// Tuliskan sebuah class bernama Buku yang mengimplementasikan interface BarangRitel!

// Berikut adalah contoh kode yang menggunakan class Buku:

// Buku novel = new Buku("Laskar Pelangi", "Andrea Hirata", 125000);
// System.out.println("Judul: " + novel.getJudul());
// System.out.println("Pengarang: " + novel.getPengarang());
// System.out.printf("Harga: Rp.%,.2f", novel.getHargaRitel());
// Output dari kode di atas:

// Judul: Laskar Pelangi
// Pengarang: Andrea Hirata
// Harga: Rp.125,000.00

///jawabbb////

public class Buku implements BarangRitel {
    private String judul;
    private String pengarang;
    private double hargaRitel;

    public Buku(String judul, String pengarang, double hargaRitel) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.hargaRitel = hargaRitel;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    @Override
    public double getHargaRitel() {
        return hargaRitel;
    }

    public static void main(String[] args) {
        Buku novel = new Buku("Laskar Pelangi", "Andrea Hirata", 125000);
        System.out.println("Judul: " + novel.getJudul());
        System.out.println("Pengarang: " + novel.getPengarang());
        System.out.printf("Harga: Rp%,.2f\n", novel.getHargaRitel());
    }
}

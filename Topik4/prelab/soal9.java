// Misalkan terdapat class Bangun dengan definisi seperti berikut:

// public class Bangun
// {
//     private double luas;
    
//     public void setLuas(double luas)
//     {
//         this.luas = luas;
//     }

//     public double getLuas()
//     {
//         return luas;
//     }
// }
// Class PersegiPanjang di bawah mengekstensi class Bangun dan didefinisikan seperti berikut:

// public class PersegiPanjang extends Bangun
// {
//     private double panjang;
//     private double lebar;

//     public PersegiPanjang(double panjang, double lebar)
//     {
//         this.panjang = panjang;
//         this.lebar = lebar;
//         setLuas(panjang * lebar);
//     }

//     public double getPanjang()
//     {
//         return panjang;
//     }

//     public double getLebar()
//     {
//         return lebar;
//     }
// }
// Tuliskan sebuah class bernama BujurSangkar yang mengekstensi class PersegiPanjang. Class BujurSangkar tidak menambahkan field apapun dan hanya mempunyai sebuah constructor yang menerima sebuah argument berupa panjang sisi dan menetapkan dua field panjang dan lebar dari class PersegiPanjang dengan nilai argument tersebut.

// Berikut adalah contoh kode yang menggunakan class BujurSangkar:

// BujurSangkar boks1 = new BujurSangkar(5.0);
// System.out.println("Sisi = " + boks1.getPanjang());
// System.out.println("Luas = " + boks1.getLuas());
// Output dari kode di atas:

// Sisi = 5.0
// Luas = 25.0

//JAWAB/

public class BujurSangkar extends PersegiPanjang {
    public BujurSangkar(double sisi) {
        super(sisi, sisi); // Memanggil constructor dari superclass PersegiPanjang
    }

    public static void main(String[] args) {
        BujurSangkar boks1 = new BujurSangkar(5.0);
        System.out.println("Sisi = " + boks1.getPanjang());
        System.out.println("Luas = " + boks1.getLuas());
    }
}

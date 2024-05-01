// Class AktivitasBernilai didefinisikan seperti berikut:

// public class AktivitasBernilai 
// {
//     private double skor;

//     public void setSkor(double s)
//     {
//         skor = s;
//     }

//     public double getSkor()
//     {
//         return skor;
//     }

//     public char getGrade()
//     {
//         char gradeHuruf;

//         if (skor >= 90)
//         {
//             gradeHuruf = 'A';
//         }
//         else if (skor >= 80)
//         {
//             gradeHuruf = 'B';
//         }
//         else if (skor >= 70)
//         {
//             gradeHuruf = 'C';
//         }
//         else if (skor >= 60)
//         {
//             gradeHuruf = 'D';
//         }
//         else
//         {
//             gradeHuruf = 'E';
//         }

//         return gradeHuruf;
//     }
// }
// Tulistlah sebuah class Essay yang mengekstensi class AktivitasBernilai dengan menambahkan field grammar, pekerjaan, panjangEssay, dan konten. Class Essay memiliki method-method mutator yang menyimpan nilai-nilai ke masing-masing field dan method-method accessor yang mengembalikan nilai-nilai dalam masing-masing field. Class Essay ini menentukan nilai yang didapatkan seorang siswa. Essay siswa memiliki nilai maksimal 100 dan bisa ditentukan pembagian nilainya seperti berikut:

// Grammar: 30 poin
// Pengejaan: 20 poin
// Kesesuaian panjang essay: 20 poin
// Konten: 30 poin
// Apabila nilai yang dimasukkan lebih dari poin-poin maksimal seperti di atas, maka poin tersebut akan ditetapkan ke 0.

// Kode berikut mencontohkan penggunaan class Essay:

// Essay nilai = new Essay(25, 15, 20, 25);
// System.out.println("Total skor: " + nilai.getSkor());
// System.out.println("Grade essay: " + nilai.getGrade());
// Output dari kode di atas:

// Total skor: 85.0
// Grade essay: B

//jawab//

public class Essay extends AktivitasBernilai {
    private double grammar;
    private double pengejaan;
    private double panjangEssay;
    private double konten;
    
    // Constructor
    public Essay(double grammar, double pengejaan, double panjangEssay, double konten) {
        setGrammar(grammar);
        setPengejaan(pengejaan);
        setPanjangEssay(panjangEssay);
        setKonten(konten);
        hitungSkor();
    }
    
    // Method mutator
    public void setGrammar(double grammar) {
        if (grammar > 30) {
            this.grammar = 0;
        } else {
            this.grammar = grammar;
        }
    }
    
    public void setPengejaan(double pengejaan) {
        if (pengejaan > 20) {
            this.pengejaan = 0;
        } else {
            this.pengejaan = pengejaan;
        }
    }
    
    public void setPanjangEssay(double panjangEssay) {
        if (panjangEssay > 20) {
            this.panjangEssay = 0;
        } else {
            this.panjangEssay = panjangEssay;
        }
    }
    
    public void setKonten(double konten) {
        if (konten > 30) {
            this.konten = 0;
        } else {
            this.konten = konten;
        }
    }
    
    // Method accessor
    public double getGrammar() {
        return grammar;
    }
    
    public double getPengejaan() {
        return pengejaan;
    }
    
    public double getPanjangEssay() {
        return panjangEssay;
    }
    
    public double getKonten() {
        return konten;
    }
    
    // Method untuk menghitung total skor
    private void hitungSkor() {
        double totalSkor = grammar + pengejaan + panjangEssay + konten;
        setSkor(totalSkor);
    }
}

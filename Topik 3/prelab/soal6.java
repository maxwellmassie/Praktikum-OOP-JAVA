// Tuliskan sebuah class bernama Pet, yang mempunyai field-field private berikut:

// nama. Field nama yang menyimpan nama dari pet (hewan peliharaan).
// hewan. Field hewan menyimpan jenis hewan dari pet. Contoh nilai-nilai untuk field ini adalah "Kucing", "Burung", "Kelinci".
// umur. Field umur menyimpan umur pet.
// Class Pet juga harus mempunyai method-method berikut:

// setNama. Method setNama menyimpan sebuah nilai dalam field nama.
// setHewan. Method setAnimal menyimpan sebuah nilai dalam field hewan.
// setUmur. Method setUmur menyimpan sebuah nilai dalam field umur.
// getNama. Method getNama mengembalikan nilai dari field nama.
// getHewan. Method getHewan mengembalikan nilai dari field hewan.
// getUmur. Method getUmur mengembalikan nilai dari field umur.
// Berikut adalah contoh kode yang menggunakan class Pet:

// Pet heli = new Pet();
// heli.setNama("Heli");
// heli.setHewan("Anjing");
// heli.setUmur(3);
// System.out.println("Nama = " + heli.getNama());
// System.out.println("Hewan = " + heli.getHewan());
// System.out.println("Umur = " + heli.getUmur());
// Kode di atas akan menghasilkan output:

// Nama = Heli
// Hewan = Anjing
// Umur = 3

//JAWAB
public class Pet {
    private String nama;
    private String hewan;
    private int umur;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHewan(String hewan) {
        this.hewan = hewan;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getHewan() {
        return hewan;
    }

    public int getUmur() {
        return umur;
    }

    public static void main(String[] args) {
        Pet heli = new Pet();
        heli.setNama("Heli");
        heli.setHewan("Anjing");
        heli.setUmur(3);
        System.out.println("Nama = " + heli.getNama());
        System.out.println("Hewan = " + heli.getHewan());
        System.out.println("Umur = " + heli.getUmur());
    }
}

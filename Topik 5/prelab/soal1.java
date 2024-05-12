// Pada kotak jawaban terdapat definisi class bernama Dog. 
// Definisi class tersebut tidak bisa dikompilasi karena terdapat kode yang belum lengkap. 
// Lengkapilah kode tersebut dengan menambahkan method equals di dalam class Dog. 
// Method equals mengembalikan boolean true jika nama Dog saat ini sama dengan nama Dog sebelumnya. 
// Gunakan statement if tersarang untuk mengecek nama setiap Dog. Lengkapi method equals pada kotak jawaban. 
// Program seharusnya mencetak false dua kali lalu true dua kali.

//jawab//

public class Dog {
    private String nama;

    public Dog(String nama) {
        this.nama = nama;
    }

    public boolean equals(Object objectLain) {
        if (this == objectLain) // Jika objek sama dengan dirinya sendiri
            return true;
        if (objectLain == null || getClass() != objectLain.getClass()) // Jika objek null atau kelas tidak sama
            return false;

        Dog dogLain = (Dog) objectLain; // Cast objek lain ke kelas Dog
        return nama.equals(dogLain.nama); // Membandingkan nama Dog
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Rufus");
        Dog d2 = new Dog("Sally");
        Dog d3 = new Dog("Rufus");
        Dog d4 = d3;
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d3));
        System.out.println(d3.equals(d4));
    }
}

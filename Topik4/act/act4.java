// Misalkan terdapat class bernama Bangun dengan definisi seperti berikut:

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
// Tuliskan sebuah class bernama Lingkaran yang mengekstensi class Bangun. Class Lingkaran memiliki:

// Sebuah field private bernama radius bertipe double.
// Sebuah method bernama setRadius yang menerima sebuah argument bertipe double. Method setRadius menetapkan nilai field radius dan menetapkan nilai field superclass luas dengan luas lingkaran dengan radius sesuai dengan nilai argument.
// Sebuah method bernama getRadius yang mengembalikan nilai field radius. 
// Berikut adalah contoh kode yang menggunakan class Lingkaran:

// Lingkaran bulat = new Lingkaran();
// bulat.setRadius(3.5);
// System.out.printf("Lingkaran dengan radius %.2f cm mempunyai luas = %.2f cm2",
//                     bulat.getRadius(), bulat.getLuas());
// Kode di atas akan memberikan output:

// Lingkaran dengan radius 3.50 cm mempunyai luas = 38.48 cm2

//jawab//

public class Lingkaran extends Bangun {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
        hitungLuas();
    }

    public double getRadius() {
        return radius;
    }

    private void hitungLuas() {
        double luas = Math.PI * radius * radius;
        setLuas(luas);
    }
}

// Misalkan terdapat sebuah class bernama Point2D yang merepresentasikan sebuah point (titik) dalam koordinat 2D xy dengan definisi seperti berikut:

// public class Point2D 
// {
//     private int x;
//     private int y;
 
//     public Point2D() 
//     {
//         x = 0;
//         y = 0;        
//     }
 
//     public Point2D(int x,int y) {
//        this.x = x;
//        this.y = y;
//     }

//     public void setX(int x)
//     {
//         this.x = x;
//     }

//     public int getX()
//     {
//         return x;
//     }

//     public void setY(int y)
//     {
//         this.y = y;
//     }

//     public int getY()
//     {
//         return y;
//     }
// }
// Tuliskan sebuah class bernama Point3D yang merepresentasikan point dalam koordinat tiga dimensi xyz yang mengekstensi class Point2D. Class Point3D menambahkan sebuah field z yang merepresentasikan lokasi point pada sumbu z.

// Berikut adalah contoh kode yang menggunakan class Point3D:

// Point3D pt1 = new Point3D();
// pt1.setX(4);
// pt1.setY(7);
// pt1.setZ(5);

// Point3D pt2 = new Point3D(3, 4, 5);

// System.out.println("Point 1: (" + pt1.getX() + ", " +
//                                     pt1.getY() + ", " + 
//                                     pt1.getZ() + ")");

// System.out.println("Point 2: (" + pt2.getX() + ", " +
//                                     pt2.getY() + ", " + 
//                                     pt2.getZ() + ")");
// Output dari kode di atas adalah sebagai berikut:

// Point 1: (4, 7, 5)
// Point 2: (3, 4, 5)

//JAWAB//

public class Point3D extends Point2D {
    private int z;

    public Point3D() {
        super(); // Panggil constructor default dari superclass Point2D
        z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y); // Panggil constructor dari superclass Point2D
        this.z = z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public static void main(String[] args) {
        Point3D pt1 = new Point3D();
        pt1.setX(4);
        pt1.setY(7);
        pt1.setZ(5);

        Point3D pt2 = new Point3D(3, 4, 5);

        System.out.println("Point 1: (" + pt1.getX() + ", " +
                pt1.getY() + ", " + pt1.getZ() + ")");

        System.out.println("Point 2: (" + pt2.getX() + ", " +
                pt2.getY() + ", " + pt2.getZ() + ")");
    }
}

// Asumsikan terdapat sebuah class bernama Point yang merepresentasikan sebuah titik pada koordinat kartesius. Definisi class Point dapat didownload pada file berikut: Point.java.

// Tuliskan sebuah class bernama Line yang merepresentasikan sebuah segmen garis antara dua object Point. Class Line mempunyai dua field private bertipe data class Point dan mempunyai method-method berikut:

// Sebuah constructor, public Line(Point p1, Point p2) yang mengkonstruksi sebuah object Line dengan dua argument Point.
// Method public Point getP1() yang mengembalikan Point ujung garis pertama.
// Method public Point getP2() yang mengembalikan Point ujung garis kedua.
// Method public String toString() yang mengembalikan representasi String dari Line seperti contoh berikut "[(22, 3), (4, 7)]".
// Method public double getSlope() yang menghitung slope (kemiringan) dari garis ini. Slope dari dua titik (x1,y1)
//  dan (x2,y2)
//  sama dengan (y2−y1)(x2−x1)
// . Asumsikan nilai x2
//  tidak sama dengan x1
// .
// Kode berikut mencontohkan penggunaan class Line:

// Point p1 = new Point(12, 3);
// Point p2 = new Point(4, 7);
// Line garis = new Line(p1, p2);
// System.out.println("Garis " + garis.toString() +
//                     " mempunyai slope = " + garis.getSlope());
// Output dari kode di atas:

// Garis [(12, 3), (4, 7)] mempunyai slope = -0.5

///jawabbb\\\

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return "[" + p1 + ", " + p2 + "]";
    }

    public double getSlope() {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();

        return (y2 - y1) / (x2 - x1);
    }

    public static void main(String[] args) {
        Point p1 = new Point(12, 3);
        Point p2 = new Point(4, 7);
        Line garis = new Line(p1, p2);
        System.out.println("Garis " + garis.toString() +
                " mempunyai slope = " + garis.getSlope());
    }
}

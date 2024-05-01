// Misalkan telah terdapat sebuah class bernama Mobil yang didefinisikan sebagai berikut:

// public class Mobil 
// {
//     private String pabrikan;
//     private String model;
//     private String warna;
//     private int kecepatanMax;       
    
//     public void setPabrikan(String pabrikan)
//     {
//         this.pabrikan = pabrikan;
//     }

//     public void setModel(String model)
//     {
//         this.model = model;
//     }

//     public void setWarna(String warna)
//     {
//         this.warna = warna;
//     }

//     public void setKecepatanMax(int kecepatanMax)
//     {
//         this.kecepatanMax = kecepatanMax;
//     }

//     public String getPabrikan()
//     {
//         return pabrikan;
//     }

//     public String getModel()
//     {
//         return model;
//     }

//     public String getWarna()
//     {
//         return warna;
//     }

//     public int getKecepatanMax()
//     {
//         return kecepatanMax;
//     }
// }
// Tuliskan sebuah class bernama MobilListrik yang mengekstensi class Mobil dengan tambahan field lamaRecharge bertipe int dan method accessor dan mutator untuk field tersebut.

// Berikut adalah contoh kode yang menggunakan class MobilListrik:

// MobilListrik kona = new MobilListrik("Hyundai", "Kona", "Silver", 180, 4);
// MobilListrik tesla = new MobilListrik();
// tesla.setPabrikan("Tesla");
// tesla.setModel("X");
// tesla.setWarna("Merah");
// tesla.setKecepatanMax(250);
// tesla.setLamaRecharge(3);

// System.out.println("Data Mobil Listrik: ");
// System.out.println(kona.getPabrikan() + "\t" +
//                     kona.getModel() + "\t" + 
//                     kona.getWarna() + "\t" +
//                     kona.getKecepatanMax() + "\t" +
//                     kona.getLamaRecharge() + "\t");
// System.out.println(tesla.getPabrikan() + "\t" +
//                     tesla.getModel() + "\t" + 
//                     tesla.getWarna() + "\t" +
//                     tesla.getKecepatanMax() + "\t" +
//                     tesla.getLamaRecharge() + "\t");
// Kode di atas akan memberikan output seperti berikut:

// Data Mobil Listrik: 
// Hyundai Kona    Silver  180     4
// Tesla   X       Merah   250     3

////JAWAB///

public class MobilListrik extends Mobil {
    private int lamaRecharge;

    public MobilListrik() {
        super(); // Panggil constructor default dari superclass
    }

    public MobilListrik(String pabrikan, String model, String warna, int kecepatanMax, int lamaRecharge) {
        super();
        setPabrikan(pabrikan);
        setModel(model);
        setWarna(warna);
        setKecepatanMax(kecepatanMax);
        this.lamaRecharge = lamaRecharge;
    }

    public void setLamaRecharge(int lamaRecharge) {
        this.lamaRecharge = lamaRecharge;
    }

    public int getLamaRecharge() {
        return lamaRecharge;
    }

    public static void main(String[] args) {
        MobilListrik kona = new MobilListrik("Hyundai", "Kona", "Silver", 180, 4);
        MobilListrik tesla = new MobilListrik();
        tesla.setPabrikan("Tesla");
        tesla.setModel("X");
        tesla.setWarna("Merah");
        tesla.setKecepatanMax(250);
        tesla.setLamaRecharge(3);

        System.out.println("Data Mobil Listrik: ");
        System.out.println(kona.getPabrikan() + "\t" +
                            kona.getModel() + "\t" + 
                            kona.getWarna() + "\t" +
                            kona.getKecepatanMax() + "\t" +
                            kona.getLamaRecharge() + "\t");
        System.out.println(tesla.getPabrikan() + "\t" +
                            tesla.getModel() + "\t" + 
                            tesla.getWarna() + "\t" +
                            tesla.getKecepatanMax() + "\t" +
                            tesla.getLamaRecharge() + "\t");
    }
}

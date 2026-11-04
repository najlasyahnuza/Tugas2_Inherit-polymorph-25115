package soal2;

/**
 * Menjalankan seluruh bagian Soal 2: analisis polimorfisme, urutan
 * constructor, dan relasi is-a.
 */
public class TesSoal2 {

    /**
     * Titik masuk program uji Soal 2.
     *
     * @param args argumen command line (tidak digunakan)
     */
    public static void main(String[] args) {
        System.out.println("=== Bagian A ===");
        jalankanBagianA();
        System.out.println("=== Bagian B ===");
        jalankanBagianB();
        System.out.println("=== Bagian C ===");
        jalankanBagianC();
    }

    private static void jalankanBagianA() {
        Hewan h = new Kucing("Tom");
        h.makan();
        h.suara();
        // h.panjat(); // error kompilasi: method panjat() tidak ada di tipe Hewan
        Kucing k = (Kucing) h;
        k.panjat();

        Hewan h2 = new Hewan("Generik");
        if (h2 instanceof Kucing) {
            Kucing k2 = (Kucing) h2;
            k2.panjat();
        } else {
            System.out.println("h2 bukan Kucing, downcasting dibatalkan");
        }
    }

    private static void jalankanBagianB() {
        new B();
    }

    private static void jalankanBagianC() {
        Lingkaran l1 = new Lingkaran(5);
        Titik l2 = new Titik();
        Lingkaran l3 = new Titik();
        System.out.println(l1.luas());
        System.out.println(l2.luas());
        System.out.println(l3.luas());
    }
}
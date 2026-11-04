package soal2;

/**
 * Subclass dari A yang meng-override init() dan memiliki atribut nilai.
 */
public class B extends A {

    int nilai = 5;

    /**
     * Membuat objek B setelah constructor A selesai.
     */
    B() {
        super();
        System.out.println("B dibuat, nilai=" + nilai);
    }

    /**
     * Mencetak keterangan inisialisasi milik B beserta nilainya.
     */
    @Override
    void init() {
        System.out.println("init B, nilai=" + nilai);
    }
}
package soal2;

/**
 * Superclass untuk latihan urutan constructor dan pemanggilan method override.
 */
public class A {

    /**
     * Membuat objek A dan memanggil init().
     */
    A() {
        System.out.println("A dibuat");
        init();
    }

    /**
     * Mencetak keterangan inisialisasi milik A.
     */
    void init() {
        System.out.println("init A");
    }
}
package soal2;

/**
 * Merepresentasikan hewan umum yang menjadi superclass untuk latihan polimorfisme.
 */
public class Hewan {

    protected String nama;

    /**
     * Membuat hewan baru dan mencetak pesan pembuatan.
     *
     * @param nama nama hewan
     */
    Hewan(String nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + nama);
    }

    /**
     * Mencetak suara umum hewan.
     */
    void suara() {
        System.out.println("...");
    }

    /**
     * Mencetak aktivitas makan, lalu memanggil suara().
     */
    void makan() {
        System.out.println(nama + " makan");
        suara();
    }
}
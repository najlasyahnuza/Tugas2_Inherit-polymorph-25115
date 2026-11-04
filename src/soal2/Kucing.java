package soal2;

/**
 * Merepresentasikan kucing sebagai jenis hewan yang bisa memanjat.
 */
public class Kucing extends Hewan {

    /**
     * Membuat kucing baru dan mencetak pesan pembuatan.
     *
     * @param nama nama kucing
     */
    Kucing(String nama) {
        super(nama);
        System.out.println("Kucing dibuat");
    }

    /**
     * Mencetak suara kucing.
     */
    @Override
    void suara() {
        System.out.println("meong");
    }

    /**
     * Mencetak aktivitas memanjat milik kucing.
     */
    void panjat() {
        System.out.println(nama + " memanjat");
    }
}
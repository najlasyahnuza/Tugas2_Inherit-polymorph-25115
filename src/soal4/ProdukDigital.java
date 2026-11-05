package soal4;

/**
 * Merepresentasikan produk digital yang mendapat diskon digital.
 */
public class ProdukDigital extends Produk {

    private static final double DISKON_DIGITAL = 0.10;

    private final double ukuranMb;

    /**
     * Membuat produk digital baru.
     *
     * @param kode       kode unik produk
     * @param nama       nama produk
     * @param hargaDasar harga dasar produk
     * @param ukuranMb   ukuran berkas dalam megabyte, tidak boleh negatif
     * @throws IllegalArgumentException jika data dasar tidak valid atau ukuran negatif
     */
    public ProdukDigital(String kode, String nama, double hargaDasar, double ukuranMb) {
        super(kode, nama, hargaDasar);
        if (ukuranMb < 0) {
            throw new IllegalArgumentException("Ukuran tidak boleh negatif");
        }
        this.ukuranMb = ukuranMb;
    }

    /**
     * Menghitung harga akhir berupa harga dasar dikurangi diskon digital.
     *
     * @return harga akhir
     */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() * (1 - DISKON_DIGITAL);
    }

    /**
     * Mengembalikan keterangan jenis dan ukuran produk.
     *
     * @return keterangan produk digital
     */
    @Override
    public String deskripsi() {
        return "digital " + ukuranMb + " MB";
    }
}
package soal4;

/**
 * Merepresentasikan produk fisik yang dikenai ongkos kirim berdasarkan berat.
 */
public class ProdukFisik extends Produk {

    private static final double ONGKOS_KIRIM_PER_KG = 10000;

    private final double beratKg;

    /**
     * Membuat produk fisik baru.
     *
     * @param kode       kode unik produk
     * @param nama       nama produk
     * @param hargaDasar harga dasar produk
     * @param beratKg    berat produk dalam kilogram, tidak boleh negatif
     * @throws IllegalArgumentException jika data dasar tidak valid atau berat negatif
     */
    public ProdukFisik(String kode, String nama, double hargaDasar, double beratKg) {
        super(kode, nama, hargaDasar);
        if (beratKg < 0) {
            throw new IllegalArgumentException("Berat tidak boleh negatif");
        }
        this.beratKg = beratKg;
    }

    /**
     * Menghitung harga akhir berupa harga dasar ditambah ongkos kirim.
     *
     * @return harga akhir
     */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() + beratKg * ONGKOS_KIRIM_PER_KG;
    }

    /**
     * Mengembalikan keterangan jenis dan berat produk.
     *
     * @return keterangan produk fisik
     */
    @Override
    public String deskripsi() {
        return "fisik " + beratKg + " kg";
    }
}
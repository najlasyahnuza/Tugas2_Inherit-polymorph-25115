package soal4;

/**
 * Merepresentasikan produk umum di toko digital. Kelas ini menyimpan data
 * dasar produk dan menjadi superclass untuk jenis produk lainnya.
 */
public class Produk {

    private final String kode;
    private final String nama;
    private final double hargaDasar;

    /**
     * Membuat produk baru.
     *
     * @param kode       kode unik produk, tidak boleh kosong
     * @param nama       nama produk, tidak boleh kosong
     * @param hargaDasar harga dasar produk, tidak boleh negatif
     * @throws IllegalArgumentException jika kode atau nama kosong, atau harga negatif
     */
    public Produk(String kode, String nama, double hargaDasar) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode produk tidak boleh kosong");
        }
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong");
        }
        if (hargaDasar < 0) {
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif");
        }
        this.kode = kode.trim();
        this.nama = nama.trim();
        this.hargaDasar = hargaDasar;
    }

    /**
     * Mengembalikan kode produk.
     *
     * @return kode produk
     */
    public String getKode() {
        return kode;
    }

    /**
     * Mengembalikan nama produk.
     *
     * @return nama produk
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengembalikan harga dasar produk.
     *
     * @return harga dasar
     */
    public double getHargaDasar() {
        return hargaDasar;
    }

    /**
     * Menghitung harga akhir produk. Produk umum tidak punya tambahan
     * atau diskon, sehingga harga akhir sama dengan harga dasar.
     *
     * @return harga akhir
     */
    public double hitungHargaAkhir() {
        return hargaDasar;
    }

    /**
     * Mengembalikan keterangan jenis produk.
     *
     * @return keterangan produk
     */
    public String deskripsi() {
        return "produk umum";
    }
}
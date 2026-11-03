package soal1;

/**
 * Merepresentasikan satu perangkat elektronik yang dijual di toko.
 * Kelas ini menyimpan data dasar perangkat dan memastikan setiap
 * nilai yang disimpan lolos validasi.
 */
public class Perangkat {

    /** Tarif pajak perangkat sebesar 10 persen. */
    private static final double TARIF_PAJAK = 0.10;

    /** Pemisah antarbagian pada teks info singkat. */
    protected static final String PEMISAH = " | ";

    private final String merek;
    protected double harga;
    private final int garansiBulan;

    /**
     * Membuat perangkat baru.
     *
     * @param merek        merek perangkat, tidak boleh kosong
     * @param harga        harga perangkat, tidak boleh negatif
     * @param garansiBulan lama garansi dalam bulan, tidak boleh negatif
     * @throws IllegalArgumentException jika merek kosong, harga negatif,
     *                                  atau garansi negatif
     */
    public Perangkat(String merek, double harga, int garansiBulan) {
        if (merek == null || merek.trim().isEmpty()) {
            throw new IllegalArgumentException("Merek tidak boleh kosong");
        }
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }
        if (garansiBulan < 0) {
            throw new IllegalArgumentException("Garansi tidak boleh negatif");
        }
        this.merek = merek.trim();
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }

    /**
     * Mengembalikan merek perangkat.
     *
     * @return merek perangkat
     */
    public String getMerek() {
        return merek;
    }

    /**
     * Mengembalikan lama garansi.
     *
     * @return garansi dalam bulan
     */
    public int getGaransiBulan() {
        return garansiBulan;
    }

    /**
     * Menghitung pajak perangkat berdasarkan tarif pajak.
     *
     * @return besar pajak dalam rupiah
     */
    public double hitungPajak() {
        return harga * TARIF_PAJAK;
    }

    /**
     * Mengembalikan keterangan singkat perangkat.
     *
     * @return teks berisi merek dan garansi
     */
    public String infoSingkat() {
        return merek + PEMISAH + "garansi " + garansiBulan + " bulan";
    }
}
package soal1;

/**
 * Merepresentasikan laptop gaming yang mendapat garansi tambahan.
 */
public class LaptopGaming extends Laptop {

    private static final int GARANSI_TAMBAHAN_BULAN = 6;

    private final String kartuGrafis;

    /**
     * Membuat laptop gaming baru. Garansi otomatis ditambah 6 bulan.
     *
     * @param merek           merek laptop
     * @param harga           harga laptop
     * @param garansiBulan    garansi dasar dalam bulan
     * @param ramGb           kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     * @param kartuGrafis     tipe kartu grafis, tidak boleh kosong
     * @throws IllegalArgumentException jika data dasar atau kartu grafis tidak valid
     */
    public LaptopGaming(String merek, double harga, int garansiBulan,
                        int ramGb, double ukuranLayarInci, String kartuGrafis) {
        super(merek, harga, garansiBulan + GARANSI_TAMBAHAN_BULAN,
                ramGb, ukuranLayarInci);
        if (kartuGrafis == null || kartuGrafis.trim().isEmpty()) {
            throw new IllegalArgumentException("Kartu grafis tidak boleh kosong");
        }
        this.kartuGrafis = kartuGrafis.trim();
    }

    /**
     * Mengembalikan keterangan singkat laptop gaming.
     *
     * @return info laptop ditambah kartu grafis
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + PEMISAH + "GPU " + kartuGrafis;
    }
}
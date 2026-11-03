package soal1;

/**
 * Merepresentasikan laptop sebagai jenis perangkat elektronik.
 */
public class Laptop extends Perangkat {

    private static final double PERSEN_PENUH = 100.0;

    private final int ramGb;
    private final double ukuranLayarInci;

    /**
     * Membuat laptop baru.
     *
     * @param merek           merek laptop
     * @param harga           harga laptop
     * @param garansiBulan    lama garansi dalam bulan
     * @param ramGb           kapasitas RAM dalam GB
     * @param ukuranLayarInci ukuran layar dalam inci
     * @throws IllegalArgumentException jika data dasar, RAM, atau ukuran layar tidak valid
     */
    public Laptop(String merek, double harga, int garansiBulan,
                  int ramGb, double ukuranLayarInci) {
        super(merek, harga, garansiBulan);
        if (ramGb <= 0 || ukuranLayarInci <= 0) {
            throw new IllegalArgumentException("RAM dan ukuran layar harus lebih dari 0");
        }
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
     * Menghitung harga setelah diskon promo.
     *
     * @param diskonPersen besar diskon, antara 0 sampai 100
     * @return harga setelah diskon
     * @throws IllegalArgumentException jika diskon di luar 0 sampai 100
     */
    public double hitungHargaPromo(double diskonPersen) {
        if (diskonPersen < 0 || diskonPersen > PERSEN_PENUH) {
            throw new IllegalArgumentException("Diskon harus antara 0 dan 100 persen");
        }
        return harga - (harga * diskonPersen / PERSEN_PENUH);
    }

    /**
     * Mengembalikan keterangan singkat laptop.
     *
     * @return info perangkat ditambah RAM dan ukuran layar
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + PEMISAH + "RAM " + ramGb + " GB"
                + PEMISAH + "layar " + ukuranLayarInci + " inci";
    }
}
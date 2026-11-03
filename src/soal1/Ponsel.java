package soal1;

/**
 * Merepresentasikan ponsel sebagai jenis perangkat elektronik.
 */
public class Ponsel extends Perangkat {

    private final int kapasitasGb;
    private final int jumlahKamera;

    /**
     * Membuat ponsel baru.
     *
     * @param merek        merek ponsel
     * @param harga        harga ponsel
     * @param garansiBulan lama garansi dalam bulan
     * @param kapasitasGb  kapasitas penyimpanan dalam GB
     * @param jumlahKamera jumlah kamera
     * @throws IllegalArgumentException jika data dasar, kapasitas, atau jumlah kamera tidak valid
     */
    public Ponsel(String merek, double harga, int garansiBulan,
                  int kapasitasGb, int jumlahKamera) {
        super(merek, harga, garansiBulan);
        if (kapasitasGb <= 0 || jumlahKamera < 0) {
            throw new IllegalArgumentException(
                    "Kapasitas harus lebih dari 0 dan jumlah kamera tidak boleh negatif");
        }
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }

    /**
     * Mengembalikan keterangan singkat ponsel.
     *
     * @return info perangkat ditambah kapasitas dan jumlah kamera
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + PEMISAH + kapasitasGb + " GB"
                + PEMISAH + jumlahKamera + " kamera";
    }
}
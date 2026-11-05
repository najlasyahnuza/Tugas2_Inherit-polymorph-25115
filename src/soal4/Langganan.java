package soal4;

/**
 * Merepresentasikan langganan digital yang dihitung per bulan dan
 * mendapat diskon jika durasinya panjang.
 */
public class Langganan extends ProdukDigital {

    private static final double DISKON_LANGGANAN = 0.20;
    private static final int BATAS_BULAN_DISKON = 12;

    private final int durasiBulan;

    /**
     * Membuat langganan baru.
     *
     * @param kode        kode unik produk
     * @param nama        nama produk
     * @param hargaDasar  harga dasar per bulan
     * @param ukuranMb    ukuran berkas dalam megabyte
     * @param durasiBulan durasi langganan dalam bulan, minimal 1
     * @throws IllegalArgumentException jika data dasar tidak valid atau durasi kurang dari 1
     */
    public Langganan(String kode, String nama, double hargaDasar,
                     double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);
        if (durasiBulan < 1) {
            throw new IllegalArgumentException("Durasi langganan minimal 1 bulan");
        }
        this.durasiBulan = durasiBulan;
    }

    /**
     * Menghitung harga akhir berupa harga dasar dikali durasi, dengan
     * diskon langganan jika durasi mencapai batas. Diskon digital tidak berlaku.
     *
     * @return harga akhir
     */
    @Override
    public double hitungHargaAkhir() {
        double total = getHargaDasar() * durasiBulan;
        if (durasiBulan >= BATAS_BULAN_DISKON) {
            total = total * (1 - DISKON_LANGGANAN);
        }
        return total;
    }

    /**
     * Mengembalikan keterangan jenis dan durasi langganan.
     *
     * @return keterangan langganan
     */
    @Override
    public String deskripsi() {
        return "langganan " + durasiBulan + " bulan";
    }
}
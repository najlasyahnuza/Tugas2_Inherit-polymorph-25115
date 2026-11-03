package soal1;

/**
 * Menjalankan skenario uji hierarki perangkat elektronik.
 */
public class TesSoal1 {

    /**
     * Titik masuk program uji Soal 1.
     *
     * @param args argumen command line (tidak digunakan)
     */
    public static void main(String[] args) {
        Laptop l = new Laptop("Asus", 8000000, 24, 16, 14.0);
        Ponsel p = new Ponsel("Samsung", 5000000, 12, 128, 3);
        LaptopGaming g = new LaptopGaming("MSI", 15000000, 12, 32, 15.6, "RTX 4060");

        System.out.println(l.infoSingkat());
        System.out.println(p.infoSingkat());
        System.out.println(g.infoSingkat());
        System.out.printf("Pajak laptop: Rp%.0f%n", l.hitungPajak());
        System.out.printf("Promo laptop 10 persen: Rp%.0f%n", l.hitungHargaPromo(10));
    }
}
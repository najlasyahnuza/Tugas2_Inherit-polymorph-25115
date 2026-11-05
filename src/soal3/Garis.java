package soal3;

/**
 * Merepresentasikan garis yang disusun dari dua objek Titik (composition).
 * Garis menyimpan salinan titik yang diterima sehingga perubahan objek
 * di luar tidak memengaruhi isi garis (defensive copy).
 */
public class Garis {

    private Titik awal;
    private Titik akhir;

    /**
     * Membuat garis dari dua titik. Kedua titik disalin.
     *
     * @param awal  titik awal, tidak boleh null
     * @param akhir titik akhir, tidak boleh null
     * @throws IllegalArgumentException jika salah satu titik null
     */
    public Garis(Titik awal, Titik akhir) {
        this.awal = salin(awal);
        this.akhir = salin(akhir);
    }

    /**
     * Membuat garis dari koordinat kedua ujungnya.
     *
     * @param x1 koordinat x titik awal
     * @param y1 koordinat y titik awal
     * @param x2 koordinat x titik akhir
     * @param y2 koordinat y titik akhir
     */
    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2));
    }

    /**
     * Mengembalikan salinan titik awal.
     *
     * @return salinan titik awal
     */
    public Titik getAwal() {
        return salin(awal);
    }

    /**
     * Mengubah titik awal dengan menyimpan salinannya.
     *
     * @param awal titik awal baru, tidak boleh null
     * @throws IllegalArgumentException jika titik null
     */
    public void setAwal(Titik awal) {
        this.awal = salin(awal);
    }

    /**
     * Mengembalikan salinan titik akhir.
     *
     * @return salinan titik akhir
     */
    public Titik getAkhir() {
        return salin(akhir);
    }

    /**
     * Mengubah titik akhir dengan menyimpan salinannya.
     *
     * @param akhir titik akhir baru, tidak boleh null
     * @throws IllegalArgumentException jika titik null
     */
    public void setAkhir(Titik akhir) {
        this.akhir = salin(akhir);
    }

    /**
     * Menghitung panjang garis memakai jarakKe() milik Titik.
     *
     * @return panjang garis
     */
    public double getPanjang() {
        return awal.jarakKe(akhir);
    }

    /**
     * Mengembalikan teks garis dengan format titik awal - titik akhir.
     *
     * @return representasi garis
     */
    @Override
    public String toString() {
        return awal + " - " + akhir;
    }

    private static Titik salin(Titik titik) {
        if (titik == null) {
            throw new IllegalArgumentException("Titik tidak boleh null");
        }
        return new Titik(titik.getX(), titik.getY());
    }
}
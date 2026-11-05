package soal3;

/**
 * Merepresentasikan satu titik pada bidang dua dimensi.
 */
public class Titik {

    private double x;
    private double y;

    /**
     * Membuat titik di pusat koordinat (0, 0).
     */
    public Titik() {
        this(0, 0);
    }

    /**
     * Membuat titik pada koordinat tertentu.
     *
     * @param x koordinat x
     * @param y koordinat y
     */
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Mengembalikan koordinat x.
     *
     * @return koordinat x
     */
    public double getX() {
        return x;
    }

    /**
     * Mengubah koordinat x.
     *
     * @param x koordinat x yang baru
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Mengembalikan koordinat y.
     *
     * @return koordinat y
     */
    public double getY() {
        return y;
    }

    /**
     * Mengubah koordinat y.
     *
     * @param y koordinat y yang baru
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Menghitung jarak lurus dari titik ini ke titik lain.
     *
     * @param lain titik tujuan, tidak boleh null
     * @return jarak antara kedua titik
     * @throws IllegalArgumentException jika titik tujuan null
     */
    public double jarakKe(Titik lain) {
        if (lain == null) {
            throw new IllegalArgumentException("Titik tujuan tidak boleh null");
        }
        double selisihX = lain.x - x;
        double selisihY = lain.y - y;
        return Math.sqrt(selisihX * selisihX + selisihY * selisihY);
    }

    /**
     * Mengembalikan teks titik dengan format (x, y).
     *
     * @return representasi titik
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
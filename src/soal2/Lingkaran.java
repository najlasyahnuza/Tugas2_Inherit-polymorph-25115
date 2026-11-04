package soal2;

/**
 * Merepresentasikan lingkaran dengan jari-jari tertentu.
 */
public class Lingkaran {

    private final double jariJari;

    /**
     * Membuat lingkaran baru.
     *
     * @param jariJari jari-jari lingkaran, tidak boleh negatif
     * @throws IllegalArgumentException jika jari-jari negatif
     */
    public Lingkaran(double jariJari) {
        if (jariJari < 0) {
            throw new IllegalArgumentException("Jari-jari tidak boleh negatif");
        }
        this.jariJari = jariJari;
    }

    /**
     * Mengembalikan jari-jari lingkaran.
     *
     * @return jari-jari lingkaran
     */
    public double getJariJari() {
        return jariJari;
    }

    /**
     * Menghitung luas lingkaran.
     *
     * @return luas lingkaran
     */
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    /**
     * Menghitung keliling lingkaran.
     *
     * @return keliling lingkaran
     */
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}
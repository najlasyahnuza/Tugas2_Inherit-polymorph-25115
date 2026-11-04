package soal2;

/**
 * Merepresentasikan titik sebagai lingkaran berjari-jari nol.
 * Dipakai untuk membahas apakah relasi is-a ini masuk akal.
 */
public class Titik extends Lingkaran {

    private static final double JARI_JARI_TITIK = 0.0;

    /**
     * Membuat titik dengan jari-jari nol.
     */
    public Titik() {
        super(JARI_JARI_TITIK);
    }

    /**
     * Mengembalikan luas titik.
     *
     * @return selalu 0.0
     */
    @Override
    public double luas() {
        return 0.0;
    }

    /**
     * Mengembalikan keliling titik.
     *
     * @return selalu 0.0
     */
    @Override
    public double keliling() {
        return 0.0;
    }
}
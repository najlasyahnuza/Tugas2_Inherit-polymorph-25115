package soal4;

import java.util.ArrayList;
import java.util.List;

/**
 * Merepresentasikan keranjang belanja yang menyimpan daftar produk
 * (composition) dan memanfaatkan polimorfisme untuk menghitung harga.
 */
public class Keranjang {

    private final List<Produk> daftarProduk = new ArrayList<>();

    /**
     * Menambahkan produk ke keranjang.
     *
     * @param produk produk yang ditambahkan, tidak boleh null
     * @throws IllegalArgumentException jika produk null
     * @throws IllegalStateException    jika kode produk sudah ada di keranjang
     */
    public void tambah(Produk produk) {
        if (produk == null) {
            throw new IllegalArgumentException("Produk tidak boleh null");
        }
        for (Produk ada : daftarProduk) {
            if (ada.getKode().equals(produk.getKode())) {
                throw new IllegalStateException(
                        "Kode produk " + produk.getKode() + " sudah ada di keranjang");
            }
        }
        daftarProduk.add(produk);
    }

    /**
     * Menghitung total harga akhir seluruh produk di keranjang.
     *
     * @return total harga
     */
    public double hitungTotal() {
        double total = 0;
        for (Produk produk : daftarProduk) {
            total += produk.hitungHargaAkhir();
        }
        return total;
    }

    /**
     * Mencetak struk berisi satu baris per produk dan total keseluruhan.
     */
    public void cetakStruk() {
        for (Produk produk : daftarProduk) {
            System.out.printf("%s | %s | %s | Rp%.0f%n",
                    produk.getKode(), produk.getNama(),
                    produk.deskripsi(), produk.hitungHargaAkhir());
        }
        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    /**
     * Menghitung dan mencetak jumlah produk fisik, digital, dan langganan.
     * Langganan diperiksa lebih dulu karena Langganan juga merupakan ProdukDigital.
     */
    public void hitungPerJenis() {
        int jumlahFisik = 0;
        int jumlahDigital = 0;
        int jumlahLangganan = 0;
        for (Produk produk : daftarProduk) {
            if (produk instanceof Langganan) {
                jumlahLangganan++;
            } else if (produk instanceof ProdukDigital) {
                jumlahDigital++;
            } else if (produk instanceof ProdukFisik) {
                jumlahFisik++;
            }
        }
        System.out.println("Fisik: " + jumlahFisik + ", Digital: " + jumlahDigital
                + ", Langganan: " + jumlahLangganan);
    }
}
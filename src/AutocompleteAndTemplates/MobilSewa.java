package AutocompleteAndTemplates;

/**
 * Kelas MobilSewa digunakan untuk merepresentasikan informasi penyewaan mobil.
 */
public class MobilSewa {
    private String pelanggan;
    private String mobil;
    private double biayaSewa;
    private int durasiSewa;
    /**
     * Konstruktor untuk menciptakan objek MobilSewa.
     *
     * @param pelanggan  Nama pelanggan.
     * @param mobil      Jenis mobil yang disewa.
     * @param biayaSewa  Biaya sewa per hari.
     * @param durasiSewa Durasi penyewaan dalam hari.
    */
    public MobilSewa(String pelanggan, String mobil, double biayaSewa, int durasiSewa) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.biayaSewa = biayaSewa;
        this.durasiSewa = durasiSewa;
    }

    /**
     * Metode ini menghitung total biaya penyewaan mobil.
     *
     * @return Total biaya penyewaan.
     */
    public double hitungTotalBiaya() {
        return biayaSewa * durasiSewa;
    }

    /**
     * Metode utama untuk menampilkan informasi penyewaan mobil.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam contoh ini).
     */
    public static void main(String[] args) {
        String pelanggan = "satrio";
        String mobil = "Toyota ";
        double biayaSewa = 100.0;
        int durasiSewa = 3;

        double totalBiaya = biayaSewa * durasiSewa;

        System.out.println("Selamat datang, " + pelanggan + "!");
        System.out.println("Anda telah menyewa mobil " + mobil + ".");
        System.out.println("Durasi sewa: " + durasiSewa + " hari");
        System.out.println("Biaya sewa per hari: $" + biayaSewa);
        System.out.println("Total biaya: $" + totalBiaya);

    }
}
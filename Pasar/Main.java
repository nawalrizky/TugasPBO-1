public class Main {
    public static void main(String[] args) {
        Pasar pasar = new Pasar(); // Membuat objek baru dari kelas 'Pasar'
        Pelanggan pelanggan = new Pelanggan(pasar, 50000); // Membuat objek baru dari kelas
        // 'Pelanggan' dengan parameter 'pasar' dan 'anggaran'

        System.out.println("Catatan barang yang dibeli Dina: " + pelanggan.getDaftarBelanja());

        System.out.println("Total belanja : Rp " + pelanggan.hitungTotalHarga());

        System.out.println(pelanggan.cekAnggaran());
    }
}


import java.util.ArrayList;
public class Pelanggan {
    private Pasar pasar;    // Mendeklarasikan variabel pasar dengan tipe data pasar
                            // dan menggunakan modifer private
    private ArrayList<Item> daftarBelanja;  // Mendeklarasikan variabel daftarBelanja
                                            // dengan tipe data ArrayList yang berisi objek item
    private int anggaran;   // Mendeklariskan variabel anggaran dengan tipe data integer
                            // dan menggunakan modifier private
    private int selisih;
    public Pelanggan(Pasar pasar, int anggaran) { // Membuat konstruktor pelanggan dengan dua parameter
                                                  // yaitu objek pasar dan anggaran
        this.pasar = pasar; // Menetapkan nilai variabel lokal 'pasar' menjadi nilai dari parameter 'pasar'
        this.anggaran = anggaran; // Menetapkan nilai variabel lokal 'anggaran' menjadi nilai dari
                                  // parameter 'anggaran'
        daftarBelanja = new ArrayList<Item>(); //Membuat objek ArrayList untuk variabel "daftarBelanja"
        daftarBelanja.add(pasar.getBarang().get(0)); // Baris 16 hingga 26 digunakan untuk menambahkan objek
        daftarBelanja.add(pasar.getBarang().get(1));  // yang ada pada Array barang ke dalam Array daftarBelanja
        daftarBelanja.add(pasar.getBarang().get(2));
        daftarBelanja.add(pasar.getBarang().get(3));
        daftarBelanja.add(pasar.getBarang().get(5));
        daftarBelanja.add(pasar.getBarang().get(6));

    }
    public ArrayList<Item> getDaftarBelanja() { // Membuat method yang mengembalikan ArrayList 'namaBarang'
                                                // yang berisi nama semua item pada daftar belanja
        ArrayList<Item> namaBarang = new ArrayList<Item>(); // Membuat ArrayList baru dengan nama 'namaBarang'
        for (Item item : daftarBelanja) { // Melakukan perulangan untuk setiap item di ArrayList 'daftarBelanja'
            namaBarang.add(new Item(item.getNama(), 0));
        } // Menambahkan objek item baru ke ArrayList 'namaBarang' dengan nama dari objek item di
          // ArrayList 'daftarBelanja' dan harga 0
        return namaBarang;
    }

    public int hitungTotalHarga() { // Deklarasi method 'hitungTotalHarga' yang
                                    // mengembalikan nilai bertipe int
        int totalHarga = 0; // Deklarasi variabel bertipe int dengan nama 'totalHarga'
                            // yang diinisialisasi dengan nilai '0'
        for (Item item : daftarBelanja) { // Perulangan for-each untuk setiap 'item' pada 'daftarBelanja'
            totalHarga += item.getHarga(); // Operasi penjumlahan nilai 'totalHarga' dengan nilai harga setiap 'item'
        }
        return totalHarga; // Statement mengembalikan nilai dari 'totalHarga' setelah perulangan selesai
    }

    public String cekAnggaran() { // Method 'cekAnggaran' yang akan mengembalikan nilai bertipe String
         selisih = anggaran - hitungTotalHarga(); // Variabel 'selisih' yang berisi selisih antara nilai
                                                     // 'anggaran' dan hasil method 'hitungTotalHarga'
        if (selisih == 0) { // Jika nilai 'selisih' sama dengan 0 maka akan dijalankan perintah blok if berikutnya
            return "Uang pas."; // Mengembalikan nilai berupa string "Uang pas". Jika kondisi if pada baris sebelumnya terpenuhi
        } else if (selisih < 0) { // Jika nilai 'selisih' kurang dari 0 maka akan dijalankan perintah blok if berikutnya
            return "Uang kurang " + selisih* -1; // Mengembalikan nilai berupa string "Uang kurang" dan jumlah kekurangannya. Jika kondisi if pada baris sebelumnya terpenuhi
        } else { // Memulai kondisi else, jika tidak ada kondisi if atau else if yang terpenuhi maka akan dijalankan perintah pada blok else berikutnya.
            return "Uang lebih " + selisih; //Mengembalikan nilai berupa string "Uang lebih" dan jumlah kelebihannya. jika kondisi else pada baris sebelumnya terpenuhi.
        }
    }



}

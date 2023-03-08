import java.util.ArrayList;
public class Pasar { 
    private ArrayList<Item> barang; 
    private int totalHarga;
    public Pasar() {
        barang = new ArrayList<Item>();
        barang.add(new Item("bawang", 3000));
        barang.add(new Item("bayam", 2000));
        barang.add(new Item("beras", 20000));
        barang.add(new Item("tempe", 5000));
        barang.add(new Item("cabai", 6000));
        barang.add(new Item("ayam", 20000));
        barang.add(new Item("minyak", 15000));
    }   // Konstruktor pasar, pada baris ke 9-13 di dalamnya, 
        // kelas item yang terdaftar di pasar

    public void tambahBarang(String nama, int harga) {
        barang.add(new Item(nama, harga));
    }   // Method tambahBarang yang menerima parameter "nama" dan "harga". Method ini
        // akan menambahkan objek item baru ke dalam ArrayList barang

    public ArrayList<Item> getBarang() {
        return barang;
    }   

    public int hitungTotalHarga() {
        totalHarga = 0;
        for (Item item : barang) {
            totalHarga += item.getHarga();
        }
        return totalHarga;
    }   // Method hitungTotalHarga yang akan menghitung total harga dari semua barang
        // pada ArrayList barang dengan mengakses atribut harga dari objek Item dan
        // menambahkannya pada atribut totalHarga. Kemudian, method ini mengembalikan
        // nilai totalHarga
}
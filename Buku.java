package TUGAS_AKHIR;

public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private double harga;
    private int jumlahHalaman;

    public Buku() {
        System.out.println("Object Buku telah diciptakan, constructor berjalan");
    }

    public Buku(int id, String judul, String penulis, double harga, int jumlahHalaman) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
        this.jumlahHalaman = jumlahHalaman;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
    }

    
    public void naikkanHarga() {
        harga += 5000; 
    }

    
    public void naikkanHarga(double kenaikan) {
        harga += kenaikan;
    }
}

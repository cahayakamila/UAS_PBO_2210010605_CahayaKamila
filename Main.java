package TUGAS_AKHIR;

public class Main {
    public static void main(String[] args) {
        
        Pengguna pengguna = new Pengguna();
        pengguna.setId(1);
        pengguna.setUsername("john_doe");
        pengguna.setPassword("password123");

        
        System.out.println("Pengguna ID: " + pengguna.getId());
        System.out.println("Pengguna Username: " + pengguna.getUsername());
        System.out.println("Pengguna Password: " + pengguna.getPassword());

        
        Buku buku = new Buku();
        buku.setId(1);
        buku.setJudul("Belajar Java");
        buku.setPenulis("John Doe");
        buku.setJumlahHalaman(300); 
        buku.setHarga(50000); 

        
        buku.printInfo();

        
        buku.naikkanHarga();
        buku.printInfo();

        
        Komik komik = new Komik();
        komik.setId(2);
        komik.setJudul("Komik Keren");
        komik.setPenulis("Jane Doe");
        komik.setJumlahHalaman(150); 
        komik.setHarga(30000); 

        
        komik.printInfo();

        
        komik.naikkanHarga();
        komik.printInfo();

        
        Majalah majalah = new Majalah();
        majalah.setId(3);
        majalah.setJudul("Majalah Fashion");
        majalah.setEditor("Alex Smith");
        majalah.setJumlahHalaman(100); 
        majalah.setHarga(20000);

        
        majalah.printInfo();

        
        majalah.naikkanHarga();
        majalah.printInfo();
    }
}

class Pengguna {
    private int id;
    private String username;
    private String password;

    public void login() {
        System.out.println("Ini method untuk Login");
    }

    public void daftar() {
        System.out.println("Ini method Daftar user baru");
    }

    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Pengguna() {
        System.out.println("Object telah diciptakan, constructor berjalan");
    }
}

class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlahHalaman;
    private double harga;

    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public void setHarga(double harga) {
        this.harga = harga;
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

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public double getHarga() {
        return harga;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Harga: " + harga);
    }

    
    public void naikkanHarga() {
        harga += 5000; 
    }

    
    public void naikkanHarga(double kenaikan) {
        harga += kenaikan;
    }

    public Buku() {
        System.out.println("Object Buku telah diciptakan, constructor berjalan");
    }
}

class Komik extends Buku {
    
    @Override
    public void naikkanHarga() {
        double kenaikan = 2000; 
        setHarga(getHarga() + kenaikan);
    }

    public Komik() {
        System.out.println("Object Komik telah diciptakan, constructor berjalan");
    }
}

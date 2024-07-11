package TUGAS_AKHIR;

public class Majalah extends Buku {
    private String editor;

    
    public Majalah() {
        System.out.println("Object Majalah telah diciptakan, constructor berjalan");
    }

    
    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    
    @Override
    public void naikkanHarga() {
        double kenaikan = 3000; 
        setHarga(getHarga() + kenaikan);
    }

    
    @Override
    public void printInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Judul: " + getJudul());
        System.out.println("Editor: " + editor);
        System.out.println("Jumlah Halaman: " + getJumlahHalaman());
        System.out.println("Harga: " + getHarga());
    }
}

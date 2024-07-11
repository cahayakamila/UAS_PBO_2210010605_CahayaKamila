package TUGAS_AKHIR;

public class Tamu extends Pengguna {
    private int sisaMasaAktif;

    public Tamu() {
        System.out.println("Object Tamu telah diciptakan, constructor berjalan");
    }

    public void setSisaMasaAktif(int sisaMasaAktif) {
        this.sisaMasaAktif = sisaMasaAktif;
    }

    public int getSisaMasaAktif() {
        return sisaMasaAktif;
    }

    public void menambahMasaAktif(int tambahan) {
        this.sisaMasaAktif += tambahan;
    }
}

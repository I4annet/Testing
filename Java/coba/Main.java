package coba;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa("Yanto", "Catatan Sipil", "Catatan Sipil Kewarganegaraan", 20000000);
        m.berjalan();
        m.membaca();

        MahasiswaTI ti = new MahasiswaTI("Lala", "Teknologi Informasi", "D-IV Teknik Informatika", 2000);
        ti.berjalan();
        ti.membaca();
        ti.menghitung();
    }
}

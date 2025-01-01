package coba;

public class Mahasiswa {
    private String nama;
    private String jurusan;
    private String prodi;
    private double UKT;

    public Mahasiswa(String nama, String jurusan, String prodi, double UKT) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.prodi = prodi;
        this.UKT = UKT;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getProdi() {
        return prodi;
    }

    public double getUKT() {
        return UKT;
    }

    public void membaca() {
        System.out.println(this.nama + "Ya dia bisa membaca");
    }

    public void berjalan() {
        System.out.println(this.nama + "Bisa berjalan juga");
    }
    
    public void berbicara() {
        while (true) {
            System.out.println("Aku cinta Polinema");
        }
    }


}

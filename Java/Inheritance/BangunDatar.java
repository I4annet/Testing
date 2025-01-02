package Inheritance;
import java.util.Scanner;

public class BangunDatar {

    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih Salah satu untuk menghitung rumus bangun datar");
            System.out.println("1. Persegi ");
            System.out.println("2. Persegi Panjang ");
            System.out.println("3. Belah Ketupat");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar Genjang");
            System.out.println("6. Trapesium");
            System.out.println("7. Segitiga");
            System.out.println("8. Layang-layang");
            System.out.println("9. Kembali");
            System.out.print("Pilih salah satu bangun datar : ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hitungPersegi();
                    break;
                case 2:
                    hitungPersegiPanjang();
                    break;
                case 3:
                    hitungBelahKetupat();
                    break;
                case 4:
                    hitungLingkaran();
                    break;
                case 5:
                    hitungJajarGenjang();
                    break;
                case 6: 
                    hitungTrapesium();
                    break;
                case 7:
                    hitungSegitiga();
                    break;
                case 8: 
                    hitungLayangLayang();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("pilih salah satu");
                    break;
            }

        }
    }

    private static void hitungPersegi(){
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Pilih salah satu untuk menghitung Persegi");
        System.out.println("1. Keliling ");
        System.out.println("2. Luas ");
        System.out.println("3. Kembali");
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan panjang sisi : ");
                double sisiKeliling = sc.nextDouble();
                double Keliling = 4 * sisiKeliling;
                System.out.println("Keliling Persegi adalah " + Keliling);
                break;
            case 2:
                System.out.print("Masukkan panjang sisi : ");
                double sisiLuas = sc.nextDouble();
                double Luas = sisiLuas * sisiLuas;
                System.out.println("Luas Persegi adalah " + Luas);
                break;
            case 3:
                return;
            default:
            System.out.println("Pilih salah satu");
                break;
            }   
        }
    }

    private static void hitungPersegiPanjang() {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Pilih salah satu untuk menghitung Persegi Panjang");
        System.out.println("1. Keliling ");
        System.out.println("2. Luas ");
        System.out.println("3. Kembali ");
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan panjang : ");
                double panjangKeliling = sc.nextDouble();
                System.out.print("Masukkan lebar : ");
                double lebarKeliling = sc.nextDouble();
                double Keliling = 2 * (panjangKeliling + lebarKeliling);
                System.out.println("Keliling Persegi Panjang adalah " + Keliling);
                break;
            case 2:
                System.out.print("Masukkan panjang : ");
                double panjangLuas = sc.nextDouble();
                System.out.print("Masukkan lebar : ");
                double lebarLuas = sc.nextDouble();
                double Luas = panjangLuas * lebarLuas;
                System.out.println("Keliling Persegi Panjang adalah " + Luas);
                break;
            case 3:
                return;
            default:
            System.out.println("Pilih salah satu");
                break;
            }
        }
    }

    private static void hitungBelahKetupat() {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Pilih salah satu untuk menghitung Belah Ketupat");
        System.out.println("1. Keliling ");
        System.out.println("2. Luas ");
        System.out.println("3. Kembali ");
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan panjang sisi : ");
                double sisiKeliling = sc.nextDouble();
                double Keliling = 4 * sisiKeliling;
                System.out.println("Keliling Belah Ketupat adalah " + Keliling);
                break;
            case 2:
                System.out.print("Masukkan panjang diagonal 1 : ");
                double diagonal1Luas = sc.nextDouble();
                System.out.print("Masukkan panjang diagonal 2 : ");
                double diagonal2Luas = sc.nextDouble();
                double Luas = 0.5 * diagonal1Luas * diagonal2Luas;
                System.out.println("Luas Belah Ketupat adalah " + Luas);
                break;
            case 3:
                return;
            default:
            System.out.println("Pilih salah satu");
                break;
            }
        }
    }

    private static void hitungLingkaran() {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Pilih salah satu untuk menghitung Lingkaran");
        System.out.println("1. Keliling ");
        System.out.println("2. Luas ");
        System.out.println("3. Kembali ");
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan panjang jari-jari : ");
                double jariKeliling = sc.nextDouble();
                double Keliling = 2 * Math.PI * jariKeliling;
                System.out.println("Keliling Lingkaran adalah " + Keliling);
                break;
            case 2:
                System.out.print("Masukkan panjanng jari-jari : ");
                double jariLuas = sc.nextDouble();
                double Luas = Math.PI * jariLuas * jariLuas;
                System.out.println("Luas Lingkaran adalah " + Luas);
                break;
            case 3:
                return;
            default:
            System.out.println("Pilih salah satu");
                break;
           }
        }
    }

    private static void hitungJajarGenjang() {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Pilih salah satu untuk menghitung Jajar Genjang");
        System.out.println("1. Keliling ");
        System.out.println("2. Luas ");
        System.out.println("3. Kembali ");
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan panjang : ");
                double panjangKeliling = sc.nextDouble();
                System.out.print("Masukkan lebar : ");
                double lebarKeliling = sc.nextDouble();
                double Keliling = 2 * (panjangKeliling + lebarKeliling);
                System.out.println("Keliling Jajar Genjang adalah " + Keliling);
                break;
            case 2:
                System.out.print("Masukkan panjang alas : ");
                double alasLuas = sc.nextDouble();
                System.out.print("Masukkan ukuran tinggi : ");
                double tinggiLuas = sc.nextDouble();
                double Luas = alasLuas * tinggiLuas;
                System.out.println("Luas Jajar Genjang adalah " + Luas);
                break;
            case 3: 
                return;
            default:
            System.out.println("Pilih salah satu");
                break;
            } 
        }
    }

    private static void hitungTrapesium() {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Pilih salah satu untuk menghitung Trapesium");
        System.out.println("1. Keliling ");
        System.out.println("2. Luas ");
        System.out.println("3. Kembali");
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan panjang sisi : ");
                double sisiKeliling = sc.nextDouble();
                double Keliling = 4 * sisiKeliling;
                System.out.println("Keliling Trapesium adalah " + Keliling);
                break;
            case 2:
                System.out.print("Masukkan panjang sisi atas (A) : ");
                double sisiALuas = sc.nextDouble();
                System.out.print("Masukkan panjang sisi bawah (B) : ");
                double sisiBLuas = sc.nextDouble();
                System.out.print("Masukkan ukuran tinggi : ");
                double tinggiLuas = sc.nextDouble();
                double Luas = 0.5 * (sisiALuas * sisiBLuas) * tinggiLuas;
                System.out.println("Luas Trapesium adalah " + Luas);
                break;
            case 3:
                return;
            default:
            System.out.println("Pilih salah satu");
                break;
            }
        }     
    }


    private static void hitungSegitiga() {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Pilih salah satu untuk menghitung Segitiga");
        System.out.println("1. Keliling ");
        System.out.println("2. Luas ");
        System.out.println("3. Kembali");
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan panjang sisi : ");
                double sisiKeliling = sc.nextDouble();
                double Keliling = 3 * sisiKeliling;
                System.out.println("Keliling Segitiga adalah " + Keliling);
                break;
            case 2:
                System.out.print("Masukkan panjang alas : ");
                double alasLuas = sc.nextDouble();
                System.out.print("Masukkan ukuran tinggi : ");
                double tinggiLuas = sc.nextDouble();
                double Luas = 0.5 * alasLuas * tinggiLuas;
                System.out.println("Luas Segitiga adalah " + Luas);
                break;
            case 3:
                return;
            default:
            System.out.println("Pilih salah satu");
                break;
           } 
        }
    }

    private static void hitungLayangLayang() {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Pilih salah satu untuk menghitung Layang-layang");
        System.out.println("1. Keliling ");
        System.out.println("2. Luas ");
        System.out.println("3. Kembali");
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan panjang sisi : ");
                double sisiKeliling = sc.nextDouble();
                double Keliling = 4 * sisiKeliling;
                System.out.println("Keliling Layang-layang adalah " + Keliling);
                break;
            case 2:
                System.out.print("Masukkan panjang diagonal 1 : ");
                double diagonal1Luas = sc.nextDouble();
                System.out.print("Masukkan panjang diagonal 2 : ");
                double diagonal2Luas = sc.nextDouble();
                double Luas = 0.5 * diagonal1Luas * diagonal2Luas;
                System.out.println("Luas Layang-layang adalah " + Luas);
                break;
            case 3:
                return;
            default:
            System.out.println("Pilih salah satu");
                break;
            } 
        }
    }
}

package Inheritance;
import java.util.Scanner;

public class BangunRuang {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih Salah satu untuk menghitung rumus bangun ruang");
            System.out.println("1. Kubus ");
            System.out.println("2. Balok ");
            System.out.println("3. Prisma ");
            System.out.println("4. Limas ");
            System.out.println("5. Tabung ");
            System.out.println("6. Kerucut ");
            System.out.println("7. Bola ");
            System.out.println("8. Kembali");
            System.out.print("Pilih salah satu bangun datar : ");
            int milih = scanner.nextInt();

            switch (milih) {
                case 1:
                    hitungKubus();
                    break;
                case 2:
                    hitungBalok();
                    break;
                case 3:
                    hitungPrisma();
                    break;
                case 4:
                    hitungLimas();
                    break;
                case 5:
                    hitungTabung();
                    break;
                case 6: 
                    hitungKerucut();
                    break;
                case 7:
                    hitungBola();
                    break;
                case 8: 
                    return;
                default:
                System.out.println("Pilih salah satu atau kembali");
                    break;
            }
        }
    }

    private static void hitungKubus() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih salah satu untuk menghitung Kubus");
            System.out.println("1. Luas ");
            System.out.println("2. Volume ");
            System.out.println("3. Kembali");
            System.out.print("Pilihan Anda: ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan panjang sisi: ");
                    double sisiLuas = sc.nextDouble();
                    double luasKubus = 6 * sisiLuas * sisiLuas;
                    System.out.println("Luas Kubus adalah " + luasKubus);
                    break;
                case 2:
                    System.out.print("Masukkan panjang sisi: ");
                    double sisiVolume = sc.nextDouble();
                    double volumeKubus = sisiVolume * sisiVolume * sisiVolume;
                    System.out.println("Volume Kubus adalah " + volumeKubus);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }

    private static void hitungBalok() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih salah satu untuk menghitung Balok");
            System.out.println("1. Luas ");
            System.out.println("2. Volume ");
            System.out.println("3. Kembali");
            System.out.print("Pilihan Anda: ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan panjang: ");
                    double panjang = sc.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebar = sc.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = sc.nextDouble();
                    double luasBalok = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
                    System.out.println("Luas Balok adalah " + luasBalok);
                    break;
                case 2:
                    System.out.print("Masukkan panjang: ");
                    panjang = sc.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    lebar = sc.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    tinggi = sc.nextDouble();
                    double volumeBalok = panjang * lebar * tinggi;
                    System.out.println("Volume Balok adalah " + volumeBalok);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }

    private static void hitungPrisma() {
        System.out.println("AKAN DIREVISI");
    }

    private static void hitungLimas() {
        System.out.println("AKAN DIREVISI");
    }

    private static void hitungTabung() {
        System.out.println("AKAN DIREVISI");
    }

    private static void hitungKerucut() {
        System.out.println("AKAN DIREVISI");
    }

    private static void hitungBola() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih salah satu untuk menghitung Bola");
            System.out.println("1. Luas ");
            System.out.println("2. Volume ");
            System.out.println("3. Kembali");
            System.out.print("Pilihan Anda: ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jari-jari: ");
                    double jariLuas = sc.nextDouble();
                    double luasBola = 4 * Math.PI * jariLuas * jariLuas;
                    System.out.println("Luas Bola adalah " + luasBola);
                    break;
                case 2:
                    System.out.print("Masukkan jari-jari: ");
                    double jariVolume = sc.nextDouble();
                    double volumeBola = (4.0 / 3) * Math.PI * jariVolume * jariVolume * jariVolume;
                    System.out.println("Volume Bola adalah " + volumeBola);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}


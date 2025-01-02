package Inheritance;

import java.util.Scanner;

public class HitungBangunan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BangunDatar bangunDatar = new BangunDatar();
        BangunRuang bangunRuang = new BangunRuang();
        Login login = new Login();

        System.out.println("==== Hitung Bangunan ====");
        login.loginMenu();
        

        while (true) {
            System.out.println("Pilih Salah satu untuk menghitung rumus bangunan");
            System.out.println("1. Hitung Bangun Ruang ");
            System.out.println("2. Hitung Bangun Datar ");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            int pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    bangunRuang.menu();
                    break;
                case 2:
                    bangunDatar.menu();
                    break;
                case 3:
                    System.out.println("Program di hentikan");
                    System.exit(0);
                default:
                System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}
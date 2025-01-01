import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    // public static void main(String[] args) {
        // String hello = "Hello World";
        // String nama = "Namaku Ivansyah";
        // String Nama = "Namaku Andiansyah";
        // String jeneng = "Jenengku Ora Ngerti";
        
        // System.out.println(hello);
        // System.out.println(nama);
        // System.out.println(Nama);
        // System.out.println(jeneng);

        // String nama, alamat, pekerjaan;
        // int usia;

        // alamat = "Kota Malang";
        // nama = "Ivansyah Eka Oktaviadi Santoso";
        // pekerjaan = "Masih Kuliah, Doain Ya dilancarkan kuliahnya sampai lulus";
        // usia = 17;

        // System.out.println("Nama: " + nama );
        // System.out.println("Alamat: " + alamat);
        // System.out.println("Usia: " + usia + "tahun");
        // System.out.println("Pekerjaan: " + pekerjaan);

        // Double pi, r, luas;

        // r = 14.0;
        // pi = 3.14;

        // luas = pi * r * r;
        // System.out.println("Luas Lingkaran adalah: " + luas);
        // System.out.println(luas);


        // Scanner sc = new Scanner(System.in);
        // int Luas, keliling;
        // int sisi;

        // System.out.print("Masukkan sisi: ");
        // sisi = sc.nextInt();

        // keliling = (2 * sisi * sisi);
        // Luas = (sisi * sisi);

        // System.out.println("Luas Persegi: " + Luas);
        // System.out.println("Keliling Persegi: " + keliling);


        public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Metode untuk mengacak elemen dalam array
    public static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndexToSwap = rand.nextInt(arr.length);
            int temp = arr[randomIndexToSwap];
            arr[randomIndexToSwap] = arr[i];
            arr[i] = temp;
        }
    }

    // Metode untuk mengurutkan array menggunakan Bogo Sort
    public static void bogoSort(int[] arr) {
        while (!isSorted(arr)) {
            shuffle(arr);
        }
    }

    // Metode utama untuk menjalankan contoh Bogo Sort
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 4, 6, 8, 10, 12, 7, 9, 11, 14, 13, 15, 17, 16, 18, 19, 20};
        System.out.println("Array sebelum diurutkan: " + Arrays.toString(arr));
        bogoSort(arr);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(arr));
    }
}

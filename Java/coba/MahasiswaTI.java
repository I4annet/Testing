package coba;

import java.nio.channels.Pipe.SourceChannel;

public class MahasiswaTI extends Mahasiswa {

    public MahasiswaTI(String nama, String jurusan, String prodi, int UKT) {
        super(nama, jurusan, prodi, UKT);
    }
    
    @Override
    public void membaca() {
        System.out.println("Membacanya sangat cepat sekali");
    }

    public void menghitung() {
        while (true) {
            System.out.println("LALALALALALA.... (menghilangkan stres :))");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Program error");
        }

        System.out.println("HAHAHAHAHHAHAHAHAH....... _-");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Program error");
        }
        }
    }
}

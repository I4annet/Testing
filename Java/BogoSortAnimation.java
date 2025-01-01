import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BogoSortAnimation extends JPanel {
    private int[] array;
    private final int SIZE = 50; // Ukuran array
    private final int MAX_VALUE = 100; // Nilai maksimal elemen dalam array
    private final int DELAY = 100; // Waktu delay dalam milidetik

    public BogoSortAnimation() {
        array = new int[SIZE];
        fillArray();
        shuffleArray();
    }

    private void fillArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    private void shuffleArray() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndex = rand.nextInt(array.length);
            int temp = array[randomIndex];
            array[randomIndex] = array[i];
            array[i] = temp;
        }
    }

    private boolean isSorted() {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private void bogoSort() {
        while (!isSorted()) {
            shuffleArray();
            repaint();
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth() / SIZE;
        for (int i = 0; i < array.length; i++) {
            int height = array[i] * getHeight() / MAX_VALUE;
            g.fillRect(i * width, getHeight() - height, width, height);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bogo Sort Animation");
        BogoSortAnimation panel = new BogoSortAnimation();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        new Thread(panel::bogoSort).start();
    }
}



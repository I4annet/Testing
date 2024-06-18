import java.util.Scanner;

public class Kartu {
    private static String[][] akun = {{"user1", "pass1"}, {"user2", "pass2"}, {"user3", "pass3"}};
    

    public enum Suit {
        Hati, Wajik, Waru, Keriting         /* ♠ Spade atau sekop (juga disebut "waru")
                                              ♥ Heart atau hati
                                                ♦ Diamond atau berlian (juga disebut "wajik")
                                                ♣ Club atau keriting */
    }
    public static void Login() {
    Scanner input = new Scanner(System.in);
    boolean loggedIn = false;
    while (!loggedIn) {
        System.out.print("Masukkan Nama Pengguna: ");
        String username = input.nextLine();
        System.out.print("Masukkan kata sandi: ");
        String password = input.nextLine();

        for (int i = 0; i < akun.length; i++) {
            if (username.equals(akun[i][0]) && password.equals(akun[i][1])) {
                loggedIn = true;
               
            }
        }

        if (!loggedIn) {
            System.out.println("===================================================================");
            System.out.println("| Coba lagi -_- |");
            System.out.println("===================================================================");
        }
    }
}

    public enum Rank{
        dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, sepuluh, Jack, Queen, King, Ace
    }

    private final Suit suit;
    private final Rank rank;
  

    public Kartu(Suit suit, Rank rank) {
        this.rank = rank;
        this.suit = suit;

    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getrank() {
        return rank;
    }
    public String toString() {
        return rank + " of " + suit;
    }

    // Metode main untuk pengujian
    public static void main(String[] args) {
        Login();
        Kartu card = new Kartu(Suit.Hati, Rank.Ace);
        System.out.println(card);  // Output: ACE of HEARTS
    }

}

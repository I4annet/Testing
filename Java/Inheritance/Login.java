package Inheritance;

import java.util.Scanner;

public class Login {
        private static final String[][] akun = {{"user1", "pass1"}, {"user2", "pass2"}, {"user3", "pass3"}};

        public static void loginMenu(){
        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;
        while (!loggedIn)  {
            System.out.print("Username : ");
            String username = sc.nextLine();

            System.out.print("Password : ");
            String password = sc.nextLine();

            for (int i = 0; i < akun.length; i++) {
            if (username.equals(akun[i][0]) && password.equals(akun[i][1]) ) {
                loggedIn = true;
            } 
            
            if (!loggedIn) {
                System.out.println("Username / password salah coba lagi");
            }
        }
    }
}
}


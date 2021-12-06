import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(
            " _____         _     _____ _       _                 _ \r\n" +
            "|_   _|       | |   /  __ (_)     | |               | |\r\n" +
            "  | | _____  _| |_  | /  \\/_ _ __ | |__   ___ _ __  | |\r\n" +
            "  | |/ _ \\ \\/ / __| | |   | | '_ \\| '_ \\ / _ \\ '__| | |\r\n" +
            "  | |  __/>  <| |_  | \\__/\\ | |_) | | | |  __/ |    |_|\r\n" +
            "  \\_/\\___/_/\\_\\\\__|  \\____/_| .__/|_| |_|\\___|_|    (_)\r\n" +
            "                            | |                        \r\n" +
            "                            |_|                        \r\n"
            
        );
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(" Input the plaintext message : ");
            String plaintext = sc.nextLine();
            System.out.println(" Enter the value by which each character in the plaintext message gets shifted : ");
            int shift = sc.nextInt();
            System.out.println(" What you will like to do: \n 1) Encrypt \n 2) Decrpyt\n n) Exit : \n (choose correct options 1 or 2) ");
            int ED = sc.nextInt();

            if ( ED == 1 ) {    
                new Cipher(plaintext, shift);
                sc.nextLine();
                sc.nextLine();
            } else if ( ED == 2 )  {
                new DeCipher(plaintext, shift);
                sc.nextLine();
                sc.nextLine();
            } else {
                break;
            }
        }
        sc.close();
    }
}

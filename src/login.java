
import java.util.Scanner;

public class login {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Sign in :");
            System.out.println("Enter your desired username");
            String username = sc.nextLine();
            System.out.println("Enter your desired password");
            String password = sc.nextLine();

            System.out.println("Thank you for signing up, please log in");

            System.out.print("Enter the username: ");
            String user_username = sc.nextLine();

            System.out.print("Enter the password: ");
            String user_password = sc.nextLine();

            if (user_username.equals(username) && user_password.equals(password)) {


                System.out.println("Login Success!, Hi," + user_username);
                break;
            }
            else{
                System.out.println("try again");
            }
        }
    }
}

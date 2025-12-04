import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input a single character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Check character type using relational + logical operators
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital Alphabet");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Small Alphabet");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }

        sc.close();
    }
}



import java.util.Scanner;

public class VotingEligibility {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input age
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Input citizenship
        System.out.print("Enter citizenship: ");
        String citizen = sc.next();

        // Check eligibility using logical operator &&
        if (age >= 18 && citizen.equalsIgnoreCase("Indian")) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        sc.close();
    }
}
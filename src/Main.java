import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        for (int numbers = 2; count < number; numbers++) {
            if (numbers < 2) {
                continue;
            } else if (numbers == 2) {
                System.out.println(numbers);
                count++;
            } else {
                boolean checkPrime = true;
                for (int i = 2; i < numbers; i++) {
                    if (numbers % i == 0) {
                        checkPrime = false;
                        break;
                    }
                }
                if (checkPrime == true) {
                    System.out.println(numbers);
                    count++;
                }
            }
        }
    }
}

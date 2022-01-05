import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int numbers = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        while (count<number){
            if (numbers < 2) {
                numbers++;
                continue;
            } else if (numbers == 2) {
                System.out.println(numbers);
                count++;
            } else {
                boolean checkPrime = true;
                for (int i = 2; i < Math.sqrt(numbers); i++) {
                    if (numbers % i == 0) {
                        checkPrime = false;
                        break;
                    }
                }
                if (checkPrime) {
                    count++;
                    System.out.println(numbers);
                }
            }
            numbers++;
        }
    }
}

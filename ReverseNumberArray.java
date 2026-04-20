import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        long value = Math.abs(number);

        int count = 0;
        long temp = value;
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        int[] digits = new int[count];
        temp = value;
        for (int i = 0; i < count; i++) {
            digits[i] = (int) (temp % 10);
            temp /= 10;
        }

        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
            if (i < count - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
    }
}

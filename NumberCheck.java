import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for(int num : numbers) {
            if(num > 0) {
                if(num % 2 == 0) {
                    System.out.println(num + " is positive even");
                } else {
                    System.out.println(num + " is positive odd");
                }
            } else if(num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }
        int first = numbers[0];
        int last = numbers[4];
        if(first > last) {
            System.out.println("First element is greater than last");
        } else if(first < last) {
            System.out.println("First element is less than last");
        } else {
            System.out.println("First element is equal to last");
        }
        sc.close();
    }
}
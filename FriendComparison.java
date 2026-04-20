import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        double[] ages = new double[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.print("Enter age for " + names[i] + ": ");
                ages[i] = sc.nextDouble();
                System.out.print("Enter height in cm for " + names[i] + ": ");
                heights[i] = sc.nextDouble();
                if (ages[i] <= 0) {
                    System.out.println("Age must be greater than 0. Please enter the values again.");
                    continue;
                }
                if (heights[i] <= 0) {
                    System.out.println("Height must be greater than 0. Please enter the values again.");
                    continue;
                }
                break;
            }
        }

        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println();
        System.out.println("Youngest friend: " + names[youngestIndex] + " (age " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (height " + heights[tallestIndex] + " cm)");
        sc.close();
    }
}

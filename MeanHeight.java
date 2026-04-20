import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        for(int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i+1) + ": ");
            heights[i] = sc.nextDouble();
        }
        double sum = 0;
        for(double h : heights) {
            sum += h;
        }
        double mean = sum / 11;
        System.out.println("Mean height: " + mean);
        sc.close();
    }
}
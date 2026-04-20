import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonusAmount = new double[10];
        double[] newSalary = new double[10];
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = sc.nextDouble();
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = sc.nextDouble();
                if (salary[i] <= 0) {
                    System.out.println("Salary must be greater than 0. Please enter the values again.");
                    continue;
                }
                if (yearsOfService[i] < 0) {
                    System.out.println("Years of service cannot be negative. Please enter the values again.");
                    continue;
                }
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            double rate = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonusAmount[i] = salary[i] * rate;
            newSalary[i] = salary[i] + bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonusAmount[i];
        }

        System.out.println();
        System.out.printf("Total bonus payout: %.2f\n", totalBonus);
        System.out.printf("Total old salary: %.2f\n", totalOldSalary);
        System.out.printf("Total new salary: %.2f\n", totalNewSalary);
        sc.close();
    }
}

import java.util.Scanner;

public class Currency_conv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary:");
        float amount = sc.nextFloat();
        // major countries Currency
        double USD = 86.5;
        double CNY = 12.06;
        double Euro = 101.645;
        double GBP = 117.151;
        double CAD = 63.155;

        double dollar = amount * USD;
        double Yuan = amount * CNY;
        double Europe_curr = amount * Euro;
        double Pound = amount * GBP;
        double cand_dollar = amount * CAD;

        System.out.print("Enter Currency as follow as country: ");
        double money = sc.nextDouble();

        if (money == USD) {
            System.out.println("Your Salary in American currency:" + dollar);
        } else if (money == CNY) {
            System.out.println("Your Salary in Chinese currency:" + Yuan);
        } else if (money == Euro) {
            System.out.println("Your Salary in European currency:" + Europe_curr);
        } else if (money == GBP) {
            System.out.println("Your Salary in British currency:" + Pound);
        } else if (money == CAD) {
            System.out.println("Your Salary in Canadian currency:" + cand_dollar);
        } else {
            System.out.println("The Currency is not available .");
        }
    }
}

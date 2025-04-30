import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        System.out.println("Enter hours worked per week: ");
        double hoursWorked = scanner.nextDouble();

        double weeklySalary;
        if (hoursWorked > 40) {
            weeklySalary = calculateWeeklySalary(hourlyWage, hoursWorked, 1.5);
        } else {
            weeklySalary = calculateWeeklySalary(hourlyWage, hoursWorked);
        }

        double annualSalary = calculateAnnualSalary(weeklySalary);

        System.out.printf("Weekly salary: $%.2f\n", weeklySalary);
        System.out.printf("Annual salary: $%.2f\n", annualSalary);

    }

    // Calculate weekly salary without overtime
    public static double calculateWeeklySalary(double hourlyWage, double hoursWorked) {
        return hourlyWage * hoursWorked;
    }

    // Calculate weekly salary with overtime
    public static double calculateWeeklySalary(double hourlyWage, double hoursWorked, double overtimeRate) {
        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(hoursWorked - 40, 0);
        return (regularHours * hourlyWage) + (overtimeHours * hourlyWage * overtimeRate);
    }

    // Calculate annual salary on weekly salary
    public static double calculateAnnualSalary(double weeklySalary) {
        return weeklySalary * 52; // weeks in a year
    }
}

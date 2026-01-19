public class SalaryCalculator {

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public int bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = 1000 * salaryMultiplier(daysSkipped);
        double finalSalary = baseSalary + bonusForProductsSold(productsSold);

        return finalSalary > 2000 ? 2000 : finalSalary;
    }
}

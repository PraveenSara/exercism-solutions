public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        return salaryMultiplier(daysSkipped) * 1000 + bonusForProductsSold(productsSold) <= 2000 ? salaryMultiplier(daysSkipped) * 1000 + bonusForProductsSold(productsSold) : 2000;
    } 
}

static class SavingsAccount
{
    public static float InterestRate(decimal balance)
    {
        if (balance >= 5000) return (float)2.475;
        else if (balance >= 1000) return (float)1.621;
        else if (balance >= 0) return (float)0.5;
        else return (float)3.213;
    }

    public static decimal Interest(decimal balance) =>  (decimal)InterestRate(balance)/100 * balance;

    public static decimal AnnualBalanceUpdate(decimal balance) =>  Interest(balance) + balance; 

    public static int YearsBeforeDesiredBalance(decimal balance, decimal targetBalance)
    {
        int years = 0;
        decimal intrestedBalance = balance;
        
        while (intrestedBalance < targetBalance)
        {
            years += 1;
            intrestedBalance = AnnualBalanceUpdate(intrestedBalance);
        }

        return years;
    }
}

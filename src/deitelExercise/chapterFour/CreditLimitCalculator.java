package deitelExercise.chapterFour;

public class CreditLimitCalculator {

    private String accountNumber;
    private double beginMonthBalance;
    private int totalItemsCharged;
    private double totalCreditsApplied;
    private double allowedCreditLimit;

    public CreditLimitCalculator() {

    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAllowedCreditLimit(double allowedCreditLimit) {
        this.allowedCreditLimit = allowedCreditLimit;
    }

    public void setBeginMonthBalance(double beginMonthBalance) {
        this.beginMonthBalance = beginMonthBalance;
    }

    public void setTotalItemsCharged(int totalItemsCharged) {
        this.totalItemsCharged = totalItemsCharged;
    }

    public void setTotalCreditsApplied(double totalCreditsApplied) {
        this.totalCreditsApplied = totalCreditsApplied;
    }

    public double getAllowedCreditLimit() {
        return allowedCreditLimit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBeginMonthBalance() {
        return beginMonthBalance;
    }

    public int getTotalItemsCharged() {
        return totalItemsCharged;
    }

    public double getTotalCreditsApplied() {
        return totalCreditsApplied;
    }

    public double newBalance(double balance, double charges, double credits) {
        return (balance + charges) - credits;
    }

    public String creditLimitExceed(double newBalance) {
        if (newBalance > allowedCreditLimit) {
            return "Credit limit is not exceeded";
        }
        return "Credit limit exceeded!";
    }
}

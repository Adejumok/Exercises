package tdd;

public class Kata {


    public int bitFlipper;

    public static int noOfFactorsOf(int number) {
        int factor = 0;
        for (int i = 1; i <= number ; i++){
            if(number % i == 0)
                factor++;
        }
            return  factor;
    }

    public static boolean isPrime(int number) {

            if(noOfFactorsOf(number) == 2)return true;

        return false;
    }

    public int add(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }


    public int subtract(int firstNumber, int secondNumber) {
        int difference = 0;
        if (secondNumber > firstNumber) difference = secondNumber - firstNumber;
        if (firstNumber > secondNumber) difference = firstNumber - secondNumber;
        return difference;
    }

    public int product(int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber);
    }

    public int quotient(int numerator, int denominator) {
        int quoteResult = 0;
        if (numerator == 0 || denominator == 0) {
            return quoteResult;
        } else {
            quoteResult = numerator / denominator;
        }

        return quoteResult;
    }

    public String mysteryNumber(int guessedNumber) {
        int mysteryNumber = 40;

        String mystery = null;
        if (guessedNumber == mysteryNumber) {
            mystery = "correct";
        }

        if (guessedNumber < mysteryNumber) {
            mystery = "too low";
        }

        if (guessedNumber > mysteryNumber) {
            mystery = "too high";
        }

        return mystery;
    }


    public String evenOddNumber(int number) {
        int evenOddNumber = 0;
        String digit = null;
        if (number % 2 == 0) {
            digit = "It is an even number";
        }

        if (number % 2 != 0) {
            digit = "It is an odd number";
        }
        return digit;
    }

    public int bitFlipper(int digit) {
        int bitFlipper = 0;
        if (digit == 1) {
            bitFlipper = 0;
        }
        if (digit == 0) {
            bitFlipper = 1;
        }

        return bitFlipper;
    }


    public double energy(double waterWeight, double initialTemp, double finalTemp) {
        double energy = 0.0;

        energy = waterWeight * (finalTemp - initialTemp) * 4184;

        return energy;
    }


    public String grade(double score) {
        String grade = null;
        if (score >= 90 && score <= 100) {
            grade = "A";
        }
        if (score >= 80 && score < 90) {
            grade = "B";
        }
        if (score >= 70 && score < 80) {
            grade = "C";
        }
        if (score >= 60 && score < 70) {
            grade = "D";
        }
        if (score < 60) {
            grade = "F";
        }
        return grade;
    }

    public String report(int number) {
        String report = null;

        if (number > 55) {
            report = "Pass";
        }
        if (number < 55) {
            report = "Fail";
        }
        return report;
    }

    public double meters(double feet) {
        double meters = 0.0;
        meters = feet * 0.305;

        return meters;
    }

    public double kg(double pounds) {
        double kg = 0.0;
        kg = pounds * 0.454;

        return kg;
    }

    public double cost(double drivingDistance, double milesPerGallon, double pricePerGallon) {
        double cost = 0.0;
        double subCost = 0.0;

        cost = Math.round((drivingDistance / milesPerGallon) * pricePerGallon * 100.0) / 100.0;

        return cost;
    }

    public int years(int minutes) {
        int years = 0;
        years = minutes / 525600;

        return years;
    }

    public int days(int minutes) {
        int days = 0;
        int yearsRemainder = 0;

        yearsRemainder = minutes % 525600;

       days = yearsRemainder / 1440;

        return days;
    }

    public double value(double investmentAmount, double annualInterestRate, int years) {
        double value = 0.0;
        double monthlyInterestRate = 0.0;

        monthlyInterestRate = annualInterestRate / (1200);

        value = Math.round(investmentAmount * (Math.pow (1 + monthlyInterestRate, (years * 12))) * 100.0) / 100.0;

        return value;
    }

    public double accountValue(double monthlySaving) {
        double accountValue = 0;
        monthlySaving = 100.0;
        double annualInterestRate = 0.05;
        int months = 6;
        double monthlyInterestRate = annualInterestRate / 12;
        for (int i = 1; i <= 6 ; i++) {
            accountValue = (double)Math.round((accountValue+ monthlySaving) * (1 + monthlyInterestRate) * 1000)/ 1000;
        }
        accountValue = (double)Math.round(accountValue * 100)/100;

        return accountValue;
    }

    public double interest(int balance, double interestRate) {
        double interest = 0.0;

        interest = Math.round(balance * (interestRate / 1200) * 100000.0) / 100000.0;

        return interest;
    }

    public double area(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.0;

        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);

        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

        double s = (side1 + side2 + side3) / 2;

        double initialArea = Math.pow (s * (s - side1) * (s - side2) * (s - side3), 0.5);

        area = Math.round(initialArea * 10.0) / 10.0;

        return area;
    }

    public double bmi(double weightInPounds, double heightInInches) {
        double bmi = 0.0;

        double weightKg = weightInPounds * 0.45359237;

        double heightMeters = heightInInches * 0.0254;

        bmi = Math.round(weightKg / (heightMeters * heightMeters) * 10000.0) / 10000.0;

        return bmi;

    }
}


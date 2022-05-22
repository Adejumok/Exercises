package tdd;

public class Homewrk {
    public int firstTenSum(int numberCount) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public int factorialNumber(int number) {
        int factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial *= i;
        }
        return factorial;
    }
}

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


    public boolean getBoolean(String[] a, String[] b) {
        int counter = 0;
        if(a.length != b.length){return false;}
        else {
            for (int i = 0; i < a.length; i++) {
                if(a[i].equalsIgnoreCase(b[i])){
                    counter+=1;}
            }
            if(counter == a.length){
                return true;
            }
        }
        return false;
    }


}
package personal;

public class PrimeNumbers {
    public static void main(String[] args) {

        int value = 0;
        for (int i=15; i<=35; i++){
          if(isPrime((i))){
              value++;
              System.out.println("Number " + i + " is a prime number");
              if(value == 3){
                  System.out.println("Exiting for loop");
                  break;
              }
          }
        }

    }

    public static boolean isPrime(int n){

        if(n ==1){
            return false;
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

}

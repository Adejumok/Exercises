package tdd;

public class TestDriller {
    public int copy(int copy) {
        int pricePerCopy = 0;
        if  (copy > 0 && copy <= 4 ){pricePerCopy = 2_000;
        }
        if  (copy >= 5 && copy <= 9 ){pricePerCopy = 1_800;
        }
        if  (copy >= 10 && copy <= 29 ){pricePerCopy = 1_600;
        }
        if  (copy >= 30 && copy <= 49 ){pricePerCopy = 1_500;
        }
        if  (copy >= 50 && copy <= 99 ){pricePerCopy = 1_300;
        }
        if  (copy >= 100 && copy <= 199 ){pricePerCopy = 1_200;
        }
        if  (copy >= 200 && copy <= 499 ){pricePerCopy = 1_100;
        }
        if  (copy >= 500 ){pricePerCopy = 1_000;
        }
        return pricePerCopy;


    }

    public int pricePerCopy(int pricePerCopy) {
        return pricePerCopy;
    }

   /* public int pricePerCopy(int pricePerCopy) {

       int copy = 0;
        int firstPrice = 2_000;
        int secondPrice = 1_800;
        int thirdPrice = 1_600;
        int fourthPrice = 1_500;
        int fifthPrice = 1_300;
        int sixthPrice = 1_200;
        int seventhPrice = 1_100;
        int eightPrice = 1_000; */

}

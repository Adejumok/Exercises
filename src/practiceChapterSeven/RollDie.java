package practiceChapterSeven;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[7];

        for(int roll = 1; roll <= 60_000_000; roll++){
            ++frequency[1 + randomNumbers.nextInt(6)];
        }
        System.out.printf("%s%10s%n", "Side", "Frequency");

        for (int side = 1; side < frequency.length; side++){
            System.out.printf("%4d%10d%n", side, frequency[side]);
        }
    }
}

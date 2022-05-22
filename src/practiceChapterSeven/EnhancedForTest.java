package practiceChapterSeven;

public class EnhancedForTest {
    public static void main(String[] args) {
        int[] babe = {10, 20, 33, -6, -7};
        int sum = 0;

        for (int i : babe){
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}

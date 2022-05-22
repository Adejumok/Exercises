package practice;

import java.util.Arrays;

public class MainStuff {
    public static void main(String[] args) {
        int money = 10000;
        Stuff.deposit(money);
        System.out.println(money);

        int[] values = {1,2,4,5,6,7,8,9};
        Stuff.deposit1(values);
        System.out.println(Arrays.toString(values));
    }
}

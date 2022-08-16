package deitelExercise.chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        Scanner mileage = new Scanner(System.in);
        double total = 0;

        System.out.print("Enter miles or -1 quit: ");
        int miles = mileage.nextInt();
        System.out.print("Enter gallons or -1 to quit: ");
        int gallons = mileage.nextInt();
        double milesPerGallon = miles * 1.0/gallons;
        System.out.printf("Miles per gallon is %.2f%n", milesPerGallon);

        while (miles != -1 || gallons != -1){
            total += milesPerGallon;

            System.out.print("Enter miles or -1 quit: ");
            miles = mileage.nextInt();
            if(miles == -1){break;}
            System.out.print("Enter gallons or -1 to quit: ");
            gallons = mileage.nextInt();
            if(gallons == -1){break;}
            milesPerGallon = miles * 1.0/gallons;
            System.out.printf("Miles per gallon is %.2f%n", milesPerGallon);
        }
        System.out.printf("%nThe combined miles per gallon obtained for all trips is %.2f", total);
    }

}

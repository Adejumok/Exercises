
package ClassExercises;


import java.util.Scanner;

public class IVRIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Language represented in a range of 1 to 4");
        System.out.println("1 is for English");
        System.out.println("2 is for Igbo");
        System.out.println("3 is for French");
        System.out.println("4 is for Yoruba");
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if(number == 1){
            System.out.println("1 is for Data and 2 is for Transfer");
            System.out.println("English (pick a number between 1 and 2): ");
            int english = input.nextInt();
            if(english == 1) {
                System.out.println("Data");
            }
               if(english == 2){
                System.out.println("Transfer");
            }
        }

        else if(number == 2){
            System.out.println("1 is for Sharing and 2 is for Caring");
            System.out.println("Igbo (pick a number between 1 and 2): ");
            int igbo = input.nextInt();
            if(igbo == 1) {
                System.out.println("Sharing");
            }
            if(igbo == 2){
                System.out.println("Caring");
            }
        }

        else if(number == 3){
            System.out.println("1 is for Egg and 2 is for Champagne");
            System.out.println("French (pick a number between 1 and 2): ");
            int french = input.nextInt();
            if(french == 1) {
                System.out.println("Egg");
            }
            if(french == 2){
                System.out.println("Champagne");
            }
        }

        else if(number == 4){
            System.out.println("1 is for Ewa and 2 is for Agoyin");
            System.out.println("Yoruba (pick a number between 1 and 2): ");
            int yoruba = input.nextInt();
            if(yoruba == 1) {
                System.out.println("Ewa");
            }
            if(yoruba == 2){
                System.out.println("Agoyin");
            }
        }

        else{
            System.out.println("Invalid input");
        }
    }
}

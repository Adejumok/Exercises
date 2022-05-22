package ClassExcercises;
/*
* Prompt the user to enter 1 - 4
* If user enters 1
*       prompt the user to enter 1-2
*       if user enters 1, print 1
*       if user enters 2, print 2
 */

import java.util.Scanner;

public class IVRCorrectionSuggestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        String prompt = """
                1 for English
                2 for Igbo
                3 for French
                4 for Yoruba
                """;
        System.out.println(prompt);
        System.out.println("Enter a number: ");
        int userResponse = keyboardInput.nextInt();
 //       char response = userResponse.charAt(0);
        switch (userResponse) {
            case 1 -> {
                prompt = """
                        1 for data
                        2 for transfer
                        """;
                System.out.println(prompt);
                System.out.println("Enter a number: ");
                userResponse = keyboardInput.nextInt();

                switch (userResponse) {
                    case '1' -> System.out.println("data");
                    case '2' -> System.out.println("transfer");
                    default -> System.out.println("Invalid");
                }
            }
            case '2' -> {
                prompt = """
                        1 for sharing
                        2 for caring
                        """;
                System.out.println(prompt);
                System.out.println("Enter a number: ");
                userResponse = keyboardInput.nextInt();
                switch (userResponse) {
                    case '1':
                        System.out.println("sharing");
                        break;
                    case '2':
                        System.out.println("caring");
                        break;
                    default:
                        System.out.println("Invalid");
                }
            }
            case '3' -> {
                prompt = """
                        1 for egg
                        2 for champagne
                        """;
                System.out.println(prompt);
                System.out.println("Enter a number: ");
                userResponse = keyboardInput.nextInt();
                switch (userResponse) {
                    case '1' -> System.out.println("egg");
                    case '2' -> System.out.println("champagne");
                    default -> System.out.println("Invalid");
                }
            }
            case '4' -> {
                prompt = """
                        1 for ewa
                        2 for agoyin
                        """;
                System.out.println(prompt);
                System.out.println("Enter a number: ");
                userResponse = keyboardInput.nextInt();
                switch (userResponse) {
                    case '1' -> System.out.println("ewa");
                    case '2' -> System.out.println("agoyin");
                    default -> System.out.println("Invalid");
                }
            }
        }
    }
}

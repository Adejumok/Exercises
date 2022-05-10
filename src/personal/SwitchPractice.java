package personal;

public class SwitchPractice {
    public static void main(String[] args) {

        char charValue = 'H';
        switch (charValue) {
            case 'A':
                System.out.println("A is found");
                break;

            case 'B':
                System.out.println("B is found");
                break;

            case 'C': case 'D': case 'E':
                System.out.println(charValue + " is found");
                break;

            default:
                System.out.println("A, B, C, D, or E not found");
                break;

        }
    }

}

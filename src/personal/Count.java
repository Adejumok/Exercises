package personal;

public class Count {
    public static void main(String[] args) {
        int count = 1;
        while (count < 7){
            System.out.println("Count is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 7) {
                break;
            }
            System.out.println("Count is " + count);
            count++;
        }
    }

}

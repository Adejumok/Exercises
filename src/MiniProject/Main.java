package MiniProject;

public class Main {
    private static Diary main = new Diary();
    private static User memad = new User();

    public static void main(String[] args) {
        createDiary();
        //checkDiary();
        System.out.println(main);
    }

    public static void createDiary(){
        main.setName("Banji");
        main.setId("081");
        memad.createDiary(main);



    }

    public static void checkDiary(){
        System.out.println(memad.viewDiary(0));
    }
}

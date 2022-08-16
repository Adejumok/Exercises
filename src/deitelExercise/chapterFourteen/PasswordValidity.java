package deitelExercise.chapterFourteen;

public class PasswordValidity {
    public static boolean isValidPassword(String password) {
        return password.matches("^[A-Za-z](?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#$%&*@!?^_+=]).{8,15}$");
    }
}

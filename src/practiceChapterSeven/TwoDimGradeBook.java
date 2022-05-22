package practiceChapterSeven;

public class TwoDimGradeBook {
    private String courseName;
    private int[][] grades;

    public TwoDimGradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void processGrades(){
        outputGrades();

        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade in the grade book is", getLowest(),
                "Highest grade in the grade book is", getHighest());

        outputBarChart();

    }

    private void outputBarChart() {
        System.out.println("Overall grade distribution:");

        int[] frequency = new int[11];

        for (int[] studentGrades : grades){
            for (int grade : studentGrades){
                ++frequency[grade/10];
            }
        }

        for (int enumerate = 0; enumerate < frequency.length; enumerate++){
            if(enumerate == 10){
                System.out.printf("%5d: ", 100);
            }else {
                System.out.printf("%02d-%02d: ", enumerate * 10, enumerate * 10 + 9);
            }

            for (int stars = 0; stars < frequency[enumerate]; stars++){
                System.out.printf("*");

            }
            System.out.println();
        }


    }

    private int getHighest() {
        int highestGrade = grades[0][0];

        for (int[] studentGrades : grades){
            for (int grade : studentGrades){
                if(grade > highestGrade){
                    highestGrade = grade;
                }
            }
        }return highestGrade;
    }

    private int getLowest() {
        int lowestGrade = grades[0][0];

        for (int[] studentGrades : grades){
            for (int grade : studentGrades){
                if(grade < lowestGrade){
                    lowestGrade = grade;
                }
            }
        }return lowestGrade;
    }

    private void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("          ");

        for (int test = 0; test < grades[0].length; test++){
            System.out.printf("Test %d  ", test + 1);
        }

        for (int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student]){
                System.out.printf("%8d", test);
            }

            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }

    }

    private double getAverage(int[] setOfGrades) {
        int total = 0;
        for (int grade : setOfGrades){
            total += grade;
        }return (double) total/setOfGrades.length;
    }
}

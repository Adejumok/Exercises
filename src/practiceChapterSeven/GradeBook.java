package practiceChapterSeven;

public class GradeBook {
    private String courseName;
    private int[] grades;

    public GradeBook(String courseName, int[] grades) {
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

        System.out.printf("%nClass average is %.2f%n", getAverage());

        System.out.printf("Lowest grade is %d%nHighest grade is %d%n",
                getMinimum(), getMaximum());
        
        outputBarChart();

    }

    private void outputGrades() {
        System.out.printf("The grades are:%n%n");

        for (int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d: %3d%n",
                    student + 1, grades[student]);
        }
    }

    private double getAverage() {
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return (double) sum/ grades.length;
    }

    private int getMinimum() {
        int lowGrade = grades[0];
        for (int grade : grades){
            if(grade < lowGrade){
                lowGrade = grade;
            }
        }return lowGrade;
    }

    private int getMaximum() {
        int highGrade = grades[0];
        for (int grade : grades){
            if (grade > highGrade){
                highGrade = grade;
            }
        }return highGrade;
    }

    private void outputBarChart() {
        System.out.println("Grade distribution:");

        int[] frequency = new int[11];

        for (int grade : grades){
            ++frequency[grade/10];
        }

        for (int count = 0; count < frequency.length; count++){
            if(count == 10){
                System.out.printf("%5d: ", 100);
            }
            else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }
            for (int stars = 0; stars < frequency[count]; stars++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}

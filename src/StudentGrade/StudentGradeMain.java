package StudentGrade;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeMain {
    private static ArrayList<Student> students=new ArrayList<>();
    private static Subject[] subjects;
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of students: ");
        int studentNumber=scanner.nextInt();
        System.out.println("Enter the number of subjects each are offering: ");
        int subjectsNo=scanner.nextInt();
        scanner.nextLine();
        subjects=new Subject[subjectsNo];

        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Enter subject "+(i+1)+" name: ");
            String subjectName=scanner.nextLine();
            Subject studentSubject=new Subject(subjectName);
            subjects[i]=studentSubject;
        }

        for (int i = 0; i < studentNumber; i++) {
            System.out.println("Enter "+(i+1)+" student name: ");
            String studentName=scanner.nextLine();
            Student student=new Student(studentName,subjectsNo);
            student.addSubjectList(subjects);
            students.add(student);

            for (int j = 0; j < subjects.length; j++) {
                System.out.printf("Enter student score in %s: ", student.getSubjectName(j));
                int score=scanner.nextInt();
                scanner.nextLine();
                student.getSubject(j).setScore(score);
            }
        }

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

    }

}

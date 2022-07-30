package StudentGrade;

import StudentGrade.Subject;

import java.util.Arrays;

public class Student {

    private String name;
    private Subject[] subject;
    public Student(String name, int subjectLength){
        subject = new Subject[subjectLength];
        this.name=name;
    }

    public Subject[] getSubjectsArray() {
        return subject;
    }

    public void addSubjectList(Subject[] subjectList) {
        Subject sub;
        for(int i = 0; i < subject.length; i++) {
            sub = new Subject(subjectList[i].getName());
            addSubject(sub);
        }
    }

    public String getStudentName() {
        return name;
    }

    public void addSubject(Subject subjectName) {
        for (int i = 0; i < subject.length; i++) {
            if (subject[i]==null){
                subject[i] = subjectName;
                break;
            }
        }
    }

    public String getSubjectName(Subject subjectName) {
        for (int i = 0; i < subject.length; i++) {
            if (subject[i]==subjectName){
                return subject[i].getName();
            }
        }
        return null;
    }

    public String getSubjectName(int index) {
        return subject[index].getName();
}

    public Subject getSubject(int index) {
        return subject[index];
    }

    @Override
    public String toString() {
        return String.format("""
                Student Name: %s
                Subjects: %s
                """,name, Arrays.toString(subject));
    }
}

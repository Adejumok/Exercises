package SchoolManagSys;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final String name;
    private int id;
    private boolean isActivateCourse=true;
    private ArrayList <Student> students= new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format("""
                Name: %s
                Id: %d
                """, name, id);
    }

    public void activateCourse() {
        isActivateCourse = true;
    }

    public boolean isActivateCourse() {
        return isActivateCourse;
    }

    public void deactivate() {
        isActivateCourse = false;
    }

    public Student setStudentOffering(String studentName) {
        Student student = new Student(studentName);
        student.setId(students.size()+1);
        students.add(student);
        return student;
    }

    public List<Student> getAllStudentsOffering() {
        return students;
    }
}

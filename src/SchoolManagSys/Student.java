package SchoolManagSys;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private ArrayList <Course> courses= new ArrayList<>();

    public Student(String studentName) {
        name = studentName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
       return String.format("""
               Name : %s
               Id : %d\s""",name,id);
    }

    public Course selectCourse(String courseName) {
        Course course = new Course(courseName);
        course.setId(courses.size()+1);
        courses.add(course);
        return course;
    }

    public List <Course> viewCourses() {
        return courses;
    }

    public Course dropCourse(String courseName) {
        Course tempCourse;
        for (Course course:courses){
            if (courseName.equalsIgnoreCase(course.getName())){
                tempCourse = course;
                courses.remove(course);
                return tempCourse;
            }
        }throw new CourseNotFoundException("Course not found!");
    }
}

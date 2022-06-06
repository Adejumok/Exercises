package SchoolManagSys;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private ArrayList<Student>students = new ArrayList<>();
    private ArrayList<Course>courses = new ArrayList<>();
    private int id;

    public School(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Student admitStudent(String studentName) {
        Student student = new Student(studentName);
        student.setId(students.size()+1);
        students.add(student);
        return student;
    }


    public int studentSize() {
        return students.size();
    }

    public Student deleteStudentByName(String studentName) {
        Student tempStudent;
        for(Student student : students){
            if(studentName.equalsIgnoreCase(student.getName())){
                tempStudent = student;
                students.remove(student);
                return tempStudent;
            }
        }
        throw new StudentNotFoundException("ops! student not found!");
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void addCourse(String courseName) {
        Course course = new Course(courseName);
        course.setId(courses.size()+1);
        courses.add(course);
    }

    public int getNumberOfCourses() {
        return courses.size();
    }

    public String findCourseById(int id) {
        for(Course course: courses){
            if(id == course.getId()){
                return course.getName();
            }
        }
        throw new CourseNotFoundException("course not found!");
    }

    public Course deleteCourseByName(String courseName) {
        Course tempCourse;
        for (Course course : courses){
            if (courseName.equalsIgnoreCase(course.getName())){
                tempCourse = course;
                courses.remove(course);
                return tempCourse;
            }
        }throw new CourseNotFoundException("Course not found!");
    }

    public List<Course> getAllCourses() {
        return courses;
    }
}

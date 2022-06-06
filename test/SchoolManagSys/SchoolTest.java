package SchoolManagSys;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SchoolTest {

    private School school;
    private Course course;
    private Student student;

    @BeforeEach
    void setUp(){
        school = new School("YabaLeft",1);
        course = new Course("Architecture");
        student = new Student("Quadri");
    }
    @Test
    void testThatSchoolExist (){
        assertNotNull(school);
    }

    @Test
    void testThatSchoolDetailsCanBeAdded(){
        assertEquals("YabaLeft",school.getName());
        assertEquals(1,school.getId());
    }

    @Test
    void testThatSchoolCanAdmitStudent(){
        school.admitStudent("Gbenga");
        assertEquals(1,school.studentSize());
    }

    @Test
    void testThatSchoolCanAdmitMultipleStudents(){
        Student Gbenga = school.admitStudent("Gbenga");
        Student Shola = school.admitStudent("Shola");
        Student Funmi = school.admitStudent("Funmi");
        assertEquals(3,school.studentSize());
        assertEquals(3,Funmi.getId());
        assertEquals(2,Shola.getId());
    }
    @Test
    void testThatSchoolCanDeleteStudentRecord(){
        school.admitStudent("Gbenga");
        school.admitStudent("Shola");
        school.admitStudent("Funmi");
        school.deleteStudentByName("Shola");
        assertThrows(StudentNotFoundException.class,()->school.deleteStudentByName("Bisi"));
        assertEquals(2,school.studentSize());
    }
    @Test
    void testThatAllStudentCanBeGotten(){
        school.admitStudent("Gbenga");
        school.admitStudent("Shola");
        school.admitStudent("Funmi");
        List<Student> students = school.getAllStudents();
        assertEquals("""
                [Name : Gbenga
                Id : 1 , Name : Shola
                Id : 2 , Name : Funmi
                Id : 3 ]""",students.toString());
    }
    @Test
    void testThatCourseCanBeAdded(){
        school.addCourse("Biology");
        assertEquals(1,school.getNumberOfCourses());
    }

    @Test
    void testThatCourseCanBeFound(){
        school.addCourse("Biology");
        school.addCourse("Yoruba");
        school.addCourse("French");
        school.addCourse("Latin");
        assertEquals("French",school.findCourseById(3));

    }

    @Test
    void testThatCourseCanBeDeleted(){
        school.addCourse("Biology");
        school.addCourse("Yoruba");
        school.addCourse("French");
        school.addCourse("Latin");
        school.deleteCourseByName("Biology");
        assertEquals(3,school.getNumberOfCourses());
    }

    @Test
    void testThatAllCoursesCanBeGotten(){
        school.addCourse("Biology");
        school.addCourse("Yoruba");
        school.addCourse("French");
        List<Course>courses = school.getAllCourses();
        assertEquals("""
                [Name: Biology
                Id: 1
                , Name: Yoruba
                Id: 2
                , Name: French
                Id: 3
                ]""", courses.toString());
    }

    @Test
    void testThatCourseCanBeActivated(){
        assertTrue(course.isActivateCourse());
    }

    @Test
    void testThatCourseCanBeDeactivated(){
        assertTrue(course.isActivateCourse());

        course.deactivate();
        assertFalse(course.isActivateCourse());
    }

    @Test
    void testThatCourseCanBeActivatedAgain(){
        course.deactivate();
        assertFalse(course.isActivateCourse());

        course.activateCourse();
        assertTrue(course.isActivateCourse());
    }

    @Test
    void testThatWeCanSetStudentOfferingACourse(){
        course.setStudentOffering("Bolaji");
        course.setStudentOffering("Yoggo");
        List<Student>students = course.getAllStudentsOffering();
        assertEquals("""
                [Name : Bolaji
                Id : 1 , Name : Yoggo
                Id : 2 ]""", students.toString());
    }

    @Test
    void testThatStudentCanSelectCourse(){
        student.selectCourse("Biology");
        student.selectCourse("Yoruba");
        student.selectCourse("French");
        List<Course>courses = student.viewCourses();
        assertEquals("""
                [Name: Biology
                Id: 1
                , Name: Yoruba
                Id: 2
                , Name: French
                Id: 3
                ]""", courses.toString());
    }

    @Test
    void testThatStudentCanDropCourse(){
        student.selectCourse("Greek");
        student.selectCourse("Portuguese");
        student.selectCourse("Chinese");
        student.dropCourse("Portuguese");
        List<Course>courses = student.viewCourses();
        assertEquals("""
                [Name: Greek
                Id: 1
                , Name: Chinese
                Id: 3
                ]""", courses.toString());
    }
}

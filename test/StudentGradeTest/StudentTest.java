package StudentGradeTest;

import StudentGrade.Student;
import StudentGrade.Subject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class StudentTest {
    Student student;
    Subject subject;

    @BeforeEach
    void setUp() {
        student =new Student("Fash",3);
        subject=new Subject("English");

    }

    @Test
    public void testThatSubjectArrayExist(){
        assertNotNull(student.getSubjectsArray());
    }

    @Test
    public void testToSetTheLengthOfSubject(){
        assertEquals(3,student.getSubjectsArray().length);
    }

    @Test
    public void testThatWeCanGetStudentName(){
        assertEquals("Fash",student.getStudentName());
    }

    @Test
    public void testThatStudentCanAddSubject(){

        student.addSubject(subject);
       assertEquals("English", student.getSubjectName(subject));
    }

    @Test
    public void testThatSubjectCanHaveScore(){
        subject.setScore(78);
        assertEquals(78,subject.getScore());
    }


}
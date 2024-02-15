package schoolapp.services.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import schoolapp.enums.Gender;
import schoolapp.enums.StudentStatus;
import schoolapp.model.Course;
import schoolapp.model.Student;

class StudentServiceImplDiffblueTest {
    /**
     * Method under test: {@link StudentServiceImpl#takeACourse(Course, Student)}
     */
    @Test
    void testTakeACourse() {
        // Arrange
        StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
        Course course = new Course("Name", 1);

        Student student = new Student("Name", "2020-03-01", Gender.MALE, 1, "Reg No", new ArrayList<>(),
                StudentStatus.NEWLY_ADMITTED);

        // Act
        studentServiceImpl.takeACourse(course, student);

        // Assert
        assertEquals(1, student.getListOfCourses().size());
    }

    /**
     * Method under test: {@link StudentServiceImpl#takeACourse(Course, Student)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testTakeACourse2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "schoolapp.model.Course.getName()" because "course" is null
        //       at schoolapp.services.impl.StudentServiceImpl.takeACourse(StudentServiceImpl.java:15)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        StudentServiceImpl studentServiceImpl = new StudentServiceImpl();

        // Act
        studentServiceImpl.takeACourse(null,
                new Student("Name", "2020-03-01", Gender.MALE, 1, "Reg No", new ArrayList<>(), StudentStatus.NEWLY_ADMITTED));
    }

    /**
     * Method under test: {@link StudentServiceImpl#takeACourse(Course, Student)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testTakeACourse3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "schoolapp.model.Student.getListOfCourses()" because "student" is null
        //       at schoolapp.services.impl.StudentServiceImpl.takeACourse(StudentServiceImpl.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        StudentServiceImpl studentServiceImpl = new StudentServiceImpl();

        // Act
        studentServiceImpl.takeACourse(new Course("Name", 1), null);
    }
}

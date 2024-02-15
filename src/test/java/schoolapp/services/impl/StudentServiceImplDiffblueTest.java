package schoolapp.services.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
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
}

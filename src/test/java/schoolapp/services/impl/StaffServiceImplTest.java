package schoolapp.services.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import schoolapp.enums.Gender;
import schoolapp.enums.StaffType;
import schoolapp.enums.StudentStatus;
import schoolapp.model.Applicant;
import schoolapp.model.Course;
import schoolapp.model.School;
import schoolapp.model.Staff;
import schoolapp.model.Student;

class StaffServiceImplDiffblueTest {
    /**
     * Method under test: {@link StaffServiceImpl#teach(Staff)}
     */
    @Test
    void testTeach() {
        // Arrange
        StaffServiceImpl staffServiceImpl = new StaffServiceImpl();
        Staff staff = new Staff("Name", "2020-03-01", Gender.MALE, "42", "Hello from the Dreaming Spires", 10.0d,
                StaffType.PRINCIPAL);

        // Act
        staffServiceImpl.teach(staff);

        // Assert that nothing has changed
        assertEquals("2020-03-01", staff.getDateOfBirth());
        assertEquals("42", staff.getStaffId());
        assertEquals("Hello from the Dreaming Spires", staff.getSubject());
        assertEquals("Name", staff.getName());
        assertEquals(10.0d, staff.getSalary());
        assertEquals(Gender.MALE, staff.getGender());
        assertEquals(StaffType.PRINCIPAL, staff.getStaffType());
    }

    /**
     * Method under test: {@link StaffServiceImpl#teach(Staff)}
     */
    @Test
    void testTeach2() {
        // Arrange
        StaffServiceImpl staffServiceImpl = new StaffServiceImpl();
        Staff staff = new Staff("Name", "2020-03-01", Gender.MALE, "42", "Hello from the Dreaming Spires", 10.0d,
                StaffType.TEACHER);

        // Act
        staffServiceImpl.teach(staff);

        // Assert that nothing has changed
        assertEquals("2020-03-01", staff.getDateOfBirth());
        assertEquals("42", staff.getStaffId());
        assertEquals("Hello from the Dreaming Spires", staff.getSubject());
        assertEquals("Name", staff.getName());
        assertEquals(10.0d, staff.getSalary());
        assertEquals(Gender.MALE, staff.getGender());
        assertEquals(StaffType.TEACHER, staff.getStaffType());
    }

    /**
     * Method under test: {@link StaffServiceImpl#teach(Staff)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testTeach3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "schoolapp.model.Staff.getStaffType()" because "staff" is null
        //       at schoolapp.services.impl.StaffServiceImpl.teach(StaffServiceImpl.java:20)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new StaffServiceImpl()).teach(null);
    }

    /**
     * Method under test:
     * {@link StaffServiceImpl#expelStudent(Student, School, Staff)}
     */
    @Test
    void testExpelStudent() {
        // Arrange
        StaffServiceImpl staffServiceImpl = new StaffServiceImpl();
        Student student = new Student("Name", "2020-03-01", Gender.MALE, 1, "Reg No", new ArrayList<>(),
                StudentStatus.NEWLY_ADMITTED);

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffServices = new ArrayList<>();
        ArrayList<Applicant> applicants = new ArrayList<>();
        School school = new School(students, staffServices, applicants, new ArrayList<>(), "Name", "42 Main St");

        // Act
        staffServiceImpl.expelStudent(student, school, new Staff("Name", "2020-03-01", Gender.MALE, "42",
                "Hello from the Dreaming Spires", 10.0d, StaffType.PRINCIPAL));

        // Assert
        List<Student> students2 = school.getStudents();
        assertTrue(students2.isEmpty());
        assertEquals(student.getListOfCourses(), students2);
    }

    /**
     * Method under test:
     * {@link StaffServiceImpl#expelStudent(Student, School, Staff)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExpelStudent2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "schoolapp.model.Student.getName()" because "student" is null
        //       at schoolapp.services.impl.StaffServiceImpl.expelStudent(StaffServiceImpl.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        StaffServiceImpl staffServiceImpl = new StaffServiceImpl();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffServices = new ArrayList<>();
        ArrayList<Applicant> applicants = new ArrayList<>();
        School school = new School(students, staffServices, applicants, new ArrayList<>(), "Name", "42 Main St");

        // Act
        staffServiceImpl.expelStudent(null, school, new Staff("Name", "2020-03-01", Gender.MALE, "42",
                "Hello from the Dreaming Spires", 10.0d, StaffType.PRINCIPAL));
    }

    /**
     * Method under test:
     * {@link StaffServiceImpl#expelStudent(Student, School, Staff)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExpelStudent3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "schoolapp.model.School.getStudents()" because "school" is null
        //       at schoolapp.services.impl.StaffServiceImpl.expelStudent(StaffServiceImpl.java:32)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        StaffServiceImpl staffServiceImpl = new StaffServiceImpl();
        Student student = new Student("Name", "2020-03-01", Gender.MALE, 1, "Reg No", new ArrayList<>(),
                StudentStatus.NEWLY_ADMITTED);

        // Act
        staffServiceImpl.expelStudent(student, null, new Staff("Name", "2020-03-01", Gender.MALE, "42",
                "Hello from the Dreaming Spires", 10.0d, StaffType.PRINCIPAL));
    }

    /**
     * Method under test:
     * {@link StaffServiceImpl#expelStudent(Student, School, Staff)}
     */
    @Test
    void testExpelStudent4() {
        // Arrange
        StaffServiceImpl staffServiceImpl = new StaffServiceImpl();
        Student student = new Student("Name", "2020-03-01", Gender.MALE, 1, "Reg No", new ArrayList<>(),
                StudentStatus.NEWLY_ADMITTED);

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffServices = new ArrayList<>();
        ArrayList<Applicant> applicants = new ArrayList<>();
        School school = new School(students, staffServices, applicants, new ArrayList<>(), "Name", "42 Main St");

        Staff staff = new Staff("Name", "2020-03-01", Gender.MALE, "42", "Hello from the Dreaming Spires", 10.0d,
                StaffType.TEACHER);

        // Act
        staffServiceImpl.expelStudent(student, school, staff);

        // Assert that nothing has changed
        assertEquals("2020-03-01", staff.getDateOfBirth());
        assertEquals("2020-03-01", student.getDateOfBirth());
        assertEquals("42 Main St", school.getAddress());
        assertEquals("42", staff.getStaffId());
        assertEquals("Hello from the Dreaming Spires", staff.getSubject());
        assertEquals("Name", school.getName());
        assertEquals("Name", staff.getName());
        assertEquals("Name", student.getName());
        assertEquals("Reg No", student.getRegNo());
        assertEquals(1, student.getAge());
        assertEquals(10.0d, staff.getSalary());
        assertEquals(Gender.MALE, staff.getGender());
        assertEquals(Gender.MALE, student.getGender());
        assertEquals(StaffType.TEACHER, staff.getStaffType());
        assertEquals(StudentStatus.NEWLY_ADMITTED, student.getStatus());
        List<Course> listOfCourses = student.getListOfCourses();
        assertTrue(listOfCourses.isEmpty());
        assertEquals(listOfCourses, school.getApplicants());
        assertEquals(listOfCourses, school.getClasses());
        assertEquals(listOfCourses, school.getStaff());
        assertEquals(listOfCourses, school.getStudents());
    }

    /**
     * Method under test:
     * {@link StaffServiceImpl#expelStudent(Student, School, Staff)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExpelStudent5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "schoolapp.model.Staff.getStaffType()" because "staff" is null
        //       at schoolapp.services.impl.StaffServiceImpl.expelStudent(StaffServiceImpl.java:29)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        StaffServiceImpl staffServiceImpl = new StaffServiceImpl();
        Student student = new Student("Name", "2020-03-01", Gender.MALE, 1, "Reg No", new ArrayList<>(),
                StudentStatus.NEWLY_ADMITTED);

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffServices = new ArrayList<>();
        ArrayList<Applicant> applicants = new ArrayList<>();

        // Act
        staffServiceImpl.expelStudent(student,
                new School(students, staffServices, applicants, new ArrayList<>(), "Name", "42 Main St"), null);
    }

    /**
     * Method under test:
     * {@link StaffServiceImpl#admitStudents(List, School, Staff)}
     */
    @Test
    void testAdmitStudents() {
        // Arrange
        StaffServiceImpl staffServiceImpl = new StaffServiceImpl();
        ArrayList<Applicant> listOfApplicants = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffServices = new ArrayList<>();
        ArrayList<Applicant> applicants = new ArrayList<>();
        School school = new School(students, staffServices, applicants, new ArrayList<>(), "Name", "42 Main St");

        // Act
        staffServiceImpl.admitStudents(listOfApplicants, school, new Staff("Name", "2020-03-01", Gender.MALE, "42",
                "Hello from the Dreaming Spires", 10.0d, StaffType.PRINCIPAL));

        // Assert
        List<Student> students2 = school.getStudents();
        assertTrue(students2.isEmpty());
        assertEquals(listOfApplicants, students2);
    }

    /**
     * Method under test:
     * {@link StaffServiceImpl#admitStudents(List, School, Staff)}
     */
    @Test
    void testAdmitStudents2() {
        // Arrange
        StaffServiceImpl staffServiceImpl = new StaffServiceImpl();

        ArrayList<Applicant> listOfApplicants = new ArrayList<>();
        listOfApplicants.add(new Applicant("Name", "2020-03-01", Gender.MALE, "Applicant No", 1));
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffServices = new ArrayList<>();
        ArrayList<Applicant> applicants = new ArrayList<>();
        School school = new School(students, staffServices, applicants, new ArrayList<>(), "Name", "42 Main St");

        // Act
        staffServiceImpl.admitStudents(listOfApplicants, school, new Staff("Name", "2020-03-01", Gender.MALE, "42",
                "Hello from the Dreaming Spires", 10.0d, StaffType.PRINCIPAL));

        // Assert
        List<Student> students2 = school.getStudents();
        assertTrue(students2.isEmpty());
        assertEquals(students, students2);
    }

    /**
     * Method under test:
     * {@link StaffServiceImpl#admitStudents(List, School, Staff)}
     */
    @Test
    void testAdmitStudents3() {
        // Arrange
        StaffServiceImpl staffServiceImpl = new StaffServiceImpl();

        ArrayList<Applicant> listOfApplicants = new ArrayList<>();
        listOfApplicants.add(new Applicant("You are not eligible for admission. Try elsewhere", "2020-03-01", Gender.MALE,
                "You are not eligible for admission. Try elsewhere", 1));
        listOfApplicants.add(new Applicant("Name", "2020-03-01", Gender.MALE, "Applicant No", 1));
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffServices = new ArrayList<>();
        ArrayList<Applicant> applicants = new ArrayList<>();
        School school = new School(students, staffServices, applicants, new ArrayList<>(), "Name", "42 Main St");

        // Act
        staffServiceImpl.admitStudents(listOfApplicants, school, new Staff("Name", "2020-03-01", Gender.MALE, "42",
                "Hello from the Dreaming Spires", 10.0d, StaffType.PRINCIPAL));

        // Assert
        List<Student> students2 = school.getStudents();
        assertTrue(students2.isEmpty());
        assertEquals(students, students2);
    }

    /**
     * Method under test:
     * {@link StaffServiceImpl#admitStudents(List, School, Staff)}
     */
    @Test
    void testAdmitStudents4() {
        // Arrange
        StaffServiceImpl staffServiceImpl = new StaffServiceImpl();

        ArrayList<Applicant> listOfApplicants = new ArrayList<>();
        listOfApplicants.add(new Applicant("Name", "2020-03-01", Gender.MALE, "Applicant No", 18));
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffServices = new ArrayList<>();
        ArrayList<Applicant> applicants = new ArrayList<>();
        School school = new School(students, staffServices, applicants, new ArrayList<>(), "Name", "42 Main St");

        // Act
        staffServiceImpl.admitStudents(listOfApplicants, school, new Staff("Name", "2020-03-01", Gender.MALE, "42",
                "Hello from the Dreaming Spires", 10.0d, StaffType.PRINCIPAL));

        // Assert
        assertEquals(1, school.getStudents().size());
    }

    /**
     * Method under test:
     * {@link StaffServiceImpl#admitStudents(List, School, Staff)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAdmitStudents5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "schoolapp.model.School.getStudents()" because "school" is null
        //       at schoolapp.services.impl.StaffServiceImpl.admitStudents(StaffServiceImpl.java:55)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        StaffServiceImpl staffServiceImpl = new StaffServiceImpl();
        ArrayList<Applicant> listOfApplicants = new ArrayList<>();

        // Act
        staffServiceImpl.admitStudents(listOfApplicants, null, new Staff("Name", "2020-03-01", Gender.MALE, "42",
                "Hello from the Dreaming Spires", 10.0d, StaffType.PRINCIPAL));
    }

    /**
     * Method under test:
     * {@link StaffServiceImpl#admitStudents(List, School, Staff)}
     */
    @Test
    void testAdmitStudents6() {
        // Arrange
        StaffServiceImpl staffServiceImpl = new StaffServiceImpl();
        ArrayList<Applicant> listOfApplicants = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffServices = new ArrayList<>();
        ArrayList<Applicant> applicants = new ArrayList<>();
        School school = new School(students, staffServices, applicants, new ArrayList<>(), "Name", "42 Main St");

        Staff staff = new Staff("Name", "2020-03-01", Gender.MALE, "42", "Hello from the Dreaming Spires", 10.0d,
                StaffType.TEACHER);

        // Act
        staffServiceImpl.admitStudents(listOfApplicants, school, staff);

        // Assert that nothing has changed
        assertEquals("2020-03-01", staff.getDateOfBirth());
        assertEquals("42 Main St", school.getAddress());
        assertEquals("42", staff.getStaffId());
        assertEquals("Hello from the Dreaming Spires", staff.getSubject());
        assertEquals("Name", school.getName());
        assertEquals("Name", staff.getName());
        assertEquals(10.0d, staff.getSalary());
        assertEquals(Gender.MALE, staff.getGender());
        assertEquals(StaffType.TEACHER, staff.getStaffType());
        assertEquals(listOfApplicants, school.getApplicants());
        assertEquals(listOfApplicants, school.getClasses());
        assertEquals(listOfApplicants, school.getStaff());
        assertEquals(listOfApplicants, school.getStudents());
    }

    /**
     * Method under test:
     * {@link StaffServiceImpl#admitStudents(List, School, Staff)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAdmitStudents7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "schoolapp.model.Staff.getStaffType()" because "staff" is null
        //       at schoolapp.services.impl.StaffServiceImpl.admitStudents(StaffServiceImpl.java:43)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        StaffServiceImpl staffServiceImpl = new StaffServiceImpl();
        ArrayList<Applicant> listOfApplicants = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffServices = new ArrayList<>();
        ArrayList<Applicant> applicants = new ArrayList<>();

        // Act
        staffServiceImpl.admitStudents(listOfApplicants,
                new School(students, staffServices, applicants, new ArrayList<>(), "Name", "42 Main St"), null);
    }

    /**
     * Method under test:
     * {@link StaffServiceImpl#admitStudents(List, School, Staff)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAdmitStudents8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "schoolapp.model.Applicant.getApplicantAge()" because "applicant" is null
        //       at schoolapp.services.impl.StaffServiceImpl.admitStudents(StaffServiceImpl.java:46)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        StaffServiceImpl staffServiceImpl = new StaffServiceImpl();

        ArrayList<Applicant> listOfApplicants = new ArrayList<>();
        listOfApplicants.add(null);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Staff> staffServices = new ArrayList<>();
        ArrayList<Applicant> applicants = new ArrayList<>();
        School school = new School(students, staffServices, applicants, new ArrayList<>(), "Name", "42 Main St");

        // Act
        staffServiceImpl.admitStudents(listOfApplicants, school, new Staff("Name", "2020-03-01", Gender.MALE, "42",
                "Hello from the Dreaming Spires", 10.0d, StaffType.PRINCIPAL));
    }
}

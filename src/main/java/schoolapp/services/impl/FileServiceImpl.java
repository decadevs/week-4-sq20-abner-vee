package schoolapp;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileServiceImpl {
    public static void main(String[] args) throws IOException {
       getListOfStudentsFromFile();
//        getListOfStaffFromFile();

    }
    public static List<Student> getListOfStudentsFromFile() throws IOException {
        List<String> text = Files.readAllLines(Paths.get("/Users/user/Desktop/Projects/week-4-sq20-abner-vee/src/main/resources/student.csv"), StandardCharsets.UTF_8);
        List<Student> listOfStudents = new ArrayList<>();
        for (int i = 1; i < text.size(); i++) {
              String line = text.get(i);
              String[] arr = line.split(",");
              //name,dateOfBirth,gender,age,regNo,studentStatus
              String name = arr[0];
              String dateOfBirth = arr[1];
              Gender gender = Gender.valueOf(arr[2]);
              Integer age = Integer.parseInt(arr[3]);
              String regNo = arr[4];
              StudentStatus studentStatus = StudentStatus.valueOf(arr[5]);
              Student student = new Student(name, dateOfBirth, gender, age, regNo, new ArrayList<>(), studentStatus);
              listOfStudents.add(student);
        }
        System.out.println(listOfStudents);
        return listOfStudents;
    }

    private static List<Staff> getListOfStaffFromFile() throws IOException {
        List<String> staff = Files.readAllLines(Paths.get("/Users/user/Desktop/Projects/week-4-sq20-abner-vee/src/main/resources/staff.csv"));
        List<Staff> listOfStaff = new ArrayList<>();
        for (int i = 1; i < staff.size(); i++){
            String line = staff.get(i);
            String[] arr = line.split(",");
            //name,dateOfBirth,gender,staffId,subject,salary,staffType
            String name = arr[0];
            String dateOfBirth = arr[1];
            Gender gender = Gender.valueOf(arr[2]);
            String staffId = arr[3];
            String subject = arr[4];
            Integer salary = Integer.parseInt(arr[5]);
            StaffType staffType = StaffType.valueOf(arr[6]);
            Staff work = new Staff(name, dateOfBirth, gender, staffId, subject, salary,  staffType);
            listOfStaff.add(work);
        }
        System.out.println(listOfStaff);
        return listOfStaff;
    }
}

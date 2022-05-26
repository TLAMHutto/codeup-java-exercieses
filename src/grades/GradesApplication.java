package grades;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        Student s1 = new Student("Keaton");
        Student s2 = new Student("Mike");
        Student s3 = new Student("Sam");
        s1.addGrade(100);
        s1.addGrade(90);
        s1.addGrade(80);
        s2.addGrade(100);
        s2.addGrade(90);
        s2.addGrade(80);
        s3.addGrade(100);
        s3.addGrade(90);
        s3.addGrade(80);
        students.put("TLAMHutto", s1);
        students.put("Miket", s2);
        students.put("Mr. Dood", s3);
        do {
            for (String key : students.keySet()) {
                System.out.println(key + ": " + students.get(key).getName());
            }
            System.out.println("Enter a student name to see their grades");
            String studentName = scanner.nextLine();
            if (students.containsKey(studentName)) {
                System.out.println(students.get(studentName).getName() + ": " + students.get(studentName).getAverage());
            }
            else {
                System.out.println("Student not found");
            }
            System.out.println("Enter 'q' to quit");
        } while (!scanner.nextLine().equals("q"));
    }
}

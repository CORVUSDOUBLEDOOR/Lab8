package lab8hade1;
import java.util.Scanner;
import java.util.ArrayList;
public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList <Student> students = new ArrayList<Student>();
        for(int i = 0; i < n; i++){
            int id = kb.nextInt();
            String name = kb.next();
            double gpa = kb.nextDouble();
            students.add(new Student(id, name, gpa));
        }
        for(int i = 0; i < n; i++){
            System.out.println(students.get(i).getName() + "(" + students.get(i).getType() + ")" + students.get(i).checkStatus());
        }
    }
}

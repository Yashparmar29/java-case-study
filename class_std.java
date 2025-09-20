import student.student1;
import java.util.*;
class student_marks
{
    Scanner sc = new Scanner(System.in);
    int mark1,mark2,mark3;
    int total = 0;
    void show()
    {
        System.out.println("java :- ");
        mark1 = sc.nextInt();
        System.out.println("python :- ");
        mark2 = sc.nextInt();
        System.out.println("adbms :- ");
        mark3 = sc.nextInt();
    }
    void result()
    {
        total = (mark1 + mark2 + mark3)/3;
        System.out.println("result :- " + total);

    }
}
public class class_std 
{
    public static void main(String[] args)
    {
        student1 s = new student1();
        s.show();
        student_marks s1 = new student_marks();
        s1.show();
        s1.result();
    }    
}

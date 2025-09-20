package student;
import java.util.Scanner;
import java.io.*;

public class student1 
{
    Scanner sc = new Scanner(System.in);
    int sid;
    String sclass,sname;
    student1()
    {
        System.out.print("Student id: ");
        sid = sc.nextInt();
        System.out.print("Student name: ");
        sname = sc.next();
        System.out.print("Student class: ");
        sclass = sc.next();
    }    
    public void show()
    {
        System.out.println("student id :- " + sid);
        System.out.println("student name  :- " + sname);
        System.out.println("student class :- " + sclass);
    }
}

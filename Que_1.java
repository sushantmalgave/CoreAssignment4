//1) WAP to define a class Student with attributes rollno, name ,
//   marks accept data for 2 objects and display them.
import java.util.*;
class Student
{
    int rollno;
    String name;
    int marks;
    
    void GetDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Roll No: ");
        rollno=sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        this.name=sc.nextLine();
        System.out.print("Marks: ");
        this.marks=sc.nextInt();
    }
    
    void ShowDetails()
    {
        System.out.println("\nRoll No: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }
}

public class Que_1
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student();
        
        s1.GetDetails();
        s2.GetDetails();
        s1.ShowDetails();
        s2.ShowDetails();
    }
}


    
    
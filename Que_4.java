//4) WAP to define a class Employee with attributes id, name, designation accept data
//    for 5 objects and display employee details whose designation is Manager.
import java.util.*;

class Employee
{
    int id;
    String name;
    String Desig;
    Scanner sc=new Scanner(System.in);
    
    Employee()
    {
        System.out.print("Enter ID: ");
        id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name=sc.nextLine();
        System.out.print("Enter Designation: ");
        Desig=sc.nextLine();
    }
}
    
class Que_4
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        Employee e4=new Employee();
        Employee e5=new Employee();
        
        String s="Manager";
        
        if(e1.Desig.equals(s))
            System.out.println("\n"+e1.name+" with ID: "+e1.id+" is Manager");
        
        else if(e2.Desig.equals(s))
            System.out.println("\n"+e2.name+" with ID: "+e2.id+" is Manager");
        
        else if(e3.Desig.equals(s))
            System.out.println("\n"+e3.name+" with ID: "+e3.id+" is Manager");
        
        else if(e4.Desig.equals(s))
            System.out.println("\n"+e4.name+" with ID: "+e4.id+" is Manager");
        
        else
            System.out.println("\n"+e5.name+" with ID: "+e5.id+" is Manager");
    }
}



//2) WAP to define a class Book with attributes id, name, price
//   accept data for 5 objects display book with highest price.
import java.util.*;
class Book
{
    int id;
    String name;
    int price;
    Scanner sc=new Scanner(System.in);
    
    Book()
    {
        System.out.print("Enter ID: ");
        id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Name: ");
        name=sc.nextLine();
        System.out.print("Enter Price: ");
        price=sc.nextInt();
    }
}
    
class Que_2
{
    public static void main(String []args)
    {
        //Scanner sc=new Scanner(System.in);
        Book b1=new Book();
        Book b2=new Book();
        Book b3=new Book();
        Book b4=new Book();
        Book b5=new Book();
        
        if(b1.price>b2.price && b1.price>b3.price && b1.price>b4.price && b1.price>b5.price)
            System.out.println("\nRs."+b1.price+" of "+b1.name+" book with ID: "+b1.id+" is greatest.");
        
        else if(b2.price>b3.price && b2.price>b4.price && b2.price>b5.price)
            System.out.println("\nRs."+b2.price+" of "+b2.name+" book with ID: "+b2.id+" is greatest.");
        
        else if(b3.price>b4.price && b3.price>b5.price)
            System.out.println("\nRs."+b3.price+" of "+b3.name+" book with ID: "+b3.id+" is greatest.");
        
        else if(b4.price>b5.price)
            System.out.println("\nRs."+b4.price+" of "+b4.name+" book with ID: "+b4.id+" is greatest.");
        
        else
            System.out.println("\nRs."+b5.price+" of "+b5.name+" book with ID: "+b5.id+" is greatest.");
    }
}






//5) WAP to define Class Simpleinterest with attributes principal amount, 
//    rate of interest static ,number of years calculate SI and display it. 
import java.util.*;

class Simpleinterest
{
    int princ;
    int rate;
    int years;
    Scanner sc=new Scanner(System.in);
    
    Simpleinterest()
    {
        System.out.print("Enter Principal: ");
        princ=sc.nextInt();
        System.out.print("Enter Rate: ");
        rate=sc.nextInt();
        System.out.print("Enter Years: ");
        years=sc.nextInt();
    }
    
    float CalculateSI()
    {
        float si=(princ*rate*years)/100.0f;
        return si;
    }
    
}
    
class Que_5
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        Simpleinterest s=new Simpleinterest();
        
        System.out.println("SI: Rs."+s.CalculateSI());
     }
}



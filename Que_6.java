
//6) Write a program Complex number to add the real and
//   imaginary part for 2 complex numbers.
import java.util.*;

class Complex
{
    int real;
    int imag;
    Scanner sc=new Scanner(System.in);
    
    Complex()
    {
        System.out.print("Enter Real part: ");
        real=sc.nextInt();
        System.out.print("Enter Imaginary part: ");
        imag=sc.nextInt();
    }
    
    int CalcReal(Complex x)
    {
        int sum=x.real+real;
        return sum;
    }
    
    int CalcImag(Complex x)
    {
        int sum=x.imag+imag;
        return sum;
    }
    
    
}
    
class Que_6
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        Complex s1=new Complex();
        Complex s2=new Complex();
        
        //int a=s1.real+s2.real;
        //int b=s1.imag+s2.imag;
        
        int x=s1.CalcReal(s2);
        int y=s1.CalcImag(s2);
        
        System.out.println("\nSum: "+s1.real+"+"+s1.imag+"i  +  "+s2.real+"+"+s2.imag+"i  =  "+x+"+"+y+"i");
        
        //System.out.println("\nSum: "+s1.real+"+"+s1.imag+"i  +  "+s2.real+"+"+s2.imag+"i  =  "+a+"+"+b+"i");
     }
}
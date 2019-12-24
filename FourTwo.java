import java.util.*;
import java.lang.*;
class FourTwo
{
 public static void main(String[] args)
 {
    Scanner s=new Scanner(System.in);
    int  num1=s.nextInt();
   int  num2=s.nextInt();
     double num3=s.nextDouble();

  
     System.out.println(Calculator.powerInt(num1,num2));
     System.out.println(Calculator.powerDouble(num3,num2));
     
   
 }
}
class Calculator
{
    static  double powerInt(int num1,int num2)
       {
          double pow=Math.pow(num1,num2);
               return  pow;
        }
    static  double powerDouble(double num3,int num2)
       {
          double pow=Math.pow(num3,num2);
               return  pow;
        }

    }
     

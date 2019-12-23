import java.util.*;
import java.lang.*;
class FourTwo
{
 public static void main(String[] args)
 {
    Scanner s=new Scanner(System.in);
  int  num1=s.nextInt();
   int  num2=s.nextInt();
//double num3=s.nextDouble();

     //Box b=new Box();
    //double volume1=b.volume();
     System.out.println(FourTwo.powerInt(num1,num2));
     System.out.println(FourTwo.powerDouble(num3,num2));
     
     //System.out.println(volume1);
 }
}
class Calculator
{
    static  int powerInt(int num1,int num2)
       {
          int pow=math.pow(num1,num2);
               return  pow;
        }
    static  double powerDouble(double num3,int num2)
       {
          double pow=math.pow(num3,num2);
               return  pow;
        }

    }
     
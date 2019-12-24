import java.util.*;
import java.lang.*;
class Four3
{
 public static void main(String[] args)
 {
    Scanner s=new Scanner(System.in);
       String name=s.next();
      double height=s.nextDouble();
     double weight=s.nextDouble();
      System.out.println("patient name is"+name);
     System.out.println("patient bmi is"+Patient.bmi(name,height,weight));
 }
}

class Patient
{
   String name;
   double weight,height;
 double bmi(String name,double height,double weight)
         {
            return((weight/height)*703);

        }
}
     

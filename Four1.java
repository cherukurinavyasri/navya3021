import java.util.*;
class Four1
{
 public static void main(String[] args)
 {
    Scanner s=new Scanner(System.in);
  double len=s.nextDouble();
   double bre=s.nextDouble();
double hei=s.nextDouble();

     Box b=new Box(len,bre,hei);
    double volume1=b.volume();
    //double volume1;
   System.out.println(volume1);
 }
}
class Box
{
    double len,bre,hei;
     Box(double len,double bre,double hei)
   {
      this.len=len;
   this.bre=bre;
   this.hei=hei;
   }
       double volume()
    { 
      return(len*bre*hei);
        }
}
     
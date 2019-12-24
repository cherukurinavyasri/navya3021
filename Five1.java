class Animal
{
   String  sleep()

   {return ("sleeps..");}
    String eat()

    {return ("eats...");}


}
class Bird extends Animal
{
   String fly()

    {return("flys...");}
}


class Five1
   
{
  public static void main(String[] args)
{
   
    Animal a=new Animal();
   System.out.println("I"+a.eat());
   System.out.println("I"+a.sleep());
  
   Bird b=new Bird();
    System.out.println("I"+b.eat());
   System.out.println("I"+b.sleep());
   System.out.println("I"+b.fly());
}
}












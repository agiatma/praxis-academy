
public class Base
{
     public void display()
     {
         System.out.println("Base display()");
     }
     public static void main(String args[])
     {
         Derived obj = new Derived();
         Base objj = new Base();
         obj.display();
         objj.display();
     }
}

public class Derived extends Base
{
     @Override
     public void display()
     {
         System.out.println("Derived display(int )");
     }
     
}


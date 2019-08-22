public class DeprecatedTest
{
    @Deprecated
    public void Display()
    {
        System.out.println("Deprecatedtest display()");
    }

    public void DisplayA()
    {
        System.out.println("New Method()");
    }

   public static void main(String args[])
    {
        DeprecatedTest d1 = new DeprecatedTest();
        DeprecatedTest d2 = new DeprecatedTest();
        d1.DisplayA();
        d2.Display();
    }
}
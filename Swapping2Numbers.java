public class Swapping2Numbers
{
    public static void main(String[] args)
    {

        int a = 10, b = 20;
        System.out.println("Before swapping values are.. "+a+" "+b);
        //logical -Third variable
        // int t = a;
        // a = b;
        // b = t;

        //logic 2- +use + and - without using third variable

        // a=a+b;//10+20=30
        // b=a-b;//30-20=10
        // a=a-b;//30-10=20

        //logic3- use * and / without using third variable
        //here a & b values should not be zero

        // ;a=a*b;//10*20=200
        // b=a/b;//200/20=10
        // a=a/b;//200/10=20

        //logic4 - bitwise xor (^)
        a =a^b;
        b=a^b;
        a=a^b;
        
        System.out.println("After swapping values are.. "+a+" "+b);

    }
    
}

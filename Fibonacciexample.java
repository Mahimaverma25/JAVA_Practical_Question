class Fibonacciexample{
    public static void main(String args[])
    {
        int n1=0, n2=1, n3, i, count=10;
        System.out.print(n1+ ""  +n2);
        for(i=2; i<count; ++i)
        {
            n3=n1+n2;
            System.out.print("\n");
            System.out.print(""  +n3);//changed to print for inline output
            n1=n2;
            n2=n3;
        }
    }
}
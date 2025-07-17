class Harmonic
{
    static double sum(int n)
    {
        double i, s = 0.0;
        for(i=1; i<=n; i++)
        {
            s = s + 1/i;
        }
        return s;
    }
    public static void main(String args[])
    {
        int n = 5;
        System.out.printf("Sum of harmonic series up to %d terms is %.4f%n", n, sum(n));
    }

}
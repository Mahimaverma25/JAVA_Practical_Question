import java.util.Scanner;

public class chapter_02
{
    public static void main(String[] args)
    {
        int x, y, sum;
        Scanner myObj = new Scanner(System.in);
        try{
            System.out.println("Type a number:");
        x= myObj.nextInt();

        System.out.println("Type another number:");
        y = myObj.nextInt();

        sum = x + y;
        System.out.println("sum is:" + sum);

        } catch(Exception e){
            System.out.println("Please enter valid interger.");
        }finally{
            myObj.close();

        }
    }
}
import java.util.Scanner;
public class SumOfTwoDigits{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of : ");
        int num = scanner.nextInt();
         int sum = SumOfTwoDigits(num);
        System.out.println("Sum is digits: " + sum);
    }
    public static int SumOfTwoDigits(int num){
        int sum = 0;
        while(num!=0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
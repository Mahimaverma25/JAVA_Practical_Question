import java.util.Scanner;

public class DecimalToPaise{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price in decimal:");
        double decimalPrice = scanner.nextDouble();
        int Paise = (int)(decimalPrice *100);
        System.out.println(decimalPrice + "Ruppes is equal to" + Paise + "Paise");
    }
}
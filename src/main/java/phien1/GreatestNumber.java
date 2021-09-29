package phien1;
import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("First number: ");
        double a = input.nextDouble();
        System.out.println("Second number: ");
        double b = input.nextDouble();
        System.out.println("Third number: ");
        double c = input.nextDouble();
        if(a > b || a > c){
            System.out.println("Greatest number is "+a);
        }
        else if (b>a || b>c){
            System.out.println("Greatest number is "+b);
        }
        else{
            System.out.println("Greatest number is "+c);
        }
    }
}

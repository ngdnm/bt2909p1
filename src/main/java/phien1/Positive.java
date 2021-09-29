package phien1;
import java.util.Scanner;
public class Positive {
    public static void main(String[] args){
        System.out.println("Nhap Number : ");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        if (number > 0){
            System.out.println(number+" is a positive number");
        }
        else if(number < 0){
            System.out.println(number+" is a negative number");
        }
        else{
            System.out.println(number+" is neither positive nor negative");
        }
    }
}

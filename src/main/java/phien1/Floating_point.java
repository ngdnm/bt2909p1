package phien1;
import java.util.Scanner;
public class Floating_point {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Floating_point number : ");
        double a = input.nextDouble();
        System.out.println("Floating_point number 2: ");
        double b = input.nextDouble();
        if(Math.round(a*1000)/1000 == Math.round(b*1000)/1000){
            System.out.println("They are same");
        }
        else{System.out.println("They are different");
        }
    }
}
package phien1;
import java.util.Scanner;
public class Weekday {
    public static void main(String[] args) {
        String[] days = {"Monday" , "Tuesday","Wednesday","Thursday","Friday","Saturday" , "Sunday"};
        System.out.println("Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(days[number]);
    }
}


package coditionals;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int a = sc.nextInt();
        if(a%4==0)
        {
            System.out.printf("%d is Leap Year ",a);
        }
        else
        {
            System.out.printf("%d is not Leap Year ",a);
        }


    }
}

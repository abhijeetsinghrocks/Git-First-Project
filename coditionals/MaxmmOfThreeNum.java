package coditionals;
import java.util.*;
public class MaxmmOfThreeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Num : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Num : ");
        int b = sc.nextInt();

        System.out.print("Enter Third Num : ");
        int c = sc.nextInt();

        int max;

        max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }
}

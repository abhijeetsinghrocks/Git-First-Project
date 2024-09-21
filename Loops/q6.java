package Loops;
import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Alphabet : ");
        char a = sc.next().charAt(0);

        for(int i=1; i<=a; i++)
        {
            System.out.println(" "+i);
        }
    }
}

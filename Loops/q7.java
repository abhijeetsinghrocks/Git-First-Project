package Loops;
import java.util.*;
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Alphabet : ");

        char a = sc.next().charAt(0);

        for(char i='a'; a>=i; a--)
        {
            System.out.println(""+a);
        }
    }
}

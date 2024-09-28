package PatternBasic;
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int hor=1; hor<=n; hor++)
        {
            System.out.print("\n");
            for(int ver = 1;ver<=n;ver++)
            {
                System.out.print("* ");
            }
        }
    }
}

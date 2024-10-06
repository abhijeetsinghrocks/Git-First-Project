package PatternAdvance;
import java.util.*;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int a=1;
        char ab='A';
        char cd='a';
        for(int i=1; i<=n; i++)
        {
            System.out.print("\n");
            for(int j=1; j<=i; j++ )
            {
                if(a%2==0)
                {
                    System.out.print(ab);
                }
                else
                {
                    System.out.print(cd);
                }
                ab++;
                cd++;
                a++;
            }
        }
    }
}

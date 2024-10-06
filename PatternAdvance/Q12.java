package PatternAdvance;
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        char bc='B';
        char ab='A';

        for(int i=1; i<=n; i++)
        {
            System.out.println();
            for(int j=1; j<=n; j++)
            {
                if(i==1)
                {
                    System.out.print(ab);
                    ab++;
                }
                if(i>1 && j<2)
                {
                    System.out.print(bc);
                    bc++;
                }
            }
        }
    }
}

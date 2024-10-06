package PatternAdvance;
import java.util.*;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int a=1;
        char ab='A';
        for(int i=1; i<=n; i++)
        {
            System.out.print("\n");
            for(int j=1; j<=n; j++)
            {
                if(i%2==1 && j%2==1)
                {
                    System.out.print(a);
                    a++;
                }
                else
                {
                    System.out.print(" ");
                }

                if(i%2==0 && j%2==0)
                {
                    System.out.print(ab);
                    ab++;
                }
                else
                {
                    System.out.print(" ");
                }


            }
        }
    }
}

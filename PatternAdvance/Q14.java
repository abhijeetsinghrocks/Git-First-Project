package PatternAdvance;
import java.util.*;
public class Q14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int a=2;
        for(int i=1; i<=n; i++)
        {
            System.out.print("\n");
            for(int j=1; j<=n; j++)
            {
                if(i==1)
                {
                    System.out.print(j);
                }
                if(i>1 && j==1)
                {
                    System.out.print(a);
                    a++;
                }
            }
        }

    }
}

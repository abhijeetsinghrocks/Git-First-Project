package PatternAdvance;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            System.out.println();
            for(int j=1; j<=n; j++)
            {
                if(i>1 && i<n)
                {
                    if(j>1 && j<n)
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    System.out.print("*");
                }

            }
        }
    }
}

package coditionals;
import java.util.*;

public class identifyingchar {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char a = sc.next().charAt(0);
        if(a>='a'&&a<='z')
        {
            System.out.printf("Small Letter : %c",a);
        }
        else if(a>='A'&&a<='Z')
        {
            System.out.printf("Capital Letter : %c",a);
        }
        else if(a>='0'&&a<='9')
        {
            System.out.printf("Number : %c",a);
        }
        else
        {
            System.out.printf("Special Character : %c",a);
        }
    }
}

package coditionals;
import java.util.*;

public class alphabetcheck {
    public static void main (String[] args)
    {
        System.out.print("Enter a Character : ");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(a>='a' &&a<='z')
        {
            System.out.printf("Given character is Alphabet : %c",a);
        }
        else if (a>='A' && a<='Z')
        {
            System.out.printf("Given character is Alphabet : %c",a);
        }
        else
        {
            System.out.printf("Given character is not an Alphabet : %c",a);
        }
    }
}

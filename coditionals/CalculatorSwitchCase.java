package coditionals;

import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter First Number : ");
        int a = sc.nextInt();

        System.out.printf("Enter Operation : ");
        char op = sc.next().charAt(0);

        System.out.printf("Enter Second Number : ");
        int b = sc.nextInt();

        int c;
        int fail=0;

        switch(op)
        {
            case '+':
            c=a+b;
            fail=1;
            System.out.printf("result : %d",c);
            break;

            case '-':
                c=a-b;
                fail=1;
                System.out.printf("result : %d",c);
                break;

            case '*':
                c=a*b;
                fail=1;
                System.out.printf("result : %d",c);
                break;

            case '/':
                c=a/b;
                fail=1;
                System.out.printf("result : %d",c);
                break;

        }
        if(fail==0)
        {
            System.out.print("Invalid Operator!!!!!!");
        }
    }
}

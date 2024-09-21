package Loops;
import java.util.*;
public class qRevTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number you want Table of : ");
        int a = sc.nextInt();

        for(int i=10;i>=1;i--)
        {
            int res = 0;
            res = a*i;
            System.out.println(a+" x "+i+" = "+res);
        }
    }
}

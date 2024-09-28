package LoopAdvance;

import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=-9999,min=9999;
        float avg=0;
        for(int n =1;n<=10;n++)
        {
            System.out.print("Enter no : ");
            int in = sc.nextInt();
            if(in>max)
            {
                max=in;
            }
            if(in<min)
            {
                min=in;
            }
            avg=avg+in;
        }
        float ans=avg/10;
        System.out.print("Avg of Given No is : "+ans);
    }
}

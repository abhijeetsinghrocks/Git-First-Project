package coditionals;
import java.util.*;

public class reportcard {
    public static void main(String[] args) {
        System.out.printf("Enter Number of Subjects : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        double sum = 0;

        int total = size * 100;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        double percentage = sum / total * 100;

        System.out.printf("Total Percentage Outcome is : %.2f", percentage);
        if (percentage >= 60) {
            System.out.printf("\nAnd Passed with 1st Division");
        } else if (percentage >= 40 && percentage < 60) {
            System.out.printf("\nAnd Passed with 2nd Division");
        } else if (percentage >= 32 && percentage < 40) {
            System.out.printf("\nAnd Passed with 3rd Division");
        } else {
            System.out.printf("\nFailed!!!");
        }


    }
}

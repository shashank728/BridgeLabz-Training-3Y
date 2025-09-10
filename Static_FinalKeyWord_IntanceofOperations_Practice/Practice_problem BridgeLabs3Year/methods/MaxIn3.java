package methods;

import java.util.Scanner;

public class MaxIn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println("Largest of three: "+ max);

        sc.close();
    }
}

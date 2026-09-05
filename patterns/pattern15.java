/*
In this program we will print the following pattern:
ABCDE
ABCD
ABC
AB
A
*/

import java.util.Scanner;

public class pattern15 {
    public static void pattern(int n){
        //for rows
        for(int i=1; i<=n; i++){
            //for pattern
            for(char ch='A'; ch<='A'+(n-i); ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}

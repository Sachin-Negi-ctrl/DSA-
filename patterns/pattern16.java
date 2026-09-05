/*
In this program we will print the following pattern:
A
BB
CCC
DDDD
EEEEE
*/

import java.util.Scanner;

public class pattern16 {
    public static void pattern(int n){
        //for rows
        char start = 'A';
        for(int i=1; i<=n; i++){
            //for pattern
            for(int j=1; j<=i; j++){
                System.out.print(start);
            }
            start++;
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}

/*
In this program we will print this pattern:
1
2 2
3 3 3 
4 4 4 4
up until n
*/

import java.util.Scanner;

public class pattern4{
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of lines :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }
}
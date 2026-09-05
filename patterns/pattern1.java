/*
This function will print * of equal columns and rows
* * * * 
* * * * 
* * * * 
* * * * 
*/

import java.util.Scanner;

public class pattern1{
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*"); //For printing the stars.
            }
            System.out.println(); //For terminating line after stars.
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
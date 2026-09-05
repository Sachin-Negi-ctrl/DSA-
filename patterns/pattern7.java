/*
In this program we will created the following pattern:
    *
   ***
  *****
*********
*/

import java.util.Scanner;

public class pattern7{
public static void pattern(int n){

    for(int i=0; i<n; i++){
        //for leading space
        for(int j=1; j<n-i; j++){
            System.out.print(" ");
        }
        //for stars
        for(int k=0; k<2*i+1; k++){
            System.out.print("*");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        System.out.println("Enter the number of lines:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
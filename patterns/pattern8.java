/*
In this program we will print the following pattern:
*********
 *******
  *****
   ***
    *
*/

import java.util.Scanner;

public class pattern8{
public static void pattern(int n){

    for(int i=0; i<n; i++){
        //for gap
        for(int j=0; j<i; j++ ){
            System.out.print(" ");
        }
        //for *
        for(int k=0; k<2*n-(2*i+1); k++){
            System.out.print("*");
        }
        System.out.println();
    }
}

//My approach
/*
import java.util.Scanner;

public class demo{
    public static void pattern(int n){
        //for rows
        for(int i=0; i<n; i++){
            //for space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            //for stars
            for(int k=i; k<n*2-i-1; k++){
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
 */

    public static void main(String[] args) {
        System.out.println("Enter the number of lines:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
} 
    


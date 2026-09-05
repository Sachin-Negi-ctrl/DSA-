/*
In this program we will print this pattern:
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*/
import java.util.Scanner;

public class pattern20 {
    public static void pattern(int n){
        //top half
        //for rows
        for(int i=1; i<=n; i++){
            //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //for space
            for(int k=1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //bottom half
        //for rows
        for(int i=1; i<n; i++){
            //for stars
            for(int j=i; j<n; j++){
                System.out.print("*");
            }
            //for space
            for(int k=1; k<=2*i; k++){
                System.out.print(" ");
            }
            //for stars
            for(int j=i; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }
}

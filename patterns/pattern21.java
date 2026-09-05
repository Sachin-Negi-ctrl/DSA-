/*
In this program we will print this pattern:
*****
*   *
*   *
*   *
*****
*/
import java.util.Scanner;

public class pattern21 {
    public static void pattern(int n){
        //for rows
        // for(int i=1; i<=n; i++){
        //     //for stars
        //     if(i==1 || i==n){
        //         for(int j=1; j<=n; j++){
        //             System.out.print("*");
        //         }
        //     }else{
        //         System.out.print("*");
        //         for(int k=1; k<n-1; k++){
        //             System.out.print(" ");
        //         }
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //SECOND APPROACH
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 ||i==n ||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
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

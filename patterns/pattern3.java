// This snippet will print the pattern :
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// up until n

import java.util.Scanner;

public class pattern3 {
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the number of lines :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        pattern(n);
    }
}

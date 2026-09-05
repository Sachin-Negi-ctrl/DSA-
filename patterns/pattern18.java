/*
In this pattern we will print the following pattern:
E 
D E 
C D E 
B C D E 
A B C D E
*/
import java.util.Scanner;

public class pattern18 {
    public static void pattern(int n){
        //for rows
        // for(int i=1; i<=n; i++){
        //     //for pattern
        //     for(int j=n-i; j<n; j++){
        //         char start = 'A'; //Every time the "start" starts from 'A' which is equvalent to 1.(We have initialized this inside the loop bcz we have to get the start at 1 everytime before adding the j in it to get the desired o/p)
        //         start +=j; //Then we add n-i value; for n=5=> 5-1 = 4, which eventually comes down to 'A'/1 + 4 which is 'E'/5. 
        //         System.out.print(start+" ");

        //         // ch++;
        //     }
        //     System.out.println();
        
        //SECOND VERSION
        for(int i=0; i<n; i++){
            for(char ch=(char)('E'-i); ch<='E'; ch++){
                System.out.print(ch+" ");
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

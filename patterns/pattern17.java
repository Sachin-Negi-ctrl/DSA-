import java.util.Scanner;

public class pattern17 {
    public static void pattern(int n){
        //for rows
        
        for(int i=1; i<=n; i++){
            //for space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for pattern
            char start = 'A';
            for(int k=1; k<=i; k++){ 
                System.out.print(start);
                start++;
            }
            start -=2;
            for(int l=i; l>1; l--){
                // int s = l-1;
                System.out.print(start--);
            }
            // start -= 2;
            // for (int l = 1; l < i; l++) {
            //     System.out.print(start--);
            // }
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

// 2d arrays
import java.util.*;
public class Main_11_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] numbers=new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                numbers[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// 2d array searching
import java.util.*;
public class Main_11_2 {
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
        int key=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(numbers[i][j]==key) {
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}

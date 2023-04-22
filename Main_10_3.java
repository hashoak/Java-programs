// array searching
import java.util.*;
public class Main_10_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++) {
            if(arr[i]==key) System.out.print(i+" ");
        }
    }
}
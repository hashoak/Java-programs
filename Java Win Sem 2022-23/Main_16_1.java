// bubble sort
import java.util.*;
public class Main_16_1 {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {

            a[i]=sc.nextInt();
        }
        sc.close();
        int t;
        for(int i=1;i<n;i++) {

            for(int j=0;j<n-i;j++) {

                if(a[j]>a[j+1]) {

                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i=0;i<n;i++) {

            System.out.print(a[i]+" ");
        }

    }
}

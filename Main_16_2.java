// selection sort
import java.util.*;
public class Main_16_2 {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {

            a[i]=sc.nextInt();
        }
        sc.close();
        int t,li;
        for(int i=0;i<n-1;i++) {

            li=i;
            for(int j=i+1;j<n;j++) {

                if(a[j]<a[i]) {

                    li=j;
                }
            }
            t=a[i];
            a[i]=a[li];
            a[li]=t;
        }
        for(int i=0;i<n;i++) {

            System.out.print(a[i]+" ");
        }

    }
}

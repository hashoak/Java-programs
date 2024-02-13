// selection sort
import java.util.*;
public class Main_16_3 {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {

            a[i]=sc.nextInt();
        }
        sc.close();
        int t,li;
        for(int i=1;i<n;i++) {

            li=i;
            while(li>0 && a[li]<a[li-1]) {

                t=a[li];
                a[li]=a[li-1];
                a[li-1]=t;
                li--;
            }
        }
        for(int i=0;i<n;i++) {

            System.out.print(a[i]+" ");
        }
    }
}

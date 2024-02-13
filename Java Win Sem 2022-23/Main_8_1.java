// GCD
import java.util.*;
public class Main_8_1 {
    public static int GCD(int a,int b) {
        for(int i=Math.min(a,b);i>0;i--)
        {
            if(a%i==0 && b%i==0) return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int gcd=GCD(a,b);
        System.out.println(gcd);
    }
}

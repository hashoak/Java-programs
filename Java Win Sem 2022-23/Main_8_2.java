// functions
import java.util.*;
public class Main_8_2 {
    public static void fibonacci(int n) {
        int a=0,b=1,t;
        while(n-->0)
        {
            System.out.print(a);
            System.out.print(" ");
            t=a;
            a=b;
            b+=t;
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        fibonacci(n);
    }
}

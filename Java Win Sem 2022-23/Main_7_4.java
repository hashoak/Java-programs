// functions
import java.util.*;
public class Main_7_4 {
    public static int factorial(int a) {
        if(a<0) return 0;
        int f=1;
        while(a>0) f*=a--;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fact=factorial(a);
        System.out.println(fact);
        sc.close();
    }
}

// functions
import java.util.*;
public class Main_7_3 {
    public static int multiply(int a,int b) {
        int p=a*b;
        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int prod=multiply(a,b);
        System.out.println(prod);
        sc.close();
    }
}

// functions
import java.util.*;
public class Main_7_2 {
    public static int calcSum(int a,int b) {
        int s=a+b;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calcSum(a,b);
        System.out.println(sum);
        sc.close();
    }
}

// bit manipulation
import java.util.*;
public class Main_15_1 {
    public static void getBit(int n,int p) {
        if((1>>(p-1)&n)!=0) {
            System.out.println("Bit is one");
        } else {
            System.out.println("Bit is zero");
        }
    }
    public static int setBit(int n,int p) {
        return 1<<(p-1)|n;
    }
    public static int clearBit(int n,int p) {
        return ~(1<<(p-1))&n;
    }
    public static int updateBit(int n,int p,int b) {
        if(b==1) {
            return setBit(n,p);
        } else {
            return clearBit(n,p);
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        getBit(n,p);
        p=sc.nextInt();
        n=setBit(n,p);
        System.out.println(n);
        p=sc.nextInt();
        n=clearBit(n,p);
        System.out.println(n);
        n=sc.nextInt();
        p=sc.nextInt();
        int b=sc.nextInt();
        n=updateBit(n,p,b);
        System.out.println(n);
        sc.close();
    }
}

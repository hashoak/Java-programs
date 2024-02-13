// tower of henoi
import java.util.*;
public class Main_17_2_1 {
    public static int towerOfHenoi(int n,String src,String hlp,String dst) {

        if(n==0) return 0;
        int moves=towerOfHenoi(n-1,src,dst,hlp);
        System.out.println("From "+src+" to "+dst);
        moves+=towerOfHenoi(n-1,hlp,src,dst);
        return ++moves;
    }
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(towerOfHenoi(n, "A", "B", "C")+" no.of moves");
        sc.close();
    }
}
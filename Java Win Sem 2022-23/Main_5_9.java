// 0-1 triangle
import java.util.*;
public class Main_5_9 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((i+j+1)%2);
            }
            System.out.println();
        }
    }
}

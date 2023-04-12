// half pyramid
import java.util.*;
public class Main_5_3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

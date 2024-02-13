// inverted half pyramid 180 deg rotated
import java.util.*;
public class Main_5_5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        for(int i=a;i>0;i--)
        {
            for(int j=1;j<=a;j++)
            {
                if(j>=i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

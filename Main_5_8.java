// floyd's triangle
import java.util.*;
public class Main_5_8 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),x=0;
        sc.close();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(++x);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// arrays
import java.util.*;
public class Main_10_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int numbers[]=new int[n];
        for(int i=0;i<n;i++)
        {
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}

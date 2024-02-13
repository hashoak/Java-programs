//  loops - for, while, do while
import java.util.*;
public class Main_4_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),i;
        sc.close();
        for(i=0;i<a;i++) {
            System.out.println(i);
        }
        System.out.println();
        i=0;
        while(i<a){
            System.out.println(i);
            i++;
        }
        System.out.println();
        
        i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<a);
        System.out.println();
    }
}

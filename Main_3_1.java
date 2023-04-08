// if, else if, else
import java.util.*;

public class Main_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Not adult");
        }

        if(a%2==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }

        int b=sc.nextInt();
        if(a==b) {
            System.out.println("Equal");
        }
        else if(a>b) {
            System.out.println("a Greater than b");
        }
        else{
            System.out.println("a Less than b");
        }
        sc.close();
    }
}

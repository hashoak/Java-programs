// functions
import java.util.*;
public class Main_7_1 {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printMyName(name);
        sc.close();
    }
}

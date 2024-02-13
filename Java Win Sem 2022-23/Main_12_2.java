// string operations
import java.util.*;
public class Main_12_2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.next(),lastName=sc.next();
        // concatenation
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);
        // length
        System.out.println(fullName.length());
        // chatAt
        for(int i=0;i<fullName.length();i++) {
            System.out.println(fullName.charAt(i));
        }
        // compare => a.compareTo(b)=ascii(a)-ascii(b)
        if(firstName.compareTo(lastName)==0) {
            System.out.println("Names are equal");
        }
        else {
            System.out.println("Names are not equal");
        }
        // sub-string
        String middleName=fullName.substring(2,8);
        System.out.println(middleName);
        // NOTE: STRINGS ARE IMMUTABLE!!!
        sc.close();
    }
}

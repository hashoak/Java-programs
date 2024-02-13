// string builder
public class Main_13_1 {
    public static void main(String args[]) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        // get length
        System.out.println(sb.length());
        // get char
        System.out.println(sb.charAt(2));
        // set char
        sb.setCharAt(2,'b');
        System.out.println(sb);
        // insert
        sb.insert(3,'e');
        System.out.println(sb);
        // delete
        sb.delete(2,4);
        System.out.println(sb);
        // append
        sb.append("o");
        sb.append("t");
        sb.append("a");
        System.out.println(sb);
    }
}

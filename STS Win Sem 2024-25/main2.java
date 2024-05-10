import java.util.*;

public class main2 {
    static Stack <Integer> s;
    static Stack <Integer> ms;

    static void push(int n){
        s.push(n);
        if(ms.empty() || n<=ms.peek()) ms.push(n);
    }

    static void pop()
    {
        if(s.peek()==ms.peek()) ms.pop();
        s.pop();
    }

    static int getMin()
    {
        return ms.peek();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        s=new Stack<Integer>();
        ms=new Stack<Integer>();
        while(n-->0){
            switch(sc.nextInt()){
                case 1:
                    push(sc.nextInt());
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    System.out.println(getMin());
                    break;
                default:
                    break;
            }
        }
    }
}

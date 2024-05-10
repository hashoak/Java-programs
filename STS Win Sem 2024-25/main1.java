import java.util.*;

public class main1{
    static void preorder(String[] lev,int i){
        if(i>=lev.length) return;
        System.out.print(lev[i]+" ");
        preorder(lev, 2*i+1);
        preorder(lev, 2*i+2);
        return;
    }
    static void inorder(String[] lev,int i){
        if(i>=lev.length) return;
        inorder(lev, 2*i+1);
        System.out.print(lev[i]+" ");
        inorder(lev, 2*i+2);
        return;
    }
    static void postorder(String[] lev,int i){
        if(i>=lev.length) return;
        postorder(lev, 2*i+1);
        postorder(lev, 2*i+2);
        System.out.print(lev[i]+" ");
        return;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] lev=sc.nextLine().split(" ");
        System.out.println("Level order traversal:");
        for(int i=0;i<lev.length;i++)
            System.out.print(lev[i]+" ");
        System.out.println("\nPreorder traversal:");
        preorder(lev,0);
        System.out.println("\nInorder traversal:");
        inorder(lev,0);
        System.out.println("\nPostorder traversal:");
        postorder(lev,0);
        // for(int i=0;i<lev.length;i++)
        //     System.out.print(lev[i]+" ");
    }
}
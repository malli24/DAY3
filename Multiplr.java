import java.util.*;
public class Multiplr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a&(a-1))==0)
       {
        System.out.println("multiple of 2");
       } 
    else{
        System.out.println("not multiple of 2");
    }
}
    
    
}
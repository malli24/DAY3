import java.util.*;
public class Ifblock {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        if((a&1)==0)
        {
            System.out.println("even number");
        }
    else{
        System.out.println("odd number");
    }
}
    }
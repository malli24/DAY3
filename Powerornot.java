import java.util.Scanner;

public class Powerornot {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
    int a=Sc.nextInt();
if((a&(a-1))==0)
{
    System.out.println("it is power of 2");
}
else{
    System.out.println("not power of 2");
}
}
    
}
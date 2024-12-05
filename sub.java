import java.util.*;
public class sub {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        String S=sc.nextLine();
        boolean p =a>=35 && b>=35 && c>=35 && d>=35 && e>=35 ;
        double avg=(a+b+c+d+e)/5;

           if(avg>=80 && avg<=100 && p)
        {
           String f=String.format("%S your status=PASS avg=%f and grade=A",S,avg);
           System.out.println(f);
        }
           else if(avg>=60 && avg<=80 && p)
        {
            String f=String.format("%S your status=PASS avg=%f and grade=B",S,avg);   
            System.out.println(f);
        }
        else if(avg>=40 && avg<=60 && p)
        {
            String f=String.format("%S your status=PASS avg=%f and grade=C",S,avg);   
            System.out.println(f);
        }
            else 
            {
                String f=String.format("%S your status=PASS avg=%f and grade=F",S,avg);   
            System.out.println(f);
        }
    }
    }
}
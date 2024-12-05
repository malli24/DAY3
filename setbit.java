public class setbit {
    public static void main(String args[])
    {
        int a=18;
        int pos=2;
        if((a&(1<<pos))!=0)
        {
            System.out.println("not set");
        }
        else{
            System.out.println("set bit");
        }
    }
    
}
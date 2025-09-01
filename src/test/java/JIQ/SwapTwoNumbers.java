package JIQ;

public class SwapTwoNumbers
{
    public static void swapTwoNumbs(int a , int b){

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a="+a+" b="+b);

    }

    public static void main(String[] args)
    {
        int first =5;
        int second =7;
        swapTwoNumbs(first,second);
    }
}

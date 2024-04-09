import java.util.Scanner;

class Program
{
   static boolean isPrime(int a)
    {
        for (int i = 2; i <= Math.sqrt(a); i++)
        {
            if (a % i == 0)
                return false;
        }
        return true;
    }
    static boolean DoSumAndCHeckit(int i)
    {
        int a = 0;
        while (i != 0)
        {
            a += i % 10;
            i = i /10;
        }
        return isPrime(a);
    }
    public static void main(String[] str)
    {
        try 
        {
            int i = 0;
            Scanner obj = new Scanner(System.in);
            String a ;

            while (true)
            {
                a = obj.nextLine();
                int x = Integer.valueOf(a);
                if (x == 42)
                    break;
                if (DoSumAndCHeckit(x) == true)
                    i++;
        }
        System.out.println("Count of coffee-request : "+ i);

            
        }catch(NumberFormatException e)
        {
            System.err.println("INvalid Formate");
        }
    }
}
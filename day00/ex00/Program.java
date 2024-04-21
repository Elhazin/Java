import java.util.Scanner;

class Program
{
    public static void main(String[] str)
    {
        int i = 0;
        
        
        // Scanner obj = new Scanner(System.in);
        // String a  = obj.nextLine();
        try {
            int x = 479598;
            while (x > 0)
            {
                i += x % 10;
                x = x / 10;
            }
            System.out.println(i);
        }
        catch(NumberFormatException e)
        {
            System.err.println("INvalid Formate");
        }

    }
}
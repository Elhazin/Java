import java.util.Scanner;

class Program
{
    public static void main(String[] str)
    {
        Scanner input = new Scanner(System.in);
        try {
            String num = input.nextLine();
            Integer size =0;
            Integer number = Integer.valueOf(num);
            if (number <= 1 )
                throw new NumberFormatException();
            for (Integer i = 2; i <= Math.sqrt(number); i++)
            {
                size++;
                if (number % i == 0)
                {
                    System.out.println("false " + size);
                    return ;
                }
            }
            System.out.println("true " + size);    
        }
        catch(NumberFormatException e)
        {
            System.out.println("IllegalArgument");
        }
    }
}
import java.util.Scanner;

class Program
{
    static String createStatistics(int size)
    {
        String str = "";
        for (int i = 0; i < size; i++)
        {
            str += "=";
        }
        str += ">";
        return str;
    }
    static String GetMinStatistics(String str)
    {
        String[] arr = str.split(" ");
        int min = Integer.MAX_VALUE;
        try {
            for (String s : arr)
            {
                int x = Integer.valueOf(s);
                if (x < min)
                    min = x;
            }
        } catch (NumberFormatException e)
        {
            System.err.println("Invalid Format");
            System.exit(e.hashCode());
        }
        return createStatistics(min);
    }
    public static void main(String[] str)
    {
        int i = 0;
        String value;
        String arr[] = new String[17];
        String weekcheck = "Week";
        Scanner obj = new Scanner(System.in);
        boolean weekcheckflag = false;
        try {
        while (true)
        {
            if (i == 17)
                break;
            value = obj.nextLine();
            if (value.equals("42"))
            {
                break;

            }
            if (value.contains(weekcheck) == true)
            {
                if (value.equals(weekcheck + " " + Integer.toString(i + 1)) == false )
                {
                    throw new NumberFormatException();
                }
                else 
                {
                    arr[i] = value;
                }
                weekcheckflag = true;
            }
            else if (weekcheckflag == true)
            {
                arr[i] += " ";
                arr[i] +=  GetMinStatistics(value);
                i++;
            }
            else 
                throw new NumberFormatException();


        }
    }
    catch (NumberFormatException e)
    {
        System.err.println("Invalid Format here  " + e.getMessage());
        System.exit(e.hashCode());
    }
    for (String s : arr)
    {
        if (s != null)
            System.out.println("     " + s);
    }

    }   
}
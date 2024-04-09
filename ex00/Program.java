package ex00;


class Program
{
    public static void  main(String[] str)
    {
        int i = 479598;
        int temp = i;
        int f = 0;
        while (temp != 0)
        {
            f += temp % 10;
            temp = temp / 10;
        }
        System.out.println(f);
    }
}
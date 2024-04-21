import javax.print.DocFlavor.STRING;

class User{
    private String Name;
    private String Identifier;
    private int Balance;
    public int  GetBalance()
    {
        return Balance;
    }
    public String  GetName()
    {
        return Name;
    }
    public String  GetIdentifier()
    {
        return Identifier;
    }
    public void SetBalance(int  balance)
    {
        if ( balance < 0)
        {
            System.err.println("Invalid Balance");
            System.exit(1);
        }
        Balance = balance;
    }
    public void SetName(String name)
    {
        Name = name;
    }
    public void SetIdentifier(String identifier)
    {
        Identifier = identifier;
    }


}
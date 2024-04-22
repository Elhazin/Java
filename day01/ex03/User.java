import java.util.UUID;

import javax.print.DocFlavor.STRING;

class User{
    private String Name;
    private long id;
    private int Balance;
    public User(String name,  int balance)
    {
        Name = name;
        this.id = UserIdsGenerator.generateId();
        Balance = balance;
    }
    public int  GetBalance()
    {
        return Balance;
    }
    public String  GetName()
    {
        return Name;
    }
    public long  GetIdentifier()
    {
        return id;
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


}
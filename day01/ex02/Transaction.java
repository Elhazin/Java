import java.util.UUID;

class Transaction
{
    private UUID Identifier;
    private User Recipient;
    private User Sender;
    private String transferMethod;
    private int transferAmount;
    public UUID GetIdentifier()
    {
        return Identifier;
    }
    public User GetRecipient()
    {
        return Recipient;
    }
    public User GetSender()
    {
        return Sender;
    }
    public String GetTransferMethod()
    {
        return transferMethod;
    }
    public int GetTransferAmount()
    {
        return transferAmount;
    }
    public void SetIdentifier(UUID identifier)
    {
        Identifier = identifier;
    }
    public void SetRecipient(User recipient)
    {
        Recipient = recipient;
    }
    public void SetSender(User sender)
    {
        Sender = sender;
    }
    public void SetTransferMethod(String transfermethod)
    {
    
        transferMethod = transfermethod;
    }
    public void SetTransferAmount(int transferamount)
    {
        if (transferamount < 0)
        {
            System.err.println("Invalid Transfer Amount");
            System.exit(1);
        }
        transferAmount = transferamount;
    }
}
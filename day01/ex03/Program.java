class Program 

{
    static User user1;
    static User user2;
   static Transaction transaction;
    public static void main(String[] args)
    {
        user1 = new User("Alice", 1000);
        user2 = new User("Bob", 2000);
        System.out.println(user1.GetName() + " has a balance of " + user1.GetBalance());
        System.out.println(user2.GetName() + " has a balance of " + user2.GetBalance());
        transaction = new Transaction();
        transaction.SetSender(user1);
        transaction.SetRecipient(user2);
        transaction.SetTransferAmount(100);
        transaction.SetTransferMethod("Credit");
        System.out.println("user1'id: " + user1.GetIdentifier()+ " user2'id: " + user2.GetIdentifier());
        System.out.println("Sender: " + transaction.GetSender().GetName());
        System.out.println("Recipient: " + transaction.GetRecipient().GetName());
        System.out.println("Transfer Amount: " + transaction.GetTransferAmount());
        System.out.println("Transfer Method: " + transaction.GetTransferMethod());
        transaction.SetSender(user1);
        transaction.SetRecipient(user2);
        transaction.SetTransferAmount(100);
        transaction.SetTransferMethod("Credit");
        System.out.println("Sender: " + transaction.GetSender().GetName());
        System.out.println("Recipient: " + transaction.GetRecipient().GetName());
        System.out.println("Transfer Amount: " + transaction.GetTransferAmount());
        System.out.println("Transfer Method: " + transaction.GetTransferMethod());


    }
}
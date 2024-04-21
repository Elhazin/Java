class Program 

{
    static User user1;
    static User user2;
    Transaction transaction;
    public static void main(String[] args)
    {
        user1 = new User();
        user2 = new User();
        user1.SetName("Alice");
        user2.SetName("Bob");
        user1.SetBalance(1000);
        user2.SetBalance(2000);
        System.out.println(user1.GetName() + " has a balance of " + user1.GetBalance());
        System.out.println(user2.GetName() + " has a balance of " + user2.GetBalance());

    }
}
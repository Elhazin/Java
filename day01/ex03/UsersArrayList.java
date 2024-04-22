import java.util.ArrayList;

class UserArrayList implements UsersList
{
    private int id = 0;
    private int capacity = DEFAULT_CAPACITY;
    private User[] users = new User[DEFAULT_CAPACITY];
    
    private void Resize()
    {
        this.capacity += this.capacity;
        User[] newUsers = new User[this.capacity];
        for (int i = 0; i < this.capacity; i++)
        {
            newUsers[i] = this.users[i];
        }
        this.users = newUsers;
    }
    @Override
    public void AddUser(User user)
    {
        if (id == DEFAULT_CAPACITY)
        {
            Resize();
        }
        if (user == null)
        {
            System.err.println("Invalid User");
            throw new IllegalArgumentException();
        }
        users[id] = user;
        id++;
    }
    @Override
    public User GetUserById(long id)
    {
        if (this.id == 0 || id < 0 || id >= this.id)
        {
            System.err.println("No Users");
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < this.id; i++)
        {
            if (users[i].GetIdentifier() == id)
            {
                return users[i];
            }
        }
        return null;
    }
    @Override
    public User GetUserByIndex(int index)
    {
        if (index < 0 || index >= this.id ||  this.id == 0)
        {
            System.err.println("Invalid Index");
            throw new IllegalArgumentException();
        }
        return users[index];
    }
    @Override
    public int GetUsersCount()
    {
        return id;
    }


}
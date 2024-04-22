

/**
 * UsersList
 */
interface UsersList {
    Integer DEFAULT_CAPACITY = 10;
    
    public void AddUser(User user);
    public User GetUserById(long id);
    public User GetUserByIndex(int index);
    public int GetUsersCount();
}
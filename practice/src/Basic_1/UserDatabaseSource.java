package Basic_1;

interface User {
    String name = null;
}

interface UserDataBase {
    User readUser(String userName);
    void writeUser(User user);
}

public class UserDatabaseSource implements UserDataBase {
    private static UserDataBase theInstance = new UserDatabaseSource();

    public static UserDataBase instance() {
        return theInstance;
    }

    private UserDatabaseSource() {}

    @Override
    public User readUser(String userName) {
        return null;
    }

    @Override
    public void writeUser(User user) {

    }
}

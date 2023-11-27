package user;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public static List<User> users;
    static {
        users =  new ArrayList<>();

        User admin = new User("89422342522");
        User user = new User("8902562626");

        users.add(admin);
        users.add(user);
    }
}

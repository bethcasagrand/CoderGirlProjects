package microblog;

public class User
{

    public String avatarUrl;
    public String userName;
    public String realName;
    public String email;

    public User (String avatarUrl, String userName, String realName, String email)
    {
        this.avatarUrl = avatarUrl;
        this.userName = userName;
        this.realName = realName;
        this.email = email;
    }

    public String getUserName()

    {
        return this.userName;
    }
}

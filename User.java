package microblog;

public class User
{

    private String avatarUrl;
    private String userName;
    private String realName;
    private String email;

    public User (String avatarUrl, String userName, String realName, String email)
    {
        this.avatarUrl = avatarUrl;
        this.userName = userName;
        this.realName = realName;
        this.email = email;
    }

    public String getUserInfo()

    {
        return userName;
    }
}

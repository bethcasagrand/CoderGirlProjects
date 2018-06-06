package microblog;

public class Post {

    public String userName;
    public String post;
    public int postNumber;

    public Post(String userName, String post, int postNumber) {
        this.userName = userName;
        this.post = post;
        this.postNumber = postNumber;
    }

    public void printPost()
    {
        System.out.println("Username: " + userName + "\n" + "Post: " + post);
    }

    public String getUserName() {
        return this.userName;
    }

}

package microblog;

import java.util.ArrayList;
import java.util.Iterator;

public class Post {

    private static int nextpostNumber = 0;

    private String postUser;
    private int postNumber;
    private String postContent;
    private String webAddress;

    public Post(int postNumber, String postUser, String postContent, String webAddress) {
        this.postNumber = nextpostNumber;
        nextpostNumber++;
        this.postUser = postUser;
        this.postContent = postContent;
        this.webAddress = webAddress;
    }

    public int getpostNumber()
    {
        return postNumber;
    }
}


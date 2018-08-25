package michael.jsonreaderexaple.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;
    private int followersCount;

    public User() {
    }

    public User(String userName, int followersCount) {
        this.userName = userName;
        this.followersCount = followersCount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }
}

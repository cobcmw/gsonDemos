package michael.jsonreaderexaple.pojo;

import java.io.Serializable;
import java.util.List;

public class Message implements Serializable {
    private long id;
    private String text;
    private User user;
    private List<Double> geo;

    public Message() {
    }

    public Message(long id, String text, User user, List<Double> geo) {
        this.id = id;
        this.text = text;
        this.user = user;
        this.geo = geo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Double> getGeo() {
        return geo;
    }

    public void setGeo(List<Double> geo) {
        this.geo = geo;
    }
}

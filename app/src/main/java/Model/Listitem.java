package Model;

public class Listitem {
    public int user_image;
    public int post_image;
    public long likes;
    public long comments;
    public String name;
    public String date;
    public String description;

    public Listitem() {

    }

    public Listitem(int post_image, int user_image, long likes, long comments, String name, String date, String description) {
        this.user_image = user_image;
        this.post_image = post_image;
        this.likes = likes;
        this.comments = comments;
        this.name = name;
        this.date = date;
        this.description = description;
    }

    public int getUser_image() {
        return user_image;
    }

    public void setUser_image(int user_image) {
        this.user_image = user_image;
    }

    public int getPost_image() {
        return post_image;
    }

    public void setPost_image(int post_image) {
        this.post_image = post_image;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public long getComments() {
        return comments;
    }

    public void setComments(long comments) {
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

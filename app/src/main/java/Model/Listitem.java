package Model;

public class Listitem {
    public long likes;
    public long comments;
    public String name;
    public String date;
    public String description;

    public Listitem() {

    }

    public Listitem(long likes, long comments, String name, String date, String description) {
        this.likes = likes;
        this.comments = comments;
        this.name = name;
        this.date = date;
        this.description = description;
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

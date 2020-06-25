package Model;

public class Listitem {
    private int userImage, postImage, likeImageFlag = 0;
    private long likes, comments;
    private String name, date, description;

    public Listitem(int postImage, int userImage, long likes, long comments, String name, String date, String description) {
        this.userImage = userImage;
        this.postImage = postImage;
        this.likes = likes;
        this.comments = comments;
        this.name = name;
        this.date = date;
        this.description = description;

    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int user_image) {
        this.userImage = user_image;
    }

    public int setPostImage() {
        return postImage;
    }

    public void setPostImage(int post_image) {
        this.postImage = post_image;
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

    public int getLikeFlag() {
        return likeImageFlag;
    }

    public void setLikeFlag(int likeImageFlag) {
        this.likeImageFlag = likeImageFlag;
    }

}

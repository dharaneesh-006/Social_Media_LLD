package entity;

public class Post {
    private String post_id;
    private String post;
    private int like;
    private int share;
    private int comment;

    public Post(String post_id, String post, int like, int share, int comment) {
        this.post_id = post_id;
        this.post = post;
        this.like = like;
        this.share = share;
        this.comment = comment;
    }

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }
}

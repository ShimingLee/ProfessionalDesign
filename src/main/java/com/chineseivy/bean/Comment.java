package com.chineseivy.bean;

import java.util.Date;

/**
 * created by tiankunping on 2018/3/22
 * 评价
 */
public class Comment {
    private int comentID;
    private String comment;
    private Date commentTime;
    private int commentStar;
    private Date commentStarTime;
    private int commentTop;//在置顶操作中默认均不置顶，即默认值为“0”，如果置顶则改为“1”
    public Comment(){}
    public Comment(int comentID, String comment, Date commentTime, int commentStar, Date commentStarTime, int commentTop) {
        this.comentID = comentID;
        this.comment = comment;
        this.commentTime = commentTime;
        this.commentStar = commentStar;
        this.commentStarTime = commentStarTime;
        this.commentTop = commentTop;
    }

    public int getComentID() {
        return comentID;
    }

    public void setComentID(int comentID) {
        this.comentID = comentID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public int getCommentStar() {
        return commentStar;
    }

    public void setCommentStar(int commentStar) {
        this.commentStar = commentStar;
    }

    public Date getCommentStarTime() {
        return commentStarTime;
    }

    public void setCommentStarTime(Date commentStarTime) {
        this.commentStarTime = commentStarTime;
    }

    public int getCommentTop() {
        return commentTop;
    }

    public void setCommentTop(int commentTop) {
        this.commentTop = commentTop;
    }
}

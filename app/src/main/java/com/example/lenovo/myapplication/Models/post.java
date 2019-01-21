package com.example.lenovo.myapplication.Models;

import java.util.List;

public class post {
    private int postID;
    private int mTeam1_result;
    private int mTeam2_result;
    private int mNumberOfLikes;
    private String mTitle;
    private String mTeam1_Logo;
    private String mTeam2_Logo;
    private List<Player> mPlayerHowLikes;
    private List<Comment> mComments;

    public post(String mTitle, String mTeam1_Logo, int mNumberOfLikes, List<Player> mPlayerHowLikes, List<Comment> mComments) {
        this.mTitle = mTitle;
        this.mTeam1_Logo = mTeam1_Logo;
        this.mNumberOfLikes = mNumberOfLikes;
        this.mPlayerHowLikes = mPlayerHowLikes;
        this.mComments = mComments;
    }

    public int getmTeam1_result() {
        return mTeam1_result;
    }

    public void setmTeam1_result(int mTeam1_result) {
        this.mTeam1_result = mTeam1_result;
    }

    public int getmTeam2_result() {
        return mTeam2_result;
    }

    public void setmTeam2_result(int mTeam2_result) {
        this.mTeam2_result = mTeam2_result;
    }
    public int getPostID() {
        return postID;
    }
    public String getmTeam2_Logo() {
        return mTeam2_Logo;
    }

    public void setmTeam2_Logo(String mTeam2_Logo) {
        this.mTeam2_Logo = mTeam2_Logo;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmTeam1_Logo() {
        return mTeam1_Logo;
    }

    public void setmTeam1_Logo(String mTeam1_Logo) {
        this.mTeam1_Logo = mTeam1_Logo;
    }

    public int getmNumberOfLikes() {
        return mNumberOfLikes;
    }

    public void setmNumberOfLikes(int mNumberOfLikes) {
        this.mNumberOfLikes = mNumberOfLikes;
    }

    public List<Player> getmPlayerHowLikes() {
        return mPlayerHowLikes;
    }

    public void setmPlayerHowLikes(List<Player> mPlayerHowLikes) {
        this.mPlayerHowLikes = mPlayerHowLikes;
    }

    public List<Comment> getmComments() {
        return mComments;
    }

    public void setmComments(List<Comment> mComments) {
        this.mComments = mComments;
    }
}

package com.meesho.github.model;

import com.meesho.github.interfaces.MGDataModel;

import java.util.List;

public class PullRequest implements MGDataModel {

    private String title;
    private String number;
    private String url;
    private String html_url;
    private String diff_url;
    private String patch_url;
    private String state;
    private User user;
    private String created_at;
    private User assignee;
    private List<User> assignees;
    private List<User> requestedReviewers;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getDiff_url() {
        return diff_url;
    }

    public void setDiff_url(String diff_url) {
        this.diff_url = diff_url;
    }

    public String getPatch_url() {
        return patch_url;
    }

    public void setPatch_url(String patch_url) {
        this.patch_url = patch_url;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public List<User> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<User> assignees) {
        this.assignees = assignees;
    }

    public List<User> getRequestedReviewers() {
        return requestedReviewers;
    }

    public void setRequestedReviewers(List<User> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
    }
}

package com.example.administrator.myinstaapp.Pojo;

/**
 * Created by Administrator on 2/22/2016.
 */
public class TokenResponse {

    private User user;

    private String access_token;

    public User getUser ()
    {
        return user;
    }

    public void setUser (User user)
    {
        this.user = user;
    }

    public String getAccess_token ()
    {
        return access_token;
    }

    public void setAccess_token (String access_token)
    {
        this.access_token = access_token;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [user = "+user+", access_token = "+access_token+"]";
    }
}
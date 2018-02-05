package com.example.sunil.volleyeg;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sunil on 1/29/2018.
 */

public class User {

    @SerializedName("id")
    int idnumber;
    @SerializedName("login")
    String loginname;
    @SerializedName("avatar_url")
    String userimage;

    public int getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }


    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }


    public String getUserimage() {
        return userimage;
    }

    public void setUserimage(String userimage) {
        this.userimage = userimage;
    }
}

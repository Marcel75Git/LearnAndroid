package com.example.learnandroidjava;

import java.io.Serializable;

public class User implements Serializable {
    private String mUserLogin;
    private String MuserName;
    private int mImageRessourceId;

    public User(String mUserLogin, String muserName, int mImageRessourceId) {
        this.mUserLogin = mUserLogin;
        MuserName = muserName;
        this.mImageRessourceId = mImageRessourceId;
    }


    public String getmUserLogin() {
        return mUserLogin;
    }

    public void setmUserLogin(String mUserLogin) {
        this.mUserLogin = mUserLogin;
    }

    public String getMuserName() {
        return MuserName;
    }

    public void setMuserName(String muserName) {
        MuserName = muserName;
    }

    public int getmImageRessourceId() {
        return mImageRessourceId;
    }

    public void setmImageRessourceId(int mImageRessourceId) {
        this.mImageRessourceId = mImageRessourceId;
    }
}

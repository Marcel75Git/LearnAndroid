package com.example.learnandroidjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter {
    public UserAdapter(Context context, int ressource, ArrayList<User> users){
        super(context, ressource, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_my_adapter, parent, false);
        }

        User currentUser = (User) getItem(position);
        TextView  loginTv = convertView.findViewById(R.id.login);
        loginTv.setText(currentUser.getmUserLogin());

        TextView  nameTv = convertView.findViewById(R.id.name);
        nameTv.setText(currentUser.getMuserName());

        ImageView iv = convertView.findViewById(R.id.img);
        iv.setImageResource(currentUser.getmImageRessourceId());

        return convertView;
    }
}

package com.example.userregisteration;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class UserViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView userName, userEmail, userDP;


    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imageView);
        userName = itemView.findViewById(R.id.textViewName);
        userEmail = itemView.findViewById(R.id.textViewEmail);
        userDP = itemView.findViewById(R.id.textViewDP);
    }
}

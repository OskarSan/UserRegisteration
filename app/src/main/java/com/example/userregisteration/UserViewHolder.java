package com.example.userregisteration;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView userName, userEmail, userDP, userExTitle, userExams;


    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        //imageView = itemView.findViewById(R.i.imageView);
        userName = itemView.findViewById(R.id.textViewName);
        userEmail = itemView.findViewById(R.id.textViewEmail);
        userDP = itemView.findViewById(R.id.textViewDP);
        //userExTitle = itemView.findViewById(R.id.userExTitle);
        //userExams = itemView.findViewById(R.id.textViewUserExams);

    }
}

package com.example.userregisteration;

import static java.nio.file.Files.size;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public UserListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false ));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        String helpString = "";
        holder.userName.setText(users.get(position).getFirstName()+" "+users.get(position).getLastName());
        holder.userEmail.setText(users.get(position).getEmail());
        holder.userDP.setText(users.get(position).getDegreeProgram());
        //holder.imageView.setImageResource(users.get(position).getImage());

        /* Suoritetut tutkinnot röökitys
        holder.userExTitle.setText("SUORITETUT TUTKINNOT:");

        for(int i = 0; i < users.get(position).getExaminations().size(); i++ ){
            helpString += (users.get(position).getExaminations().get(i)+"\n");
        }
        holder.userExams.setText(helpString);
        */

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}

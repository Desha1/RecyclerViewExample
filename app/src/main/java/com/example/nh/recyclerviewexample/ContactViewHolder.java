package com.example.nh.recyclerviewexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private TextView lastMessage;
    private ImageView image;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        lastMessage = itemView.findViewById(R.id.last_message);
        image = itemView.findViewById(R.id.image);
    }

    public void setData(Contact contact){
        name.setText(contact.getName());
        lastMessage.setText(contact.getLastMessage());
        image.setImageResource(contact.getImage());

    }
}

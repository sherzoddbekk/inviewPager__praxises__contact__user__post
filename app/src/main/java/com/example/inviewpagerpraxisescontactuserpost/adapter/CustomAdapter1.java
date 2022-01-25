package com.example.inviewpagerpraxisescontactuserpost.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.inviewpagerpraxisescontactuserpost.R;
import com.example.inviewpagerpraxisescontactuserpost.activity.Page1;
import com.example.inviewpagerpraxisescontactuserpost.model.Member1;

import java.util.List;

public class CustomAdapter1 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Member1> member1s;
    Page1 page1;

    public CustomAdapter1(List<Member1> member1s, Page1 page1) {
        this.member1s = member1s;
        this.page1 = page1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_layout_page1,parent,false);
        return  new CustomViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Member1 member1 = member1s.get(position);

        if (holder instanceof CustomViewHolder){

            TextView name = ((CustomViewHolder) holder).name;
            TextView phoneNumber = ((CustomViewHolder) holder).phoneNumber;

            name.setText(member1.getName());
            phoneNumber.setText(member1.getPhoneNumber());
        }
    }

    @Override
    public int getItemCount() {
        return member1s.size();
    }

    private class CustomViewHolder extends RecyclerView.ViewHolder{

        View view;
        TextView name,phoneNumber;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            name = view.findViewById(R.id.page1_textView_name);
            phoneNumber = view.findViewById(R.id.page1_textView_phone);
        }
    }
}

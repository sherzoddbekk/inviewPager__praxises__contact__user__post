package com.example.inviewpagerpraxisescontactuserpost.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.inviewpagerpraxisescontactuserpost.R;
import com.example.inviewpagerpraxisescontactuserpost.activity.Page2;
import com.example.inviewpagerpraxisescontactuserpost.model.Member2;

import java.util.List;

public class CustomAdapter2 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Member2> member2s;
    Page2 page2;

    public CustomAdapter2(List<Member2> member2s, Page2 page2) {
        this.member2s = member2s;
        this.page2 = page2;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_layout_page2,parent,false);
        return  new CustomViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Member2 member2 = member2s.get(position);

        if (holder instanceof CustomViewHolder){

            TextView phoneNumber = ((CustomViewHolder) holder).phoneNumber2;


            phoneNumber.setText(member2.getPhoneNumber1());
        }
    }

    @Override
    public int getItemCount() {
        return member2s.size();
    }

    private class CustomViewHolder extends RecyclerView.ViewHolder{

        View view;
        TextView phoneNumber2;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            phoneNumber2 = view.findViewById(R.id.page2_textView_phoneNumber);
        }
    }
}
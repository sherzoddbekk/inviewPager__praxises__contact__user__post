package com.example.inviewpagerpraxisescontactuserpost.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.inviewpagerpraxisescontactuserpost.R;
import com.example.inviewpagerpraxisescontactuserpost.activity.Page3;
import com.example.inviewpagerpraxisescontactuserpost.model.Member3;

import java.util.List;

public class CustomAdapter3 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Member3> member3s;
    Page3 page3;

    public CustomAdapter3(List<Member3> member3s, Page3 page3) {
        this.member3s = member3s;
        this.page3 = page3;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_layout_page3,parent,false);
        return new CustomHolderView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Member3 member3 = member3s.get(position);
        if (holder instanceof CustomHolderView){
            TextView postt = ((CustomHolderView) holder).post;

            postt.setText(member3.getPost());
        }
    }

    @Override
    public int getItemCount() {
        return member3s.size();
    }
    private class CustomHolderView extends RecyclerView.ViewHolder{

        TextView post;
        View view;
        public CustomHolderView(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            post = view.findViewById(R.id.post_page3);
        }
    }

}

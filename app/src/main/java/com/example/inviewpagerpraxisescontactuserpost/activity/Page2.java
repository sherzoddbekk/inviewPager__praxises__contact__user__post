package com.example.inviewpagerpraxisescontactuserpost.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.inviewpagerpraxisescontactuserpost.R;
import com.example.inviewpagerpraxisescontactuserpost.adapter.CustomAdapter1;
import com.example.inviewpagerpraxisescontactuserpost.adapter.CustomAdapter2;
import com.example.inviewpagerpraxisescontactuserpost.model.Member1;
import com.example.inviewpagerpraxisescontactuserpost.model.Member2;

import java.util.ArrayList;
import java.util.List;

public class Page2 extends Fragment {
RecyclerView recyclerView;
Context context;
    public Page2() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page2,container,false);

        initView(view);
        List<Member2> member2s = prepareMemberList();
        refreshAdapter(member2s);
        return view;
    }

    private  void initView( View view){

        recyclerView = view.findViewById(R.id.recycle_view_page2);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
    }
    private void refreshAdapter(List<Member2> member2s){

        CustomAdapter2 adapter2 = new CustomAdapter2(member2s, this);
        recyclerView.setAdapter(adapter2);
    }
    private List<Member2> prepareMemberList(){

        List<Member2> member2s = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            member2s.add(new Member2("+99891506475 " + i));
        }
        return member2s;
    }

}

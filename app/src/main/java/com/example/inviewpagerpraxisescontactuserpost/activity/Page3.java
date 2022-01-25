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
import com.example.inviewpagerpraxisescontactuserpost.adapter.CustomAdapter3;
import com.example.inviewpagerpraxisescontactuserpost.model.Member3;

import java.util.ArrayList;
import java.util.List;

public class Page3 extends Fragment {
RecyclerView recyclerView;
Context context;
    public Page3() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page3,container,false);

        initView(view);
        List<Member3> member3s = prepareMemberList();
        refreshAdapter(member3s);
        return  view;
    }
    private  void initView( View view){

        recyclerView = view.findViewById(R.id.recycle_view_page3);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
    }
    private void refreshAdapter(List<Member3> member3s){

        CustomAdapter3 adapter3 = new CustomAdapter3(member3s, this);
        recyclerView.setAdapter(adapter3);
    }
    private List<Member3> prepareMemberList(){

        List<Member3> member3s = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            member3s.add(new Member3("Sherzod tdcyufigopk[hj]mphgkobgfidugys"));
        }
        return member3s;
    }


}

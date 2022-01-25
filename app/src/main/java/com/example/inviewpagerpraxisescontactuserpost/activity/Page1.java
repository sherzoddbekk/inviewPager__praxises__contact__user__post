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
import com.example.inviewpagerpraxisescontactuserpost.model.Member1;

import java.util.ArrayList;
import java.util.List;

public class Page1 extends Fragment {
    RecyclerView recyclerView;
    Context context;

    public Page1() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_page1,container,false);

        View view =  inflater.inflate(R.layout.fragment_page1,container,false);

        initView(view);

        List<Member1> member1s = prepareMemberList();
        refreshAdapter(member1s);

         return view;
    }

    private  void initView( View view){

        recyclerView = view.findViewById(R.id.recycle_view_page1);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
    }
    private void refreshAdapter(List<Member1> member1s){

        CustomAdapter1 adapter1 = new CustomAdapter1(member1s, this);
        recyclerView.setAdapter(adapter1);
    }
      private List<Member1> prepareMemberList(){

        List<Member1> member1s = new ArrayList<>();
          for (int i = 0; i < 30; i++) {
              member1s.add(new Member1("Sherzod ","+99891506475 " + i));
          }
          return member1s;
      }
}

package com.example.travel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentExplore extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Explore> lstExplore;


    public FragmentExplore() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.explore_fragment,container,false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.explore_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstExplore);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstExplore = new ArrayList<>();
        //lstExplore.add(new Explore("Jagannath Temple","Puri","Odisha",R.string.PuriDescription, R.drawable.puri));
        lstExplore.add(new Explore("Jagannath Temple","Puri","Odisha","The Shree Jagannath Temple of Puri is an important Hindu temple dedicated to Jagannath, a form of Vishnu, in Puri in the state of Odisha on the eastern coast of India. The present temple was rebuilt from the 10th century onwards, on the site of an earlier temple, and begun by King Anantavarman Chodaganga Deva, first of the Eastern Ganga dynasty. ",R.drawable.puri));
        lstExplore.add(new Explore("Sun Temple","Konark","Odisha","Konark Sun Temple (Surya Mandira) is a 13th-century CE Sun temple at Konark about 35 kilometres (22 mi) northeast from Puri on the coastline of Odisha, India. The temple is attributed to king Narasimhadeva I of the Eastern Ganga Dynasty about 1250 CE. ",R.drawable.konark));
    }
}

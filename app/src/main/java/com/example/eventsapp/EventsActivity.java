package com.example.eventsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.eventsapp.Adapters.EventsRecyclerViewAdapter;
import com.example.eventsapp.Repository.EventsRepo;

public class EventsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    EventsRecyclerViewAdapter eventsRecyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events_page);

        recyclerView = findViewById(R.id.recyclerView);
        initRecyclerView();
    }
    void initRecyclerView(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        eventsRecyclerViewAdapter = new EventsRecyclerViewAdapter(EventsRepo.getEventsRepo().getEventModelList());
        Log.i("data-->",""+EventsRepo.getEventsRepo().getEventModelList().size());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(eventsRecyclerViewAdapter);
        eventsRecyclerViewAdapter.notifyDataSetChanged();

    }
}
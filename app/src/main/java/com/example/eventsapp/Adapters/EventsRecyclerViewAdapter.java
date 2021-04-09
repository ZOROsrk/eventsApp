package com.example.eventsapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.eventsapp.Models.EventModel;
import com.example.eventsapp.R;
import com.example.eventsapp.databinding.EventCardBinding;

import java.util.ArrayList;


public class EventsRecyclerViewAdapter extends RecyclerView.Adapter<EventsRecyclerViewAdapter.ViewHolder> {
   ArrayList<EventModel> eventModelArrayList = new ArrayList<>();

   public EventsRecyclerViewAdapter(ArrayList<EventModel> eventModelArrayList) {
       this.eventModelArrayList = eventModelArrayList;
   }

   @NonNull
   @Override
   public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View cardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_card, parent, false);
       return new ViewHolder(cardView);
   }

   @Override
   public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       holder.date.setText(eventModelArrayList.get(position).getDay());
       holder.month.setText(eventModelArrayList.get(position).getMonth());
       holder.title.setText(eventModelArrayList.get(position).getTitle());
       holder.place.setText(eventModelArrayList.get(position).getPlace());
       holder.count.setText(eventModelArrayList.get(position).getCount());
       Glide.with(holder.imageView).load(eventModelArrayList.get(position).getUrl()).into(holder.imageView);
   }

   @Override
   public int getItemCount() {
       return eventModelArrayList.size();
   }

class ViewHolder extends RecyclerView.ViewHolder {
   TextView date, month, title, place, count;
   ImageView imageView;

   public ViewHolder(@NonNull View itemView) {
       super(itemView);
       date = itemView.findViewById(R.id.day);
       month = itemView.findViewById(R.id.month);
       title = itemView.findViewById(R.id.eventTitle);
       place = itemView.findViewById(R.id.location);
       count = itemView.findViewById(R.id.count);
       imageView = itemView.findViewById(R.id.card_image);


   }
}
}


// public class EventsRecyclerViewAdapter extends RecyclerView.Adapter<EventsRecyclerViewAdapter.ViewHolder> {
//     ArrayList<EventModel> eventModelArrayList = new ArrayList<>();

//     public EventsRecyclerViewAdapter(ArrayList<EventModel> eventModelArrayList) {
//         this.eventModelArrayList = eventModelArrayList;
//     }

//     @NonNull
//     @Override
//     public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//         EventCardBinding eventCardBinding = EventCardBinding.inflate(LayoutInflater.from(parent.getContext()));
//         return new ViewHolder(eventCardBinding);
//     }

//     @Override
//     public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//         holder.date.setText(eventModelArrayList.get(position).getDay());
//         holder.month.setText(eventModelArrayList.get(position).getMonth());
//         holder.title.setText(eventModelArrayList.get(position).getTitle());
//         holder.place.setText(eventModelArrayList.get(position).getPlace());
//         holder.count.setText(eventModelArrayList.get(position).getCount());
//         RequestOptions requestOptions = new RequestOptions();
//         requestOptions.fitCenter();
// //        requestOptions.placeholder(R.drawable.dj_image);
//         Glide.with(holder.imageView).load(eventModelArrayList.get(position).getUrl()).apply(requestOptions)
//                 .into(holder.imageView);
//     }

//     @Override
//     public int getItemCount() {
//         return eventModelArrayList.size();
//     }

//     class ViewHolder extends RecyclerView.ViewHolder {
//         TextView date, month, title, place, count;
//         ImageView imageView;

//         public ViewHolder(@NonNull EventCardBinding eventCardBinding) {
//             super(eventCardBinding.getRoot());
//             date = eventCardBinding.day;
//             month = eventCardBinding.month;
//             title = eventCardBinding.eventTitle;
//             place = eventCardBinding.location;
//             count = eventCardBinding.count;
//             imageView = eventCardBinding.cardImage;


//         }
//     }
// }


package com.example.eventsapp.Repository;

import com.example.eventsapp.Models.EventModel;

import java.util.ArrayList;
import java.util.List;

public class EventsRepo {
    private static EventsRepo eventsRepo;
    private  ArrayList<EventModel> eventModelList = new ArrayList<>();

    public EventsRepo() {
        eventModelList.add(new EventModel("21", "AUG", "Fireworks", "london", "591", "https://cdn.pixabay.com/photo/2013/12/12/20/01/fireworks-227383_1280.jpg"));
        eventModelList.add(new EventModel("15", "FEB", "concert", "new york", "201", "https://cdn.pixabay.com/photo/2015/10/12/15/09/concert-984237_1280.jpg"));
        eventModelList.add(new EventModel("05", "APR", "beach party", "boston", "897", "https://cdn.pixabay.com/photo/2018/05/31/11/54/celebration-3443779_1280.jpg"));
        eventModelList.add(new EventModel("24", "JAN", "music & dance", "banglore", "152", "https://cdn.pixabay.com/photo/2015/09/02/13/04/marriage-918864_1280.jpg"));
    }
    public static EventsRepo getEventsRepo(){
        if(eventsRepo == null){
            eventsRepo = new EventsRepo();
        }
        return eventsRepo;
    }

    public ArrayList<EventModel> getEventModelList() {
        return eventModelList;
    }
}

package com.example.eventsapp.Models;

public class EventModel {
    private String day, month, title, place, count, url;

    public EventModel(String day, String month, String title, String place, String count, String url) {
        this.day = day;
        this.month = month;
        this.title = title;
        this.place = place;
        this.count = count;
        this.url = url;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getTitle() {
        return title;
    }

    public String getPlace() {
        return place;
    }

    public String getCount() {
        return count;
    }

    public String getUrl() {
        return url;
    }
}

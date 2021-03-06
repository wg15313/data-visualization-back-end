package com.example.datavisualizationbackend.visualizer.models;

import com.example.datavisualizationbackend.shared.models.Event;
import io.searchbox.annotations.JestId;

import java.util.Date;

public class StoredEvent {

    @JestId
    private String id;

    private String eventType;
    private String userId;
    private String userName;
    private String group;
    private int assetId;
    private String assetTitle;
    private long date;

    public StoredEvent(String eventType, String userId, String userName, String group, int assetId, String assetTitle, long date) {
        this.eventType = eventType;
        this.userId = userId;
        this.userName = userName;
        this.group = group;
        this.assetId = assetId;
        this.assetTitle = assetTitle;
        this.date = date;
    }

    public String getEventType() {
        return eventType;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getGroup() {
        return group;
    }

    public int getAssetId() {
        return assetId;
    }

    public String getAssetTitle() {
        return assetTitle;
    }

    public long getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "StoredEvent{" +
                "eventType='" + eventType + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", group='" + group + '\'' +
                ", assetId=" + assetId +
                ", assetTitle='" + assetTitle + '\'' +
                ", date=" + date +
                '}';
    }


    public Event toEvent() {
        return new Event(this.eventType,this.userId,this.userName,this.group,this.assetId,this.assetTitle,new Date(this.date));
    }
}

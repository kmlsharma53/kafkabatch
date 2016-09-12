package com.batch.jobs.model;

/**
 * Created by kamal on 11/09/16.
 */
public class EventHeader {

    private String eventType;
    private String eventActivity;
    private String eventOutCome;
    private String eventGUID;
    private String appId;
    private String appInstanceId;
    private String serverId;
    private String eventCorrelationId;
    private String eventPublishTime;
    private String eventResubmissionFlag;

    public EventHeader() {
        super();
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventActivity() {
        return eventActivity;
    }

    public void setEventActivity(String eventActivity) {
        this.eventActivity = eventActivity;
    }

    public String getEventOutCome() {
        return eventOutCome;
    }

    public void setEventOutCome(String eventOutCome) {
        this.eventOutCome = eventOutCome;
    }

    public String getEventGUID() {
        return eventGUID;
    }

    public void setEventGUID(String eventGUID) {
        this.eventGUID = eventGUID;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppInstanceId() {
        return appInstanceId;
    }

    public void setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getEventCorrelationId() {
        return eventCorrelationId;
    }

    public void setEventCorrelationId(String eventCorrelationId) {
        this.eventCorrelationId = eventCorrelationId;
    }

    public String getEventPublishTime() {
        return eventPublishTime;
    }

    public void setEventPublishTime(String eventPublishTime) {
        this.eventPublishTime = eventPublishTime;
    }

    public String getEventResubmissionFlag() {
        return eventResubmissionFlag;
    }

    public void setEventResubmissionFlag(String eventResubmissionFlag) {
        this.eventResubmissionFlag = eventResubmissionFlag;
    }

    @Override
    public String toString() {
        return "EventHeader{" +
                "eventType='" + eventType + '\'' +
                ", eventActivity='" + eventActivity + '\'' +
                ", eventOutCome='" + eventOutCome + '\'' +
                ", eventGUID='" + eventGUID + '\'' +
                ", appId='" + appId + '\'' +
                ", appInstanceId='" + appInstanceId + '\'' +
                ", serverId='" + serverId + '\'' +
                ", eventCorrelationId='" + eventCorrelationId + '\'' +
                ", eventPublishTime='" + eventPublishTime + '\'' +
                ", eventResubmissionFlag='" + eventResubmissionFlag + '\'' +
                '}';
    }
}

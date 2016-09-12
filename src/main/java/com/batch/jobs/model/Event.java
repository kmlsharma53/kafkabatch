package com.batch.jobs.model;

/**
 * Created by kamal on 11/09/16.
 */
public class Event {

    private EventHeader eventHeader;

    private EventPayload eventPayload;

    public Event() {
    }

    public EventHeader getEventHeader() {
        return eventHeader;
    }

    public void setEventHeader(EventHeader eventHeader) {
        this.eventHeader = eventHeader;
    }

    public EventPayload getEventPayload() {
        return eventPayload;
    }

    public void setEventPayload(EventPayload eventPayload) {
        this.eventPayload = eventPayload;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventHeader=" + eventHeader +
                ", eventPayload=" + eventPayload +
                '}';
    }
}

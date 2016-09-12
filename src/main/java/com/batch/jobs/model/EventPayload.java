package com.batch.jobs.model;

/**
 * Created by kamal on 11/09/16.
 */
public class EventPayload {

    private Settlement settlement;

    private MetaData metaData;

    public EventPayload() {
    }

    public Settlement getSettlement() {
        return settlement;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    @Override
    public String toString() {
        return "EventPayload{" +
                "settlement=" + settlement +
                ", metaData=" + metaData +
                '}';
    }
}

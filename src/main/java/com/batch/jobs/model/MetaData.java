package com.batch.jobs.model;

/**
 * Created by kamal on 11/09/16.
 */
public class MetaData {

    private String metaField1;
    private String metaField2;

    public MetaData() {
    }

    public String getMetaField1() {
        return metaField1;
    }

    public void setMetaField1(String metaField1) {
        this.metaField1 = metaField1;
    }

    public String getMetaField2() {
        return metaField2;
    }

    public void setMetaField2(String metaField2) {
        this.metaField2 = metaField2;
    }

    @Override
    public String toString() {
        return "MetaData{" +
                "metaField1='" + metaField1 + '\'' +
                ", metaField2='" + metaField2 + '\'' +
                '}';
    }
}

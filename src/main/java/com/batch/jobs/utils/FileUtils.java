package com.batch.jobs.utils;

import com.batch.jobs.model.Event;
import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.io.FileReader;

import com.google.gson.stream.JsonReader;

/**
 * Utility class responsible for reading data from file and returns list of string.
 *
 * @author kamal
 */
public class FileUtils {

    /**
     * @param fileName
     * @return list of events
     */
    public static List<Event> getData(String fileName){
        Gson gson = new Gson();

        List<Event> eventList = new ArrayList<>();

        try{
            FileReader fileReader = new FileReader(fileName);
            JsonReader jsonReader = new JsonReader(fileReader);
            Event[] events = gson.fromJson(jsonReader, Event[].class);
            eventList = Arrays.asList(events);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return eventList;
    }
}
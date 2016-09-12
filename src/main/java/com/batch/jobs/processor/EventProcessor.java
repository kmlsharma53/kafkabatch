package com.batch.jobs.processor;

import com.batch.jobs.model.Event;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by kamal on 11/09/16.
 */

@Component("eventProcessor")
public class EventProcessor implements ItemProcessor<List<String>,List<Event>>{
    @Override
    public List<Event> process(List<String> strings) throws Exception {


        return null;
    }
}

package com.batch.jobs.writer;

import com.batch.jobs.messaging.KafkaTopics;
import com.batch.jobs.messaging.MessagingQueueHelper;
import com.batch.jobs.model.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by kamal on 11/09/16.
 */

@Component("eventWriter")
public class EventWriter implements ItemWriter<List<Event>>{

    private static final Logger LOGGER = LoggerFactory.getLogger(EventWriter.class);

    private String topic = System.getProperty("kafka.topic");

    @Override
    public void write(List<? extends List<Event>> list) throws Exception {

        for(List<Event> eventList : list){
            for(Event event : eventList){
                MessagingQueueHelper.sendToQueue(event,event.getEventHeader().getEventGUID(), topic);
                LOGGER.info("Pushed event {} in kafka",event);
            }
        }

    }
}

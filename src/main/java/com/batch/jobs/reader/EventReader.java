package com.batch.jobs.reader;

import com.batch.jobs.model.Event;
import com.batch.jobs.utils.FileUtils;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by kamal on 11/09/16.
 */

@Component("eventReader")
public class EventReader implements ItemReader<List<Event>>{

    private static final Logger LOGGER = LoggerFactory.getLogger(EventReader.class);

    private boolean batchJobState = false;

    @Override
    public List<Event> read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

        List<Event> inputData = new ArrayList<Event>();
        if(!batchJobState){
            inputData = FileUtils.getData(System.getProperty("path"));
            batchJobState = true;
            if(CollectionUtils.isEmpty(inputData)){
                LOGGER.error("Input file is not correct,provide correct path and execute again");
                System.err.println("Input file is not correct,provide correct path and execute again");
                System.exit(0);
            }
        }
        if(CollectionUtils.isEmpty(inputData)){
            batchJobState = false;
            return null;
        }
        return inputData;
    }
}

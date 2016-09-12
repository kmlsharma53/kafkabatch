package com.batch.jobs.messaging;

import com.google.gson.Gson;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessagingQueueHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessagingQueueHelper.class);
    private static Gson gson = new Gson();


    public static void sendToQueue(Object obj,String key,String topic) {
            try {
                String json = gson.toJson(obj);
                ProducerRecord<String, String> message = new ProducerRecord<String, String>(topic,key,json);
                KafkaProducerConnector.getProducerInstance().send(message);
            }catch (Throwable th) {
                th.printStackTrace();
                LOGGER.error("Exception in sending message in kafka"+th);
            }
    }
}
package com.batch.jobs.messaging;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;

import java.util.Properties;


public class KafkaProducerConnector {

    private static Properties properties = new Properties();
    static {

        String kafka_host = System.getProperty("kafka.host");
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafka_host);
        properties.put(ProducerConfig.METADATA_FETCH_TIMEOUT_CONFIG, "1000");
        properties.put(ProducerConfig.TIMEOUT_CONFIG,"1000");
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        //Async Properties
        /*properties.put("producer.type", "async");
        properties.put("queue.buffering.max.ms", "1000");
        properties.put("queue.buffering.max.messages", "100000");
        properties.put("queue.enqueue.timeout.ms", "0");
        properties.put("batch.num.messages", "50");*/
    }

    private static KafkaProducer<String,String> producer = new KafkaProducer<String, String>(properties);


    public static KafkaProducer<String,String> getProducerInstance() {

        if (null == producer) {
            producer = new KafkaProducer<String, String>(properties);
        }

        return producer;
    }

}

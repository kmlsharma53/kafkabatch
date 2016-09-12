import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.Properties;

public class SpringBatchScheduler {

    private static final Logger LOG = LoggerFactory.getLogger(SpringBatchScheduler.class);
 
    public static void main(String[] args) {

        try{
            String springConfig = "job-quartz.xml";
            System.out.println("Scheduler starting");

            System.out.println("Input file :: " + args[0]);
            System.out.println("Kafka host :: "+args[1]);
            System.out.println("Kafka topic :: "+args[2]);

            System.setProperty("path",args[0]);
            System.setProperty("kafka.host",args[1]);
            System.setProperty("kafka.topic",args[2]);

            if (StringUtils.isEmpty(System.getProperty("path"))){
                throw new Exception("Missing run time argument path");
            }

            if(StringUtils.isEmpty(System.getProperty("kafka.host")) ){
                throw new Exception("Missing run time argument kafka.host");
            }

            if(StringUtils.isEmpty(System.getProperty("kafka.topic")) ){
                throw new Exception("Missing run time argument kafka.topic");
            }

            ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

            System.out.println("ApplicationContext initialized completed");
            LOG.info("ApplicationContext initialized completed");

            System.out.println("Schedular started at " + new Date());
            LOG.info("Schedular started at " + new Date());
        }
        catch(Exception ex){
            ex.printStackTrace();
            LOG.error(ex.getMessage());
        }
    }
}

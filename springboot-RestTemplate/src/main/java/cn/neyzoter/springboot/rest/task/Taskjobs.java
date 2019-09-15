package cn.neyzoter.springboot.rest.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Task jobs
 * @author Neyzoter Song
 * @data 19/9/15
 */
@Component("taskJob")
public class Taskjobs {
    private final static Logger logger = LoggerFactory.getLogger(Taskjobs.class);
    private Integer counter = 0;

    /**
     * Organization
     */
    private String org = "zju";
    /**
     * InfluxDB bucket
     */
    private String bucket = "influxdb_bucket";
    /**
     * precision
     */
    private String precision = "s";
    /**
     * token
     */
    private String token = "yzwAKztIXZLJNSvTPeUuFW7P9z4oWd_NLnGZNcIuoJMY7PCZEm1Lu1s-IIjloYFiSBVhRss7aMaDbh58WdlhGA==";
    /**
     * Measurement
     */
    private String measurement = "vehicle";
    /**
     * tag set
     */
    private String tags = "vehicleId=100";
    /**
     * field set
     */
    private String fields = "vehicleSpeed=";

    /**
     * timestamp
     */
    private String timestamp = counter.toString();

    /**
     * post msg to InfluxDB periodically
     */
    @Scheduled(cron="10/5 * * * * ?")
    public void post2InfluxDb(){
        try{
            logger.info("Starting post : "+counter);
            RestTemplate restTemplate = new RestTemplate();
            String url = String.format("http://localhost:9999/api/v2/write?org=%s&bucket=%s&precision=%s", org, bucket, precision);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            headers.add("Authorization", "Token "+token);
            String lineProtoBody = this.measurement+","+this.tags+" "+this.fields+100*Math.sin((double) this.counter);

            HttpEntity<String> request = new HttpEntity<>(lineProtoBody, headers);
            ResponseEntity<String> response = restTemplate.postForEntity( url, request , String.class );
            logger.info("url : "+url);
            logger.info("response : "+ response);
        }catch (Exception e){
            logger.error("",e);
        }finally {
            this.counter += 5;
            this.timestamp = counter.toString();
            if(counter >= Integer.MAX_VALUE){
                counter = 0;
            }
        }
    }
}

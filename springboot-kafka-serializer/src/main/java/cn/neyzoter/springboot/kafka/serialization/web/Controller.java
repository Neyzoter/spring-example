package cn.neyzoter.springboot.kafka.serialization.web;

import cn.neyzoter.springboot.kafka.serialization.biz.domain.vehicle.VehicleHttpPack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 * @author Neyzoter Song
 * @date 2019/9/11
 */
@RestController
public class Controller {
    private final String apiPrefix = "/springboot-kafka-serializer/api";
    @Autowired
    private KafkaTemplate kafkaTemplate;
    /**
     * server get vehicle data
     * @param @RequestBody VehicleHttpPack
     * @return {@link String}
     */
    @RequestMapping(value = apiPrefix+"/sendData", method = RequestMethod.POST)
    public Object sendData(@RequestBody VehicleHttpPack vehicleHttpPack) {  //convert serialization

        kafkaTemplate.send("VehicleHttpPack", vehicleHttpPack);
        return "OK";
    }
}

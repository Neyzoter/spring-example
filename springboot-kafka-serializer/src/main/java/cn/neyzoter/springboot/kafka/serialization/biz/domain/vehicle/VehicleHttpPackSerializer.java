package cn.neyzoter.springboot.kafka.serialization.biz.domain.vehicle;

import cn.neyzoter.springboot.kafka.serialization.common.SerializationUtil;
import org.apache.kafka.common.serialization.Serializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * VehicleHttpPack Serializer
 * @author Neyzoter Song
 * @date 2019/9/11
 */
@Service
public class VehicleHttpPackSerializer implements Serializer<VehicleHttpPack> {
    private final static Logger logger = LoggerFactory.getLogger(VehicleHttpPackSerializer.class);
    @Override
    public void configure(Map<String, ?> config, boolean isKey){
        // do nothing
    }
    @Override
    public byte[] serialize(String topic, VehicleHttpPack vehicleHttpPack){
        try{
            return SerializationUtil.serialize(vehicleHttpPack);
        }catch (Exception e){
            logger.error("",e);
        }
        return null;
    }
    @Override
    public void close() {
        //do nothing
    }
}

package cn.neyzoter.springboot.kafka.serialization.biz.domain.vehicle;

import java.io.Serializable;

/**
 * Vehicle class
 * @author Neyzoter Song
 * @date 2019/9/7
 */
public class Vehicle implements Serializable {
    private long app;
    private long id;
    private RuntimeData rtData;

    /**
     * set Application
     * @param appId
     */
    public void setApp(long appId){
        this.app = appId;
    }

    /**
     * get Application id
     * @return
     */
    public long getApp() {
        return app;
    }

    /**
     * set id
     * @param identity
     */
    public void setId(long identity){
        this.id = identity;
    }

    /**
     * get id
     * @return
     */
    public long getId(){
        return this.id;
    }

    /**
     * get runtime data
     * @return {@link RuntimeData}
     */
    public RuntimeData getRtData(){
        return this.rtData;
    }

    /**
     * set runtime data
     * @param data
     */
    public void setRtData(RuntimeData data){
        this.rtData = data;
    }

    @Override
    public String toString(){
        String str = "{" +
                "app="+this.app+","+
                "id=" + this.id + ","+
                "rtData=" +
                this.rtData.toString()+
                "}";
        return str;
    }
}

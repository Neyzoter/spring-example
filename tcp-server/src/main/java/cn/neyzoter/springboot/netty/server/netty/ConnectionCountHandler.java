package cn.neyzoter.springboot.netty.server.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@ChannelHandler.Sharable
public class ConnectionCountHandler extends ChannelInboundHandlerAdapter {
    private static final Logger logger = LoggerFactory.getLogger(ConnectionCountHandler.class);
    //jdk1.5 并发包中的用于计数的类
    private AtomicInteger nConnection = new AtomicInteger();

    public ConnectionCountHandler() {
        /**
         *  每两秒统计一下连接数
         */
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(() -> {
            logger.info("connections: " + nConnection.get());
        }, 0, 2, TimeUnit.SECONDS);

    }
    /**
     *  每次过来一个新连接就对连接数加一
     * @param ctx
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        nConnection.incrementAndGet();
    }
    /**
     *  端口的时候减一
     * @param ctx
     */
    @Override
    public void channelInactive(ChannelHandlerContext ctx) {
        nConnection.decrementAndGet();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        Channel channel = ctx.channel();
        if(channel.isActive()){
            ctx.close();
        }
        //……
    }
}
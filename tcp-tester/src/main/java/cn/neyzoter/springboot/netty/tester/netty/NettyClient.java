package cn.neyzoter.springboot.netty.tester.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * Netty测试客户端
 * @author Charles Song
 * @date 2020-7-1
 */
public class NettyClient {
//    private static final String SERVER_HOST = "127.0.0.1";
    private static final String SERVER_HOST = "47.110.251.155";
//    private static final String SERVER_HOST = "114.55.104.50";

    public void start(final int beginPort, int nPort) {
        System.out.println("client starting....");
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();
        final Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(eventLoopGroup);
        bootstrap.channel(NioSocketChannel.class);
        bootstrap.option(ChannelOption.SO_REUSEADDR, true);
        bootstrap.handler(new ChannelInitializer<Channel>() {
            @Override
            protected void initChannel(Channel ch) {
            }
        });
        int index = 0;
        int port;
        while (!Thread.interrupted()) {
            port = beginPort + index;
            try {
                ChannelFuture channelFuture = bootstrap.connect(SERVER_HOST, port);
                channelFuture.addListener((ChannelFutureListener) future -> {
                    if (!future.isSuccess()) {
                        System.out.println("连接失败, 退出!");
                        System.exit(0);
                    }
                });
                channelFuture.get();
            } catch (Exception e) {
            }
            if (++index == nPort) {
                index = 0;
            }
//            try {
//                Thread.sleep(100);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

        }
    }
}
package cn.neyzoter.springboot.netty.tester;

import cn.neyzoter.springboot.netty.tester.netty.NettyClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesterApp {
    private static final int BEGIN_PORT = 8089;
    private static final int N_PORT = 100;
    public static void main(String[] args) {
        SpringApplication.run(TesterApp.class, args);
        new NettyClient().start(BEGIN_PORT, N_PORT);
    }
}


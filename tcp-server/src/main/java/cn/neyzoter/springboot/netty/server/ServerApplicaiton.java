package cn.neyzoter.springboot.netty.server;

import cn.neyzoter.springboot.netty.server.netty.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务器
 * @author Charles Song
 * @date 2020-7-1
 */
@SpringBootApplication
public class ServerApplicaiton {
    private static final int BEGIN_PORT = 8000;
    private static final int N_PORT = 1;
    public static void main(String[] args) {
        SpringApplication.run(ServerApplicaiton.class, args);
        new Server().start(BEGIN_PORT, N_PORT);
    }
}
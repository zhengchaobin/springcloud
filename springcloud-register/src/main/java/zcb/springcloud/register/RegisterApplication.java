package zcb.springcloud.register;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhengchaobin
 * Date: 2018/10/9
 * Description:
 **/

@EnableEurekaServer
@SpringBootApplication
public class RegisterApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(RegisterApplication.class).web(true).run(args);
    }

}

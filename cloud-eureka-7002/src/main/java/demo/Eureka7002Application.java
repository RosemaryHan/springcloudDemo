package demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Rosemary
 * @title: EurekaApplication
 * @projectName cloud2020
 * @date 2020/11/517:20
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7002Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7002Application.class, args);
        System.out.println("EurekaApplication7002启动成功");
    }
}

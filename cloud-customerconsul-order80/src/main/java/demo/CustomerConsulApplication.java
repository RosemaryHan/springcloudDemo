package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Rosemary
 * @title: CustomerZKApplication
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/11/1014:44
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CustomerConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerConsulApplication.class, args);
        System.out.println("CustomerZKApplication启动成功");
    }
}

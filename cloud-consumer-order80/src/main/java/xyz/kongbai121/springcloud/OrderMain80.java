package xyz.kongbai121.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import xyz.kongbai121.myrule.MySelfRule;

@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClient(name = "CLOUD-ORDER-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
            SpringApplication.run(OrderMain80.class,args);
        }
}

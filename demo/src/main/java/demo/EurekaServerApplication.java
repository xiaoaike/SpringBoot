package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer    //声明这是一个Eureka服务器
public class EurekaServerApplication {
	public static void main(String[] args)
	{
		SpringApplication.run(EurekaServerApplication.class, args);//后面是直接设置端口号
	}
}

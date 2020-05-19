package pl.kukla.krzys.micro11msscbreweryeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Micro11MsscBreweryEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Micro11MsscBreweryEurekaServerApplication.class, args);
	}

}

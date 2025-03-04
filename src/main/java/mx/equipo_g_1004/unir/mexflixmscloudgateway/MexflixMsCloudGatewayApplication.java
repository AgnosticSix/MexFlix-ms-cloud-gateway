package mx.equipo_g_1004.unir.mexflixmscloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MexflixMsCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MexflixMsCloudGatewayApplication.class, args);
    }

}

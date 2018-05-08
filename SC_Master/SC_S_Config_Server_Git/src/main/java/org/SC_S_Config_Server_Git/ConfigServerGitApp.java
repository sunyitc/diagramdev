package org.SC_S_Config_Server_Git;

 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableConfigServer
public class ConfigServerGitApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		SpringApplication.run(ConfigServerGitApp.class, args);
    }
}

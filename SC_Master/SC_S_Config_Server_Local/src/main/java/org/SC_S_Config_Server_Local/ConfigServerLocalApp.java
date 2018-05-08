package org.SC_S_Config_Server_Local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerLocalApp 
{
    public static void main( String[] args )
    {
        System.out.println( "" );
		SpringApplication.run(ConfigServerLocalApp.class, args);
    }
}

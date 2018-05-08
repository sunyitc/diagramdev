package org.SC_S_Hystrix.dashboard.Turbine;
 
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Hello world!
 *
 */
@EnableTurbine
@SpringCloudApplication
public class HystrixDashboardTurbineApplication 
{
    public static void main( String[] args )
    {
		SpringApplication.run(HystrixDashboardTurbineApplication.class, args);
    }
}

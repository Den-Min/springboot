package com.csdj.config;

import com.csdj.dao.AccounDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //声明类为配置文件 代替spring.xml
@ComponentScan("com.csdj")
@PropertySource(value = {"classpath:user.properties", "classpath:jdbc.properties"})
public class IocConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public AccounDao createAccountDao() {
        return new AccounDao();
    }

    public void showPropperties(){
        System.out.println(driver+"\n"+url+"/n"+username+"\n"+password);
    }
}

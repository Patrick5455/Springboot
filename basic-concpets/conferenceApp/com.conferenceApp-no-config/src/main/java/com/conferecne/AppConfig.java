package com.conferecne;

import com.conferecne.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
@ComponentScan(value = {("com.conference")})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory(){
        CalendarFactory factory = new CalendarFactory();

        factory.addDays(2);

        return factory;
    }


    @Bean
    public Calendar cal()throws Exception{
        return calFactory().getObject();
    }



}

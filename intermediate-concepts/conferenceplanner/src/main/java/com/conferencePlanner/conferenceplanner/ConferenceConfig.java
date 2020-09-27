package com.conferencePlanner.conferenceplanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ConferenceConfig implements WebMvcConfigurer {


    // configuring springboot to host up/serve up our pdf files
    // this helps us to create custom paths(/files/**) that
    // goes to a different place on our file system
    // this we would not have to expose files of our file-system
    // but rather could host them up through our app
    // or rather even wrap security around them if we wanted to

   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry){
       registry.addResourceHandler("/files/**")
               .addResourceLocations("/WEB-INF/pdf/");
   }


    // implementing the view resolver configured in application properties
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/jsp/");
        bean.setSuffix(".jsp");
        bean.setOrder(0);
        return bean;
    }

}

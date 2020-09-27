package com.conferencePlanner.conferenceplanner;

import org.apache.tomcat.util.descriptor.LocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.security.PublicKey;
import java.util.Locale;

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

   // register interceptor beans
   @Override
   public void addInterceptors(InterceptorRegistry interceptorRegistry){
       interceptorRegistry.addInterceptor(localeChangeInterceptor());
   }

   //Internationalization (I18N) with Spring Boot
    @Bean
    public LocaleResolver localResolver(){
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.US);
        return slr;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor(){
       LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
       lci.setParamName("lang");
       return lci;
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

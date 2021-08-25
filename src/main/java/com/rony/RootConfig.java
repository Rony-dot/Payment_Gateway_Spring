package com.rony;

import com.rony.spel.Temp;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.ArrayList;
import java.util.List;

@ComponentScan(basePackages = {"com.rony.services"})
public class RootConfig {
    @Bean(name = "messageSource")
    @Qualifier("messageSource")
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("resourceBundles/messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean(name = "add")
    public List<String> address(){
        List<String> address = new ArrayList<>();
        address.add("banani 1");
        address.add("banani 2");
        address.add("banani 3");
        return address;
    }

    @Bean(name = "tempObj")
    public Temp temp(){
        return new Temp();
    }

}

package com.rony;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

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
}

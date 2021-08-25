package com.rony;

import com.rony.spel.Temp;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // Load Spring web application configuration
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(RootConfig.class);
        rootContext.refresh();

        servletContext.addListener(new ContextLoaderListener(rootContext));

        // Create and register the DispatcherServlet
        AnnotationConfigWebApplicationContext servletRegisterer = new AnnotationConfigWebApplicationContext();
        servletRegisterer.register(WebMvcConfig.class);
        ServletRegistration.Dynamic registration = servletContext.addServlet("servlet",
                new DispatcherServlet(servletRegisterer));
        registration.setLoadOnStartup(1);
        registration.addMapping("/");


        var temp1 = rootContext.getBean("tempObj", Temp.class);
//        temp1.setId(11L);
//        temp1.setName("temp object name");
//        List<String> address = new ArrayList<>();
//        address.add("gulshan 1");
//        address.add("gulshan 2");
//        address.add("gulshan 3");
//        temp1.setAddress(address);
        System.out.println(temp1+"-----------------------------------");
        System.out.println(temp1.hashCode()+"-----------------------------------");

    }
}

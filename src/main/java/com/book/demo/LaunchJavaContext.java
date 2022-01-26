package com.book.demo;

import com.book.demo.infrastructure.SpringContext;
import com.book.demo.persistence.BusinessService;
import com.book.demo.persistence.model.User;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class LaunchJavaContext
{
    private static final User DUMMY_USER = new User("dummy");
    public static Logger logger = Logger.getLogger(LaunchJavaContext.class);

    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
        BusinessService service = context.getBean(BusinessService.class);
        logger.debug(service.calculateSum(DUMMY_USER));
    }
}

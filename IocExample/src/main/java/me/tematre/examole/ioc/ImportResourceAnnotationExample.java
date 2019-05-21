package me.tematre.examole.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({ "applicationTestContext.xml"})
public class ImportResourceAnnotationExample {
    @Autowired
    private BeanA beanA;

    @Autowired
    private BeanB beanB;

    @Autowired
    private BeanC beanC;


    public BeanA getBeanA() {
        return beanA;
    }

    public BeanB getBeanB() {
        return beanB;
    }

    public BeanC getBeanC() {
        return beanC;
    }
}
package me.tematre.examole.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ImportResourceAnnotationExample.class);
        try {

            ImportResourceAnnotationExample importResourceAnnotationExample = (ImportResourceAnnotationExample) context
                    .getBean("importResourceAnnotationExample");
            System.out.println("BeanA member: "
                    + importResourceAnnotationExample.getBeanA());
            System.out.println("BeanB member: "
                    + importResourceAnnotationExample.getBeanB());
            System.out.println("BeanC member: "
                    + importResourceAnnotationExample.getBeanC());

            importResourceAnnotationExample = new ImportResourceAnnotationExample();

            System.out.println("BeanA member: "
                    + importResourceAnnotationExample.getBeanA());
            System.out.println("BeanB member: "
                    + importResourceAnnotationExample.getBeanB());
            System.out.println("BeanC member: "
                    + importResourceAnnotationExample.getBeanC());

        } finally {
            context.close();
        }
    }
}

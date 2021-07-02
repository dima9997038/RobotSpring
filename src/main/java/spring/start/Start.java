package spring.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.impls.Robot.ModelT1000;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        t1000.dance();
        t1000.fire();
    }
}

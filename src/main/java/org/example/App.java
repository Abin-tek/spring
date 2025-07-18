package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

//        System.out.println( "Hello World!" );

        Student student = (Student) context.getBean("st1");

        student.show();
//        student.setAge(30);
//        System.out.println(student.getAge() + " : " + student.getRno());
        student.writeExam();
    }
}

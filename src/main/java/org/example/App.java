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

        Student perusu = (Student) context.getBean("st1");
        Student sirusu = (Student) context.getBean("st2");

//        student.setAge(30);
//        System.out.println(student.getAge() + " : " + student.getRno());
        perusu.writeExam();
        sirusu.writeExam();
    }
}

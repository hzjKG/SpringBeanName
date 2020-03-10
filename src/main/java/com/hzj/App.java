package com.hzj;

import com.hzj.entity.Stu;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        //使用ID
        Stu bean1 = context.getBean("com.hzj.entity.Stu#0", Stu.class);
        //使用别名
        Stu bean1_1 = context.getBean("com.hzj.entity.Stu", Stu.class);

//        Stu bean = context.getBean(Stu.class);


        Stu bean2 = context.getBean("stu", Stu.class);
        Stu bean4 = context.getBean("stu3", Stu.class);
        Stu bean5 = context.getBean("stu4", Stu.class);
        Stu bean6 = context.getBean("stu5", Stu.class);



        Stu bean3 = context.getBean("stu2", Stu.class);


        String[] beanNamesForType = context.getBeanNamesForType(Stu.class);

        System.out.println(Arrays.asList(beanNamesForType));

        System.out.println(bean1);
        System.out.println(bean1_1);

        System.out.println(bean2);
        System.out.println(bean4);
        System.out.println(bean5);
        System.out.println(bean6);

        System.out.println(bean3);







    }
}

package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
public class App {
    public static <localDate> void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        LocalDate Date= LocalDate.now();
        System.out.println(" The Current Date is: \t"+Date+"\n");

        Mid Mid_Date = applicationContext.getBean("Mid", Mid.class);
        Final Final_Date = applicationContext.getBean("Final", Final.class);

   if(String.valueOf(Date) == Mid_Date.getDate())
   {
       Interface x = applicationContext.getBean("Mid", Interface.class);
       System.out.println(x.exam());
   }
   else if(String.valueOf(Date) == Final_Date.getDate())
   {
       Interface x = applicationContext.getBean("Final", Interface.class);
       System.out.println(x.exam());
   }
   else
   {
        System.out.println(" There is no exam at this time! ");
   }



    }
}

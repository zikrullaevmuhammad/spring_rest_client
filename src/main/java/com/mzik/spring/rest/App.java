package com.mzik.spring.rest;

import com.mzik.spring.rest.configuration.MyConfig;
import com.mzik.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication =
                context.getBean("communication", Communication.class);

//        Список всех работников
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Получение работника по id
//        Employee empByID = communication.getEmployee(1);
//        System.out.println(empByID);

//        Добавление работника в базу данных
//        Employee emp = new Employee("Sveta", "Sokolova", "HR", 900);
//        communication.saveEmployee(emp);

//        Изменение работника
//        Employee emp = new Employee("Sveta", "Sokolova", "IT", 1200);
//        emp.setId(11);
//        communication.saveEmployee(emp);

//        Удаление работника
        communication.deleteEmployee(11);
    }
}

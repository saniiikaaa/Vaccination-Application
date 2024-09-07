package com.example.Vaccination;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class VaccinationApplication {

    public static void main(String[] args) {

        /*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

		 Tasks:
		1. Fetch context from ApplicationContext.xml and initiate Scanner.
		2. Fetch vaccine and User type choice.
		3. Get the required bean from context.
		4. Get the appointment details form user
		5. Display the appointment details
		6. Run the loop again to book for another user or else exit.
		 */
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
       Scanner scanner=new Scanner(System.in);
       System.out.println("Welcome to the Vaccination Application");
       while(true)
       {
       System.out.println("Please choose your vaccine preference: \n1. Covid\n2. Polio\n3. Typhoid");
       int vaccineType=scanner.nextInt();
       String vaccine="";
       switch(vaccineType)
       {
       case 1:
    	   vaccine="Covid";
    	   break;
       case 2:
    	   vaccine="Typhoid";
    	   break;
       case 3:
    	   vaccine="Polio";
    	   break;
       }
       System.out.println("Whom do you want to vaccinate \n1. Father\n2. Mother\n3. Self\n4. Spouse\n5. Exit");
       int userType=scanner.nextInt();
       String user="";
       switch(userType)
       {
       case 1:
    	   user="father";
    	   break;
       case 2:
    	   user="mother";
    	   break;
       case 3:
    	   user="self";
    	   break;
       case 4:
    	   user="spouse";
    	   break;
       case 5:
    	   System.out.println("Exiting the application.");
           System.exit(0);
       }
       User u=(User) context.getBean(user.concat(vaccine));
       System.out.println("Please enter "+user+"details:");
       System.out.print("Name:");
       String name=scanner.next();
       System.out.print("Age:");
       int age=scanner.nextInt();
       System.out.print("Appointment date (YYYY-MM-DD):");
       String appointmentDate=scanner.next();
       System.out.print("Appointment time (HH:MM AM/PM):");
       String appointmentTime=scanner.next();
       System.out.print("Appointment location:");
       String appointmentLocation=scanner.next();
       
       TimeAndLocation tal=(TimeAndLocation) context.getBean("timeAndLocation");
       tal.setDate(appointmentDate);
       tal.setLocation(appointmentLocation);
       tal.setTimeSlot(appointmentLocation);
       u.setUserDetails(name, age, tal);
       u.setAppointment();
       System.out.println("\nDo you want to register for someone else \n1. Yes\n2. No");
       int yn=scanner.nextInt();
       switch(yn)
       {
       case 1:
    	   continue;
       case 2:
    	   System.out.println("Exiting the application.");
           System.exit(0);
       }
       }  
    }
}
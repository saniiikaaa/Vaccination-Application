package com.example.Vaccination;

import com.example.Vaccination.User;

/**
  This class is an implementation of a User Interface based on the selection 
  in the console the user type is selected.You need to complete this class 
  based on the following tasks.
    
   Tasks:
 a.Override the methods of User Interface.
 b.Adding common attributes:
    1. String name
    2. Integer age
    3. boolean isVaccinated
    4. TimeAndLocation(class), vaccine(interface), both are injected by the constructor method.
    5. The arguments of the constructor for all users should be like "public User(TimeAndLocation timeAndLocation, Vaccine vaccine)"
 c.Build the logic for all the methods based on the description mentioned in the User Interface.
 
**/
/*User implementation classes will have two setter-based methods:

    • setTimeAndLocation(TimeAndLocation timeAndLocation): This method sets timeAndLocation attribute.

    • setVaccine(Vaccine vaccine): This method sets vaccine attribute.

And, the TimeAndLocation class will have three setter-based methods:

    • setLocation(String location): This method sets the location attribute.

    • setDate(String date): This method sets the date attribute.

    • setTimeSlot(String timeSlot): This method sets timeSlot attribute.*/
public class Self implements User {
	String name;
    Integer age;
    boolean isVaccinated;
    TimeAndLocation timeAndLocation ;
    Vaccine vaccine;
//    public Self(TimeAndLocation timeAndLocation,Vaccine vaccine)
//	{
//		this.timeAndLocation=timeAndLocation;
//		this.vaccine=vaccine;
//	}
    public void setTimeAndLocation(TimeAndLocation timeAndLocation)
    {
    	this.timeAndLocation=timeAndLocation;
    }
    public void setVaccine(Vaccine vaccine) {
    	this.vaccine=vaccine;
    }
    public Vaccine getVaccineDetails() {
    	return this.vaccine;
    }

    /** This function sets user details such as name, age, and timeAndLocation. **/
    public void setUserDetails(String name, int age, TimeAndLocation timeAndLocation)
    {
    	this.name=name;
    	this.age=age;
    	this.timeAndLocation=timeAndLocation;
    }

    /** This function updates vaccination status of the user and prints appointment details in the console with includes user name , Vaccine name and lastly timeAndLocation class based details 
        For example:  "Hello John your appointment has been fixed for Covid Vaccine on  12 Pm at Mumbai  on 2023-05-10". 
     **/
   public void setAppointment()
    {
    	System.out.print("Hello "+this.name+" your appointment has been fixed for "+this.vaccine.getType()+" Vaccine on "+this.timeAndLocation.getDetails());;
    }

    /** This function returns a boolean type indicating the vaccination status of a user. If the user is vaccinated it should return true else false. **/
   public boolean IsVaccinated() {
    	return this.isVaccinated;
    }

}

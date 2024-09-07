package com.example.Vaccination;

/**
  TimeAndLocation class is a class which a user can use to set its appointment details
  from the console.This class should be injected as a dependency into the selected user.
  To complete this class you need perform the following tasks:
   
        Tasks:
 1.Add common attributes as mentioned below:
  a. String timeSlot
  b. String location
  c. String date
 2. Implement below function based on the given description:
    a. setDetails(String timeSlot, String location, String date): This method takes timeSlot, location, and date as input parameters.
    b. getDetails(): This method returns a string containing the timeslot, location, and date for example: "12:00 AM at New Delhi on 2023-05-22". 
And, the TimeAndLocation class will have three setter-based methods:

    • setLocation(String location): This method sets the location attribute.

    • setDate(String date): This method sets the date attribute.

    • setTimeSlot(String timeSlot): This method sets timeSlot attribute.
**/ 
public class TimeAndLocation {
	String timeslot;
	String location;
	String date;
//	public void setDetails(String timeSlot, String location, String date)
//	{
//		this.timeslot=timeSlot;
//		this.location=location;
//		this.date=date;
//		
//	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public void setDate(String date) {
		this.date=date;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeslot=timeSlot;
	}
	public String getDetails()
	{
		return this.timeslot+" at "+this.location+" on "+this.date;
	}

}

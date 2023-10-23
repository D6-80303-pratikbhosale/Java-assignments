package assign01;

import java.util.Scanner;

public class Date {
	int month;
	int day;
	int year;
	
	public Date() {
		this(1,1,1947);
	}

	public Date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void acceptDate() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter Date :");
		 day = sc.nextInt();
		 System.out.print("Enter Month :");
		 month = sc.nextInt();
		 System.out.print("Enter Year :");
		 year = sc.nextInt();
	}
	
	public void displayDate() {
		System.out.println("Entered Date : " +day+"/"+month+"/"+year);
	}
	
}
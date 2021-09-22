package Employwages;

public class Employwagesuc10{
	//public static final int IS_PART_TIME = 1;
	//public static final int IS_FULL_TIME = 2;
	private final String company;
	 final int empRatePerHour;
	final int numOfWorkingDays;
	final int maxHoursPerMonth;
	private int totalEmpWage;
	public Employwagesuc10(String company, int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	public void setTotalEmpWage(int totalEmpWage) {
		//variables
		this.totalEmpWage = totalEmpWage;
	}
	//override
	public String toString() {
		return "Total Emp wage for Company:"+company+"is:"+totalEmpWage;
	}
 }
 
		
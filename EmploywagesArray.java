package Employwages;

public class EmploywagesArray {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	private int numOfCompany = 0;
	private Employwagesuc10[] employwagesuc10Array;
	public EmploywagesArray() {
		employwagesuc10Array = new Employwagesuc10[5];
	}
	private void addEmploywagesuc10(String company, int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		employwagesuc10Array[numOfCompany] = new Employwagesuc10(company, empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
	    numOfCompany++; 
	}
	private void computeEmpWage() {
		for(int i = 0; i < numOfCompany; i++) {
			employwagesuc10Array[i].setTotalEmpWage(this.computeEmpWage(employwagesuc10Array[i]));
			System.out.println(employwagesuc10Array[i]);
		}
	}
	private int computeEmpWage(Employwagesuc10 employWagesuc10) {
		//variables
		int empHrs = 0, totalEmpHrs  = 0, totalWorkingDays = 0;
		//computation
		while (totalEmpHrs <= employWagesuc10.maxHoursPerMonth &&
				totalWorkingDays < employWagesuc10.numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;
			switch (empCheck ) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#:" + totalWorkingDays + "Emp Hr:" +empHrs);			
		}
		return totalEmpHrs * employWagesuc10.empRatePerHour;
	}
	public static void main(String[] args) {
		EmploywagesArray employwagesArray = new EmploywagesArray();
		employwagesArray.addEmploywagesuc10("DMart", 20, 2, 10);
		employwagesArray.addEmploywagesuc10("Reliance", 10, 4, 20);
		employwagesArray.computeEmpWage();
	
	}
}

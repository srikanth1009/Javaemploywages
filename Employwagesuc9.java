package Employwages;

 class Employwagesuc9 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;
	public Employwagesuc9(String company, int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	public void computeEmpWage() {
		//variables
		int empHrs = 0, totalEmpHrs  = 0, totalWorkingDays = 0;
		//computation
		while (totalEmpHrs <= maxHoursPerMonth &&
				totalWorkingDays < numOfWorkingDays) {
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
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}
	//override
	public String toString() {
		return "Total Emp wage for Company:"+company+"is:"+totalEmpWage;
	}
	public static void main(String[] args) {
		Employwagesuc9 DMart = new Employwagesuc9("DMart", 20, 2, 10);
		Employwagesuc9 Reliance = new Employwagesuc9("Reliance", 10, 4, 20);
		DMart.computeEmpWage();
		Reliance.computeEmpWage();
		System.out.println(Reliance);
	}
}

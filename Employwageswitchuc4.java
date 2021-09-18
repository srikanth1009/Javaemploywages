package Employwages;

public class Employwageswitchuc4 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	 public static final int EMP_RATE_PER_HOUR = 20;
	 public static void main(String[] args) {
		// const
        int emphrs = 0;
        int empwage = 0; 
        // computation
		 int empcheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empcheck) 
		{
		 case IS_FULL_TIME:
			emphrs = 8;
		 case IS_PART_TIME:
			emphrs = 4;
	   	default:
		    emphrs = 0;
		}
		empwage = emphrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee wage:"+empwage);
		}
}

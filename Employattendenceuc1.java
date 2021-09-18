package Employwages;

public class Employattendenceuc1 {
	public static void main(String[] args) {
		// constants
		int IS_FULL_TIME = 1;
		// computation
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == IS_FULL_TIME)
		System.out.println("Employee is present");
		else
		System.out.println("Employee is Absent");
		}
}

package OOP_Pillars;

public class Employee extends Person implements PersonInterface {

	double employeeSalary;
	String employeeTitle;
	double bonus;
	
	
	Employee(String name, int age, String gender, double empSalary, String empTitle){
		
		super(name, age, gender);
		this.employeeSalary = empSalary;
		this.employeeTitle = empTitle;
		
		
	}
 
	
	public void calculate() {
		bonus = this.employeeSalary * 40/100;
		
	}
	
	public void display() {
		super.display();
		 
		System.out.println("Employee Salary: " + "$" + this.employeeSalary);
		System.out.println("Employee Title: " + this.employeeTitle);
		System.out.println("Bonus: " + "$" + this.bonus);
		//System.out.println("Employee's Net Salary: " + "$"+ calculate(this.bonus));
		 
	}
	
	public double calculate(int bonus) {
		double netSalary = bonus + this.employeeSalary;
		return netSalary;
	}
	
	public double highScore(double num1, double num2, double num3) {
		double accumulatedBonus = num1 + num2 + num3;
		return accumulatedBonus;
	}

}

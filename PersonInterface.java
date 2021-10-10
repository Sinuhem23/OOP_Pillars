package OOP_Pillars;

public interface PersonInterface {
	//Create an Interface PersonInterface. 
	//Declare one static final variable for the organization name and create 2 abstract methods in it.
	//One should be calculate which should take one int argument and should return a double value. 
	//The other method should be of your choice.
	
	static final String ORGINIZATION = "Per Scholas Best Coding School";
	double calculate(double num);
	double highScore(double num1, double num2, double num3);

}

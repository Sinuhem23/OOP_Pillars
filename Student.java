package OOP_Pillars;


public class Student extends Person implements PersonInterface{

	 int stud_id;
	 String subject1;
	 String subject2;
	 String subject3;
	 String favoriteSubject;
	 
	 
	 
	 Student(int  id, String name, int age, String gender, String s1, String s2, String s3,  String favSub){
		 
		 super(name, age, gender);
		 this.stud_id = id;
		 this.subject1 = s1;
		 this.subject2 = s2;
		 this.subject3 = s3;
		 this.favoriteSubject = favSub;
		 
	 }


	 
	 // from PersonInterface
	 public double calculate(double a) {
		  System.out.println("ICalculator - crosssum " + a);
		    double sum = 0;
		    while (0 != a) {
		        sum = sum + (a % 10);
		        a = a / 10;
		    }
		    return sum;
		
		}
	 
	 public double highScore(double sub1, double sub2, double sub3) {
		 
		 double highestScore;
		 if(sub1>sub2 && sub1>sub3) {
			 highestScore = sub1;
			
		 }else if (sub2>sub1 && sub2>sub3) {
			 highestScore = sub2;
			
		 }else {
			 highestScore = sub3;
			
		 }
		 
		 return highestScore;
	 }
	 
	 
	 
//	 End of class
}

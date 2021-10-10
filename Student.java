package OOP_Pillars;


public class Student extends Person implements PersonInterface{

	 int stud_id;
	 String subject1;
	 double sub1Score;
	 String subject2;
	 double sub2Score;
	 String subject3;
	 double sub3Score;
	 String favoriteSubject;
	 
	 
	 
	 Student(int  id, String name, int age, String gender, String s1, double firstScore, String s2, double secondScore, String s3, double thirdScore,  String favSub){
		 
		 super(name, age, gender);
		 this.stud_id = id;
		 this.subject1 = s1;
		 this.sub1Score = firstScore;
		 this.sub2Score = secondScore;
		 this.sub3Score = thirdScore;
		 
		 this.favoriteSubject = favSub;
		 
	 }


	 
	 // from PersonInterface
	 public double calculate(int year) {
		 //to not count the year you are on currently
		  double years = 12 - (year+1) ;
		return years;
		}
	 
	 public double highScore(double sub1, double sub2, double sub3) {
		 System.out.println("Inside child class");
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

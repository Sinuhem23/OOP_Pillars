package OOP_Pillars;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		// Making Student Objects
		System.out.println("-----------------");
		System.out.println("Student");
		System.out.println("-----------------");
		
		Scanner scan = new Scanner(System.in);
		
		
		Person1 stud = new Person1();
		
		//Name
		System.out.println("What is your name: ");
		String name = scan.nextLine();
		stud.setName(name);
		//Age
		System.out.println("What is your age: ");
		int age = scan.nextInt();
		stud.setAge(age);
		//Gender
		scan.nextLine();
		System.out.println("What is your gender: ");
		String gender = scan.nextLine();
		stud.setGender(gender);
		//Subject1
		scan.nextLine();
		System.out.println("What is your first subject: ");
		String firstSub = scan.nextLine();
		stud.setSubject1(firstSub);
		//Grade of Subject 1
		scan.nextLine();
		System.out.println("First Subject Grade: ");
		double firstSubGrade = scan.nextDouble();
		stud.setSub1Grade(firstSubGrade);
		//Subject2
		scan.nextLine();
		System.out.println("What is your second subject: ");
		String secondSub = scan.nextLine();
		stud.setSubject2(secondSub);
		//Grade of Subject 2
		scan.nextLine();
		System.out.println("Second Subject Grade: ");
		double secondSubGrade = scan.nextDouble();
		stud.setSub2Grade(secondSubGrade);
		//Subject3
		scan.nextLine();
		System.out.println("What is your third subject: ");
		String thirdSub = scan.nextLine();
		stud.setSubject3(thirdSub);
		//Grade of Subject 3
		scan.nextLine();
		System.out.println("Third Subject Grade: ");
		double thirdSubGrade = scan.nextDouble();
		stud.setSub3Grade(thirdSubGrade);
		//Favorite Subject
		scan.nextLine();
		System.out.println("What is your favorite subject: ");
		String favSub = scan.nextLine();
		stud.setFavoriteSubject(favSub);
		//Grade Year
		scan.nextLine();
		System.out.println("What grade are you in: ");
		int gradeYear = scan.nextInt();
		stud.setGradeYear(gradeYear);
		scan.nextLine();
		
	
//
	scan.close();
	 
	System.out.println();
	 System.out.println("Id: " + stud.getStud_id());
	 System.out.println("Grade: " + stud.getGradeYear());
	System.out.println("Name: " + stud.getName());
	System.out.println("Age: " + stud.getAge());
	System.out.println("Gender: " + stud.getGender());
	System.out.println("Subject 1: " + stud.getSubject1());
	System.out.println("Subject 2: " + stud.getSubject2());
	System.out.println("Subject 3: " + stud.getSubject3());
	System.out.println("Favorite Subject: " + stud.getFavoriteSubject());

	System.out.println();
	System.out.println();
	
				
	
	
			// hold grades to calc
	Student stud1 = new Student(stud.getStud_id(),stud.getName(),stud.getAge(), stud.getGender(),stud.getSubject1(),stud.getSub1Grade(), stud.getSubject2(),stud.getSub2Grade(), stud.getSubject3(),stud.getSub3Grade(),stud.getFavoriteSubject() );
	
	
	if(stud1.highScore(firstSubGrade,secondSubGrade,thirdSubGrade) == firstSubGrade) {
		System.out.println("Your best subject is: " + firstSub + "." + " With a grade of: " + firstSubGrade);
				
	}else if(stud1.highScore(firstSubGrade,secondSubGrade,thirdSubGrade) == secondSubGrade) {
		System.out.println("Your best subject is: " + secondSub + "." + " With a grade of: " + secondSubGrade);
				
	}else if(stud1.highScore(firstSubGrade,secondSubGrade,thirdSubGrade) == thirdSubGrade) {
		System.out.println("Your best subject is: " + thirdSub + "." + " With a grade of: " + thirdSubGrade);
				
	}else {
		System.out.println("Error. ");
	}
	
	if(gradeYear<12) {
	System.out.println("You have " + stud1.calculate(gradeYear) + " years left to graduate highschool.");
	}else if (gradeYear==12) {
		System.out.println("Last Year! of High School!!");
	}else if (gradeYear > 12){
		System.out.println("You are surpassed highschool");
	}else {
		System.out.println("try again");
	}
				
				System.out.println("-----------------");
				// This display method is being called from our Student class
				
				System.out.println("Employee");
				System.out.println("-----------------");
				Employee emp1 = new Employee("Batman", 31, "Male", 120000, "Software Engineer");
		
				emp1.calculate();
				
				emp1.display();

	}

}

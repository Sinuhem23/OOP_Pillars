package OOP_Pillars;

public class Person {

	 
		
		
		String pName;
		int pAge;
		char pGender;
		
		
		public Person() {
			
		}
		
		public Person(String pName, int pAge, char pGender) {
			this.pName = pName;
			this.pAge = pAge;
			this.pGender = pGender;
		}
		
		
		void display() {
			System.out.println("Name: " + this.pName);
			System.out.println("Age: " + this.pAge);
			System.out.println("Gender: " + this.pGender);
		}
		
		
		
		
 

}

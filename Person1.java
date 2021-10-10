package OOP_Pillars;

public class Person1 {
	// Getters and Setters
	
	public static int idGenerator = 0;

//	private String pName;
//	private int pAge;
//	private char pGender;
	
	private int stud_id;
	private String name;
	private int age;
	private String gender;
	private String subject1;
	private double sub1Grade;	
	private String subject2;
	private double sub2Grade;
	private String subject3;
	private double sub3Grade;
	private String favoriteSubject;
	
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getGender() {
		return gender;
	}
	
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public double getSub1Grade() {
		return sub1Grade;
	}


	public void setSub1Grade(double sub1Grade) {
		this.sub1Grade = sub1Grade;
	}


	public double getSub2Grade() {
		return sub2Grade;
	}


	public void setSub2Grade(double sub2Grade) {
		this.sub2Grade = sub2Grade;
	}


	public double getSub3Grade() {
		return sub3Grade;
	}


	public void setSub3Grade(double sub3Grade) {
		this.sub3Grade = sub3Grade;
	}
	public Person1() {
		
	this.stud_id = ++idGenerator;
	}

	
	public String getName() {
	return name;
	}


	public void setName(String name) {
	this.name = name;
	}


	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = ++idGenerator;
		System.out.println("ID: " + this.stud_id);
	}
	public String getSubject1() {
		return subject1;
	}
	public void setSubject1(String Subject1) {
		this.subject1 = Subject1;
	}
	public String getSubject2() {
		return subject2;
	}
	public void setSubject2(String Subject2) {
		this.subject2 = Subject2;
	}
	public String getSubject3() {
		return subject3;
	}
	public void setSubject3(String Subject3) {
		this.subject3 = Subject3;
	}
	public String getFavoriteSubject() {
		return favoriteSubject;
	}
	public void setFavoriteSubject(String favoriteSubject) {
		this.favoriteSubject = favoriteSubject;
	}
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	End of class

}

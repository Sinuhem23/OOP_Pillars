package OOP_Pillars;

public class Person1 {
	// Getters and Setters
	
	public static int studentIdGenerator = 0;
	public static int employeeIdGenerator = 0;

	
	//Student
	
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
	private int gradeYear;
	
	//Employee
	
	private int empID;
	private String empName;
	private int empAge;
	private String empGender;
	private double emplSalary;
	private int empBonus;
	private String  emplTitle;
	
	
	
	public int getEmpBonus() {
		return empBonus;
	}


	public void setEmpBonus(int empBonus) {
		this.empBonus = empBonus;
	}
	
	
	
	
	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = ++employeeIdGenerator;
		System.out.println("ID: " + this.empID);
	}
	
	
	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}


	public String getEmpGender() {
		return empGender;
	}


	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}


	public double getEmplSalary() {
		return emplSalary;
	}


	public void setEmplSalary(double emplSalary) {
		this.emplSalary = emplSalary;
	}


	public String getEmplTitle() {
		return emplTitle;
	}


	public void setEmplTitle(String emplTitle) {
		this.emplTitle = emplTitle;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getGradeYear() {
		return gradeYear;
	}
	
	
	public void setGradeYear(int gradeYear) {
		this.gradeYear = gradeYear;
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
		
	this.stud_id = ++studentIdGenerator;
	this.empID = ++employeeIdGenerator;
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
		this.stud_id = ++studentIdGenerator;
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

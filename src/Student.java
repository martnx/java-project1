
public class Student {
	
	String firstName;
	String lastName;
	String course;
	String section;
	int age;
	float midtermGrade;
	float finaltermGrade;
	
	Student(String firstName,
			String lastName,
			String course,
			String section,
			int age,
			float midtermGrade,
			float finaltermGrade){
			
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.section = section;
		this.age = age;
		this.midtermGrade = midtermGrade;
		this.finaltermGrade = finaltermGrade;
		
	}
	void introduceSelf(){
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.section = section;
		
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Course : " + course);
		System.out.println("Section: " + section);
		
	}
	
	void evaluateGrade() {
		this.midtermGrade = midtermGrade;
		this.finaltermGrade = finaltermGrade;
		this.firstName = firstName;
		this.course = course;
		
		float average = (midtermGrade + finaltermGrade) / 2;
		String remark = "";
		
		if(average > 100) remark = "Highest Honor";
		else if(average > 98) remark = "With Highest Honor";
		else if(average > 95) remark = "With High Honor";
		else if(average > 90) remark = "With Honor";
		else if(average > 75) remark = "Passed";
		else remark = "Failed";
		
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("Course : " + course);
		System.out.println("Remarks: " + remark);
			
		
		
	}
	
}

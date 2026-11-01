
public class Student {
	private String name;
	private String id;
	private char gender;
	private Date birthDay;
	//constructor
	public Student(String name,String id,char gender,Date brithDay) {
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.birthDay = new Date(birthDay);
	}
	//returns the student's name
	public String getName() {
		return name;
	}
	//returns the student's id
	public String getId() {
		return id;
	}
	//returns the student's gender
	public char getGender() {
		return gender;
	}
	//returns the student's birthday
	public Date getBirthDay() {
		return birthDay;
	}
	//checks if another student has the same birthday and returns true if they don't and false if they do not
	public boolean twinBirth(Student otherStudent) {
		if (this.getBirthDay() == otherStudent.getBirthDay()) {
			return true;
		}
		else {
			return false;
		}
	}
	//prints out the student's information
	public String toString() {
		return "The student's name is: "+this.name+" The student's id is: : "+this.id+" the student's brithday is : "+this.birthDay;
	}
}

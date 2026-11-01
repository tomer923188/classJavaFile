
public class TestStudent {

	public static void main(String[] args) {
		//creates 3 students
		Date s1BirthDay = new Date(15,9,2004);
		Date s2BirthDay = new Date(3,3,2005);
		Date s3BirthDay = new Date(15,9,2004);
		Student student1 = new Student("Daniel","1582",'F',s1BirthDay);
		Student student2 = new Student("Ron", "1689",'M',s2BirthDay);
		Student student3 = new Student("Ron", "1689",'M',s3BirthDay);
		//prints the student's information 
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		//checks if student 1 and student 3 have the same birthday
		if (student1.twinBirth(student3) == true) {
			System.out.println(student1.getName()+" and"+student3.getName()+" are twin birth!");
		}
		/*
		 *task 3: it will return 99 99
		 */
		
	}

}

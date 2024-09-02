
//Student Details
public class StudentInfo {
	String name;
	long PhNo;
	long Adhaar;
	int sem;
	String branch;
	String college;
	
	public  StudentInfo(String name, long phno, long Adhaar, int sem, String branch, String college) {
		this.name = name;
		this.PhNo = phno;
		this.Adhaar = Adhaar;
		this.sem = sem;
		this.branch = branch;
		this.college = college;
		
	}
	public void display() {
		System.out.println("Name:" +name);	
		System.out.println("Phone no:" +PhNo);
		System.out.println("Adhaar:" +Adhaar);
		System.out.println("Semester:" +sem);
		System.out.println("Branch:" +branch);


	}

	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo("ABC", 1234567890, 12345678901L, 7, "CSE", "FTC");
		StudentInfo s2 = new StudentInfo("CDE", 1234542890, 12313437890L, 7, "CSE", "FTC");

		s1.display();
		s2.display();

	}

}

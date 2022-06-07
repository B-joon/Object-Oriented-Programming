package ch06;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(); // 기본 생성자 호출
		
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(12345, "Kim", 2); // 매개변수를 포함한 생성자 호출
		
		System.out.println(studentKim.showStudentInfo());
		
	}

}

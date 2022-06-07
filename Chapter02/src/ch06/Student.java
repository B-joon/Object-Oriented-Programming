package ch06;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() { // 기본 생성자
	}
	
	/**
	 * 
	 * studentName = studentName << 이렇게 작성하면
	 * 변수는 본인과 가장 가까운 곳에서 찾기 때문에
	 * 넘어온 매개변수가 담기기 때문에
	 * this. 를 해줘서 전역변수에 값을 넣어줘야 한다.
	 * 
	 * studentNumber, studentName, grade << 사용자 정의
	 * 
	 */
	public Student(int studentNumber, String studentName, int grade) { // 생성자 오버로딩
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + " 학생의 학번은 " + studentNumber + " 이고, " + grade + " 학년 입니다.";
	}

}

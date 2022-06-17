package ch16;

public class Employee {
	
	// 외부에서 함부로 건들면 안되는 변수라 public -> private 변경
	private static int serialNum = 1000;

	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum; // 따로 변수에 담아줘야 다른 번호를 받는다.
		
	}
	
	public static int getSerialNum() {
		return serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
